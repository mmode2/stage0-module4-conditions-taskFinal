package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if (year % 4 != 0 || year == 1900) {
                    System.out.println(28);
                } else {
                    System.out.println(29);
                }
                break;
            default:
                System.out.println(31);
        }

    }
}
