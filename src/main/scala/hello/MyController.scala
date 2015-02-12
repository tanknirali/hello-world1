package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@Controller
@RequestMapping("/")
 class MyController {
    @RequestMapping(method=RequestMethod.GET)
    @RequestMapping(Array("/"))
    def hello():String ={
        "Hello World from Nirali";
    }
}