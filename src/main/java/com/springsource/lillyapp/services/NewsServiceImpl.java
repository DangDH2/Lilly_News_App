package com.springsource.lillyapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsource.lillyapp.dao.NewsDAO;
import com.springsource.lillyapp.dao.NewsDAOImpl;
import com.springsource.lillyapp.domain.News;

@Service
public class NewsServiceImpl implements NewsService {

	private NewsDAO newsDAO;

	@Override
	@Transactional
	public void addNews(News n) {
		newsDAO.addNews(n);
	}

	@Override
	@Transactional
	public void updateNews(News n) {
		newsDAO.updateNews(n);
	}

	@Override
	@Transactional
	public List<News> listNewsByType(String type) {
		if (newsDAO == null) {
			newsDAO = new NewsDAOImpl();
		}
		return newsDAO.listNews(Integer.parseInt(type));
	}

	@Override
	@Transactional
	public News getNewsById(String id) {
		return newsDAO.getNewsId(id);
	}

	@Override
	@Transactional
	public void removeNews(String id) {
		newsDAO.removeNews(id);
	}

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
}
