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
package io.github.kaioru.PokeDat.species.forme;

import java.io.Serializable;
import java.util.List;

import io.github.kaioru.PokeDat.species.SpeciesStat;


/**
 * @todo Class Description
 * 
 * @author Kaioru
**/
public abstract class SpeciesForme implements Serializable {
	
    private static final long serialVersionUID = -8100723888240177965L;
    
    private Integer m_FormeId;
    private String 	m_FormeName;
    private String 	m_PrimaryType, m_SecondaryType;
    private String 	m_Species; // Doubt this ever changes but oh well..
    
	public Integer getFormeId() {
	    return m_FormeId;
    }
	
	public void setFormeId(Integer formeId) {
	    m_FormeId = formeId;
    }

	public String getFormeName() {
	    return m_FormeName;
    }

	public void setFormeName(String formeName) {
	    m_FormeName = formeName;
    }

	public String getPrimaryType() {
	    return m_PrimaryType;
    }

	public void setPrimaryType(String primaryType) {
	    m_PrimaryType = primaryType;
    }

	public String getSecondaryType() {
	    return m_SecondaryType;
    }

	public void setSecondaryType(String secondaryType) {
	    m_SecondaryType = secondaryType;
    }

	public String getSpecies() {
	    return m_Species;
    }

	public void setSpecies(String species) {
	    m_Species = species;
    }
	
	public abstract List<String> getAbilities();
	public abstract void setAbilities(List<String> abilities);
	
	public abstract List<String> getHiddenAbilities();
	public abstract void setHiddenAbilities(List<String> hiddenAbilities);
	
	public abstract SpeciesStat getBaseStats();
	public abstract void setBaseStats(SpeciesStat baseStats);
	
	public abstract SpeciesStat getEVYield();
	public abstract void setEVYield(SpeciesStat evYield);
	
	public abstract Short getCaptureRate();
	public abstract void setCaptureRate(Short captureRate);
	
	public abstract Short getBaseHappiness();
	public abstract void setBaseHappiness(Short baseHappiness);
	
	public abstract Short getBaseExperience();
	public abstract void setBaseExperience(Short baseExperience);
	
	public abstract String getGrowthRate();
	public abstract void setGrowthRate(String growthRate);

}
