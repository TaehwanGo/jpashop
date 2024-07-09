package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); // model에 data라는 이름으로 hello!!를 담아서 뷰로 넘김
        return "hello"; // html 파일명(resources/templates/hello.html)
    }
}
