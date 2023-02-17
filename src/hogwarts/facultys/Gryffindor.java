package hogwarts.facultys;

import hogwarts.Hogwarts;

import java.util.Objects;

public class Gryffindor extends Hogwarts {

    private int nobilityLevel;
    private int honorLevel;
    private int braveryLevel;

    public Gryffindor(String fio, int magicLevel, int rangeToTransgress, int nobilityLevel, int honorLevel, int braveryLevel) {
        super(fio, magicLevel, rangeToTransgress);
        this.nobilityLevel = nobilityLevel;
        this.honorLevel = honorLevel;
        this.braveryLevel = braveryLevel;
    }

    public int getNobilityLevel() {
        return nobilityLevel;
    }

    public void setNobilityLevel(int nobilityLevel) {
        this.nobilityLevel = nobilityLevel;
    }

    public int getHonorLevel() {
        return honorLevel;
    }

    public void setHonorLevel(int honorLevel) {
        this.honorLevel = honorLevel;
    }

    public int getBraveryLevel() {
        return braveryLevel;
    }

    public void setBraveryLevel(int braveryLevel) {
        this.braveryLevel = braveryLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobilityLevel == that.nobilityLevel && honorLevel == that.honorLevel && braveryLevel == that.braveryLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobilityLevel, honorLevel, braveryLevel);
    }
}
