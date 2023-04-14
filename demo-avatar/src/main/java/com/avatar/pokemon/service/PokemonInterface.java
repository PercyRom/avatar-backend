package com.avatar.pokemon.service;

import com.avatar.pokemon.dto.PokemonEvolutionChainResponse;
import com.avatar.pokemon.dto.PokemonListResponse;
import com.avatar.pokemon.dto.PokemonSpecieResponse;

public interface PokemonInterface {
    PokemonListResponse getListaPokemon(Integer start, Integer limit);

    PokemonSpecieResponse getPokemonSpecie(String url);

    PokemonEvolutionChainResponse getEvolutionChain(String url);
}
