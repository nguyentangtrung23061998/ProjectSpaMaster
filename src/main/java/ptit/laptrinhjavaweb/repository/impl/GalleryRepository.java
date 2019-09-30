package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.GalleryEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.repository.IGalleryReposiory;

@Repository
public class GalleryRepository implements IGalleryReposiory{
	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	@Override
	@Transactional
	public List<GalleryEntity> getGallerys() {
		try {
			session = sessionFactory.getCurrentSession();
			Query<GalleryEntity> theQuery = session.createQuery("from GalleryEntity", GalleryEntity.class);
			List<GalleryEntity> gallerys = theQuery.getResultList();
			return gallerys;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

}
