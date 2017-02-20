package test;
/**
 * @author 谢天帝
 * @version v0.1 2017/2/20.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class testController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
