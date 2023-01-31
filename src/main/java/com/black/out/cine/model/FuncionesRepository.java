package com.black.out.cine.model;

import com.black.out.cine.dao.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionesRepository extends JpaRepository<Funcion, Long> {

    List<Funcion> findByComplejo(String complejo);

    List<Funcion> findByPelicula(String pelicula);

    List<Funcion> findByFormato(String formato);

    List<Funcion> findByDia(String dia);

    List<Funcion> findByHorario(String horario);
}
