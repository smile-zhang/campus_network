package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangTao
 * @Date:2019/4/8 18:31
 */
@RestController
@RequestMapping("/hello")
public class RegistController {
    @GetMapping
    public String hello() {
        return "<h1>hello</h1>";
    }
//    @PostMapping("/a")
//    public String regist() {
//        return "rejister";
//    }
}
