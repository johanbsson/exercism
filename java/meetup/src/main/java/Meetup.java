import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;


/**
 * Created by johan on 2017-02-09.
 */
public class Meetup {
    MeetupManager mm;
    public Meetup(int month, int year) {
       mm = new MeetupManager(month ,year);
    }
    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {
        return mm.findDay(dayOfWeek, meetupSchedule);
    }

    class MeetupManager {
        DateFinder df = null;
        DayDiffer dd = null;

        public MeetupManager(int month, int year) {
            df = new DateFinder(year, month);
            dd = new DayDiffer();
        }

        public LocalDate findDay(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {

            LocalDate theDateWeAreLookingFor = null;

            if(meetupSchedule == MeetupSchedule.LAST) {
                //todo implment last functionality
                LocalDate lastDateInMonth = df.getLastDateInMonth();
                DayOfWeek lastDayOfMonth = lastDateInMonth.getDayOfWeek();
                int backwardsCount = dd.countFromLastToTargetDayForward(lastDayOfMonth, dayOfWeek);
                theDateWeAreLookingFor = lastDateInMonth.minusDays(backwardsCount);
            }
            else {
                LocalDate firstDateInPeriod = df.getFirstDateInPeriod(meetupSchedule);
                DayOfWeek weekDayOfFirstDay = firstDateInPeriod.getDayOfWeek();
                int countToDay = dd.countFromDayToDayForward(weekDayOfFirstDay, dayOfWeek);
                theDateWeAreLookingFor  = firstDateInPeriod.plusDays(countToDay);
            }
            return theDateWeAreLookingFor;
        }
    }


    class DayDiffer {
        public DayDiffer() {
            DayOfWeek [] dayArray = {
                    DayOfWeek.MONDAY,
                    DayOfWeek.TUESDAY,
                    DayOfWeek.WEDNESDAY,
                    DayOfWeek.THURSDAY,
                    DayOfWeek.FRIDAY,
                    DayOfWeek.SATURDAY,
                    DayOfWeek.SUNDAY,
                    DayOfWeek.MONDAY,
                    DayOfWeek.TUESDAY,
                    DayOfWeek.WEDNESDAY,
                    DayOfWeek.THURSDAY,
                    DayOfWeek.FRIDAY,
                    DayOfWeek.SATURDAY,
                    DayOfWeek.SUNDAY
            } ;
            dayList = new ArrayList<DayOfWeek>(Arrays.asList(dayArray));


        }
        private List<DayOfWeek> dayList;

        public int countFromDayToDayForward(DayOfWeek firstDayInPeriod, DayOfWeek targetDay) {
            int indexOfFirstDay = dayList.indexOf(firstDayInPeriod);
            List<DayOfWeek> sublistForWeek = dayList.subList(indexOfFirstDay, indexOfFirstDay + 7);
            int dayDiffForward = sublistForWeek.indexOf(targetDay);
            return dayDiffForward;
        }

        public int countFromLastToTargetDayForward(DayOfWeek lastDayOfMonth, DayOfWeek dayOfWeek) {
            //todo invert dayList
            ArrayList<DayOfWeek> reverseDayList = new ArrayList<DayOfWeek>(dayList);
            Collections.reverse(reverseDayList);
            System.out.println("reversed day list" +reverseDayList);
            int indexOfLastDayOfMonth = reverseDayList.indexOf(lastDayOfMonth);
            List<DayOfWeek> reversedSubList = reverseDayList.subList(indexOfLastDayOfMonth,  indexOfLastDayOfMonth +7);
            System.out.println("reversed sublist " + reversedSubList);
            int dayDiffBackwards = reversedSubList.indexOf(dayOfWeek);
            //todo make sublist from lastDayOfMonth
            //todo calculate day diff
            System.out.println("daydiffbackwards " + dayDiffBackwards);
            return dayDiffBackwards;
        }
    }

    class DateFinder {
        DayOfWeek dayOfWeekFirstWeek;
        DayOfWeek dayOfWeekLastWeek;
        LocalDate firstDateOfMonth;
        LocalDate lastDateOfMonth;
        int year;
        int month;
        public DateFinder(int year, int month) {
            this.year = year;
            this.month = month;
            firstDateOfMonth =  LocalDate.of(year, month, 1);
            lastDateOfMonth = firstDateOfMonth.with(lastDayOfMonth());
            dayOfWeekFirstWeek = firstDateOfMonth.getDayOfWeek();
            dayOfWeekLastWeek = lastDateOfMonth.getDayOfWeek();
        }

        public LocalDate getFirstDateInPeriod(MeetupSchedule meetupSchedule) {
            LocalDate firstDataInPeriod = null;
            if(meetupSchedule == MeetupSchedule.TEENTH){
                firstDataInPeriod = LocalDate.of(year, month, 13);
            }
            else if(meetupSchedule == MeetupSchedule.FIRST){
                firstDataInPeriod = firstDateOfMonth;
            }
            else if(meetupSchedule == MeetupSchedule.SECOND){
                firstDataInPeriod = firstDateOfMonth.plusDays(7);
            }
            else if(meetupSchedule == MeetupSchedule.THIRD){
                firstDataInPeriod = firstDateOfMonth.plusDays(14);
            }
            else if(meetupSchedule == MeetupSchedule.FOURTH){
                firstDataInPeriod = firstDateOfMonth.plusDays(21);
            }

            return firstDataInPeriod;
        }

        public LocalDate getLastDateInMonth() {
            return lastDateOfMonth;
        }
    }
}

