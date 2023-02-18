package fr.springboot.manytomany.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "table1_table2")
public class Table1Table2AssociationModel {

	@EmbeddedId
	Table1Table2CompositeKey compositeKeyId;
	
	@ManyToOne
	@MapsId("idTble1")
	@JoinColumn(name = "id_tbl1")
	Table1Model table1Model;
	
	@ManyToOne
	@MapsId("idTbl2")
	@JoinColumn(name = "id_tbl2")
	Table2Model table2Model;
	
	@Column(name = "attribut")
	private String attribut;

	public Table1Table2AssociationModel() {
		super();
	}

	
	public Table1Table2AssociationModel(Table1Model table1Model, Table2Model table2Model) {
		super();
		this.table1Model = table1Model;
		this.table2Model = table2Model;
	}

	

	public Table1Table2AssociationModel(Table1Model table1Model, Table2Model table2Model, String attribut) {
		this.table1Model = table1Model;
		this.table2Model = table2Model;
		this.attribut = attribut;
	}


	public Table1Table2CompositeKey getCompositeKeyId() {
		return compositeKeyId;
	}

	public void setCompositeKeyId(Table1Table2CompositeKey compositeKeyId) {
		this.compositeKeyId = compositeKeyId;
	}

	public Table1Model getTable1Model() {
		return table1Model;
	}

	public void setTable1Model(Table1Model table1Model) {
		this.table1Model = table1Model;
	}

	public Table2Model getTable2Model() {
		return table2Model;
	}

	public void setTable2Model(Table2Model table2Model) {
		this.table2Model = table2Model;
	}

	public String getAttribut() {
		return attribut;
	}

	public void setAttribut(String attribut) {
		this.attribut = attribut;
	}
	
	
}
