package com.example.factiongroup.domain.service.serviceinterface;

import com.example.factiongroup.domain.entity.Groups;
import com.example.factiongroup.domain.entity.Users;

import java.util.List;

public interface GroupsService {

    public Groups createGroup(Groups group);

    public void deleteGroup(Long id);

    public Groups updateGroup(Groups group, Long id);

    public List<Groups> listAllGroups();

    public Groups findGroupById(Long id);

    public void addUserInGroup(Long usedId, Groups group);

    public void deleteUserInGroup(Long id, Groups group);
}
