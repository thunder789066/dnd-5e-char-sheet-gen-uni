import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Skills_n_Scores extends Background_n_Bio {
	
	//private static String[][] ability_scores = new String[6][2];
    //private static int strength;
    //private static int dexterity;
    //private static int constitution;
    //private static int intelligence;
    //private static int wisdom;
    //private static int charisma;
    private static int total_roll;
    private static List<Integer> temp_mod_list = new ArrayList<>();
    private static List<Integer> temp_roll_list = new ArrayList<>();
    private static List<Integer> round_of_rolls = new ArrayList<>();
    
    public static void Ability_Scores() {
        for (int i = 1; i <= 6; i++) {
        	getScore();
        	temp_roll_list.clear();
        	round_of_rolls.add(total_roll);
        	total_roll = 0;
        }
        getModifiers();
        ability_scores_hashmap();
    }
    
    private static void getScore() {
    	for (int i = 0; i <= 3; i++) {
        	int roll = ThreadLocalRandom.current().nextInt(1, 7);
        	while (roll == 0) {
        		roll = ThreadLocalRandom.current().nextInt(1, 7);
        	}
    	temp_roll_list.add(roll);  // add to temp array
        }
        Collections.sort(temp_roll_list);	// smallest -> largest
        temp_roll_list.remove(0);		// takes highest 3 rolls & removes smallest roll
        for (int i = 0; i < temp_roll_list.size(); i++) {
        	total_roll += temp_roll_list.get(i);
        }
    }
    
    private static void getModifiers() {
    	for (int i = 0; i < round_of_rolls.size(); i++) {
    		
    		double raw_mod = (round_of_rolls.get(i)-10)/2;
    		temp_mod_list.add((int)(raw_mod - (raw_mod % 1)));
    		
    		// (3)     -> -4		(12-13) -> +1		(22-23) -> +6
    		// (4-5)   -> -3		(14-15) -> +2		(24-25) -> +7
    		// (6-7)   -> -2		(16-17) -> +3		(26-27) -> +8
    		// (8-9)   -> -1		(18-19) -> +4		(28-29) -> +9
    		// (10-11) -> +0		(20-21) -> +5		(30)    -> +10
    	}
    }
    
    private static void ability_scores_hashmap() {
    	// create map to store
        Map<String, List<Integer>> abl_sc_map /* Ability_Scores */= new HashMap<String, List<Integer>>();
        
        // create list one and store values
        List<Integer> strength = new ArrayList<Integer>();
        strength.add(round_of_rolls.get(0));
        strength.add(temp_mod_list.get(0));
        strength.add(temp_mod_list.get(0));
        
        // create list two and store values
        List<Integer> dexterity = new ArrayList<Integer>();
        dexterity.add(round_of_rolls.get(1));
        dexterity.add(temp_mod_list.get(1));
        dexterity.add(temp_mod_list.get(1));
        
        // create list three and store values
        List<Integer> constitution = new ArrayList<Integer>();
        constitution.add(round_of_rolls.get(2));
        constitution.add(temp_mod_list.get(2));
        constitution.add(temp_mod_list.get(2));
        
        // create list four and store values
        List<Integer> intelligence = new ArrayList<Integer>();
        intelligence.add(round_of_rolls.get(3));
        intelligence.add(temp_mod_list.get(3));
        intelligence.add(temp_mod_list.get(3));
        
        // create list five and store values
        List<Integer> wisdom = new ArrayList<Integer>();
        wisdom.add(round_of_rolls.get(4));
        wisdom.add(temp_mod_list.get(4));
        wisdom.add(temp_mod_list.get(4));
        
        // create list six and store values
        List<Integer> charisma = new ArrayList<Integer>();
        charisma.add(round_of_rolls.get(5));
        charisma.add(temp_mod_list.get(5));
        charisma.add(temp_mod_list.get(5));
        
        // put values into map
        abl_sc_map.put("Strength", strength);
        abl_sc_map.put("Dexterity", dexterity);
        abl_sc_map.put("Constitution", constitution);
        abl_sc_map.put("Intelligence", intelligence);
        abl_sc_map.put("Wisdom", wisdom);
        abl_sc_map.put("Charisma", charisma);
        
        // iterate and display values
        for (Map.Entry<String, List<Integer>> entry : abl_sc_map.entrySet()) {
            String key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.println(key + " = " + values);
        }
    	
    	Map <String, Integer> skills_map = new HashMap<String, Integer>();
    	
    	//map.put (skill_name, skill_mod_num)
    	skills_map.put("Acrobatics", dexterity.get(1));
    	skills_map.put("Animal Handling", wisdom.get(1));
    	skills_map.put("Arcana", intelligence.get(1));
    	skills_map.put("Athletics", strength.get(1));
    	skills_map.put("Deception", charisma.get(1));
    	skills_map.put("History", intelligence.get(1));
    	skills_map.put("Insight", wisdom.get(1));
    	skills_map.put("Intimidation", charisma.get(1));
    	skills_map.put("Investigation", intelligence.get(1));
    	skills_map.put("Medicine", wisdom.get(1));
    	skills_map.put("Nature", intelligence.get(1));
    	skills_map.put("Perception", wisdom.get(1));
    	skills_map.put("Performance", charisma.get(1));
    	skills_map.put("Persuasion", charisma.get(1));
    	skills_map.put("Religion", intelligence.get(1));
    	skills_map.put("Sleight of Hand", dexterity.get(1));
    	skills_map.put("Stealth", dexterity.get(1));
    	skills_map.put("Survival", dexterity.get(1));
    	
    	for (Map.Entry<String, Integer> entry : skills_map.entrySet()) {
            String key = entry.getKey();
            Integer values = entry.getValue();
            System.out.println(key + " = " + values);
        }
    }

	private static int round_of_rolls(int i) {
		return 0;	// TODO Auto-generated method stub
	}
    
}
