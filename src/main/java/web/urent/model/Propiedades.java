package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the propiedades database table.
 * 
 */
@Entity
@Table(name="propiedades")
@NamedQuery(name="Propiedades.findAll", query="SELECT p FROM Propiedades p")
public class Propiedades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Propiedad;

	private int estado;

	@Temporal(TemporalType.DATE)
	private Date fecha_Inicio;

	@Temporal(TemporalType.DATE)
	private Date fecha_Termino;

	//bi-directional many-to-one association to Inmueble
	@OneToMany(mappedBy="propiedades")
	private List<Inmueble> inmuebles;

	//bi-directional many-to-one association to Arrendador
	@ManyToOne
	@JoinColumn(name="id_Arrendador")
	private Arrendador arrendador;

	public Propiedades() {
	}

	public int getId_Propiedad() {
		return this.id_Propiedad;
	}

	public void setId_Propiedad(int id_Propiedad) {
		this.id_Propiedad = id_Propiedad;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha_Inicio() {
		return this.fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Termino() {
		return this.fecha_Termino;
	}

	public void setFecha_Termino(Date fecha_Termino) {
		this.fecha_Termino = fecha_Termino;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setPropiedade(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setPropiedade(null);

		return inmueble;
	}

	public Arrendador getArrendador() {
		return this.arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

}