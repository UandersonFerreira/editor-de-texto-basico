package br.com.uanderson.editortext.controller;

import br.com.uanderson.editortext.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = {"/", "/index"})
public class IndexController {

    @GetMapping
    public String main(Model model){
        model.addAttribute("post", new Post());
        return "index";
    }

    @PostMapping
    public String save (Post post, Model model){
        model.addAttribute("post", post);
        return "saved";
    }
}//class
