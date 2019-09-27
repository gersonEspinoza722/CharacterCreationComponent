package GUI;
import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import BoardElement.Character.AbstractCharacter;
import BoardElement.Character.Concrete.CharacterBasic;
//import BoardElement.Character.Concrete.CharacterDummy;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolArray;
import Media.IMediaListing;
import Media.Concrete.ImageArray;
import storage.CharacterClassFactory;
import storage.CharacterDummy;
import storage.ImageDummy;
import storage.SkillDummy;
import storage.WeaponDummy;



public class json_intents {

	public static void main(String[] args) {
		ArrayList<AbstractCharacter> myList = CharacterClassFactory.getInstace().getCharacters();
		System.out.println("Personajes en Json: "+myList.size());
		ObjectMapper mapper = new ObjectMapper();
		
		/*
		ArrayList<WeaponDummy> weapons = new ArrayList<WeaponDummy>(); 
		ArrayList<SkillDummy> skills = new ArrayList<SkillDummy>();
		ArrayList<ImageDummy> images = new ArrayList<ImageDummy>();
		
		ArrayList<ImageDummy> imagesWeapon = new ArrayList<ImageDummy>();
		ArrayList<ImageDummy> imagesSkill = new ArrayList<ImageDummy>();
		
		WeaponDummy weaponDummy1 = new WeaponDummy();
		weaponDummy1.name = "Sword";
		weaponDummy1.defaultLife = 50;
		weaponDummy1.decrementableLife = 45;
		weaponDummy1.reach = 6;
		weaponDummy1.level = 2;
		weaponDummy1.minCharacterLevelReq = 1;
		weaponDummy1.minPlayerLevelReq = 1;
		weaponDummy1.simpleUseDecrement = 2;
		weaponDummy1.type = 0;
		imagesWeapon.add(new ImageDummy("swordLevel1","src/storage/warrior/ITools/Weapon1/swordLevel1.png"));
		imagesWeapon.add(new ImageDummy("swordLevel2","src/storage/warrior/ITools/Weapon1/swordLevel2.png"));
		imagesWeapon.add(new ImageDummy("swordPREVIEW","src/storage/warrior/ITools/Weapon1/swordPREVIEW.png"));
		weaponDummy1.images = imagesWeapon;
		
		SkillDummy skillDummy1 = new SkillDummy();
		skillDummy1.name = "Shield";
		skillDummy1.defaultLife = 50;
		skillDummy1.decrementableLife = 45;
		skillDummy1.reach = 6;
		skillDummy1.level = 2;
		skillDummy1.minCharacterLevelReq = 1;
		skillDummy1.minPlayerLevelReq = 1;
		skillDummy1.simpleUseDecrement = 2;
		skillDummy1.type = 0;
		
		imagesSkill.add(new ImageDummy("shieldLevel1","src/storage/warrior/ITools/Skill1/shieldLevel1.png"));
		imagesSkill.add(new ImageDummy("shieldLevel2","src/storage/warrior/ITools/Skill1/shieldLevel2.png"));
		imagesSkill.add(new ImageDummy("shieldPREVIEW","src/storage/warrior/ITools/Skill1/shieldPREVIEW.png"));
		skillDummy1.images = imagesSkill;
		
		CharacterDummy dummy1 = new CharacterDummy();
		dummy1.name = "warrior";
		dummy1.defaultLife = 250f;
		dummy1.decrementableLife = 230f;
		
		weapons.add(weaponDummy1);
		
		dummy1.weapons = weapons;
		
		skills.add(skillDummy1);
		
		dummy1.skills = skills;
		dummy1.level = 1;
		dummy1.minPlayerLevelReq = 1;
		dummy1.hitsPerUnit = 13f;
		dummy1.fields = 4;
		
		images.add(new ImageDummy("warriorLvl1","src/storage/warriorc/warriorLvl1.png"));
		images.add(new ImageDummy("warriorLvl2","src/storage/warrior/warriorLvl2.png"));
		images.add(new ImageDummy("warriorLvl3","src/storage/warrior/warriorLvl3.png"));
		images.add(new ImageDummy("warriorLvl4","src/storage/warrior/warriorLvl4.png"));
		
		dummy1.images = images;
		*/
		/*
		try {
            //mapper.writeValue(new File("src/storage/result.json"), cat);//Plain JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/jsons/result2.json"), dummy1);//Prettified JSON
            //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result1.json"), cat2);//Prettified JSON
            //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result2.json"), cat3);//Prettified JSON
            //mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result3.json"), cat4);//Prettified JSON
            System.out.println("Json files created");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
		/*
		int files = 1;
		CharacterDummy value = null;
		for(int i = 0;i<files;i++) {
			try {
	            value = mapper.readValue(new File("src/storage/jsons/result"+i+".json"), CharacterDummy.class);
	            System.out.println(value.toString());
	            //cats.add(value);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }	
		}
        //CharacterBasic example = value.getRealClass();
        
        
        
        
        
		/*
        try {
            String json = mapper.writeValueAsString(cat);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
		
	}

}
