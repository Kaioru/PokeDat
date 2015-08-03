package io.github.kaioru;

import java.util.Map;
import java.util.Optional;

import io.github.kaioru.species.SpeciesData;

public abstract class Crawler {

	public abstract Optional<SpeciesData> crawl(Integer pkmn);

	public abstract Optional<SpeciesData> crawl(String raw);

	public abstract boolean fillMap(Map<Integer, Optional<SpeciesData>> map);

}
