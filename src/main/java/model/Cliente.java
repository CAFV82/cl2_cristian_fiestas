package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_clientes")
@Entity(name = "Cliente")
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ape_pat", length = 255, nullable = false)
	private String apellidoPaterno;
	
	@Column(name = "ape_mat", length = 255, nullable = false)
	private String apellidoMaterno;
	
	@Column(name = "nombres", length = 255, nullable = false)
	private String nombres;
	
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private Cuenta cuenta;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	private Rol rol;
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" 	+ nombres + "]";
	}
	

}
