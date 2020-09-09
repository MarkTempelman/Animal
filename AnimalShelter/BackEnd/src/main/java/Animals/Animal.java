package Animals;

import java.time.LocalDate;

public class Animal {
    private String _name;
    private Gender _gender;
    private Reservor _reservedBy;

    public Animal(String name, Gender gender){
        _name = name;
        _gender = gender;
    }

    public String getName(){
        return _name;
    }

    public Gender getGender(){
        return _gender;
    }

    public Reservor getReservedBy(){
        return _reservedBy;
    }

    public Boolean reserve(String reservedBy){
        if(_reservedBy == null){
            _reservedBy = new Reservor(reservedBy, java.time.LocalDateTime.now());
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String reserved = "not reserved";
        if(_reservedBy != null){
            reserved = String.format("reserved by %n", _reservedBy.getName());
        }
        return String.format("%n, %g, %r", _name, _gender, reserved);
    }
}
