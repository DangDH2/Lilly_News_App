package com.springsource.lillyapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springsource.lillyapp.domain.News;

@Repository
public class NewsDAOImpl implements NewsDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void addNews(News n) {
		em.persist(n);

	}

	@Override
	public void updateNews(News n) {

	}

	@Override
	public List<News> listNews(int type) {
		List<News> lsNews = new ArrayList<News>();
		News n = new News();
		n.setId("1");
		n.setTitle("title 1");
		lsNews.add(n);
		// Query query = em.createQuery("from Product as p where p.category =
		// :category");
		// query.setParameter("category", category);
		// return query.getResultList();
		return lsNews;
	}

	@Override
	public News getNewsId(String id) {
		return new News();
	}

	@Override
	public void removeNews(String id) {

	}

}
