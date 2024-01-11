import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantServiceTest {
    @Test
    public void searching_for_existing_restaurant_should_return_expected_restaurant_object() {
        // Arrange
        RestaurantService restaurantService = new RestaurantService();
        Restaurant restaurant = new Restaurant();
        restaurant.setName("Test Restaurant");
        restaurantService.getRestaurants().add(restaurant);

        // Act
        Restaurant foundRestaurant = restaurantService.findRestaurantByName("Test Restaurant");

        // Assert
        assertNotNull(foundRestaurant);
        assertEquals("Test Restaurant", foundRestaurant.getName());
    }

    @Test
    public void searching_for_non_existing_restaurant_should_throw_exception() {
        // Arrange
        RestaurantService restaurantService = new RestaurantService();

        // Act and Assert
        assertThrows(RestaurantNotFoundException.class, () ->
                restaurantService.findRestaurantByName("Non-existing Restaurant"));
    }
}
