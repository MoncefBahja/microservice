package com.example.assosiationservice.repo;

import com.example.assosiationservice.entities.Assosiation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface RepoAssosiation extends JpaRepository<Assosiation,Long> {

}
