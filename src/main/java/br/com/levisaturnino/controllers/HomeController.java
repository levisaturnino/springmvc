package br.com.levisaturnino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by saturnino on 31/03/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String goHome(){
        return "Welcome Home";
    }
}
