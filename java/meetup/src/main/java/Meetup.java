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
        //FIRST,
        //SECOND,
        //THIRD,
        //FOURTH,
        //LAST,
        //TEENTH
        //We have the year and the mont from constructor

        //We get the weekday and first/second/tenth.. as input from function day

        //
        LocalDate dt = LocalDate.of(2013, 5, 13);
        return dt;
    }
    public LocalDate getTenth(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
    }
    public LocalDate getFirst(DayOfWeek d, MeetupSchedule s){
        LocalDate dt =  null ;  //LocalDate.now();
        return dt;
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