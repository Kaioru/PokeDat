package io.github.kaioru.PokeDat.species.forme;

import java.util.ArrayList;
import java.util.List;

import io.github.kaioru.PokeDat.species.SpeciesStat;


public class SpeciesNormalForme extends SpeciesForme {
	
    private static final long serialVersionUID = 5315492565216248076L;
    
    private List<String> m_Abilities, m_HiddenAbilities;
    private SpeciesStat m_BaseStats, m_EVYield;
    private Short m_CaptureRate, m_BaseHappiness, m_BaseExperience;
    private String m_GrowthRate;
    
    private List<String> m_EggGroups;
    private Short	m_EggCycles;
    private Boolean m_Genderless;
    private Double 	m_GenderRatio;
    
    public SpeciesNormalForme() {
    	m_Abilities 		= new ArrayList<>();
    	m_HiddenAbilities 	= new ArrayList<>();
    }
    
	public List<String> getEggGroups() {
	    return m_EggGroups;
    }
	
	public void setEggGroups(List<String> eggGroups) {
	    m_EggGroups = eggGroups;
    }
	
	public Short getEggCycles() {
	    return m_EggCycles;
    }
	
	public void setEggCycles(Short eggCycles) {
	    m_EggCycles = eggCycles;
    }
	
	public Boolean getGenderless() {
	    return m_Genderless;
    }
	
	public void setGenderless(Boolean genderless) {
	    m_Genderless = genderless;
    }
	
	public Double getGenderRatio() {
	    return m_GenderRatio;
    }
	
	public void setGenderRatio(Double genderRatio) {
	    m_GenderRatio = genderRatio;
    }

	@Override
    public List<String> getAbilities() {
	    return m_Abilities;
    }

	@Override
    public void setAbilities(List<String> abilities) {
	    m_Abilities = abilities;
    }

	@Override
    public List<String> getHiddenAbilities() {
	    return m_HiddenAbilities;
    }

	@Override
    public void setHiddenAbilities(List<String> hiddenAbilities) {
		m_HiddenAbilities = hiddenAbilities;
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
	    return m_EVYield;
    }

	@Override
    public void setEVYield(SpeciesStat evYield) {
	    m_EVYield = evYield;
    }

	@Override
    public Short getCaptureRate() {
	    return m_CaptureRate;
    }

	@Override
    public void setCaptureRate(Short captureRate) {
		m_CaptureRate = captureRate;
    }

	@Override
    public Short getBaseHappiness() {
	    return m_BaseHappiness;
    }

	@Override
    public void setBaseHappiness(Short baseHappiness) {
		m_BaseHappiness = baseHappiness;
    }

	@Override
    public Short getBaseExperience() {
	    return m_BaseExperience;
    }

	@Override
    public void setBaseExperience(Short baseExperience) {
		m_BaseExperience = baseExperience;
    }

	@Override
    public String getGrowthRate() {
	    return m_GrowthRate;
    }

	@Override
    public void setGrowthRate(String growthRate) {
		m_GrowthRate = growthRate;
    }

}
