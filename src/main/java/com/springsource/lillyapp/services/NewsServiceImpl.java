package com.springsource.lillyapp.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springsource.lillyapp.dao.NewsDAO;
import com.springsource.lillyapp.domain.News;

@Service
public class NewsServiceImpl implements NewsService {

	private NewsDAO newsDAO;

	@Override
	@Transactional
	public void addNews(News p) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void updateNews(News p) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<News> listNewsByType(String type) {
		return newsDAO.listNews(Integer.parseInt(type));
	}

	@Override
	@Transactional
	public News getNewsById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeNews(String id) {
		// TODO Auto-generated method stub

	}

}
