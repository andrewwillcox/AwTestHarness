package nz.morepork.alarmwatch.harness;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HarnessControllerTest.class)
@Configuration
@WebAppConfiguration
@ComponentScan(basePackages = "nz.morepork.alarmwatch.harness")
public class HarnessControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  private ObjectMapper mapper = new ObjectMapper();


  @Before
  public void setUp() throws Exception {
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void loadClient() throws Exception {
    LoadClientForm form = new LoadClientForm();
    form.FirstName = "colin";
    String content = mapper.writeValueAsString(form);
    mockMvc.perform(post("/Account/LoadClient")
                        .accept(MediaType.TEXT_PLAIN_VALUE)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
        .andExpect(status().isOk())
        .andExpect(content().string("sample string 1"));

    mockMvc.perform(get("/Logs/View").accept(MediaType.APPLICATION_JSON)).andExpect(content().string("[{\"FirstName\":\"colin\"}]"));
  }

}