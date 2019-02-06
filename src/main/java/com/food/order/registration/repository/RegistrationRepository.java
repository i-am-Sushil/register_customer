package com.food.order.registration.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.order.registration.model.User;
import com.food.order.registration.model.RegistrationResult;

@Service
public class RegistrationRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public RegistrationResult register(final User request) {
		System.out.println("RegistrationRepository.register()");
		final Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(request);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
			return new RegistrationResult(Boolean.FALSE, e.getMessage());
		} finally {
			session.close();
		}
		return new RegistrationResult(Boolean.TRUE, null);
	}
}
