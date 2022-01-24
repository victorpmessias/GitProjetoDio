package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		Gato gato = new Gato("Joao", "Preto", 18);
		System.out.println(gato.getCor());
	}
}
