package br.com.portalsolidario.dao.utils;

import br.com.portalsolidario.dao.ProfileDao;
import br.com.portalsolidario.dao.ProfileDaoImpl;
import br.com.portalsolidario.dao.UserDao;
import br.com.portalsolidario.dao.UserImpl;

public class DAOFactory {

	public static ProfileDao createProfile() {
		ProfileDaoImpl profileDaoImpl = new ProfileDaoImpl();
		profileDaoImpl.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return profileDaoImpl;
	}

	public static UserDao createUser() {
		UserImpl userImpl = new UserImpl();
		userImpl.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return userImpl;
	}

}
