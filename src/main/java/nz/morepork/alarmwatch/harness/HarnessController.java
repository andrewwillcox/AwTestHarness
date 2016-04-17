package nz.morepork.alarmwatch.harness;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;

@Controller
@RequestMapping
class HarnessController {

    private static final Logger logger = LoggerFactory.getLogger(HarnessController.class);

    private static final int TO_REMEMBER = 5;

    private final LinkedList<String> requests = new LinkedList<String>();


    @RequestMapping(method = RequestMethod.POST, path = "Account/OffLineClient")
    @ResponseBody
    public boolean offLineClient(@RequestBody OfflineClientForm form) {
        logger.info("offline client: {}", form);
        addRequest(form);
        return true;
    }

    private void addRequest(final Object form) {
        requests.add(0,form.toString());
        if (requests.size() > TO_REMEMBER) {
            requests.removeLast();
        }
    }

    @RequestMapping(method = RequestMethod.POST, path = "Account/LoadClient")
    @ResponseBody
    public String loadClient(@RequestBody LoadClientForm form) {
        logger.info("load client: {}", form);
        addRequest(form);
        return "sample string 1";
    }

    @RequestMapping(method = RequestMethod.POST, path = "Account/UpdateClient")
    @ResponseBody
    public String updateClient(@RequestBody LoadClientForm form) {
        logger.info("update client: {}", form);
        addRequest(form);
        return "sample string 1";
    }

    @RequestMapping(method = RequestMethod.GET, path = "Logs/View")
    @ResponseBody
    public String viewLogs() {
        StringBuilder buffer = new StringBuilder();
        for (Object request : requests) {
            buffer.append(request).append(" \n\n ");
        }
        return buffer.toString();
    }

    @RequestMapping(method = RequestMethod.GET, path = "Logs/Clear")
    @ResponseBody
    public boolean clearLogs() {
        requests.clear();
        return true;
    }

}

