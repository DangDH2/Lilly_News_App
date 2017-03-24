package com.springsource.lillyapp.web;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsource.lillyapp.domain.Visit;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/visits")
@Controller
@RooWebScaffold(path = "visits", formBackingObject = Visit.class)
@RooWebFinder
public class VisitController {
}
