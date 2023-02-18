package fr.springboot.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.springboot.manytomany.model.Table1Table2AssociationModel;
import fr.springboot.manytomany.service.Table1Table2AssociationService;

@RestController
@RequestMapping("/api/table1table2association")
public class Table1Table2AssociationController {
	
	@Autowired
	Table1Table2AssociationService table1Table2AssociationService;
	
	@GetMapping("")
	public Iterable<Table1Table2AssociationModel> getAllTable1Table2AssociationModel() throws Exception {
		return table1Table2AssociationService.getAllTable1Table2AssociationModel();
	}
	
	@GetMapping("/{idTbl1}/{idTbl2}")
	public Table1Table2AssociationModel getAllTable1Table2AssociationModel(@PathVariable int idTbl1,@PathVariable int idTbl2) throws Exception {
		return table1Table2AssociationService.getAllTable1Table2AssociationModel(idTbl1,idTbl2);
	}
	
//	@PostMapping("")
//	public Table1Table2AssociationModel createTable1Table2AssociationModel() throws Exception {
//		return table1Table2AssociationService.createTable1Table2AssociationModel();
//	}
	
	@PostMapping("")
	public Table1Table2AssociationModel createTable1Table2AssociationModel(@RequestBody Table1Table2AssociationModel table1Table2AssociationModel) throws Exception {
		return table1Table2AssociationService.createTable1Table2AssociationModel(table1Table2AssociationModel);
	}

}
