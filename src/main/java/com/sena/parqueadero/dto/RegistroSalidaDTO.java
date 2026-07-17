package com.sena.parqueadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {

	private Long IdRegistro;
	private String placa;
	private Double valorCobrado;
	private long horasEstadia;
}
