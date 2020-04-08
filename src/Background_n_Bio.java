import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Background_n_Bio {
	private static String player_name;
	private static String character_name;
	private static String Class;
	private static String Race;
	private static String Alignment;
	
	private static String[] ListOfClasses = { "Fighter", "Wizard", "Rogue", "Barbarian", "Bard", "Cleric", "Druid", "Mage", "Monk", "Paladin", "Ranger", "Sorcerer", "Warlock" };
	private static String[] ListOfRaces = { "Dragonborn", "Dwarf", "Eladrin", "Elf", "Gnome", "Half-elf", "Half-orc", "Halfling", "Human", "Tiefling" };
	private static String[] ListOfAlignment = { "Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "(True) Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil" };
	
	private static String[] consonents = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","y","z"};
	private static String[] vowels = {"a","e","i","o","u"};
	private static String[] last = {"Smoke","Plume","Flare","Flame","Rumble","Chilly","Ice","Dark","Glint","Light","Fire","Sand","Time","Jikan","Space","Supesu","Lightning","Magma","Swamp","Gas","Snow","Moku","Mera","Suna","Goro","Yami","Pika","Magu","Numa","Gasu","Yuki","Fog","Kiri","Steam","Joki","Cloud","Kumo","Dust","Hokori","Crystal","Salt","Shio","Mizu","Water","Kessho"};
	
	// firstchar6 = c + v + c + v + c + v
	// character name = firstcher6 + last
	
	private static void display_classes() {
		// displays classes
		String listofclasses = "Select your character's base class - ";
		for (int i = 0; i < ListOfClasses.length; i++) {
			listofclasses += "\r\n\t" + (i+1) + ") " + ListOfClasses[i];
			} System.out.println(listofclasses);
	}
	
	private static void display_races() {
		// displays races
		String listofraces = "Select your character's race - ";
		for (int i = 0; i < ListOfRaces.length; i++) {
			listofraces += "\r\n\t" + (i+1) + ") " + ListOfRaces[i];
			} System.out.println(listofraces);
	}
	
}
