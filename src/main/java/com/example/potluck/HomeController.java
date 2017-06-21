package com.example.potluck;

/**
 * Created by student on 6/21/17.
 */

import com.example.potluck.models.Signup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private SignupRepository signupRepository;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/signup")
    public String greetingForm(Model model) {
        model.addAttribute("signup", new Signup());
        return "signup";
    }

    @PostMapping("/signup")
    public String greetingSubmit(@ModelAttribute Signup signup) {

        signupRepository.save(signup);
        //@Valid Account account, BindingResult bindingResult
        /*
        if (bindingResult.hasErrors()) {
            return "deposit";
        }
        atmRepository.save(account);
        return "result";
        */
        return "result";
    }


    @RequestMapping("/list")
    public String list(Model model)
    {
        Iterable<Signup> foodList=signupRepository.findAll();
        model.addAttribute("foodList",foodList);

        return "list";
    }

}
