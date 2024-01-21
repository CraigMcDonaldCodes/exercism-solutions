import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {

    private final DateTimeFormatter usParser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, usParser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {

        // I feel like this wasn't the way to go for the solution
        // but it passes all tests so ¯\_(ツ)_/¯
        return "You have an appointment on %s, %s %d, %d, at %d:%02d %s.".formatted(
            appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US),
            appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.US),
            appointmentDate.getDayOfMonth(),
            appointmentDate.getYear(),
            appointmentDate.getHour() % 12,
            appointmentDate.getMinute(),
            appointmentDate.getHour() < 12 ? "AM" : "PM"
        );
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }
}
