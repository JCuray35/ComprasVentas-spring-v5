package com.blumbit.ComprasVentas.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.blumbit.ComprasVentas.entity.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria , Integer> {
    
}
