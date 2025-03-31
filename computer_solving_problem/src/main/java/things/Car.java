package things;

public record Car {

    public String getBrand(){
        return brand;
    }
    public String getType(){
        return type;
    }
    public int getHorsepower(){
        return horsepower;
    }
    public boolean isSportsCar(){
        return sportsCar;
    }
}
