/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ;

/**
 *
 * @author Eric Cheok
 */
public class Animal {
    
   String name;
    public static int age;

   
      //Constructor method assigns values to the corresponding fields
      public void Animal(String name,int age)
      {
         this.name = name;
         this.age = age;
      }
      
//Methods
	public void setName(String newName)
	{
		this.name = newName;
	}
        
	public String getName()
	{
		return name;
	}    
        
        public void introduceYourself()
        {
               System.out.println("Morr. I am an animal");
        }  
        
        public void setAge(int newAge)
        {
                this.age = newAge;
        }
        
        public int getAge()
        {
                return age;
        }

}

