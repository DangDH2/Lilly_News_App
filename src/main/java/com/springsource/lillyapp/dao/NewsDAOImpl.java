package com.springsource.lillyapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.springsource.lillyapp.domain.News;

public class NewsDAOImpl implements NewsDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addNews(News n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(n);

	}

	@Override
	public void updateNews(News n) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(n);

	}

	@Override
	public List<News> listNews(int type) {
		Session session = this.sessionFactory.getCurrentSession();
		// List<News> newsList = session.createQuery("from Account").list();
		// return newsList;
		List<News> newsList = new ArrayList<News>();
		News n = new News();
		n.setId("Id 1");
		n.setTitle("Title 1");
		newsList.add(n);
		return newsList;
	}

	@Override
	public News getNewsId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeNews(String id) {
		// TODO Auto-generated method stub

	}

}