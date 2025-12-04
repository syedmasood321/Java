 import java.util.Scanner;
 // for vechical class using methods
 public class MethodVehical
{       int speed;
        String area;
        MethodVehical(int speed,String area)
        {
            this.speed=speed;
            this.area=area; 
        }
    public void StartEngine()
    {
        System.out.println("the vehical is turn on");
    }
    public void StopEngine()
    {
        System.out.println("The vehical is turn off");
    }
    public void Accelerate()
    {
        System.out.println("The vehical is moving at a speed of:"+speed);
    }
    public void Break()
    {
        System.out.println("The vehical is stop at:"+area);
    }
    // for light class inner class
    public class light
    {
        boolean light;
        light(boolean light)
        {
            this.light=light;
        }
        public void Light()
        {
        if(light)
           System.out.println("light is on");
        else
            System.out.println("light is off");
        }
    }
    // main method
 public static void main(String args[])
 {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the speed:");
    int speed=s.nextInt();
    System.out.println("enter the light value 'true'or 'false':");
    boolean value=s.nextBoolean();
    MethodVehical m=new MethodVehical(speed,"Check post");
    MethodVehical.light l=m.new  light(value);
    m.StartEngine();
    m.Accelerate(); 
    m.Break();
    m.StopEngine();
    l.Light();
    s.close();
}
}