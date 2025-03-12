package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // lombok이 저 아래 private~log 만들어 둔거 자동으로 넣어줌
@RestController
public class LogTestController {

    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        // 이런 식으로 쓰면 자바 특성상 더하기 연산이 일어나면서
        // 로그레벨에 해당도 안되는 쓸모없는 리소스가 사용된다.
        // 이런 식으로 쓰면 실무에서 혼나니까 주의해!!!
        // log.trace("trace my log =" + name);


        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
