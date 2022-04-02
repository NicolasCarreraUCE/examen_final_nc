package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@Column(name = "vuel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vuelo") 
	@SequenceGenerator(name = "seq_vuelo", sequenceName = "seq_vuelo", allocationSize = 1)
	private Integer id;
	
	@Column(name = "vuel_numero")
	private String numero;
	
	@Column(name = "vuel_fecha_vuelo")
	private LocalDateTime fechaVuelo;
	
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	
	@Column(name = "vuel_valor_asiento")
	private BigDecimal valorAsiento;
	
	@Column(name = "vuel_estado")
	private Character estado;
	
	@Column(name = "vuel_origen")
	private String origen;
	
	@Column(name = "vuel_destino")
	private String destino;
	
	@ManyToOne
	@JoinColumn(name = "avio_id")
	private Avion avion;
	
	@OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CompraPasaje> compraPasajes;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
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

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<CompraPasaje> getCompraPasajes() {
		return compraPasajes;
	}

	public void setCompraPasajes(List<CompraPasaje> compraPasajes) {
		this.compraPasajes = compraPasajes;
	}
	
}
