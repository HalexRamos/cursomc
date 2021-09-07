package com.halexramos.cursomc.services;

import com.halexramos.cursomc.domain.Pedido;
import com.halexramos.cursomc.repositories.CategoriaRepository;
import com.halexramos.cursomc.repositories.PedidoRepository;
import com.halexramos.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
