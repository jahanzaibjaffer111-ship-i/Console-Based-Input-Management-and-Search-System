import java.util.Scanner;
public class Console_Based_Input_Management_and_Search_System
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        while(true)
        {
            System.out.println("Hello");
            System.out.println("Welcome to Console Based Input Management and Search System");
            System.out.println("Types Inputs you want to store");
            String a=read.nextLine();
            if(a.trim().isEmpty())
            {
                System.out.println("No input entered. Try again.");
                System.out.println();
                continue;
            }
            String [] b=a.split("\\s+");
            System.out.println("No of Inputs are="+b.length);
            System.out.println();
            System.out.println("Inputs are");
            for (int i=0; i<b.length; i++)
            {
                System.out.println((i+1)+") "+b[i]);
            }
            while(true)
            {
                boolean found=false;
                System.out.println();
                System.out.println("type Input which u want to search and Type Exit If you want to move on");
                String c=read.nextLine();
                if(c.equalsIgnoreCase("exit"))
                {
                    break;
                }
                for (int i=0; i<b.length; i++)
                {
                    if (b[i].equalsIgnoreCase(c))
                    {
                        System.out.println("Input is");
                        System.out.println((i+1)+") "+b[i]+"   true");
                        found=true;
                    }
                }
                if(!found)
                {
                    System.out.println("Input Not Found");
                    System.out.println("Try Again");
                }
            }
            while(true)
            {
                System.out.println();
                System.out.println("Type Index of which you want Input and type exit to move on");
                System.out.println("Maximum Inputs= "+b.length);
                String d=read.nextLine();
                if(d.equalsIgnoreCase("exit"))
                {
                    break;
                }
                int y=Integer.parseInt(d);
                if(y>0 && y<=b.length)
                {
                    for (int i=0; i<b.length; i++)
                    {
                        if ((i+1)==y)
                        {
                            System.out.println("Input is");
                            System.out.println((i+1)+") "+b[i]);
                        }
                    }
                    //break;
                }
                if (y==0)
                {
                    System.out.println("Index can't be Zero");
                    System.out.println("Try Again");
                }
                if (y<0)
                {
                    System.out.println("Index can't be Negative");
                    System.out.println("Try Again");
                }
                if (y>b.length)
                {
                    System.out.println("Index can't be greater than Maximum Inputs");
                    System.out.println("Try Again");
                }
            }
            System.out.println(" ");
            System.out.println("Do you want to restart type yes or no");
            String m=read.nextLine();
            if(m.equalsIgnoreCase("no"))
            {
                System.out.println("Thanks");
                System.out.println("Bye");
                break;
            }
            if(m.equalsIgnoreCase("yes"))
            {
                System.out.println(" ");
            }      
        }
    }

}
