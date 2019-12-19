package guru.springframework.mychucknorrisjokeapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ChuckNorriesJokeController {

    @RequestMapping("/")
    public ChuckNorriesJoke joke(@RequestParam(value = "joke") String name) {

    }
}
