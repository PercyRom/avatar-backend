package com.avatar.pokemon.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class PokemonSpecieResponse {
    private Integer base_happiness;
    private Integer capture_rate;
    private Color color;
    private List<EggGroup> egg_groups;
    private EvolutionChain evolution_chain;
    private EvolveFromSpecie evolves_from_species;
    private Boolean has_gender_differences;
    private Integer hatch_counter;
    private Integer id;
    private Boolean is_baby;
    private Boolean is_legendary;
    private Boolean is_mythical;
    private String name;

    @Data
    private static class Base {
        private String name;
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    private static class Color extends Base {
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    private static class EggGroup extends Base{
    }

    @Data
    private static class EvolutionChain {
        private String url;
    }

    @Data
    @EqualsAndHashCode(callSuper = false)
    private static class EvolveFromSpecie extends Base {
    }
}
