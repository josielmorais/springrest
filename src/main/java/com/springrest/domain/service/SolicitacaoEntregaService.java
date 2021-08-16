package com.springrest.domain.service;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.domain.model.Cliente;
import com.springrest.domain.model.Entrega;
import com.springrest.domain.model.StatusEntrega;
import com.springrest.domain.repository.EntregaRepository;


@Service
public class SolicitacaoEntregaService {

	@Autowired
	private CatalogoClienteService catalogoClienteService;
	@Autowired
	private EntregaRepository entregaRepository;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(OffsetDateTime.now());
		
		return entregaRepository.save(entrega);
	}
	
}
