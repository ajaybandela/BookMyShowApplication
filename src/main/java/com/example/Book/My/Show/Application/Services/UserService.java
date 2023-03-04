package com.example.Book.My.Show.Application.Services;

import com.example.Book.My.Show.Application.Entities.UserEntity;
import com.example.Book.My.Show.Application.EntryDtos.UserEntryDto;
import com.example.Book.My.Show.Application.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public void addUser(UserEntryDto userEntryDto){

        // Here we need to convert and save

        // creating objects
        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName()).address(userEntryDto.getAddress()).email(userEntryDto.getEmail()).mobile(userEntryDto.getMobile()).build();


        userRepository.save(userEntity);
        // This is to set all of the attributs in 1 go.
    }
}
