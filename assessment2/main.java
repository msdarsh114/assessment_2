package faced_design_pattern;

import java.util.Scanner;

public class main
{
    public static MusicPlayer mp=new MusicPlayer();
    public static Bulb b=new Bulb();
    public static void main(String[] args)
    {
        int ch,n;
        do
        {
            System.out.println("choose your option : ");
            System.out.println("1: Bulb Remote");
            System.out.println("2: Music Player Remote");
            System.out.println("3: exit");

            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            boolean flag=false;
            switch (ch)
            {
                case 1:
                    do
                    {
                        System.out.println("Welcome to bulb remote");
                        System.out.println("enter a key");
                        System.out.println("1: switch on");
                        System.out.println("2: switch off");
                        n = sc.nextInt();
                        switch (n)
                        {
                            case 1:
                                if (flag == false)
                                {
                                    flag=true;
                                    b.switchOn();
                                } else
                                {
                                    System.out.println("----------------------------------");
                                    System.out.println("bulb is already on");
                                    System.out.println("----------------------------------");
                                }
                                break;
                            case 2:
                                if (flag != false)
                                {
                                    flag = false;
                                    b.switchOf();
                                } else
                                {
                                    System.out.println("----------------------------------");
                                    System.out.println("Bulb is already off");
                                    System.out.println("----------------------------------");
                                }
                                break;
                            default:
                                System.out.println("----------------------------------");
                                System.out.println("Invalid choice");
                                System.out.println("----------------------------------");
                                break;
                        }
                    }while (n<3);
                    break;

                case 2:
                    do
                    {

                        System.out.println("Welcome to Music Player remote");
                        System.out.println("enter a key");
                        System.out.println("1: switch on");
                        System.out.println("2: switch off");
                        n = sc.nextInt();
                        switch (n)
                        {
                            case 1:
                                if (flag == false)
                                {
                                    flag=true;
                                    mp.switchOn();
                                } else
                                {
                                    System.out.println("----------------------------------");
                                    System.out.println("Music Player is already on");
                                    System.out.println("----------------------------------");
                                }
                                break;
                            case 2:
                                if (flag != false)
                                {
                                    flag = false;
                                    mp.switchOf();
                                } else
                                {
                                    System.out.println("----------------------------------");
                                    System.out.println("Music Player is already off");
                                    System.out.println("----------------------------------");
                                }
                                break;
                            default:System.out.println("----------------------------------");
                                System.out.println("Invalid choice");
                                System.out.println("----------------------------------");
                                break;
                        }
                    }while (n<3);
                    break;
                default: System.out.println("----------------------------------");
                    System.out.println("Thank You for Using The Remote");
                    System.out.println("----------------------------------");
            }
        }while (ch<3);

    }
}
