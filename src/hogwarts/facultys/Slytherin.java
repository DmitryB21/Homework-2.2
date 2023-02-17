package hogwarts.facultys;

import hogwarts.Hogwarts;

import java.util.Objects;

public class Slytherin extends Hogwarts {

    private int cunningLevel;
    private int determinationLevel;
    private int ambitionLevel;
    private int resourcefulnessLevel;
    private int lustForPowerLevel;

    public Slytherin(String fio, int magicLevel, int rangeToTransgress, int cunningLevel, int determinationLevel,
                     int ambitionLevel, int resourcefulnessLevel, int lustForPowerLevel) {
        super(fio, magicLevel, rangeToTransgress);
        this.cunningLevel = cunningLevel;
        this.determinationLevel = determinationLevel;
        this.ambitionLevel = ambitionLevel;
        this.resourcefulnessLevel = resourcefulnessLevel;
        this.lustForPowerLevel = lustForPowerLevel;
    }

    public int getCunningLevel() {
        return cunningLevel;
    }

    public void setCunningLevel(int cunningLevel) {
        this.cunningLevel = cunningLevel;
    }

    public int getDeterminationLevel() {
        return determinationLevel;
    }

    public void setDeterminationLevel(int determinationLevel) {
        this.determinationLevel = determinationLevel;
    }

    public int getAmbitionLevel() {
        return ambitionLevel;
    }

    public void setAmbitionLevel(int ambitionLevel) {
        this.ambitionLevel = ambitionLevel;
    }

    public int getResourcefulnessLevel() {
        return resourcefulnessLevel;
    }

    public void setResourcefulnessLevel(int resourcefulnessLevel) {
        this.resourcefulnessLevel = resourcefulnessLevel;
    }

    public int getLustForPowerLevel() {
        return lustForPowerLevel;
    }

    public void setLustForPowerLevel(int lustForPowerLevel) {
        this.lustForPowerLevel = lustForPowerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunningLevel == slytherin.cunningLevel && determinationLevel == slytherin.determinationLevel && ambitionLevel == slytherin.ambitionLevel && resourcefulnessLevel == slytherin.resourcefulnessLevel && lustForPowerLevel == slytherin.lustForPowerLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunningLevel, determinationLevel, ambitionLevel, resourcefulnessLevel, lustForPowerLevel);
    }
}
