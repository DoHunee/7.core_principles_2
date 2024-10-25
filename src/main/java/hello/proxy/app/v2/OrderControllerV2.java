package hello.proxy.app.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController //스프링은 @Controller, @RestController가 있어야 스프링 컨트롤러로 인식
public class OrderControllerV2 {
    private final OrderServiceV2 orderService;

    public OrderControllerV2(OrderServiceV2 orderService) {
        this.orderService = orderService;
    }

    // http://localhost:8080/v2/request?itemId=hello
    @GetMapping("/v2/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    // http://localhost:8080/v2/no-log
    @GetMapping("/v2/no-log")
    public String noLog() {
        return "ok";
    }
}