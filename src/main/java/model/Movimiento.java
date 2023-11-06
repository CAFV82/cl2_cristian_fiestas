package model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_movimientos")
@Entity(name = "Movimientos")
@Getter
@Setter
public class Movimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 255, nullable = false)
	private String descripcion;
	
	@Column(name = "fecha")
	private LocalDate fecha;
	
	@Column(name = "monto", precision = 10, scale = 2)
	private BigDecimal monto;
	
	@Column(name = "cuentaId")
	private Long cuentaId;
	
	

}
