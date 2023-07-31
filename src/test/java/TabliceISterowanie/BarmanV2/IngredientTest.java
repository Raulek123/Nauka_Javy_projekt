package TabliceISterowanie.BarmanV2;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IngredientTest extends TestCase {
    @Test
    public void testToStringIngredient() {
        // given
        Ingredient ingredient = new Ingredient("Ala", 50);

        //when
        String result = ingredient.toString();

        //then
        assertThat(result).isEqualTo("-Ala (50)");
    }
}