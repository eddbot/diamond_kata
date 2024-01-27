package acceptance;

import org.example.domain.DiamondCreator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondKataAcceptanceTests {
    
    
    private Path getFixture(String filename) {
        return Path.of(getClass().getClassLoader().getResource(filename).getPath());
    }


    @Test
    void shouldPrintSingleLineWhenA() throws IOException {
        // arrange
        DiamondCreator diamondCreator = new DiamondCreator('A');

        // act
        String actual = diamondCreator.create();
        String expected = Files.readString(getFixture("a_diamond.txt"));

        // assert
        assertEquals(expected, actual);
    }
    @Test
    void shouldPrintSmallDiamondWhenB() throws IOException {
        // arrange
        DiamondCreator diamondCreator = new DiamondCreator('B');

        // act
        String actual = diamondCreator.create();
        String expected = Files.readString(getFixture("b_diamond.txt"));

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrintBiggerDiamondWhenC() throws IOException {
        // arrange
        DiamondCreator diamondCreator = new DiamondCreator('C');

        // act
        String actual = diamondCreator.create();
        String expected = Files.readString(getFixture("c_diamond.txt"));

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrintTheUberDiamondWhenZ() throws IOException {
        // arrange
        DiamondCreator diamondCreator = new DiamondCreator('Z');

        // act
        String actual = diamondCreator.create();
        String expected = Files.readString(getFixture("uber_diamond.txt"));

        // assert
        assertEquals(expected, actual);
    }
}
