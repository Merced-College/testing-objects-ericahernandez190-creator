public class Cat 
{

// Name, color, and playful
private String name;
private String color;
private boolean playful;

public Cat()
{
    name = "Unknown"; //initializing the name to "Unknown"
    color = "Unknown"; // initializing the color to "Unknown"
    playful = true; //initializing playful to true
}

public Cat(String name, String color, boolean playful){
    this.name = name;
    this.color = color;
    this.playful = playful;
}
    
public String getName() { //this will return the name when using .getName
    return name;
}

public void setName(String name){ 
    this.name = name;
}

public String getColor() { ///this will return the color when using .getColor
    return color; 
}

public void setColor(String color){
    this.color = color;
}

public boolean getPlayful(){
    return playful;
}

public void setPlayful(boolean playful){
    if (!this.playful){
        this.playful = playful;
        this.name = "Grumpy";
    }

}

@Override
    public String toString(){
    return "Cat{name = '" + name + " ', color = " + color + ", Playful = '" + playful + "'}";

}

}
