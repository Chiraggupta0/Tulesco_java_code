abstract class car  // abstract class
{
    public abstract void drive();  // abstract function
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("play music");
    }

}
abstract class wagonr extends car{  //abstract class
    public void drive()
    {
        System.out.println("driving");
    }
}

class updatedwagonr extends wagonr  // concrete class 
{
    public void fly()
    {
        System.out.println("flying");
    }
}

public class _7_49Abstract
{
    public static void main(String args[])
    {
        updatedwagonr obj = new updatedwagonr();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}