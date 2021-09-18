package ObjectClass;

class MyDate{
    int day;
    int month;
    int year;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate){
            MyDate date = (MyDate)obj;
            if (this.day == date.day && this.month == date.month && this.year == date.year){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day*11 +  month*101+ year * 1001;
    }

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
public class ObjectClassExample {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(8, 12, 1996);
        MyDate date2 = new MyDate(8, 12, 1996);

        System.out.println(date1.equals(date2));
    }
}


