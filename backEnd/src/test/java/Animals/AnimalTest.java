package Animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void setUp() {
        this.animal = new Dog("Ugly Duckling", Gender.Male);
    }

    @Test
    void TestConstructor() {
        assertEquals("Ugly Duckling", this.animal.getName());
        assertEquals(Gender.Male, this.animal.getGender());
        assertNull(this.animal.getReservedBy());
    }

    @Test
    void TestReservation(){
        assertNull(this.animal.getReservedBy());
        assertTrue(this.animal.reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        assertEquals("John Doe", this.animal.getReservedBy().getName());
        assertFalse(this.animal.reserve("Jane Doe"));
    }

    @Test
    void TestToString(){
        this.animal.reserve("John Doe");
        assertEquals("Ugly Duckling, Male, reserved by John Doe", this.animal.toString());
    }

    @Test
    void TestGetAnimal(){
        Animal returnAnimal = Animal.getAnimal();
        assertEquals("Ugly Duckling", returnAnimal.getName());
    }

    //commit2
}