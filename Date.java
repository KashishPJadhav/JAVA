public class Date {

    public static void main(String[] args) {
        int date = Integer.parseInt(args[0]);
        int mon = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        System.out.println("Date is :" + date);
        System.out.println("Month is :" + mon);
        System.out.println("Year is :" + year);
       if((year%4==0 && year%100!=0)||(year%400==0 && year%100==0))
       {
            if(date>29)
            {
                System.out.println("Invalid Date");
            }
       }
       else{
        if(date>28)
        {
            System.out.println("Invalid Date");
        }
       }
        int days = 0;
        days = days + date;
        int dom[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int i;
        for (i = 0; i < mon; i++) {
            days = days + dom[i];
        }
        if(mon>=2){
            if(year%4==0 && year%100!=0)
            {
                days++;
            }
            else if(year%400==0 && year%100==0)
            {
                days++;
            }
            else{ }
        }
        year = year - 1;
        int odd;
        int yearb;
        odd = days % 7;
        System.out.println("Odd Days are :" + odd);
        int x,z,w;
        x = year / 400;
        System.out.println("X :" + x);
        yearb= year%400;
        System.out.println("Y :" + yearb);
        z = yearb / 100;
        System.out.println("Z :" + z);
        w= yearb%100;
        System.out.println("W :" + w);
        odd = (x*0)+(z * 5) + odd;
        int century;
        century=(x*400)+(z*100);
        System.out.println("Century :" +century);
        int ody,ly;
        ly=0;
        for(i=century+1;i<=year;i++)
        {
            if(i%4==0 && i%100!=0)
            {
                ly++;
            }
            else if(i%400==0 && i%100==0)
            {
                ly++;
            }
        }
        ody=w-ly;
        System.out.println("Ordinary Year :" + ody);
        System.out.println("Leap Year :" + ly);
        ly = ly * 2;
        ody = ody + ly;
        odd = (ody % 7) + odd;
        while (odd > 7) {
            odd = odd % 7;
        }
        if (odd == 7) {
            odd = 0;
        }
        System.out.println("Odd Days are :" + odd);
        String weekday;
        switch (odd) {
            case 0:
                weekday = "Sunday";
                break;
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            default:
                weekday = "Saturday";
                break;
        }
        System.out.println("Day on this Date is :" + weekday);
    }
}
