package edu.sbcc.cs105;

/**
 * Dog
 */
public class Dog {

    private boolean hasSpots;
    private int age;

    public void bark(int howManyTimes) {
        
        for (int i = 0; i < howManyTimes; i++){
            System.out.println("Ruff!");
        }
    }

    public void setHasSpots(boolean hasSpots) {
        this.hasSpots = hasSpots;
    }

    public boolean hasSpots(){
        return hasSpots;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;        
    }
}