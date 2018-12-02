package testactuator;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    private static final String template = "Hi, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/simple")
    @ResponseBody
    public Messages returnMessage(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        return new Messages(counter.incrementAndGet(), String.format(template, name));
    }

}
