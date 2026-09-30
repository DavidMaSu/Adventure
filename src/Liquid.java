public class Liquid extends Item{
    private int healthPoints;
    public Liquid(String name, String description, int healthPoints){
        super(name, description);
        this.healthPoints = healthPoints;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
}
