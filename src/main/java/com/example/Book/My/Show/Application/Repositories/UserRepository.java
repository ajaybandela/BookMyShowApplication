package com.example.Book.My.Show.Application.Repositories;

import com.example.Book.My.Show.Application.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
