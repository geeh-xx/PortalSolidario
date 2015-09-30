package br.com.portalsolidario.business;

import br.com.portalsolidario.dao.ProfileDao;
import br.com.portalsolidario.dao.utils.DAOFactory;
import br.com.portalsolidario.model.Profile;

public class ProfileBusiness {

	  private ProfileDao profileDao;
	     
	     
	    public ProfileBusiness() {
	        super();
	        setProfileDao(DAOFactory.createProfile());
	    }    
	     
	    private void setProfileDao(ProfileDao profileDao) {
	        this.profileDao = profileDao;
	    }
	 
	    public void save(Profile Profile){
	        profileDao.save(Profile);
	    }    
	
}
