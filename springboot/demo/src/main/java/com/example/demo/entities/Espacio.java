package com.example.demo.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Espacio {
    private int id;
    private String nombre;
    private String tipo;
    private int capacidad;
    private int precioBase;
}
