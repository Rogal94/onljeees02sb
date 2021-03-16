package pl.coderslab.onljees02sb;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
@Slf4j
public class HomeController {

    private final DrinkRepository drinkRepository;

    @RequestMapping("/")
    public String home() {
        log.info("some info {}", 213);

        return "hello";
    }
    @RequestMapping("/admin/account")
    public String account() {
        log.info("some info {}", 213);
        return "admin/account";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() { return "Here you can find some details for logged users"; }
}
