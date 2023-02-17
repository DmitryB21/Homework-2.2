package hogwarts;

import hogwarts.facultys.Gryffindor;
import hogwarts.facultys.Hufflepuff;
import hogwarts.facultys.Ravenclaw;
import hogwarts.facultys.Slytherin;

import java.util.Objects;

public class Hogwarts {
   private String fio;
    private int magicLevel;
    private int rangeToTransgress;



    public Hogwarts(String fio, int magicLevel, int rangeToTransgress) {
        this.fio = fio;
        this.magicLevel = magicLevel;
        this.rangeToTransgress = rangeToTransgress;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(int magicLevel) {
        this.magicLevel = magicLevel;
    }

    public int getRangeToTransgress() {
        return rangeToTransgress;
    }

    public void setRangeToTransgress(int rangeToTransgress) {
        this.rangeToTransgress = rangeToTransgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magicLevel == hogwarts.magicLevel && rangeToTransgress == hogwarts.rangeToTransgress && Objects.equals(fio, hogwarts.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, magicLevel, rangeToTransgress);
    }


}
