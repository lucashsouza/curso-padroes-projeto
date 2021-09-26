package br.com.cod3r.bridge.mvc.services;

import br.com.cod3r.bridge.mvc.dao.UserDAO;
import br.com.cod3r.bridge.mvc.model.User;

public abstract class UserService {
    protected UserDAO userDao;

    public UserService(UserDAO userDao) {
        this.userDao = userDao;
    }

    public abstract void save(User user);

}
