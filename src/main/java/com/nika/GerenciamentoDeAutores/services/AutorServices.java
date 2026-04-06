package com.nika.GerenciamentoDeAutores.services;

import com.nika.GerenciamentoDeAutores.model.AutorModel;
import com.nika.GerenciamentoDeAutores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServices {
    @Autowired
    private AutorRepository repository;

    public AutorModel salvar(AutorModel autor){
        return repository.save(autor);
    }

    public List<AutorModel> listar(){
        return repository.findAll();
    }

    public AutorModel atualizar(Long id, AutorModel autorAtualizado){
        Optional<AutorModel> autorExistente = repository.findById(id);

        if(autorExistente.isPresent()){
            AutorModel autor = autorExistente.get();
            autor.setNome(autorAtualizado.getNome());
            autor.setDataNascimento(autorAtualizado.getDataNascimento());
            autor.setStatus(autorAtualizado.getStatus());
            autor.setNacionalidade(autorAtualizado.getNacionalidade());

            return repository.save(autor);
        }else{
            throw new RuntimeException("Autor não encontrado no id" + id);
        }
    }

    public AutorModel buscar(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }



}
