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

/**
 * @todo Class Description
 * 
 * @author Kaioru
 **/
public class SpeciesStat implements Serializable {

	private static final long serialVersionUID = -3825762030465023552L;

	private int hp = 0;
	private int attack = 0;
	private int defense = 0;
	private int spAttack = 0;
	private int spDefense = 0;
	private int speed = 0;

	public enum StatType {
		HP, ATK, DEF, SPATK, SPDEF, SPD;
	}

	public int getStat(StatType statType) {
		switch (statType) {
		default:
		case HP:
			return hp;
		case ATK:
			return attack;
		case DEF:
			return defense;
		case SPATK:
			return spAttack;
		case SPDEF:
			return spDefense;
		case SPD:
			return speed;
		}
	}

	public void setStat(StatType statType, Integer stat) {
		switch (statType) {
		default:
		case HP:
			hp = stat;
		case ATK:
			attack = stat;
		case DEF:
			defense = stat;
		case SPATK:
			spAttack = stat;
		case SPDEF:
			spDefense = stat;
		case SPD:
			speed = stat;
		}
	}

}
