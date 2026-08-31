package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Espacio;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Usuario;

@Repository
public class ReservaRepository {
    private Map<Integer, Reserva> reservas = new HashMap<>();
    public ReservaRepository() {
        Usuario usuario1 = new Usuario(1, "Juan", "juan@example.com");
        Espacio espacio1 = new Espacio(1, "Sala de reuniones", "Reunión", 10, 100);
        Reserva reserva1 = new Reserva(1, usuario1, espacio1, java.time.LocalDate.now(), java.time.LocalTime.now());
        reservas.put(reserva1.getId(), reserva1);
    }
    public Reserva findById(int id) {
        return reservas.get(id);
    }
    public Collection<Reserva> findAll() {
        return reservas.values();
    }
}

