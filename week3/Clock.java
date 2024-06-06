package week3;

public class Clock
{
    public static void main (String[] args)
    {

        ClockDisplay clock = new ClockDisplay(23,59);

        System.out.println("Jam Sekarang " +  clock.getTime());
    }
}