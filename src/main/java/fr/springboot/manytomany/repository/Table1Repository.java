package fr.springboot.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.springboot.manytomany.model.Table1Model;


@Repository
public interface Table1Repository extends JpaRepository<Table1Model,Integer> {

	
}
