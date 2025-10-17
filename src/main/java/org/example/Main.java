package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(area(-5.0));
    }

    
    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        boolean rreturn = false;

        if(!isBarking) return false;
        if(clock<0 || clock>23) return false;

        if(clock<8) rreturn= true;
        if(clock>8) rreturn = true;
        return rreturn;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {


       return (firstAge<=19 && firstAge >=13 || secondAge<=19 && secondAge >=13 || thirdAge<=19 && thirdAge >=13);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     boolean play = false;

     if(isSummer){
         play = temp<=45 && temp>=25;

     }else{
         play = temp<=35 && temp>=25;
     }
     return play;
    }

    public static double area(double width, double height) {
       if(width<0 || height<0) return -1;
       return width*height;
    }

    public static double area(double radius) {
       if(radius<0) return -1;

       return radius*radius* Math.PI;
    }
}
