package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class VueloTO {

	private String numeroVuelo;
	private String origen;
	private String destino;
	private Character categoria;
	private String nombreAvion;
	private BigDecimal valorAsiento;
	
	public VueloTO() {
		// TODO Auto-generated constructor stub
	}
	
	public VueloTO(String numeroVuelo, String origen, String destino, Character categoria, String nombreAvion,
			BigDecimal valorAsiento) {
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.categoria = categoria;
		this.nombreAvion = nombreAvion;
		this.valorAsiento = valorAsiento;
	}

	// SET-GET
	public String getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Character getCategoria() {
		return categoria;
	}
	public void setCategoria(Character categoria) {
		this.categoria = categoria;
	}
	public String getNombreAvion() {
		return nombreAvion;
	}
	public void setNombreAvion(String nombreAvion) {
		this.nombreAvion = nombreAvion;
	}
	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}
	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}
}
