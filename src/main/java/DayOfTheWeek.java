public class DayOfTheWeek {

    public String dayOfTheWeek(int num){
        String returnValue;
        switch (num){
            case 1:
                returnValue= "Sunday";
                break;
            case 2:
                returnValue= "Monday";
                break;
            case 3:
                returnValue= "Tuesday";
                break;
            case 4:
                returnValue= "Wednesday";
                break;
            case 5:
                returnValue= "Thursday";
                break;
            case 6:
                returnValue= "Friday";
                break;
            case 7:
                returnValue= "Saturday";
                break;
            default:
                returnValue="Invalid input";
                break;
        }
        return returnValue;
    }
}
