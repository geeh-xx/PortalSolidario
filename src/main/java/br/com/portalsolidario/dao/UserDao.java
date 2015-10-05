package br.com.portalsolidario.dao;

import br.com.portalsolidario.model.User;

	public interface UserDao {
		public boolean existsValidation(String validation);

		public void save(User user);
	}


