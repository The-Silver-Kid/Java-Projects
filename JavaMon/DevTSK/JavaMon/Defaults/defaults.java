package DevTSK.JavaMon.Defaults;

import DevTSK.JavaMon.Attack;
import DevTSK.JavaMon.Monster;
import DevTSK.JavaMon.Type;

public class defaults {

	/* name, type, category, PP, power, accuracy, never miss, OHKO, effect) {
	 * 
	 * accuracy is float 0-1 : 1 = 100%
	 * 
	 * all effects are null for the moment...
	 * 
	 * never miss is boolean
	 * 
	 * category
	 * 0 = physical
	 * 1 = special
	 * 2 = status
	 */

	/*Changes from official Moves:
	 * Razor Wind = flying type
	 * Whirlwind = flying type
	 * Mega Kick = fighting type
	 * Disable = Psychic type
	 * Strength = fighting type
	 * Growth = grass type
	 * Earthquake = Special
	 * Fissure = Special
	 * Agility = Normal type
	 */
	//Information from http://bulbapedia.bulbagarden.net/wiki/List_of_moves
	public static final Attack[] attacks = new Attack[] {
			new Attack("Pound", new Type("Normal"), 0, 35, 40, 1, false, false, null),
			new Attack("Karate Chop", new Type("Fighting"), 0, 25, 50, 1, false, false, null),
			new Attack("Double Slap", new Type("Normal"), 0, 10, 15, .85, false, false, null),
			new Attack("Comet Punch", new Type("Normal"), 0, 15, 18, .85, false, false, null),
			new Attack("Mega Punch", new Type("Normal"), 0, 20, 80, .85, false, false, null),
			new Attack("Pay Day", new Type("Normal"), 0, 20, 40, 1, false, false, null),
			new Attack("Fire Punch", new Type("Fire"), 0, 15, 75, 1, false, false, null),
			new Attack("Ice Punch", new Type("Ice"), 0, 15, 75, 1, false, false, null),
			new Attack("Thunder Punch", new Type("Electric"), 0, 15, 75, 1, false, false, null),
			new Attack("Scratch", new Type("Normal"), 0, 35, 40, 1, false, false, null),
			new Attack("Vice Grip", new Type("Normal"), 0, 30, 55, 1, false, false, null),
			new Attack("Guillotine", new Type("Normal"), 0, 5, 0, .3, false, true, null),
			new Attack("Razor Wind", new Type("Flying"), 1, 10, 80, 1, false, false, null),
			new Attack("Swords Dance", new Type("Normal"), 2, 20, 0, 0, false, false, null),
			new Attack("Cut", new Type("Normal"), 0, 30, 50, .95, false, false, null),
			new Attack("Gust", new Type("Flying"), 1, 35, 40, 1, false, false, null),
			new Attack("Wing Attack", new Type("Flying"), 0, 35, 60, 1, false, false, null),
			new Attack("Whirlwind", new Type("Flying"), 2, 20, 0, 0, false, false, null),
			new Attack("Fly", new Type("Flying"), 0, 15, 90, .95, false, false, null),
			new Attack("Bind", new Type("Normal"), 0, 20, 15, .85, false, false, null),
			new Attack("Slam", new Type("Normal"), 0, 20, 80, .75, false, false, null),
			new Attack("Vine Whip", new Type("Grass"), 0, 25, 45, 1, false, false, null),
			new Attack("Stomp", new Type("Normal"), 0, 20, 65, 1, false, false, null),
			new Attack("Double Kick", new Type("Fighting"), 0, 30, 30, 1, false, false, null),
			new Attack("Mega Kick", new Type("Fighting"), 0, 5, 120, .75, false, false, null),
			new Attack("Jump Kick", new Type("Fighting"), 0, 10, 100, .95, false, false, null),
			new Attack("Rolling Kick", new Type("Fighting"), 0, 15, 60, .85, false, false, null),
			new Attack("Sand Attack", new Type("Ground"), 2, 15, 0, 1, false, false, null),
			new Attack("Headbutt", new Type("Normal"), 0, 15, 70, 1, false, false, null),
			new Attack("Horn Attack", new Type("Normal"), 0, 25, 65, 1, false, false, null),
			new Attack("Fury Attack", new Type("Normal"), 0, 20, 15, .85, false, false, null),
			new Attack("Horn Drill", new Type("Normal"), 0, 5, 0, .3, false, true, null),
			new Attack("Tackle", new Type("Normal"), 0, 45, 40, 1, false, false, null),
			new Attack("Body Slam", new Type("Normal"), 0, 15, 85, 1, false, false, null),
			new Attack("Wrap", new Type("Normal"), 0, 20, 15, .9, false, false, null),
			new Attack("Take Down", new Type("Normal"), 0, 20, 90, .85, false, false, null),
			new Attack("Thrash", new Type("Normal"), 0, 10, 120, 1, false, false, null),
			new Attack("Double-Edge", new Type("Normal"), 0, 10, 120, 1, false, false, null),
			new Attack("Tail Whip", new Type("Normal"), 2, 30, 0, 1, false, false, null),
			new Attack("Poison Sting", new Type("Poison"), 0, 35, 15, 1, false, false, null),
			new Attack("Twineedle", new Type("Bug"), 0, 20, 25, 1, false, false, null),
			new Attack("Pin Missile", new Type("Bug"), 0, 20, 25, .95, false, false, null),
			new Attack("Leer", new Type("Normal"), 2, 30, 0, 1, false, false, null),
			new Attack("Bite", new Type("Dark"), 1, 25, 60, 1, false, false, null),
			new Attack("Growl", new Type("Normal"), 2, 40, 0, 1, false, false, null),
			new Attack("Roar", new Type("Normal"), 2, 20, 0, 0, false, false, null),
			new Attack("Sing", new Type("Normal"), 2, 15, 0, .55, false, false, null),
			new Attack("Supersonic", new Type("Normal"), 2, 20, 0, .55, false, false, null),
			new Attack("Sonic Boom", new Type("Normal"), 1, 20, 0, .9, false, false, null),
			new Attack("Disable", new Type("Psychic"), 2, 20, 0, 1, false, false, null),
			new Attack("Acid", new Type("Poison"), 1, 30, 40, 1, false, false, null),
			new Attack("Ember", new Type("Fire"), 1, 25, 40, 1, false, false, null),
			new Attack("Flamethrower", new Type("Fire"), 1, 15, 90, 1, false, false, null),
			new Attack("Mist", new Type("Ice"), 2, 30, 0, 0, false, false, null),
			new Attack("Water Gun", new Type("Water"), 1, 25, 40, 1, false, false, null),
			new Attack("Hydro Pump", new Type("Water"), 1, 5, 110, .8, false, false, null),
			new Attack("Surf", new Type("Water"), 1, 15, 90, 1, false, false, null),
			new Attack("Ice Beam", new Type("Ice"), 1, 10, 90, 1, false, false, null),
			new Attack("Blizzard", new Type("Ice"), 1, 5, 110, .7, false, false, null),
			new Attack("Psybeam", new Type("Psychic"), 1, 20, 65, 1, false, false, null),
			new Attack("Bubble Beam", new Type("Water"), 1, 20, 65, 1, false, false, null),
			new Attack("Aurora Beam", new Type("Ice"), 1, 20, 65, 1, false, false, null),
			new Attack("Hyper Beam", new Type("Normal"), 1, 5, 150, .9, false, false, null),
			new Attack("Peck", new Type("Flying"), 0, 35, 25, 1, false, false, null),
			new Attack("Drill Peck", new Type("Flying"), 0, 20, 80, 1, false, false, null),
			new Attack("Submission", new Type("Fighting"), 0, 20, 80, .8, false, false, null),
			new Attack("Low Kick", new Type("Fighting"), 0, 20, 0, 1, false, false, null),
			new Attack("Counter", new Type("Fighting"), 0, 20, 0, 1, false, false, null),
			new Attack("Seismic Toss", new Type("Fighting"), 0, 20, 0, 1, false, false, null),
			new Attack("Strength", new Type("Fighting"), 0, 15, 80, 1, false, false, null),
			new Attack("Absorb", new Type("Grass"), 1, 25, 20, 1, false, false, null),
			new Attack("Mega Drain", new Type("Grass"), 1, 15, 40, 1, false, false, null),
			new Attack("Leech Seed", new Type("Grass"), 2, 10, 0, .9, false, false, null),
			new Attack("Growth", new Type("Grass"), 2, 20, 0, 0, false, false, null),
			new Attack("Razor Leaf", new Type("Grass"), 0, 25, 55, .95, false, false, null),
			new Attack("Solar Beam", new Type("Grass"), 1, 10, 120, 1, false, false, null),
			new Attack("Poison Powder", new Type("Poison"), 2, 35, 0, .75, false, false, null),
			new Attack("Stun Spore", new Type("Grass"), 2, 30, 0, .75, false, false, null),
			new Attack("Sleep Powder", new Type("Grass"), 2, 15, 0, .75, false, false, null),
			new Attack("Petal Dance", new Type("Grass"), 1, 10, 120, 1, false, false, null),
			new Attack("String Shot", new Type("Bug"), 2, 40, 0, .95, false, false, null),
			new Attack("Dragon Rage", new Type("Dragon"), 1, 10, 0, 1, false, false, null),
			new Attack("Fire Spin", new Type("Fire"), 1, 15, 35, .85, false, false, null),
			new Attack("Thunder Shock", new Type("Electric"), 1, 30, 40, 1, false, false, null),
			new Attack("Thunder Bolt", new Type("Electric"), 1, 15, 90, 1, false, false, null),
			new Attack("Thunder Wave", new Type("Electric"), 2, 20, 0, .9, false, false, null),
			new Attack("Thunder", new Type("Electric"), 1, 10, 110, .7, false, false, null),
			new Attack("Rock Throw", new Type("Rock"), 0, 15, 50, .9, false, false, null),
			new Attack("Earthquake", new Type("Ground"), 1, 10, 100, 1, false, false, null),
			new Attack("Fissure", new Type("Ground"), 1, 5, 0, .3, false, true, null),
			new Attack("Dig", new Type("Ground"), 0, 10, 80, 1, false, false, null),
			new Attack("Toxic", new Type("Poison"), 2, 10, 0, .9, false, false, null),
			new Attack("Confusion", new Type("Psychic"), 1, 25, 50, 1, false, false, null),
			new Attack("Psychic", new Type("Psychic"), 1, 10, 90, 1, false, false, null),
			new Attack("Hypnosis", new Type("Psychic"), 2, 20, 0, .6, false, false, null),
			new Attack("Meditate", new Type("Psychic"), 2, 40, 0, 0, false, false, null),
			new Attack("Agility", new Type("Normal"), 2, 30, 0, 0, false, false, null),
			new Attack("Quick Attack", new Type("Normal"), 0, 30, 40, 1, false, false, null),
			new Attack("Rage", new Type("Normal"), 0, 20, 20, 1, false, false, null),
			new Attack("Teleport", new Type("Psychic"), 2, 20, 0, 0, false, false, null),
			//100 Attacks!

	};

	public static final Monster[] pokemans = new Monster[] {

	};
}
