package io.github.kaioru.species.forme;

import java.util.List;

import io.github.kaioru.species.SpeciesStat;

public class SpeciesMegaForme extends SpeciesForme {

	private static final long serialVersionUID = -9166137738820533128L;

	private SpeciesNormalForme normalForme;
	private String ability;
	private SpeciesStat baseStats;

	public SpeciesNormalForme getNormalForme() {
		return normalForme;
	}

	public void setNormalForme(SpeciesNormalForme normalForme) {
		this.normalForme = normalForme;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	@Override
	public List<String> getAbilities() {
		return normalForme.getAbilities();
	}

	@Override
	public void setAbilities(List<String> abilities) {
		this.normalForme.setAbilities(abilities);
	}

	@Override
	public List<String> getHiddenAbilities() {
		return normalForme.getHiddenAbilities();
	}

	@Override
	public void setHiddenAbilities(List<String> hiddenAbilities) {
		this.normalForme.setHiddenAbilities(hiddenAbilities);
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
		return normalForme.getEVYield();
	}

	@Override
	public void setEVYield(SpeciesStat evYield) {
		this.normalForme.setEVYield(evYield);
	}

	@Override
	public Short getCaptureRate() {
		return normalForme.getCaptureRate();
	}

	@Override
	public void setCaptureRate(Short captureRate) {
		this.normalForme.setCaptureRate(captureRate);
	}

	@Override
	public Short getBaseHappiness() {
		return normalForme.getBaseHappiness();
	}

	@Override
	public void setBaseHappiness(Short baseHappiness) {
		this.normalForme.setBaseHappiness(baseHappiness);
	}

	@Override
	public Short getBaseExperience() {
		return normalForme.getBaseExperience();
	}

	@Override
	public void setBaseExperience(Short baseExperience) {
		this.normalForme.setBaseExperience(baseExperience);
	}

	@Override
	public String getGrowthRate() {
		return normalForme.getGrowthRate();
	}

	@Override
	public void setGrowthRate(String growthRate) {
		this.normalForme.setGrowthRate(growthRate);
	}

}
