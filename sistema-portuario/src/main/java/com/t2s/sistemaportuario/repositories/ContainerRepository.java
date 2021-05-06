package com.t2s.sistemaportuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.t2s.sistemaportuario.model.Container;

@Repository
public interface ContainerRepository extends JpaRepository<Container, Long> {

}
