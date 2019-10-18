package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the arriendo database table.
 * 
 */
@Entity
@NamedQuery(name="Arriendo.findAll", query="SELECT a FROM Arriendo a")
public class Arriendo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Arriendo;

	private int estado;

	@Temporal(TemporalType.DATE)
	private Date fecha_Inicio;

	@Temporal(TemporalType.DATE)
	private Date fecha_Termino;

	//bi-directional many-to-one association to Arrendador
	@ManyToOne
	@JoinColumn(name="id_Arrendador")
	private Arrendador arrendador;

	//bi-directional many-to-one association to Arrendatario
	@ManyToOne
	@JoinColumn(name="id_Arrendatario")
	private Arrendatario arrendatario;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="id_Inmueble")
	private Inmueble inmueble;

	public Arriendo() {
	}

	public int getId_Arriendo() {
		return this.id_Arriendo;
	}

	public void setId_Arriendo(int id_Arriendo) {
		this.id_Arriendo = id_Arriendo;
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

	public Arrendador getArrendador() {
		return this.arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public Arrendatario getArrendatario() {
		return this.arrendatario;
	}

	public void setArrendatario(Arrendatario arrendatario) {
		this.arrendatario = arrendatario;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}