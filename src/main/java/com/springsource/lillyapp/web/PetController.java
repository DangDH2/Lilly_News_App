package com.springsource.lillyapp.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsource.lillyapp.domain.Pet;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/pets")
@Controller
@RooWebScaffold(path = "pets", formBackingObject = Pet.class)
@RooWebFinder
public class PetController {
}
