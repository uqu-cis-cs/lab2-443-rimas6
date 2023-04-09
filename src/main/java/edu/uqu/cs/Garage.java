package edu.uqu.cs;
/*
 * Lab 2 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/
import java.util.Scanner;

public class Garage{

    /************ Part 1 **************/
    /**
     * Decalre an instance variable named cars
     * as an array of Car type
     * it should be of size 3
     * Make sure its private
     * Syntax:
     * private classType [] varName = new classType[size];
     *
     */
    public static int countCars=0;
private Car[]allcar;
public Garage(){
allcar=new Car[3];
}
 
    /************ Part 2 **************/
    /**
     * Decalre a static/class variable named countCars
     * Make sure its public
     * you could initialize it to 0
     * Syntax:
     * public dataType varName= value;
     *
     */
    

    /************ Part 3 **************/
    /**
     * Define a default constructor to create
     * all the elements of cars
     * 
     * Use loop to create them as follows:
     * Syntax:
     * public className (){
     * 	   for(int i=0; i<arrayName.length; i++){
     *         arrayName[i]= new arrayClassName();
     *     }
     *}
     */
    /**precondition model of car to add to garage
     * postcondition new car is added to array
     * 
     */
public void addCar(String model){
    boolean found=false;
for(int i=0;i<countCars;i++){
    if(allcar[i].getModel().equals(model)){
        found=true;
        allcar[i].moveCarIn();
    }
}
if(!found){
    if(countCars<allcar.length){
    Car v=new Car();
    v.setModel(model);
    allcar[countCars]=v;
    allcar[countCars].moveCarIn();
    countCars++;}
    else{
        System.out.println("garage full");
    }
}
}
    /************ Part 4 **************/
    /**
     * Define addCar(String parameter) that adds a new car (by model) to the garage 
     * and set its flag to true; 
     * hint: you must check if the car has not been added before to the list of cars 
     * and it should be added to the car list by using the static variable countCars! 
     * also, change the status of the instance variable inOutGarage to true 
     * by calling method moveCarIn() of class Car
     * Don’t forget to increase countCars’s value by one
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     */


    /************ Part 5 **************/
    /**
     * Define moveOut(String) that moves the car (by model) out of the garage; 
     * hint you must first search if the car is in the list of cars, 
     * then use moveCarOut () method of class Car
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     *
     */
     /**precondition model of car to add to garage
     * postcondition new car is movedout 
     * 
     */
public void moveOut(String model){
    for(int i=0;i<countCars;i++){
        if(allcar[i].getModel().equals(model)){
            allcar[i].moveCarOut();
        }
    }


}


    /************ Part 6 **************/
    /**
     * Define moveOut(String) that moves the car (by model) into the garage; 
     * hint you must first search if the car is in the list of cars, 
     * then use moveCarIn () method of class Car;
     * Note: method returns NO data
     * Syntax:
     * public void methodName(String m)
     *
     */
     /**precondition model of car to add to garage
     * postcondition new car is movedin
     * 
     */
   public void moveIN(String model){
    for(int i=0;i<countCars;i++){
        if(allcar[i].getModel().equals(model)){
            allcar[i].moveCarIn();
        }
    }


}


    /************ Part 7 **************/
    /**
     * Define listCars() to display/list all the cars in the garage;
     * Note: method returns NO data
     * Hint: use loop and methods of class Car to access private data members
     * Syntax:
     * public void methodName(String m)
     *
     */
     /**precondition
     * postcondition print all cars in garage
     * 
     */

 public void ListCars(){
    System.out.println("all cars in the garagear: ");
    for(int i=0;i<countCars;i++){
        if(allcar[i].getFlag())
        System.out.println("car "+(i+1)+": "+allcar[i].getModel());
    }

 System.out.println();
}

}