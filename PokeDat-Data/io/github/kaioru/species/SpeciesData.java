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
package io.github.kaioru.species;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import io.github.kaioru.species.forme.SpeciesForme;
import io.github.kaioru.species.forme.SpeciesMegaForme;
import io.github.kaioru.species.forme.SpeciesNormalForme;

/**
 * @todo Class Description
 * 
 * @author Kaioru
 **/
public class SpeciesData implements Serializable {

	private static final long serialVersionUID = -869191716651946861L;

	private String name;
	private Integer pokedexNationalId;
	private String pokedexEntryX, pokedexEntryY;

	private SpeciesNormalForme normalForme;
	private Map<Integer, SpeciesMegaForme> megaFormes;
	private Map<Integer, SpeciesForme> specialFormes;

	private SpeciesLearnset speciesLearnSet;

	public SpeciesData() {
		megaFormes = new HashMap<>();
		specialFormes = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPokedexNationalId() {
		return pokedexNationalId;
	}

	public void setPokedexNationalId(Integer pokedexNationalId) {
		this.pokedexNationalId = pokedexNationalId;
	}

	public String getPokedexEntryX() {
		return pokedexEntryX;
	}

	public void setPokedexEntryX(String pokedexEntryX) {
		this.pokedexEntryX = pokedexEntryX;
	}

	public String getPokedexEntryY() {
		return pokedexEntryY;
	}

	public void setPokedexEntryY(String pokedexEntryY) {
		this.pokedexEntryY = pokedexEntryY;
	}

	public SpeciesNormalForme getNormalForme() {
		return normalForme;
	}

	public void setNormalForme(SpeciesNormalForme normalForme) {
		this.normalForme = normalForme;
	}

	public Map<Integer, SpeciesMegaForme> getMegaFormes() {
		return megaFormes;
	}

	public void setMegaFormes(Map<Integer, SpeciesMegaForme> megaFormes) {
		this.megaFormes = megaFormes;
	}

	public Map<Integer, SpeciesForme> getSpecialFormes() {
		return specialFormes;
	}

	public void setSpeciesSpecialFormes(Map<Integer, SpeciesForme> specialFormes) {
		this.specialFormes = specialFormes;
	}

	public SpeciesLearnset getSpeciesLearnSet() {
		return speciesLearnSet;
	}

	public void setSpeciesLearnSet(SpeciesLearnset speciesLearnSet) {
		this.speciesLearnSet = speciesLearnSet;
	}

}
