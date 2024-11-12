public class Main
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60]; //9 periods, 60 mins each
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 10; i < 15; i++) schedule[1][i] = true; //go through every min (i) in period two, set to true
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
        a.printPeriod(2);
    }
}