package com.app_agenda_back.service;

import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.mapper.CategoriaMapper;
import com.app_agenda_back.model.CategoriaEntity;
import com.app_agenda_back.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {
    @Autowired //service chama os métodos que estão no repository através dessa anotação
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;

    //buscar todas as categorias
    public List<CategoriaDTO> findAll(){
        List<CategoriaEntity> categorias = categoriaRepository.findAll(); //Categoria da lista é uma lista de entity para conversar com o BD
        return categorias.stream().map(categoriaMapper::toDTO).collect(Collectors.toList()); //converte os dados da Entity para DTO novamente. método stream faz a conversão
    }

    //buscar uma categoria pelo id
    public CategoriaDTO findById(Long id){ //recebe id do controller
        CategoriaEntity categoria = categoriaRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Categoria não encontrada"));
        return categoriaMapper.toDTO(categoria);  //converte para DTO a categoria que é entidade (no parâmetro)
    }

    //cria uma categoria
    public CategoriaDTO create(CategoriaDTO categoriaDTO){
        CategoriaEntity categoria = categoriaMapper.toEntity(categoriaDTO);
        categoria = categoriaRepository.save(categoria); //"categoria =" é a entidade com o id e os outros campos que o save salva no banco. Banco não aceita DTO

        return categoriaMapper.toDTO(categoria); //transforma em DTO e envia para o front-end
    }

    //atualiza categoria
    public CategoriaDTO update(Long id,CategoriaDTO categoriaDTO){
        CategoriaEntity categoria = categoriaRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Categoria atualizada"));
        categoriaMapper.updateEntity(categoriaDTO,categoria);
        categoria = categoriaRepository.save(categoria);
        return categoriaMapper.toDTO(categoria);
    }

    //deletar categoria
    public void deleteById(Long id){
        categoriaRepository.deleteById(id);
    }
}
