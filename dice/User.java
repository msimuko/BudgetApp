public class User {
    Dice dice = new Dice();

    //this method returns a face value
    public int roll(){
        return dice.getFaceValue();
    }
}
