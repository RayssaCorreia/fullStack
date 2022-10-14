package dev.rayssa.webcidades.user.services;

import dev.rayssa.webcidades.user.models.request.LoginUserRequest;
import dev.rayssa.webcidades.user.models.request.RegisterUserRequest;
import dev.rayssa.webcidades.user.models.response.LoginUserResponse;
import dev.rayssa.webcidades.user.models.response.RegisterUserResponse;

public interface UsersServices {
    LoginUserResponse loginUser (String token);

    RegisterUserResponse saveUser (RegisterUserRequest loginUserRequest);
}
