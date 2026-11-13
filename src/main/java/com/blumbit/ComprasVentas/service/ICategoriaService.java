package com.blumbit.ComprasVentas.service;

import java.util.List;

import com.blumbit.ComprasVentas.dto.CategoriaDto;
import com.blumbit.ComprasVentas.dto.CreateCategoriaDto;

public interface ICategoriaService {

    List<CategoriaDto> listarCategorias();

    CategoriaDto obtenerCategoriaPorId(Integer id);

    CategoriaDto crearCategoria(CreateCategoriaDto categoria);

    CategoriaDto actualizarCategoria(Integer id, CreateCategoriaDto categoriaActualizada);

    void deleteCategoria(Integer id);

}
