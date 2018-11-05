package ua.zp.braincad.sania3000.lab5;

public class Fish {
   private int length;
   private String colour;

   public Fish(int length,String colour){
        this.length=length;
        this.colour=colour;
    }
    void swim(){
        System.out.println("рыбка плывет");
    }
    void eat(){
        System.out.println("рыбка кушает");

    }

    public int getLength () {
        return length;
    }

    public void setLength ( int length ) {
        this.length = length;
    }

    public String getColour () {
        return colour;
    }

    public void setColour ( String colour ) {
        this.colour = colour;
    }
}

