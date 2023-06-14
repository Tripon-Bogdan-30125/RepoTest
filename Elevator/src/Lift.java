public class Lift {

    public int position;
    public String liftName;

    public Lift(String liftName)
    {
        this.liftName = liftName;
    }

    public void displayPosition()
    {
        System.out.println("The current level of the " + liftName + " elevator is: " + position + " -> current state staying");
    }

    public void displayElevator()
    {
        System.out.println("Elevator " + liftName + " is coming. . ." + " -> current state moving");
    }
}
