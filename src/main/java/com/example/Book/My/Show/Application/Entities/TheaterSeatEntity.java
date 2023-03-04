package com.example.Book.My.Show.Application.Entities;

import com.example.Book.My.Show.Application.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "theatre_seats")
@Data
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private SeatType seatType;

    private String seatNo;

    @ManyToOne
    @JoinColumn
    private TheatreEntity theatreEntity;

}
