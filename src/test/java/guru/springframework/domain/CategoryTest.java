package guru.springframework.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryTest {

    private static Category category;

    @BeforeAll
    public static void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        String idValue = "4";

        category.setId(idValue);
        assertEquals(4L, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}