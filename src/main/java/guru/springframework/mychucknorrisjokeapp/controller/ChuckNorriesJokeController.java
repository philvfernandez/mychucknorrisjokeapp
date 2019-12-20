package guru.springframework.mychucknorrisjokeapp.controller;

import guru.springframework.mychucknorrisjokeapp.model.ChuckNorrisJokes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class ChuckNorriesJokeController {

    @RequestMapping({"", "/", "index", "index.hmtl"})
    public String getJoke(Model model) {
        model.addAttribute("jokes", new ChuckNorrisJokes());
        return "jokes/index";
    }

}
