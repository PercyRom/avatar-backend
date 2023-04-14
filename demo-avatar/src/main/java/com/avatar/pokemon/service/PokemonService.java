package com.avatar.pokemon.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.avatar.pokemon.dto.PokemonEvolutionChainResponse;
import com.avatar.pokemon.dto.PokemonListResponse;
import com.avatar.pokemon.dto.PokemonSpecieResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PokemonService implements PokemonInterface {

	private final String baseListUrl = "https://pokeapi.co/api/v2/pokemon-species?offset=%d&limit=%d";

	@Override
	public PokemonListResponse getListaPokemon(Integer start, Integer limit) {
		RestTemplate restTemplate;
		HttpHeaders headers;
		HttpEntity<String> entity;
		ResponseEntity<PokemonListResponse> response;

		restTemplate = new RestTemplate();
		headers = new HttpHeaders();

		headers.add("user-agent", "Application");
		entity = new HttpEntity<>(headers);

		response = restTemplate.exchange(baseListUrl, HttpMethod.GET, entity, PokemonListResponse.class);

		return response.getBody();
	}

	@Override
	public PokemonSpecieResponse getPokemonSpecie(String url) {
		
		RestTemplate restTemplate;
		HttpHeaders headers;
		HttpEntity<String> entity;
		ResponseEntity<PokemonSpecieResponse> response;
		
		restTemplate = new RestTemplate();
		headers = new HttpHeaders();
		
		headers.add("user-agent", "Application");
		entity = new HttpEntity<>(headers);
		
		response = restTemplate.exchange(url, HttpMethod.GET, entity, PokemonSpecieResponse.class);
		
		return response.getBody();
	}

	@Override
	public PokemonEvolutionChainResponse getEvolutionChain(String url) {
				
		RestTemplate restTemplate;
		HttpHeaders headers;
		HttpEntity<String> entity;
		ResponseEntity<PokemonEvolutionChainResponse> response;
		
		restTemplate = new RestTemplate();
		headers = new HttpHeaders();
		
		headers.add("user-agent", "Application");
		entity = new HttpEntity<>(headers);
		
		response = restTemplate.exchange(url, HttpMethod.GET, entity, PokemonEvolutionChainResponse.class);
		
		return response.getBody();
	}

}
