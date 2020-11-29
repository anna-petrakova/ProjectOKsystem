package Part_2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class YearInfo {

    /**
     * Get the number of Friday 13 days in a year.
     * @param year in which year we want to find unlucky days
     * @return number of unlucky days
     */
    public int getUnluckyDaysInAYear(int year) {
        int unluckyDays = 0;
        LocalDate dayInAYear;

        for (int month = 1; month <= 12; month++) {
            dayInAYear = LocalDate.of(year, month, 13);
            DayOfWeek day = dayInAYear.getDayOfWeek();
            if (day.getValue() == 5) {
                unluckyDays++;
            }
        }
        return unluckyDays;
    }
}
