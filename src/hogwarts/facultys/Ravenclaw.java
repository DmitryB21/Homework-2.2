package hogwarts.facultys;

import hogwarts.Hogwarts;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {

    private int mindLevel;
    private int wisdomLevel;
    private int witLevel;
    private int creationLevel;

    public Ravenclaw(String fio, int magicLevel, int rangeToTransgress, int mindLevel, int wisdomLevel, int witLevel, int creationLevel) {
        super(fio, magicLevel, rangeToTransgress);
        this.mindLevel = mindLevel;
        this.wisdomLevel = wisdomLevel;
        this.witLevel = witLevel;
        this.creationLevel = creationLevel;
    }

    public int getMindLevel() {
        return mindLevel;
    }

    public void setMindLevel(int mindLevel) {
        this.mindLevel = mindLevel;
    }

    public int getWisdomLevel() {
        return wisdomLevel;
    }

    public void setWisdomLevel(int wisdomLevel) {
        this.wisdomLevel = wisdomLevel;
    }

    public int getWitLevel() {
        return witLevel;
    }

    public void setWitLevel(int witLevel) {
        this.witLevel = witLevel;
    }

    public int getCreationLevel() {
        return creationLevel;
    }

    public void setCreationLevel(int creationLevel) {
        this.creationLevel = creationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mindLevel == ravenclaw.mindLevel && wisdomLevel == ravenclaw.wisdomLevel && witLevel == ravenclaw.witLevel && creationLevel == ravenclaw.creationLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mindLevel, wisdomLevel, witLevel, creationLevel);
    }
}
