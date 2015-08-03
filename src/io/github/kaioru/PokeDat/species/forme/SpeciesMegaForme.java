package io.github.kaioru.PokeDat.species.forme;

import java.util.List;

import io.github.kaioru.PokeDat.species.SpeciesStat;


public class SpeciesMegaForme extends SpeciesForme {
	
    private static final long serialVersionUID = -9166137738820533128L;
    
    private SpeciesNormalForme m_NormalForme;
    private String m_Ability;
    private SpeciesStat m_BaseStats;
    
	public SpeciesNormalForme getNormalForme() {
	    return m_NormalForme;
    }
	
	public void setNormalForme(SpeciesNormalForme normalForme) {
	    m_NormalForme = normalForme;
    }

	public String getAbility() {
	    return m_Ability;
    }

	public void setAbility(String ability) {
	    m_Ability = ability;
    }

	@Override
    public List<String> getAbilities() {
	    return m_NormalForme.getAbilities();
    }

	@Override
    public void setAbilities(List<String> abilities) {
		m_NormalForme.setAbilities(abilities);
    }

	@Override
    public List<String> getHiddenAbilities() {
	    return m_NormalForme.getHiddenAbilities();
    }

	@Override
    public void setHiddenAbilities(List<String> hiddenAbilities) {
		m_NormalForme.setHiddenAbilities(hiddenAbilities);
    }

	@Override
    public SpeciesStat getBaseStats() {
	    return m_BaseStats;
    }

	@Override
    public void setBaseStats(SpeciesStat baseStats) {
		m_BaseStats = baseStats;
    }

	@Override
    public SpeciesStat getEVYield() {
	    return m_NormalForme.getEVYield();
    }

	@Override
    public void setEVYield(SpeciesStat evYield) {
		m_NormalForme.setEVYield(evYield);
    }

	@Override
    public Short getCaptureRate() {
	    return m_NormalForme.getCaptureRate();
    }

	@Override
    public void setCaptureRate(Short captureRate) {
		m_NormalForme.setCaptureRate(captureRate);
    }

	@Override
    public Short getBaseHappiness() {
	    return m_NormalForme.getBaseHappiness();
    }

	@Override
    public void setBaseHappiness(Short baseHappiness) {
		m_NormalForme.setBaseHappiness(baseHappiness);
    }

	@Override
    public Short getBaseExperience() {
	    return m_NormalForme.getBaseExperience();
    }

	@Override
    public void setBaseExperience(Short baseExperience) {
		m_NormalForme.setBaseExperience(baseExperience);
    }

	@Override
    public String getGrowthRate() {
	    return m_NormalForme.getGrowthRate();
    }

	@Override
    public void setGrowthRate(String growthRate) {
		m_NormalForme.setGrowthRate(growthRate);
    }

}
