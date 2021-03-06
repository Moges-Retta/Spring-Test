package be.vdab.retroVideo.controllers;

import be.vdab.retroVideo.services.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    private final FilmService filmService;

    public IndexController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
