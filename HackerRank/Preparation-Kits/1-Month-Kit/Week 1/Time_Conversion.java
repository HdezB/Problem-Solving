/*
Given a time in

12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock. 
*/

class Result {
    public static String timeConversion(String s) {
        // Write your code here
            if (s.contains("AM") && s.contains("12")) {
                String[] arr = s.substring(0, s.length()-2).split(":");
                return "00:"+arr[1]+":"+arr[2];
            } else if (s.contains("PM") && !s.contains("12")) {
                String[] arr = s.substring(0, s.length()-2).split(":");
                return (Integer.parseInt(arr[0]) + 12)+":"+arr[1]+":"+arr[2];
            }
            return s.substring(0, s.length()-2);
        }
}