package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserOracleDAO;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserREST;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSOAP;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserREST(new UserOracleDAO());
		userRestOracleService.save(user);

		UserService userEJBOracleService = new UserEJB(new UserOracleDAO());
		userEJBOracleService.save(user);

		UserService userSoapOracleService = new UserSOAP(new UserOracleDAO());
		userSoapOracleService.save(user);
	}
}
