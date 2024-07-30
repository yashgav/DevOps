package yash.yash;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello(){
        return "Hello Yash";
    }

    @GetMapping("/hi")
    public List<String> hi(){
        List<String> l1 = new ArrayList<>();
        l1.add("Yash");
        l1.add("Akash");
        l1.add("Vedu");
        return l1;
    }
}
