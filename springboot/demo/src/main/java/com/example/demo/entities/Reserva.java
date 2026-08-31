package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    private int id;
    private Usuario usuario;
    private Espacio espacio;
    private LocalDate fecha;
    private LocalTime hora;
}
