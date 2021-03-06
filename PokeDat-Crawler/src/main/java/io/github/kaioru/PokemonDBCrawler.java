/* 
 * PokeDat - A Pokemon Data API.
 * Copyright (C) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.kaioru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import io.github.kaioru.species.SpeciesData;

public class PokemonDBCrawler extends Crawler {

	private static String POKEMON_DATABASE = "http://pokemondb.net";
	private static String POKEMON_PAGE_URL = POKEMON_DATABASE + "/pokedex";
	private static String POKEMON_PAGE_LIST = POKEMON_PAGE_URL + "/national";
	private static String POKEMON_PAGE_START = "<br><a class=\"ent-name\" href=\"";
	private static String POKEMON_PAGE_END = "\">";

	private static String STATE_ID_START = "<li class=\"svtabs-tab\"><a href=\"#svtabs_basic_";
	private static String STATE_ID_END = "\">";
	private static String STATE_LIST_START = "<li id=\"svtabs_basic_%d\" class=\"svtabs-panel\">";

	private static String NAME_START = "<title>";
	private static String NAME_END = " Pokédex";

	private static String DEX_ENTRY_HEADER = "<h2>Pokédex entries</h2>";
	private static String X_DEX_ENTRY_HEADER = "<th>X</th>";
	private static String Y_DEX_ENTRY_HEADER = "<th>Y</th>";
	private static String DEX_ENTRY_START = "<td>";
	private static String DEX_ENTRY_END = "</td>";

	private static String ORAS_LEARN_SET_START = "<li id=\"svtabs_moves_14\" class=\"svtabs-panel\">";
	private static String ORAS_LEARN_SET_END = "<li id=\"svtabs_moves_13\" class=\"svtabs-panel\">";
	private static String LEARN_SET_ENTRY_HEADER = "<h2>Moves learnt by level up</h2>";

	@Override
	public Optional<SpeciesData> crawl(Integer pkmn) {
		String raw = "";

		try {
			URL url = new URL(POKEMON_PAGE_URL + "/" + pkmn);
			URLConnection con = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			in.lines().forEach(s -> raw.concat(s));
			in.close();
		} catch (IOException e) {
		}
		return crawl(raw);
	}

	@Override
	public Optional<SpeciesData> crawl(URL url) {
		String raw = "";

		try {
			URLConnection con = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			in.lines().forEach(s -> raw.concat(s));
			in.close();
		} catch (IOException e) {
		}
		return crawl(raw);
	}

	@Override
	public Optional<SpeciesData> crawl(String raw) {
		try {
			SpeciesData sd = new SpeciesData();

			// TODO

			return Optional.of(sd);
		} catch (Exception e) {
			return Optional.empty();
		}
	}

	@Override
	public boolean crawlEverything(Map<Integer, SpeciesData> map) {
		try {
			URL url = new URL(POKEMON_PAGE_LIST);
			URLConnection con = url.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			in.lines().forEach(s -> {
				if (s.contains(POKEMON_PAGE_START)) {
					try {
						URL pkmn = new URL(POKEMON_DATABASE
								+ StringUtils.substringBetween(s, POKEMON_PAGE_START, POKEMON_PAGE_END));
						Optional<SpeciesData> opt = crawl(pkmn);

						if (opt.isPresent()) {
							SpeciesData sd = opt.get();
							
							map.put(sd.getPokedexNationalId(), sd);
						}
					} catch (Exception e) {
					}
				}
			});
			in.close();

			return true;
		} catch (IOException e) {
		}
		return false;
	}

}
