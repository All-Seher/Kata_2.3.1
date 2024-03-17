package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.entity.User;

@Controller
public class FilmController {

    private static User user;

    static {
        user = new User();
        user.setId(1);
        user.setName("1");
        user.setSurName("1");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String allFilms() {

        return "users";
    }
}