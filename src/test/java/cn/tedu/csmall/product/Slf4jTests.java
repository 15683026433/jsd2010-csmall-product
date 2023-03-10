package cn.tedu.csmall.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class Slf4jTests {

    @Test
    void test() {
        log.trace("这是一条【TRACE】日志！");
        log.debug("这是一条【DEBUG】日志！");
        log.info("这是一条【INFO】日志！");
        log.warn("这是一条【WARN】日志！");
        log.error("这是一条【ERROR】日志！");
    }

}
