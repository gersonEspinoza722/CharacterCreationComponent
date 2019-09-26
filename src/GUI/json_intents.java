package GUI;
import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import BoardElement.Character.Concrete.CharacterDummy;
import BoardElement.Tools.IToolListing;
import BoardElement.Tools.ToolArray;
import Media.IMediaListing;
import Media.Concrete.ImageArray;



public class json_intents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IToolListing array = new ToolArray();
		IMediaListing images = new ImageArray();
		
		CharacterDummy character = new CharacterDummy(100f,100f,array,10f,10f,10f,2,images);
		
		ObjectMapper mapper = new ObjectMapper();
		
		Cat cat = new Cat("Mishy","12","white");
		Cat cat2 = new Cat("Flo","8","black");
		Cat cat3 = new Cat("Elsa","3","brown");
		Cat cat4 = new Cat("Monchi","19","gray");
		
		//cat.addSon(cat2);
		//cat.addSon(cat3);
		//cat.addSon(cat4);
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		/*
		try {
            //mapper.writeValue(new File("src/storage/result.json"), cat);//Plain JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result0.json"), cat);//Prettified JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result1.json"), cat2);//Prettified JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result2.json"), cat3);//Prettified JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/storage/result3.json"), cat4);//Prettified JSON
            System.out.println("Json files created");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
		int files = 4;
		Cat value = null;
		for(int i = 0;i<files;i++) {
			try {
	            value = mapper.readValue(new File("src/storage/result"+i+".json"), Cat.class);
	            System.out.println(value.toString());
	            cats.add(value);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }	
		}
		System.out.println(cats.size());
        
        
        
		/*
        try {
            String json = mapper.writeValueAsString(cat);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
		
	}
	public static class Cat{
		public String name;
		public String age;
		public String color;
		public ArrayList<Cat> sons;
		public Cat() {
			
		}
		public Cat(String name,String age,String color) {
			this.name = name;
			this.age = age;
			this.color = color;
			sons = new ArrayList<Cat>();
		}
		public void addSon(Cat cat) {
			sons.add(cat);
		}
		public String toString() {
			String msg = "";
			msg += "Name: "+name+"\n";
			msg += "Age: "+age+"\n";
			msg += "Color: "+color+"\n";
			
			if(sons.size()==0) {
				msg+="Sons: No sons\n\n";
			}else {
				msg += "Sons: \n\n";
				for(Cat cat:sons) {
					msg+=cat.toString();
				}
			}
			return msg;
		}
	}

}
