package Animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
        this.animal = new Animal("Ugly Duckling", Gender.Male);
    }

    @Test
    void testConstructor() {
        assertEquals("Ugly Duckling", this.animal.getName());
        assertEquals(Gender.Male, this.animal.getGender());
        assertNull(this.animal.getReservedBy());
    }

    @Test
    void testReservation(){
        assertNull(this.animal.getReservedBy());
        assertTrue(this.animal.reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        assertEquals("John Doe", this.animal.getReservedBy().getName());
        assertFalse(this.animal.reserve("Jane Doe"));
    }

    //commit2
}