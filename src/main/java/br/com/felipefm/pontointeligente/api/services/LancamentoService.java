package br.com.felipefm.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import br.com.felipefm.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {
	
	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionário
	 * @param funcionarioId
	 * @param pageRequest
	 * @return
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);

	/**
	 * Retorna um lançamento por ID
	 * @param id
	 * @return
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persistir um lançamento na base de dados
	 * @param lancamento
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lançamento da base de dados.
	 * @param id
	 */
	void remover(Long id);
}
