package br.com.cod3r.mediator.translate.mediator;

import br.com.cod3r.mediator.translate.model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }
}
