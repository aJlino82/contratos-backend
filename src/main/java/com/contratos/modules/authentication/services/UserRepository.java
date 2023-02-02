package com.contratos.modules.authentication.services;

import com.contratos.modules.authentication.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}