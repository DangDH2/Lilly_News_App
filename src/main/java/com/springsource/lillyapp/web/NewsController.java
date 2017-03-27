package com.springsource.lillyapp.web;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springsource.lillyapp.domain.News;
import com.springsource.lillyapp.services.NewsService;
import com.springsource.lillyapp.services.NewsServiceImpl;

@RequestMapping("/news")
@Controller
@RooWebScaffold(path = "news", formBackingObject = News.class)
@RooWebFinder
public class NewsController {
	private NewsService newsService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String getListnews(@RequestParam(value = "type", required = false, defaultValue = "1") String type,
	        Model model) {
		if (newsService == null) {
			newsService = new NewsServiceImpl();
		}
		System.out.println("DANG HO DANG ");
		model.addAttribute("lsNews", this.newsService.listNewsByType(type));
		System.out.println("DANG HO DANG ");
		return "news/list";
	}
}
