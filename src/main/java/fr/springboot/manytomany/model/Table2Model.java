package fr.springboot.manytomany.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "table2")
public class Table2Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tbl2")
	private int id;
	
	@Column(name="label_tbl2", length=50)
	private String label;

	@Column(name="level_tbl2")
	private Integer level;

	//Bidirectional
	@JsonIgnore
	@OneToMany(mappedBy = "table2Model")
	Set<Table1Table2AssociationModel> table1Table2AssociationModel;

	public Table2Model() {
	}

	
	public Table2Model(String label, Integer level) {
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
		return this.level;
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
