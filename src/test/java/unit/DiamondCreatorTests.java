package unit;

import com.murismo.domain.DiamondCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiamondCreatorTests {

    @Test
    void shouldAcceptAlphabeticalCharacters() {
        // arrange / act / assert
       assertDoesNotThrow(()-> new DiamondCreator('A'));
    }

    @Test
    void shouldRejectNonAlphabeticalCharacters() {
        // arrange / act / assert
        assertThrows(RuntimeException.class, () -> new DiamondCreator('0'));
    }
}
