package com.example.Book.My.Show.Application.EntryDtos;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserEntryDto {

    private String name;

    private int age;

    private String email;

    private String mobile;

    private String address;
}
