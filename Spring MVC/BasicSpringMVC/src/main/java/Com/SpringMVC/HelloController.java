package Com.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")  
    public String redirect()  
    {  
        return "viewpage.jsp";  
    }     
    @RequestMapping("/helloagain")  
    public String display1()  
   {  
    return "final.jsp";  
   }  
}
