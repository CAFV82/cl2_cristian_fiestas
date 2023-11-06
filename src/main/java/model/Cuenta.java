package model;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_cuentas")
@Entity(name = "Cuentas")
@Getter
@Setter
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "activa", length = 1, nullable = false)
	private Long activa;
	
	@Column(name = "numeroCuenta", length = 255, nullable = false)
	private String numeroCuenta;
	
	@Column(name = "saldo", precision = 10, scale = 2)
	private BigDecimal saldo;
	
	@Column(name = "clienteId")
	private Long clienteId;
	
	@Column(name = "tipoCuentaId")
	private Long tipoCuentaId;	
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(unique = true)
	private TipoCuenta tipocuenta;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private Movimiento movimiento;

}
