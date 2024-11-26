package com.gabriel.payment_service.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class Payment implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
