package com.springsource.lillyapp.dao;

import java.util.List;

import com.springsource.lillyapp.domain.News;

public interface NewsDAO {

	public void addNews(News n);

	public void updateNews(News n);

	public List<News> listNews(int type);

	public News getNewsId(String id);

	public void removeNews(String id);
}
