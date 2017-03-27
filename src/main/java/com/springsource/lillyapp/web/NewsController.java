package com.springsource.lillyapp.web;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springsource.lillyapp.domain.News;
import com.springsource.lillyapp.services.NewsService;

@RequestMapping("/news")
@Controller
@RooWebScaffold(path = "news", formBackingObject = News.class)
@RooWebFinder
public class NewsController {
	private NewsService newsService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String getListnews(@RequestParam("type") String type) {
		// model.addAttribute("news", new News());
		// model.addAttribute("lsNews", this.newsService.listNewsByType(1));
		return "news/list";
	}
}
