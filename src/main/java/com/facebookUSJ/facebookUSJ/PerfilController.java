package com.facebookUSJ.facebookUSJ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PerfilController {
    @RequestMapping("/cadastrarPerfil")
    public String form() {
        return "formPerfil";
    }
}
