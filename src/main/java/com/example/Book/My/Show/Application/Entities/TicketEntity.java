package com.example.Book.My.Show.Application.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tickets")
@Data
@NoArgsConstructor
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;

    private String theatreName;

    private LocalDate showDate;

    private LocalTime showTime;

    private int totalAmount;

    private String tickedId = UUID.randomUUID().toString();



    @ManyToOne
    @JoinColumn
    private UserEntity userEntity;


    // this is chold wrt show entity
    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;


}
