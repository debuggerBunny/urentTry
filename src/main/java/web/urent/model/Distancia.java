package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the distancias database table.
 * 
 */
@Entity
@Table(name="distancias")
@NamedQuery(name="Distancia.findAll", query="SELECT d FROM Distancia d")
public class Distancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Distancia;

	private byte estado;

	private int kilometros;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="id_Inmueble")
	private Inmueble inmueble;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="id_Sede")
	private Sede sede;

	public Distancia() {
	}

	public int getId_Distancia() {
		return this.id_Distancia;
	}

	public void setId_Distancia(int id_Distancia) {
		this.id_Distancia = id_Distancia;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public int getKilometros() {
		return this.kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}