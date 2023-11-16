package br.com.projeto.api1.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.api1.modelo.Mensagem;

@Service
public class servico {

    @Autowired
    private Mensagem mensagem;
    
}
