package br.com.portalsolidario.dao.utils;

import br.com.portalsolidario.dao.ProfileDao;
import br.com.portalsolidario.dao.ProfileDaoImpl;

public class DAOFactory {

	public static ProfileDao createProfile(){
        ProfileDaoImpl profileDaoImpl = new ProfileDaoImpl();
        profileDaoImpl.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return profileDaoImpl;
    }
	
}
