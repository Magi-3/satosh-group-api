package com.example.factiongroup.domain.repository;

import com.example.factiongroup.domain.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupsRepository extends JpaRepository<Groups, Long> {
}
