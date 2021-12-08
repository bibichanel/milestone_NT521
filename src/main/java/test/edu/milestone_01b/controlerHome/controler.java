package test.edu.milestone_01b.controlerHome;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controler {
    @RequestMapping("home")
    public String index(){
        return "index";
    }
}
