package com.example.factiongroup.domain.repository;

import com.example.factiongroup.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
