/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvava.pokemon;

public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
                        
                        case "bite":
				skill = new PokemonSkill("Bite", 50);
				break;
                        case "Rider kick":
				skill = new PokemonSkill("Rider Kick", 150);
				break;
                                
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock", 40);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 90);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip", 10);
				break;
			case "Water Pulse":
				skill = new PokemonSkill("Water Pulse", 100);
				break;
		}
		return skill;
	}
}
