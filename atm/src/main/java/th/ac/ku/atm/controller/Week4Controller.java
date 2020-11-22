package th.ac.ku.atm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Week4Controller {
    @RequestMapping("/week4")
    public String getHomePage(Model model) {
        model.addAttribute("greeting", "Sawaddee");
        // return home.html
        return "week4";
    }
}
