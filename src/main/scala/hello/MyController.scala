package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class MyController {

    @RequestMapping(Array("/"))
    def hello():String ={
        "Hello World from Nirali";
    }
}