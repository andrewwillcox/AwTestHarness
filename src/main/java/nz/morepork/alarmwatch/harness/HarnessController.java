package nz.morepork.alarmwatch.harness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.LinkedList;
import java.util.List;

@EnableWebMvc
@RestController
@RequestMapping
class HarnessController {

  private static final Logger logger = LoggerFactory.getLogger(HarnessController.class);

  private static final int TO_REMEMBER = 5;

  private final LinkedList<ClientForm> requests = new LinkedList<ClientForm>();


  @RequestMapping(method = RequestMethod.POST,
                  path = "/Account/OffLineClient")
  @ResponseBody
  public boolean offLineClient(@RequestBody OfflineClientForm form) {
    logger.info("offline client: {}", form);
    addRequest(form);
    return true;
  }

  private void addRequest(final ClientForm form) {
    requests.add(0, form);
    if (requests.size() > TO_REMEMBER) {
      requests.removeLast();
    }
  }

  @RequestMapping(method = RequestMethod.POST,
                  path = "/Account/LoadClient")
  @ResponseBody
  public String loadClient(@RequestBody LoadClientForm form) {
    logger.info("load client: {}", form);
    addRequest(form);
    return "sample string 1";
  }

  @RequestMapping(method = RequestMethod.POST,
                  path = "/Account/UpdateClient")
  @ResponseBody
  public String updateClient(@RequestBody LoadClientForm form) {
    logger.info("update client: {}", form);
    addRequest(form);
    return "sample string 1";
  }

  @RequestMapping(method = RequestMethod.GET, path = "/Logs/View", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public List<ClientForm> viewLogs() {
    return requests;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/Logs/Clear", produces = MediaType.APPLICATION_JSON_VALUE)
  @ResponseBody
  public boolean clearLogs() {
    requests.clear();
    return true;
  }

}

