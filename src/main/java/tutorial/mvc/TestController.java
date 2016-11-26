package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by PDeb on 11/26/2016.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
