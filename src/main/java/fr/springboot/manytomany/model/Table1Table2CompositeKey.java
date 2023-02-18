package fr.springboot.manytomany.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Table1Table2CompositeKey implements Serializable {
	 
	private static final long serialVersionUID = -4240618437656786996L;

	@Column(name = "id_tbl1")
	private int  idTbl1;
	
	@Column(name = "id_tbl2")
	private int idTbl2;

	public Table1Table2CompositeKey() {
		super();
	}

	public Table1Table2CompositeKey(int idTbl1, int idTbl2) {
		super();
		this.idTbl1 = idTbl1;
		this.idTbl2 = idTbl2;
	}

	public int getIdTbl1() {
		return idTbl1;
	}

	public void setIdTbl1(int idTbl1) {
		this.idTbl1 = idTbl1;
	}

	public int getIdTbl2() {
		return idTbl2;
	}

	public void setIdTbl2(int idTbl2) {
		this.idTbl2 = idTbl2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTbl1, idTbl2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Table1Table2CompositeKey other = (Table1Table2CompositeKey) obj;
		return idTbl1 == other.idTbl1 && idTbl2 == other.idTbl2;
	}

	
	
}
