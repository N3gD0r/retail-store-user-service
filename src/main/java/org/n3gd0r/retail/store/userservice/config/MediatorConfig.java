package org.n3gd0r.retail.store.userservice.config;

import org.n3gd0r.commons.mediator.Mediator;
import org.n3gd0r.retail.store.userservice.usecase.register.RegisterUserCommand;
import org.n3gd0r.retail.store.userservice.usecase.register.RegisterUserParameters;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;

/**
 * MediatorConfig
 */
@Configuration
public class MediatorConfig {
    private final Mediator mediator;
    private final RegisterUserCommand registerCommand;

    public MediatorConfig(Mediator mediator, RegisterUserCommand registerCommand) {
        this.mediator = mediator;
        this.registerCommand = registerCommand;
    }

    @PostConstruct
    public void registerHandlers() {
        mediator.registerHandler(RegisterUserParameters.class, registerCommand);
    }
}
