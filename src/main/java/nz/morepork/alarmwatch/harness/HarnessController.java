package nz.morepork.alarmwatch.harness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class HarnessController {
    private static final Logger logger = LoggerFactory.getLogger(HarnessController.class);

    @RequestMapping(method = RequestMethod.POST, path = "Account/OffLineClient")
    @ResponseBody
    public boolean offLineClient(@RequestBody OfflineClientForm form) {
        logger.info("offline client: {}", form);
        return true;
    }

    @RequestMapping(method = RequestMethod.POST, path = "Account/LoadClient")
    @ResponseBody
    public String loadClient(@RequestBody LoadClientForm form) {
        logger.info("load client: {}", form);
        return "sample string 1";
    }

    @RequestMapping(method = RequestMethod.POST, path = "Account/UpdateClient")
    @ResponseBody
    public String updateClient(@RequestBody LoadClientForm form) {
        logger.info("update client: {}", form);
        return "sample string 1";
    }

}

