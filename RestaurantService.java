import java.util.List;

public class RestaurantService {
    private List<Restaurant> restaurants;

    // Assume getters and setters are already defined

    public Restaurant findRestaurantByName(String restaurantName) {
        // Search for the restaurant by name
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equalsIgnoreCase(restaurantName)) {
                return restaurant;
            }
        }
        return null; // Return null if the restaurant is not found
    }
}
