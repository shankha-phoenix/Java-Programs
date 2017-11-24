package boot.webmvc.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String greet() {
        return "Hello! World.";
    }
}
