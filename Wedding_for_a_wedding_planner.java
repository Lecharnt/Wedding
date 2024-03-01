import java.time.LocalDate;

public class Wedding_for_a_wedding_planner {
    private final LocalDate dateWed;
    private final Couple couple;
    private final String location;
    public Wedding_for_a_wedding_planner(LocalDate dateWed, Couple couple, String location){
        this.dateWed = dateWed;
        this.couple = couple;
        this.location = location;
    }
    public LocalDate getDateWed(){
        return dateWed;
    }
    public Couple getcouple() {
        return couple;
    }
    public String getLocation(){
        return location;
    }
}