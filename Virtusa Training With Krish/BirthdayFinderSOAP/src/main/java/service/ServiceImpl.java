package service;

public class ServiceImpl {
    public int calculate(int year, int month, int day) {

        boolean leapyear= Leapyear(year);
        int date;

        if(leapyear==true){

            date= findLeapDate(month, day);
        }else{
            date= Date(month, day);
        }

        return date;
    }



    private boolean Leapyear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            return true;
        } else {
            return false;
        }

    }

    private int Date(int month,int day){

        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3:
                return 31+28+day;

        }

        return 0;
    }

    private int findLeapDate(int month,int day){

        switch (month){
            case 1:
                return day;
            case 2:
                return 31+day;
            case 3:
                return 31+29+day;

        }

        return 0;
    }

}
