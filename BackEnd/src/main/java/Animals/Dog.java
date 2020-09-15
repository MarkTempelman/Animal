package Animals;

import java.time.LocalDateTime;

public class Dog extends Animal{
    private LocalDateTime _lastWalk;

    public Dog(String name, Gender gender) {
        super(name, gender);
        _lastWalk = LocalDateTime.now();
    }

    public LocalDateTime getLastWalk(){
        return _lastWalk;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", last walk: %w", _lastWalk.toString());
    }
}
