package dev.rayssa.webcidades.user.services.implementation;

import dev.rayssa.webcidades.user.domains.InfoUsers;
import dev.rayssa.webcidades.user.domains.UserRepository;
import dev.rayssa.webcidades.user.models.request.LoginUserRequest;
import dev.rayssa.webcidades.user.models.request.RegisterUserRequest;
import dev.rayssa.webcidades.user.models.response.LoginUserResponse;
import dev.rayssa.webcidades.user.models.response.RegisterUserResponse;
import dev.rayssa.webcidades.user.services.UsersServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsersServicesImpl implements UsersServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse saveUser (RegisterUserRequest loginUserRequest) {

        ModelMapper modelMapper = new ModelMapper();

        InfoUsers userModel = modelMapper.map(loginUserRequest, InfoUsers.class);

        userModel.setUserId(UUID.randomUUID().toString());
        userModel.setLogged(true);
        userModel.setToken(UUID.randomUUID().toString());

        InfoUsers.put(userModel.getName(), userModel);
        InfoUsers.put(userModel.getEmail(), userModel);
        InfoUsers.put(userModel.getPassword(), userModel);
        InfoUsers.put(userModel.getUf(), userModel);
        InfoUsers.put(userModel.getCity(), userModel);

        InfoUsers userSaved = userRepository.save(userModel);

        return modelMapper.map(userSaved, RegisterUserResponse.class);

    }

    @Override
    public LoginUserResponse loginUser (String token){

        return null;
    }

}
