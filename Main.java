public class Main
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60]; //9 periods, 60 mins each
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;  
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;

        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));

        boolean[][] schedule2 = new boolean[8][60]; //9 periods, 60 mins each
        AppointmentBook b = new AppointmentBook(schedule2);
        System.out.println(b);
        for(int i = 25; i < 30; i++) schedule[1][i] = true;  
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        or(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;

    }
}