package com.example.factiongroup.domain.service.serviceinterface;

import com.example.factiongroup.domain.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {

    public Users createUser(Users user);

    public void deleteUser(Long id);

    public Users updateUser(Users user, Long id);

    public List<Users> listAllUsers();

    public Users findUserById(Long id);

    
}
