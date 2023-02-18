package fr.springboot.manytomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.springboot.manytomany.model.Table1Model;
import fr.springboot.manytomany.model.Table2Model;
import fr.springboot.manytomany.model.Table1Table2AssociationModel;
import fr.springboot.manytomany.model.Table1Table2CompositeKey;
import fr.springboot.manytomany.repository.Table1Repository;
import fr.springboot.manytomany.repository.Table1Table2Repository;
import fr.springboot.manytomany.repository.Table2Repository;

@Service
public class Table1Table2AssociationService {
 
	@Autowired
	Table1Table2Repository table1Table2Repository;
	
	@Autowired
	Table2Repository table2Repository;
	
	@Autowired
	Table1Repository table1Repository;

//	public Table1Table2AssociationModel createTable1Table2AssociationModel() throws Exception {
//		try {	
//			Table1Model table1Model = new Table1Model("tab1",12);
//			Table2Model table2Model = new Table2Model("tab2",22);
//			table1Repository.save(table1Model);
//			table2Repository.save(table2Model);
//			Table1Table2CompositeKey compositeKey = new Table1Table2CompositeKey(table1Model.getId(),table2Model.getId());
//			Table1Table2AssociationModel table1Table2AssociationModel = new Table1Table2AssociationModel();
//			table1Table2AssociationModel.setCompositeKeyId(compositeKey);
//			table1Table2AssociationModel.setTable1Model(table1Model);
//			table1Table2AssociationModel.setTable2Model(table2Model);
//			table1Table2AssociationModel.setAttribut("helloworld");
//			return table1Table2Repository.save(table1Table2AssociationModel);
//		} catch (Exception exception) {
//			throw new Exception("Error in Table1Table2AssociationService - createTable1Table2AssociationModel() - " + exception.getMessage());
//		}
//	}
	
	public Table1Table2AssociationModel createTable1Table2AssociationModel(Table1Table2AssociationModel dtoTable1Table2AssociationModel) throws Exception {
		try {
			Table1Model table1Model = dtoTable1Table2AssociationModel.getTable1Model();
			Table2Model table2Model = dtoTable1Table2AssociationModel.getTable2Model();
			String      attribut    = dtoTable1Table2AssociationModel.getAttribut();
			Table1Table2CompositeKey compositeKey = new Table1Table2CompositeKey(table1Model.getId(),table2Model.getId());
			Table1Table2AssociationModel table1Table2AssociationModel = new Table1Table2AssociationModel();
			table1Table2AssociationModel.setCompositeKeyId(compositeKey);
			table1Table2AssociationModel.setTable1Model(table1Model);
			table1Table2AssociationModel.setTable2Model(table2Model);
			table1Table2AssociationModel.setAttribut(attribut);
			return table1Table2Repository.save(table1Table2AssociationModel);
		} catch (Exception exception) {
			throw new Exception("Error in Table1Table2AssociationService - createTable1Table2AssociationModel() - " + exception.getMessage());
		}
	}

	public Iterable<Table1Table2AssociationModel> getAllTable1Table2AssociationModel() {
		return table1Table2Repository.findAll();
	}

	public Table1Table2AssociationModel getAllTable1Table2AssociationModel(int idTbl1,int idTbl2) throws Exception{
		try {
			return table1Table2Repository.findById(new Table1Table2CompositeKey(idTbl1, idTbl2)).get();
		} catch(Exception exception) {
			throw new Exception("Error in Table1Table2AssociationService - getAllTable1Table2AssociationModel() - " + exception.getMessage());
		}
	}
}
