package pe.edu.cibertec.patitas_frontend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public record LoginResponseDTO(String code, String msj, String user, String userGmail) {
}
