package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the centroeducativo database table.
 * 
 */
@Entity
@NamedQuery(name="Centroeducativo.findAll", query="SELECT c FROM Centroeducativo c")
public class Centroeducativo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String descripcion;

	public Centroeducativo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}