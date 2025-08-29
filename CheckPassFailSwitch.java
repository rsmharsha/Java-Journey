public class CheckPassFailSwitch {
    public static String check(int mark) {
        String result;

        if (mark < 75) {
            result = "Fail";
        } else {
            switch (mark / 5) {
                case 15: // 75–79
                    if (mark == 79)
                        result = "Satisfactory";
                    else
                        result = "Fair";
                    break;

                case 16: // 80–84
                    result = "Good";
                    break;

                case 17: // 85–89
                    result = "Very Good";
                    break;

                case 18: // 90–94
                case 19: // 95–99
                case 20: // 100
                    result = "Excellent";
                    break;

                default:
                    result = "Invalid mark";
                    break;
            }
        }

        return result + "\nDONE";
    }
}
