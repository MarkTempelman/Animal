package Animals;

public class Cat extends Animal{
    private String _badHabits;
    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        _badHabits = badHabits;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", bad habits: %h", _badHabits.toLowerCase());
    }
}
