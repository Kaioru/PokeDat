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
package io.github.kaioru.PokeDat.species;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import io.github.kaioru.PokeDat.species.forme.SpeciesForme;
import io.github.kaioru.PokeDat.species.forme.SpeciesMegaForme;
import io.github.kaioru.PokeDat.species.forme.SpeciesNormalForme;


/**
 * @todo Class Description
 * 
 * @author Kaioru
**/
public class SpeciesData implements Serializable {
	
    private static final long serialVersionUID = -869191716651946861L;
    
    private String 	m_Name;
    private Integer m_PokedexNationalId;
    private String 	m_PokedexEntryX, m_PokedexEntryY;
    
    private SpeciesNormalForme 				m_NormalForme;
    private Map<Integer, SpeciesMegaForme> 	m_MegaFormes;
    private Map<Integer, SpeciesForme> 		m_SpecialFormes;
    
    private SpeciesLearnset m_SpeciesLearnSet;
    
    public SpeciesData() {
    	m_MegaFormes 	= new HashMap<>();
    	m_SpecialFormes 	= new HashMap<>();
    }

	public String getName() {
	    return m_Name;
    }

	public void setName(String speciesName) {
	    m_Name = speciesName;
    }

	public Integer getPokedexNationalId() {
	    return m_PokedexNationalId;
    }

	public void setPokedexNationalId(Integer pokedexNationalId) {
	    m_PokedexNationalId = pokedexNationalId;
    }

	public String getPokedexEntryX() {
	    return m_PokedexEntryX;
    }

	public void setPokedexEntryX(String pokedexEntryX) {
	    m_PokedexEntryX = pokedexEntryX;
    }

	public String getPokedexEntryY() {
	    return m_PokedexEntryY;
    }

	public void setPokedexEntryY(String pokedexEntryY) {
	    m_PokedexEntryY = pokedexEntryY;
    }

	public SpeciesNormalForme getNormalForme() {
	    return m_NormalForme;
    }

	public void setNormalForme(SpeciesNormalForme normalForme) {
	    m_NormalForme = normalForme;
    }

	public Map<Integer, SpeciesMegaForme> getMegaFormes() {
	    return m_MegaFormes;
    }

	public void setMegaFormes(Map<Integer, SpeciesMegaForme> megaFormes) {
	    m_MegaFormes = megaFormes;
    }

	public Map<Integer, SpeciesForme> getSpecialFormes() {
	    return m_SpecialFormes;
    }

	public void setSpeciesSpecialFormes(Map<Integer, SpeciesForme> specialFormes) {
	    m_SpecialFormes = specialFormes;
    }

	public SpeciesLearnset getSpeciesLearnSet() {
	    return m_SpeciesLearnSet;
    }

	public void setSpeciesLearnSet(SpeciesLearnset speciesLearnSet) {
	    m_SpeciesLearnSet = speciesLearnSet;
    }

}
