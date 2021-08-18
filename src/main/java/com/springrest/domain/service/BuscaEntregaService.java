package com.springrest.domain.service;

import org.springframework.stereotype.Service;

import com.springrest.domain.exception.EntidadeNaoEncontradaException;
import com.springrest.domain.model.Entrega;
import com.springrest.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
