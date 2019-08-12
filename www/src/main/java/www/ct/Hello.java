package www.ct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/aa")
    public String gete(){
        return "hello";
    }
    public void test(){

    }
}
