package franxx.code.spring.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LoggingTest {

    @Test
    void logTest() {
        log.info("learn spring");
        log.warn("learn java");
        log.error("omg omg");
    }
}
