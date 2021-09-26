package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.services.*;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

}
