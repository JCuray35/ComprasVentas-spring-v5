package com.blumbit.ComprasVentas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blumbit.ComprasVentas.dto.CategoriaDto;
import com.blumbit.ComprasVentas.dto.CreateCategoriaDto;
import com.blumbit.ComprasVentas.service.CategoriaService;
import com.blumbit.ComprasVentas.service.ICategoriaService;

@RestController
@RequestMapping("/categorias") 
public class CategoriaController {

    @Autowired 
    private ICategoriaService categoriaService;

    @GetMapping     
    public List<CategoriaDto> listarCategorias(){
        return categoriaService.listarCategorias();
    }

    @GetMapping("/{id}")
    public CategoriaDto busCategoriaDtoPorId(@PathVariable Integer id){
        return categoriaService.obtenerCategoriaPorId(id);
    }

    public CategoriaDto crearCategoria(@RequestBody CreateCategoriaDto categoria){
        return categoriaService.crearCategoria(categoria);
    }

     @PutMapping("/{id}") 
     public CategoriaDto actualizarCategoria(@PathVariable Integer id , @RequestBody CreateCategoriaDto categoriaActualizada){
        return categoriaService.actualizarCategoria(id, categoriaActualizada);
     }  

     @DeleteMapping("/{id}")
     public void eliminarCategoria(@PathVariable Integer id){
        categoriaService.deleteCategoria(id);
     }



}
