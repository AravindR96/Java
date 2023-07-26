package Com.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController2 {
	@RequestMapping("/hello2")  
    public String redirect()  
    {  
        return "viewpage2";  
    }     
    
}
