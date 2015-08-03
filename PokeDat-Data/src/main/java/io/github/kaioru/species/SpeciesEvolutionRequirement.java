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

public class SpeciesEvolutionRequirement implements Serializable {

	private static final long serialVersionUID = 3722298010149962328L;

	private int level;
	private int item;
	private int happiness;
	private int minTimeOfDay, maxTimeOfDay;
	/*
	 * Night : >= 20 ; < 4 Morning : >= 4 ; < 10 Day : >= 10 ; < 20
	 */

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getMinTimeOfDay() {
		return minTimeOfDay;
	}

	public void setMinTimeOfDay(int minTimeOfDay) {
		this.minTimeOfDay = minTimeOfDay;
	}

	public int getMaxTimeOfDay() {
		return maxTimeOfDay;
	}

	public void setMaxTimeOfDay(int maxTimeOfDay) {
		this.maxTimeOfDay = maxTimeOfDay;
	}

}