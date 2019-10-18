package web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the inmueble database table.
 * 
 */
@Entity
@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM Inmueble i")
public class Inmueble implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Inmueble;

	private int agua;

	private int cocina;

	private String descripcion;

	private String direccion;

	private int disponibilidad;

	private int estacionamiento;

	private byte estado;

	private int gas;

	private int luz;

	private int nro_Banos;

	private int nro_Habitaciones;

	private int precio_Mensual;

	private int wifi;

	//bi-directional many-to-one association to Arriendo
	@OneToMany(mappedBy="inmueble")
	private List<Arriendo> arriendos;

	//bi-directional many-to-one association to Distancia
	@OneToMany(mappedBy="inmueble")
	private List<Distancia> distancias;

	//bi-directional many-to-one association to Propiedades
	@ManyToOne
	@JoinColumn(name="id_Propiedad")
	private Propiedades propiedad;

	public Inmueble() {
	}

	public int getId_Inmueble() {
		return this.id_Inmueble;
	}

	public void setId_Inmueble(int id_Inmueble) {
		this.id_Inmueble = id_Inmueble;
	}

	public int getAgua() {
		return this.agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

	public int getCocina() {
		return this.cocina;
	}

	public void setCocina(int cocina) {
		this.cocina = cocina;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getEstacionamiento() {
		return this.estacionamiento;
	}

	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(int i) {
		this.estado =(byte) i;
	}

	public int getGas() {
		return this.gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getLuz() {
		return this.luz;
	}

	public void setLuz(int luz) {
		this.luz = luz;
	}

	public int getNro_Banos() {
		return this.nro_Banos;
	}

	public void setNro_Banos(int nro_Banos) {
		this.nro_Banos = nro_Banos;
	}

	public int getNro_Habitaciones() {
		return this.nro_Habitaciones;
	}

	public void setNro_Habitaciones(int nro_Habitaciones) {
		this.nro_Habitaciones = nro_Habitaciones;
	}

	public int getPrecio_Mensual() {
		return this.precio_Mensual;
	}

	public void setPrecio_Mensual(int precio_Mensual) {
		this.precio_Mensual = precio_Mensual;
	}

	public int getWifi() {
		return this.wifi;
	}

	public void setWifi(int wifi) {
		this.wifi = wifi;
	}

	public List<Arriendo> getArriendos() {
		return this.arriendos;
	}

	public void setArriendos(List<Arriendo> arriendos) {
		this.arriendos = arriendos;
	}

	public Arriendo addArriendo(Arriendo arriendo) {
		getArriendos().add(arriendo);
		arriendo.setInmueble(this);

		return arriendo;
	}

	public Arriendo removeArriendo(Arriendo arriendo) {
		getArriendos().remove(arriendo);
		arriendo.setInmueble(null);

		return arriendo;
	}

	public List<Distancia> getDistancias() {
		return this.distancias;
	}

	public void setDistancias(List<Distancia> distancias) {
		this.distancias = distancias;
	}

	public Distancia addDistancia(Distancia distancia) {
		getDistancias().add(distancia);
		distancia.setInmueble(this);

		return distancia;
	}

	public Distancia removeDistancia(Distancia distancia) {
		getDistancias().remove(distancia);
		distancia.setInmueble(null);

		return distancia;
	}

	public Propiedades getPropiedad() {
		return this.propiedad;
	}

	public void setPropiedad(Propiedades propiedade) {
		this.propiedad = propiedade;
	}

}