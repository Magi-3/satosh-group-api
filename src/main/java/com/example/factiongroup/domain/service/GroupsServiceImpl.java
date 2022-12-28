package com.example.factiongroup.domain.service;

import com.example.factiongroup.domain.entity.Groups;
import com.example.factiongroup.domain.entity.Users;
import com.example.factiongroup.domain.repository.GroupsRepository;
import com.example.factiongroup.domain.repository.UsersRepository;
import com.example.factiongroup.domain.service.serviceinterface.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupsServiceImpl implements GroupsService {

    @Autowired
    GroupsRepository groupsRepository;
    @Autowired
    UsersRepository usersRepository;


    @Override
    public Groups createGroup(Groups group) {
        return groupsRepository.save(group);
    }

    @Override
    public void deleteGroup(Long id) {
        groupsRepository.deleteById(id);

    }

    @Override
    public Groups updateGroup(Groups data, Long id) {
        Groups entityGroup = groupsRepository.findById(id).orElseThrow();
        entityGroup.setGroupName(data.getGroupName());
        entityGroup.setGroupLength(data.getGroupLength());
        return groupsRepository.save(entityGroup);
    }

    @Override
    public List<Groups> listAllGroups() {
        return groupsRepository.findAll();
    }

    @Override
    public Groups findGroupById(Long id) {
        return groupsRepository.findById(id).orElseThrow();
    }

    @Override
    public void addUserInGroup(Long userId, Groups group) {
        Users user = usersRepository.findById(userId).orElseThrow();
        List<Users> list = new ArrayList<>();
        list.add(user);
        group.setUsers(list);
    }

    @Override
    public void deleteUserInGroup(Long id, Groups group) {
        List<Users> list = group.getUsers();
        Users user = usersRepository.findById(id).orElseThrow();
        if (list.contains(user)) {
            list.remove(user);
        } 




    }
}
