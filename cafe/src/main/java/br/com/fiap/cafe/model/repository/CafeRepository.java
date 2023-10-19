package br.com.fiap.cafe.model.repository;
import br.com.fiap.cafe.model.Cafe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CafeRepository {
	private static List<Cafe> cafes = null;
	
	static {
		cafes = new ArrayList<Cafe>();
		Cafe tresCoracoes = new Cafe();
		tresCoracoes.setId(10L);
		tresCoracoes.setNome("Cafe 3 coracoes");
		tresCoracoes.setDataFabricacao(LocalDate.now());
		tresCoracoes.setDataValidade(LocalDate.now().plusYears(1));
		tresCoracoes.setPreco(20.5);
		cafes.add(tresCoracoes);
		
		Cafe pilao = new Cafe(11L, "Cafe Pilao", 21.5, LocalDate.now(), LocalDate.now().plusYears(1));
		cafes.add(pilao);
	}
	
	public static List<Cafe> findAll(){
		return cafes;
	}

}
