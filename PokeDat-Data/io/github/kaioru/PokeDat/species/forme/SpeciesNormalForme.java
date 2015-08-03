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

import java.util.ArrayList;
import java.util.List;

import io.github.kaioru.PokeDat.species.SpeciesStat;

public class SpeciesNormalForme extends SpeciesForme {

	private static final long serialVersionUID = 5315492565216248076L;

	private List<String> abilities, hiddenAbilities;
	private SpeciesStat baseStats, evYield;
	private Short captureRate, baseHappiness, baseExperience;
	private String growthRate;

	private List<String> eggGroups;
	private Short eggCycles;
	private Boolean genderless;
	private Double genderRatio;

	public SpeciesNormalForme() {
		abilities = new ArrayList<>();
		hiddenAbilities = new ArrayList<>();
	}

	public List<String> getEggGroups() {
		return eggGroups;
	}

	public void setEggGroups(List<String> eggGroups) {
		this.eggGroups = eggGroups;
	}

	public Short getEggCycles() {
		return eggCycles;
	}

	public void setEggCycles(Short eggCycles) {
		this.eggCycles = eggCycles;
	}

	public Boolean getGenderless() {
		return genderless;
	}

	public void setGenderless(Boolean genderless) {
		this.genderless = genderless;
	}

	public Double getGenderRatio() {
		return genderRatio;
	}

	public void setGenderRatio(Double genderRatio) {
		this.genderRatio = genderRatio;
	}

	@Override
	public List<String> getAbilities() {
		return abilities;
	}

	@Override
	public void setAbilities(List<String> abilities) {
		this.abilities = abilities;
	}

	@Override
	public List<String> getHiddenAbilities() {
		return hiddenAbilities;
	}

	@Override
	public void setHiddenAbilities(List<String> hiddenAbilities) {
		this.hiddenAbilities = hiddenAbilities;
	}

	@Override
	public SpeciesStat getBaseStats() {
		return baseStats;
	}

	@Override
	public void setBaseStats(SpeciesStat baseStats) {
		this.baseStats = baseStats;
	}

	@Override
	public SpeciesStat getEVYield() {
		return evYield;
	}

	@Override
	public void setEVYield(SpeciesStat evYield) {
		this.evYield = evYield;
	}

	@Override
	public Short getCaptureRate() {
		return captureRate;
	}

	@Override
	public void setCaptureRate(Short captureRate) {
		this.captureRate = captureRate;
	}

	@Override
	public Short getBaseHappiness() {
		return baseHappiness;
	}

	@Override
	public void setBaseHappiness(Short baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	@Override
	public Short getBaseExperience() {
		return baseExperience;
	}

	@Override
	public void setBaseExperience(Short baseExperience) {
		this.baseExperience = baseExperience;
	}

	@Override
	public String getGrowthRate() {
		return growthRate;
	}

	@Override
	public void setGrowthRate(String growthRate) {
		this.growthRate = growthRate;
	}

}
