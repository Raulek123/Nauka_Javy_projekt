package ObslugaBledow.AutomatZGrami;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameMachineTest {
    @Test
    void testNotBuyGame() {
        // given
        final GameMachine gameMachine = new GameMachine();

        //when
        final ThrowableAssert.ThrowingCallable callable = () -> gameMachine.buy("XXX", 50);

        //then
        assertThatThrownBy(callable)
                .isInstanceOf(GameNotFoundException.class)
                .hasMessage("Game not found: XXX");
    }
}