package com.henrique.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.henrique.spring.domain.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Integer> {

}
