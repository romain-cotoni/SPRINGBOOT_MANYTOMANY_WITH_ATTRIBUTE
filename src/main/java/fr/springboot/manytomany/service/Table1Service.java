package fr.springboot.manytomany.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.springboot.manytomany.model.Table1Model;
import fr.springboot.manytomany.repository.Table1Repository;

@Service
public class Table1Service {

	@Autowired
	Table1Repository table1Repository;

	public Iterable<Table1Model> getAllTable1Models() {
		return table1Repository.findAll();
	}

	public Table1Model getTable1ModelById(Integer id) throws Exception {
		try {
			Optional<Table1Model> optional = table1Repository.findById(id);
			if (optional.isPresent())
				return optional.get();
			else
				return null;
		} catch (Exception exception) {
			throw new Exception("Error in Table1Service - getTable1ModelById() - " + exception.getMessage());
		}
	}

	public Table1Model createTable1Model(Table1Model table1Model) throws Exception {
		try {			
			return table1Repository.save(table1Model);
		} catch (Exception exception) {
			throw new Exception("Error in Table1Service - createTable1Model() - " + exception.getMessage());
		}
	}

	public void deleteTable1Model(Integer id) throws Exception {
		table1Repository.deleteById(id);
	}

}
