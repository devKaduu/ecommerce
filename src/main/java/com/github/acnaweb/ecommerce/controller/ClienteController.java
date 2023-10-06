package com.github.acnaweb.ecommerce.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping
    public List<ClientDTO> getAll() {
        List<ClientDTO> result = null;
        return result; // payload
    }
}
