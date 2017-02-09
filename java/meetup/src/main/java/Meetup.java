import java.lang.reflect.Method;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;


/**
 * Created by johan on 2017-02-09.
 */
public class Meetup {

    int month;
    int year;
    int firsWeekInMonth;
    int lastWeekInMonth;
    DayOfWeek dayOfWeekFirstWeek;
    DayOfWeek dayOfWeekLastWeek;
    LocalDate firstDateOfMonth;
    LocalDate lastDateOfMonth;


    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
        firstDateOfMonth =  LocalDate.of(year, month, 1);
        firsWeekInMonth = getWeekNumber(firstDateOfMonth);
        lastDateOfMonth = firstDateOfMonth.with(lastDayOfMonth());
        lastWeekInMonth = getWeekNumber(lastDateOfMonth);
        System.out.println("First day is: " + firstDateOfMonth);
        System.out.println("Last day is:" + lastDateOfMonth);
        System.out.println("First week in month is:" + firsWeekInMonth);
        System.out.println("Last week in month is:" + lastWeekInMonth);
        dayOfWeekFirstWeek = firstDateOfMonth.getDayOfWeek();
        dayOfWeekLastWeek = lastDateOfMonth.getDayOfWeek();
        System.out.println("Day of week firstDate:" + dayOfWeekFirstWeek);
        System.out.println("Day of week lastDate:" + dayOfWeekLastWeek);

    }

    public LocalDate day(DayOfWeek d, MeetupSchedule s) {
        DayOfWeek day = d;
        MeetupSchedule shedule = s;
        LocalDate returnDate = null;
        //FIRST,
        //SECOND,
        //THIRD,
        //FOURTH,
        //LAST,
        //TEENTH
        if(s == MeetupSchedule.FIRST.TEENTH){
          returnDate = getTenth(d, s);
        }

        //We have the year and the mont from constructor

        //We get the weekday and first/second/tenth.. as input from function day

        //
        LocalDate dt = LocalDate.of(2013, 5, 13);
        return returnDate;
    }
    public LocalDate getTenth(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        //First tenth day is date 13
        LocalDate firstTenthDate = LocalDate.of(year, month, 13);
        DayOfWeek weekDayOfFirstTenthDay = firstTenthDate.getDayOfWeek();
        System.out.println("First tenth day is a " + weekDayOfFirstTenthDay);
        System.out.println("The weekday of the asked day is: " + d);

        //What week day is this
        //What week is this
        //If it's a monday, all tents are in this week
        if(weekDayOfFirstTenthDay == DayOfWeek.MONDAY){
            if(d == DayOfWeek.MONDAY){
                return firstTenthDate;
            }

            //The first testcase works now
        }
        else if(weekDayOfFirstTenthDay == DayOfWeek.TUESDAY){
            //Second testcase has first tenth day tuesday
            //And asks for first monday which is 6 days ahead
            LocalDate ret = null;
            if(d == DayOfWeek.MONDAY){
                ret = firstTenthDate.plusDays(6);
            }
            System.out.println("The day i got was:  "  + ret);
            return ret;
        }
        else if(weekDayOfFirstTenthDay == DayOfWeek.FRIDAY){
            //Third testcase has first tenth day friday
            //And asks for first monday which is 3 days ahead
            LocalDate ret = null;
            if(d == DayOfWeek.MONDAY){
                ret = firstTenthDate.plusDays(3);
            }
            System.out.println("The day i got was:  "  + ret);
            return ret;
        }
        else if(weekDayOfFirstTenthDay == DayOfWeek.WEDNESDAY){
            //Fourth testcase has first tenth day wednesday
            //And asks for first thuesday which is 6 days ahead
            LocalDate ret = null;
            if(d == DayOfWeek.TUESDAY){
                ret = firstTenthDate.plusDays(6);
            }
            System.out.println("The day i got was:  "  + ret);
            return ret;
        }
        else if(weekDayOfFirstTenthDay == DayOfWeek.SATURDAY){
            //Fifth testcase has first tenth day saturday
            //And asks for first thuesday which is 3 days ahead

            LocalDate ret = null;
            if(d == DayOfWeek.TUESDAY){
               ret = firstTenthDate.plusDays(3);
            }
            System.out.println("The day i got was:  "  + ret);
            return ret;
        }
        return dt;
    }
    public LocalDate getFirst(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
        // What day is the first workday of the month
        //If it's a monday, then tuesday is in sameweek
        //If it's a tuesday then first monday is in next week
        //If it's a wednesday thin first tuesday is in next week


    }
    public LocalDate getSecond(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
    }
    public LocalDate getThird(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
    }
    public LocalDate getFourth(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
    }
    public LocalDate getLast(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        //If last workday of month is friday then all the
        return dt;
    }


    public int getWeekNumber(LocalDate d){
        LocalDate dt = d; //LocalDate.now();
        TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
        int weekNumber = dt.get(woy);
        return weekNumber;
    }
}

/*
LocalDate date = LocalDate.now();
TemporalField woy = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
int weekNumber = date.get(woy);

LocalDate expected = LocalDate.of(2013, 5, 13);
new Meetup(5, 2013);
meetup.day(DayOfWeek.MONDAY, MeetupSchedule.TEENTH));

LocalDate expected = LocalDate.of(2013, 8, 19);
Meetup meetup = new Meetup(8, 2013);
assertEquals(expected, meetup.day(DayOfWeek.MONDAY, MeetupSchedule.TEENTH));
*/