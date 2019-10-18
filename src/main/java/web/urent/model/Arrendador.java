package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the arrendador database table.
 * 
 */
@Entity
@NamedQuery(name="Arrendador.findAll", query="SELECT a FROM Arrendador a")
public class Arrendador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Arrendador;

	private double calificacion;

	private String correo;

	private int estado;

	private String nombre;

	private String rut_Arrendador;

	private String telefono;

	//bi-directional many-to-one association to Arriendo
	@OneToMany(mappedBy="arrendador")
	private List<Arriendo> arriendos;

	//bi-directional many-to-one association to Propiedade
	@OneToMany(mappedBy="arrendador")
	private List<Propiedades> propiedades;

	public Arrendador() {
	}

	public int getId_Arrendador() {
		return this.id_Arrendador;
	}

	public void setId_Arrendador(int id_Arrendador) {
		this.id_Arrendador = id_Arrendador;
	}

	public double getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut_Arrendador() {
		return this.rut_Arrendador;
	}

	public void setRut_Arrendador(String rut_Arrendador) {
		this.rut_Arrendador = rut_Arrendador;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Arriendo> getArriendos() {
		return this.arriendos;
	}

	public void setArriendos(List<Arriendo> arriendos) {
		this.arriendos = arriendos;
	}

	public Arriendo addArriendo(Arriendo arriendo) {
		getArriendos().add(arriendo);
		arriendo.setArrendador(this);

		return arriendo;
	}

	public Arriendo removeArriendo(Arriendo arriendo) {
		getArriendos().remove(arriendo);
		arriendo.setArrendador(null);

		return arriendo;
	}

	public List<Propiedades> getPropiedades() {
		return this.propiedades;
	}

	public void setPropiedades(List<Propiedades> propiedades) {
		this.propiedades = propiedades;
	}

	public Propiedades addPropiedade(Propiedades propiedades) {
		getPropiedades().add(propiedades);
		propiedades.setArrendador(this);

		return propiedades;
	}

	public Propiedades removePropiedade(Propiedades propiedades) {
		getPropiedades().remove(propiedades);
		propiedades.setArrendador(null);

		return propiedades;
	}

}