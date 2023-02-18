package fr.springboot.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.springboot.manytomany.model.Table1Table2AssociationModel;
import fr.springboot.manytomany.model.Table1Table2CompositeKey;

@Repository
public interface Table1Table2Repository extends JpaRepository<Table1Table2AssociationModel,Table1Table2CompositeKey> {

}
