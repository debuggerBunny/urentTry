package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the universidad database table.
 * 
 */
@Entity
@NamedQuery(name="Universidad.findAll", query="SELECT u FROM Universidad u")
public class Universidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Universidad;

	private byte estado;

	private String nombre;

	//bi-directional many-to-one association to Sede
	@OneToMany(mappedBy="universidad")
	private List<Sede> sedes;

	public Universidad() {
	}

	public int getId_Universidad() {
		return this.id_Universidad;
	}

	public void setId_Universidad(int id_Universidad) {
		this.id_Universidad = id_Universidad;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sede> getSedes() {
		return this.sedes;
	}

	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

	public Sede addSede(Sede sede) {
		getSedes().add(sede);
		sede.setUniversidad(this);

		return sede;
	}

	public Sede removeSede(Sede sede) {
		getSedes().remove(sede);
		sede.setUniversidad(null);

		return sede;
	}

}