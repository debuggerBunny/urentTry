package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sede database table.
 * 
 */
@Entity
@NamedQuery(name="Sede.findAll", query="SELECT s FROM Sede s")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Sede;

	private String direccion;

	private byte estado;

	private String nombre;

	//bi-directional many-to-one association to Distancia
	@OneToMany(mappedBy="sede")
	private List<Distancia> distancias;

	//bi-directional many-to-one association to Universidad
	@ManyToOne
	@JoinColumn(name="id_Universidad")
	private Universidad universidad;

	public Sede() {
	}

	public int getId_Sede() {
		return this.id_Sede;
	}

	public void setId_Sede(int id_Sede) {
		this.id_Sede = id_Sede;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public List<Distancia> getDistancias() {
		return this.distancias;
	}

	public void setDistancias(List<Distancia> distancias) {
		this.distancias = distancias;
	}

	public Distancia addDistancia(Distancia distancia) {
		getDistancias().add(distancia);
		distancia.setSede(this);

		return distancia;
	}

	public Distancia removeDistancia(Distancia distancia) {
		getDistancias().remove(distancia);
		distancia.setSede(null);

		return distancia;
	}

	public Universidad getUniversidad() {
		return this.universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

}