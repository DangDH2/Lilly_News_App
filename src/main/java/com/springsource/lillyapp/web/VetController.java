package com.springsource.lillyapp.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsource.lillyapp.domain.Vet;

@RequestMapping("/vets")
@Controller
@RooWebScaffold(path = "vets", formBackingObject = Vet.class)
public class VetController {
}
