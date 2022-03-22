package faced_design_pattern;

public class MusicPlayer implements Invoker
{
    @Override
    public void switchOn()
    {
        System.out.println("----------------------------------");
        System.out.println("Music Player is on");
        System.out.println("----------------------------------");
    }

    @Override
    public void switchOf()
    {
        System.out.println("----------------------------------");
        System.out.println("Music Player is off");
        System.out.println("----------------------------------");
    }
}
