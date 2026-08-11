package org.n3gd0r.retail.store.userservice.usecase.register;

import org.n3gd0r.commons.mediator.RequestHandler;
import org.n3gd0r.retail.store.userservice.domain.RoleEnum;
import org.n3gd0r.retail.store.userservice.domain.User;
import org.n3gd0r.retail.store.userservice.domain.UserDetails;
import org.n3gd0r.retail.store.userservice.domain.UserDetailsId;
import org.n3gd0r.retail.store.userservice.domain.UserId;
import org.n3gd0r.retail.store.userservice.domain.UserRole;
import org.n3gd0r.retail.store.userservice.repository.RoleRepository;
import org.n3gd0r.retail.store.userservice.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * RegisterUserCommand
 */
@Component
@Transactional
public class RegisterUserCommand implements RequestHandler<RegisterUserParameters, User> {
    private final UserRepository repository;
    private final RoleRepository roleRepository;

    public RegisterUserCommand(UserRepository repository, RoleRepository roleRepository) {
        this.repository = repository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User execute(RegisterUserParameters request) {
        if (request == null) {
            throw new IllegalArgumentException();
        }
        repository.validateExistsByUserName(request.userName());
        UserDetailsId detailsId = repository.nextUserDetailsId();
        UserId id = repository.nextId();
        UserRole role = roleRepository.getRole(RoleEnum.USER);
        UserDetails details = new UserDetails(detailsId, request.firstName(), request.lastName(), request.email(),
                request.phoneNumber(), request.street(), request.streetNumber(),
                request.zipCode(), request.locality(), request.country());
        User user = new User(id, request.userName(), request.password(), true, details, role);
        repository.save(user);
        return user;
    }
}
