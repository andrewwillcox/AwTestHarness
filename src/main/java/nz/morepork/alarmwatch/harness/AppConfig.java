package nz.morepork.alarmwatch.harness;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class AppConfig {

    @Bean
    HarnessController harnessController() {
        return new HarnessController();
    }

}
