package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_clienteRol")
@Entity(name = "ClientesRol")
@Getter
@Setter
public class Cliente_Rol {
	
	@Column(name = "clienteId")
	private Long clienteId;
	
	@Column(name = "rolesId")
	private Long rolesId;

}
