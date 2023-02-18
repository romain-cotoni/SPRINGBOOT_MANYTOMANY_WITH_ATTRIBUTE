package fr.springboot.manytomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;

@Entity
@Table(name = "table1")
public class Table1Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tbl1")
	private int id;

	@Column(name = "label_tbl1", length = 50)
	private String label;

	@Column(name = "level_tbl1")
	private Integer level;

    //Bidirectional
	@JsonIgnore
	@OneToMany(mappedBy = "table1Model")
	Set<Table1Table2AssociationModel> table1Table2AssociationModel;

	public Table1Model() {
	}

	
	public Table1Model(String label, Integer level) {
		this.label = label;
		this.level = level;
	}


	public int getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	//Bidirectional
	public Set<Table1Table2AssociationModel> getTable1Table2AssociationModel() {
		return table1Table2AssociationModel;
	}

	public void setTable1Table2AssociationModel(Set<Table1Table2AssociationModel> table1Table2AssociationModel) {
		this.table1Table2AssociationModel = table1Table2AssociationModel;
	}

}
