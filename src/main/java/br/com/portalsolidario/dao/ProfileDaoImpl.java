package br.com.portalsolidario.dao;

import org.hibernate.Session;

import br.com.portalsolidario.model.Profile;

public class ProfileDaoImpl implements ProfileDao{

	private Session session;
	
	 public void setSession(Session session) {
	        this.session = session;
	    }
	
	@Override
	public void save(Profile profile) {
		// TODO Auto-generated method stub
        this.session.saveOrUpdate(profile);

	}

}
