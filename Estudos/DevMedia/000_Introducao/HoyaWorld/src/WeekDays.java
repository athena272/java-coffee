import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekDays {
    LocalDate date = LocalDate.now();
    DayOfWeek dayOfWeek = DayOfWeek.from(date);

    public String dayWeek() {
        String day;
        switch (dayOfWeek)
        {
            case SUNDAY:
                day = "Dies Solis";
                break;
            case MONDAY:
                day = "Mōnandæg";
                break;
            case TUESDAY:
                day = "Tiwesdæg";
                break;
            case WEDNESDAY:
                day = "Wōdnesdæg";
                break;
            case THURSDAY:
                day = "Þūnresdæg";
                break;
            case FRIDAY:
                day = "Frigedæg";
                break;
            case SATURDAY:
                day = "Sæturnesdæg";
                break;
            default:
                day = "Dia desconhecido";
        }

        return day;
    }
}
