package faced_design_pattern;

public class Bulb implements  Invoker
{
    @Override
    public void switchOn()
    {
        System.out.println("----------------------------------");
        System.out.println("Bulb is on");
        System.out.println("----------------------------------");
    }
    @Override
    public void switchOf()
    {
        System.out.println("----------------------------------");
        System.out.println("Bulb is off");
        System.out.println("----------------------------------");
    }
}
