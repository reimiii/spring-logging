package franxx.code.spring.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@Slf4j
@TestPropertySource("classpath:application-test.properties")
public class LoggingTest {

    @Test
    void logTest() {
        log.info("learn spring");
        log.warn("learn java");
        log.error("omg omg");
    }

    @Test
    void logFor() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("log from: {}", i);
        }
    }
}
