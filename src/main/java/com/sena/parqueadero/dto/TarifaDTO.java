package com.sena.parqueadero.dto;

import com.sena.parqueadero.model.TipoVehiculo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class TarifaDTO {
	private Long idTarifa;
	@NotNull(message = "El tipo de vehiculo es obligatorio")
	private TipoVehiculo tipoVehiculo;
	@NotNull(message = "La tarifa por hora es obligatoria")
	@Positive(message = "La tarifa por hora es mayor a 0")
	private Double tarifaPorHora;
	@NotNull(message = "La tarifa por dia es obligatoria")
	@Positive(message = "La tarifa por dia es mayor a 0")
	private Double tarifaPorDia; 

	
	
}
