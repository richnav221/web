package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ReservaService;
@Controller
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    ReservaService reservaService;

    @GetMapping
    public String mostrarReservas(Model model){
        model.addAttribute("reservas", reservaService.searchAll());
        return "mostrar_reservas";
    }
}
