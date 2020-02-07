package io.ruban.practice.algorithms.warmup.easy;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int hh = Integer.parseInt(s.substring(0, 2));
        String mm = s.substring(3, 5);
        String ss = s.substring(6, 8);

        boolean isPM = s.endsWith("PM");
        boolean isAM = s.endsWith("AM");

        if (isPM) {
            if (hh != 12) {
                hh += 12;
            }
        } else {
            if (hh == 12) {
                hh -= 12;
            }
        }

        String hhStr = String.valueOf(hh);
        if (hhStr.length() < 2) hhStr = "0" + hhStr;

        return hhStr + ":" + mm + ":" + ss;
    }

    public static void main(String[] args) {
        String s = "12:00:00AM";
        String result = timeConversion(s);
        System.out.println(s + " -> " + result);

        s = "12:40:22AM";
        result = timeConversion(s);
        System.out.println(s + " -> " + result);

        s = "07:05:45PM";
        result = timeConversion(s);
        System.out.println(s + " -> " + result);

        s = "11:59:45PM";
        result = timeConversion(s);
        System.out.println(s + " -> " + result);

        s = "12:00:00PM";
        result = timeConversion(s);
        System.out.println(s + " -> " + result);
    }
}
