public class Main {
    public static int getDayOfWeek(String dayOfWeekArg) {
         switch (dayOfWeekArg) {
             case "Monday": return 1;
             case "Tuesday": return 2;
             case "Wednesday": return 3;
             case "Thursday": return 4;
             case "Friday": return 5;
             case "Saturday": return 6;
             case "Sunday": return 0;
             default: throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
         }
    }
}
