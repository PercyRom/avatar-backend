package com.avatar.pokemon.dto;

import java.util.List;

import lombok.Data;

@Data
public class PokemonListResponse {
	private Integer count;
	private String next;
	private String previous;
	List<PokemonListDetail> results;

	@Data
	public static class PokemonListDetail {
		private String name;
		private String url;
	}
}
