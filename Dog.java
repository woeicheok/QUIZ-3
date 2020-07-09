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
public class Dog extends Animal{

    Dog(String Name) {
        this.name=Name;
        
    }
      
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }
    
}
