package boot.webmvc;

import static org.assertj.core.api.Assertions.assertThat;

import boot.webmvc.controller.GreetingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    public void contextLoader() throws Exception {
        assertThat(greetingController).isNotNull();
    }
}
