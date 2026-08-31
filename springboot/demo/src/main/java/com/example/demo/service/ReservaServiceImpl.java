package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Reserva;
import com.example.demo.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    ReservaRepository reservaRepository;

    @Override
    public Reserva searchById(int id) {
        return reservaRepository.findById(id);
    }

    @Override 
    public Collection<Reserva> searchAll() {
        return reservaRepository.findAll();
    }
}
