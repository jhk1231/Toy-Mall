package com.blog.api.module.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * view 연결시 필요없어질것 같은데
 */
@Controller
public class WelcomController {

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }
}
