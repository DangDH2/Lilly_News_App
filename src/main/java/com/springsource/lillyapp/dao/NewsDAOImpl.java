package com.springsource.lillyapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.springsource.lillyapp.domain.News;

@Repository
public class NewsDAOImpl implements NewsDAO {

	private EntityManagerFactory emf;

	@PersistenceUnit
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public void addNews(News n) {
		EntityManager em = this.emf.createEntityManager();
		em.persist(n);

	}

	@Override
	public void updateNews(News n) {
		EntityManager em = this.emf.createEntityManager();

	}

	@Override
	public List<News> listNews(int type) {
		// Session session = this.sessionFactory.getCurrentSession();
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
		EntityManager em = this.emf.createEntityManager();
		return new News();
	}

	@Override
	public void removeNews(String id) {
		EntityManager em = this.emf.createEntityManager();

	}

}
