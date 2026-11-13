package com.blumbit.ComprasVentas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blumbit.ComprasVentas.dto.CategoriaDto;
import com.blumbit.ComprasVentas.dto.CreateCategoriaDto;
import com.blumbit.ComprasVentas.entity.Categoria;
import com.blumbit.ComprasVentas.repository.CategoriaRepository;

@Service 
public class CategoriaService implements ICategoriaService {

    @Autowired 
    private CategoriaRepository categoriaRepository;


    public List<CategoriaDto> listarCategorias(){
        return categoriaRepository.findAll().stream()
            .map(CategoriaDto::fromEntity)
            .collect(java.util.stream.Collectors.toList());
    }

    public CategoriaDto obtenerCategoriaPorId(Integer id){
        return CategoriaDto.fromEntity(categoriaRepository.findById(id).get());
    }

    public CategoriaDto crearCategoria(CreateCategoriaDto categoria){
        Categoria nuevCategoria = CreateCategoriaDto.toEntity(categoria);
        return CategoriaDto.fromEntity(categoriaRepository.save(nuevCategoria));
    }

    public CategoriaDto actualizarCategoria(Integer id, CreateCategoriaDto categoriaActualizada){
        Categoria categoriaExistente = categoriaRepository.findById(id).get();
        categoriaExistente.setNombre(categoriaActualizada.getNombre());
        categoriaExistente.setDescripcion(categoriaActualizada.getDescripcion());
        return CategoriaDto.fromEntity(categoriaRepository.save(categoriaExistente));
    }

    public void deleteCategoria(Integer id){
        categoriaRepository.deleteById(id);
    }

  

}
