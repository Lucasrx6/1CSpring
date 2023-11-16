package br.com.projeto.api1.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.api1.modelo.Pessoa;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
  
    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);

    List<Pessoa> findByOrderByNome();

    List<Pessoa> findByNomeOrderByIdadeDesc(String nome);

    List<Pessoa> findByNomeContaining(String nome);

    List<Pessoa> findByNomeStartsWith(String nome);

    List<Pessoa> findByNomeEndsWith(String nome); 
    
    @Query(value = "SELECT SUM(idade) from pessoas", nativeQuery = true)
    int somaIdades();

    @Query(value = "SELECT * FROM pessoas WHERE idade >= :idade", nativeQuery = true)
    List<Pessoa> idadeMaiorIgual(int idade);
}


