package com.bofa.demo.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/controller")
public class TestController {

    @GetMapping("/view")
/*    public RedirectView index(RedirectAttributes attributes) {
        System.out.println("   ***** HelloIndexController invoked ...");
        return new RedirectView("hello");
    }*/
    public String index() {
        //This one uses InternalResourceViewResolver
        System.out.println("   ***** HelloIndexController invoked ...");
        return ("hello");
    }
}
