package br.com.fiap.springpfentregas.service;

import br.com.fiap.springpfentregas.entity.Pessoa;
import org.springframework.data.domain.Example;

import java.util.Collection;


/**
 * @param <Entity>   é uma classe que tem a anotação @Entity
 * @param <Request>  é um DTO de requisição
 * @param <Response> é um DTO de response
 */
public interface ServiceDTO<Entity, Request, Response> {

    /**
     * Este método converte um DTO de requisição para uma
     * Entidade pronta para ser persistida pela primeira vez no Banco de dados
     *
     * @param request um DTO de Request
     * @return é a Entidade pronta para ser salva pela primeira vez no Banco de dados
     */

    Entity toEntity(Request request);

    Response toResponse(Entity entity);

    Collection<Entity> findAll();

    Collection<Entity> findAll(Example<Entity> example);

    Entity findById(Long id);

    Entity save(Entity entity);


}
