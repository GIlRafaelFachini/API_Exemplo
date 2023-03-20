package br.com.nomes.treinamento.repository;

import br.com.nomes.treinamento.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa,Long>{
}
