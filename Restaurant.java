import java.time.LocalTime;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private List<Item> menu;

    // Assume getters and setters are already defined

    public List<Item> getMenu() {
        return menu;
    }

    public boolean isRestaurantOpen(LocalTime currentTime) {
        return currentTime.isAfter(openingTime) && currentTime.isBefore(closingTime);
    }
}
