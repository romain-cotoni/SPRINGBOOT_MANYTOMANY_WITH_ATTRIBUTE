package fr.springboot.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.springboot.manytomany.model.Table2Model;

@Repository
public interface Table2Repository extends JpaRepository<Table2Model,Integer> {

}
