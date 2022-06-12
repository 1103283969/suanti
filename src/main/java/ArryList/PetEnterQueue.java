package ArryList;

import lombok.Data;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class PetEnterQueue {

    /**
     *
     *
     *
     *
     */
     private Queue<Pet>  petQueue;

     public PetEnterQueue(){
         this.petQueue=new LinkedTransferQueue<Pet>();
     }


    public void add (Pet pet){
         petQueue.add(pet);
    }

    public void pollAll(){

         while(!petQueue.isEmpty()){
             System.out.println(petQueue.peek());
             petQueue.remove();
         }
    }

    public void pollDog(){
      for(Pet pet :petQueue){
          if(pet.type=="dog"){
              System.out.println(pet);
              petQueue.remove(pet);
          }
      }
     }

     public void pollCat(){
         for(Pet pet :petQueue){
             if(pet.type=="cat"){
                 System.out.println(pet);
                 petQueue.remove(pet);
             }
         }
     }

     public  Boolean isEmpty(){
         return petQueue.isEmpty();
     }

     public Boolean DogEmpty(){
         Boolean l=false;
         for(Pet pet :petQueue){
             if(pet.type=="dog"){
                 l=true;
             }
         }

         return l;
     }


    public Boolean CatEmpty(){
        Boolean l=false;
        for(Pet pet :petQueue){
            if(pet.type=="Cat"){
                l=true;
            }
        }

        return l;
    }


    @Data
     class Pet {
         private String type;

         public Pet(String type){
             this.type=type;
         }
     }

     public class Dog  extends Pet{
         public Dog(){
             super("dog");
         }
     }

     public class Cat extends Pet{
         public Cat(){
             super("cat");
         }
     }

}
