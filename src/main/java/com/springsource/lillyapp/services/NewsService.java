package com.springsource.lillyapp.services;

import java.util.List;

import com.springsource.lillyapp.domain.News;

public interface NewsService {

	public void addNews(News p);

	public void updateNews(News p);

	public List<News> listNewsByType(String type);

	public News getNewsById(String id);

	public void removeNews(String id);

}
