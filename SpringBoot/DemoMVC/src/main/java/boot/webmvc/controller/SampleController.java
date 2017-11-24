package boot.webmvc.controller;

import boot.webmvc.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService service) {
        this.sampleService = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/greet")
    public String greeting() {
        return sampleService.greet();
    }

}
