package yash.yash;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/page")
    public String page(Model model) {
        int xx = 12345;
        model.addAttribute("y", xx);
        return "index";

    }

}
