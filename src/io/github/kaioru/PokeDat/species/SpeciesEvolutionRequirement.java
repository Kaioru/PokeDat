package io.github.kaioru.PokeDat.species;

import java.io.Serializable;


public class SpeciesEvolutionRequirement implements Serializable {
	
    private static final long serialVersionUID = 3722298010149962328L;
    
	private int m_Level;
	private int m_Item;
	private int m_Happiness;
	private int m_MinTimeOfDay, m_MaxTimeOfDay;
	/*
	 * Night  	: >= 20	; < 4
	 * Morning	: >= 4	; < 10
	 * Day		: >= 10	; < 20
	 */
	
	public int getLevel() {
		return m_Level;
	}
	
	public void setLevel(int level) {
		m_Level = level;
	}
	
	public int getItem() {
		return m_Item;
	}
	
	public void setItem(int item) {
		m_Item = item;
	}
	
	public int getHappiness() {
		return m_Happiness;
	}
	
	public void setHappiness(int happiness) {
		m_Happiness = happiness;
	}
	
	public int getMinTimeOfDay() {
		return m_MinTimeOfDay;
	}
	
	public void setMinTimeOfDay(int minTimeOfDay) {
		m_MinTimeOfDay = minTimeOfDay;
	}
	
	public int getMaxTimeOfDay() {
		return m_MaxTimeOfDay;
	}
	
	public void setMaxTimeOfDay(int maxTimeOfDay) {
		m_MaxTimeOfDay = maxTimeOfDay;
	}

}