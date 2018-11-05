package ua.zp.braincad.sania3000.lab5;

public class Herb {                     //растение
    private String colour;
    private int height;
   public Herb(String colour,int height){
        this.colour=colour;
        this.height=height;
    }




    public String getColour() {
        return colour;
    }

    public int getHeight() {
        return height;
    }

    public void setColour ( String colour ) {
        this.colour = colour;
    }

    public void setHeight ( int height ) {
        this.height = height;
    }
}

