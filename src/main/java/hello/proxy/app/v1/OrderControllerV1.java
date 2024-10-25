package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.*;

@RestController //스프링은 @Controller, @RestController가 있어야 스프링 컨트롤러로 인식
public interface OrderControllerV1 {

    // http://localhost:8080/v1/request?itemId=hello
    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    // http://localhost:8080/v1/no-log
    @GetMapping("/v1/no-log")
    String noLog();
}