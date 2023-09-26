package ch.renuo.hotwirejavademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    private static final int PAGE_SIZE = 5;
    private static final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @GetMapping("/")
    public String firstPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("alphabet", ALPHABET);
        model.addAttribute("page", "first");
        model.addAttribute("pageTitle", "First");
        return "layout";
    }

    @GetMapping("/second")
    public String secondPage(Model model) {
        model.addAttribute("page", "second");
        model.addAttribute("pageTitle", "Second");
        return "layout";
    }

    @GetMapping("/third")
    public String thirdPage(Model model) {
        model.addAttribute("page", "third");
        model.addAttribute("pageTitle", "Third");
        return "layout";
    }
    
}