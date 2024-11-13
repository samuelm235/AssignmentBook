public class Main
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60]; //9 periods, 60 mins each
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 25; i < 30; i++) schedule[1][i] = true; //go through every min (i) in period two, set to true
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        for(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;
        a.printPeriod(4);
        System.out.println(a.makeAppointment(2, 4, 22));
        a.printPeriod(4);
    }
}