package hogwarts.facultys;

import hogwarts.Hogwarts;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {

    private int industriousnessLevel;
    private int loyaltyLevel;
    private int honestyLevel;

    public Hufflepuff(String fio, int magicLevel, int rangeToTransgress, int industriousnessLevel, int loyaltyLevel, int honestyLevel) {
        super(fio, magicLevel, rangeToTransgress);
        this.industriousnessLevel = industriousnessLevel;
        this.loyaltyLevel = loyaltyLevel;
        this.honestyLevel = honestyLevel;
    }

    public int getIndustriousnessLevel() {
        return industriousnessLevel;
    }

    public void setIndustriousnessLevel(int industriousnessLevel) {
        this.industriousnessLevel = industriousnessLevel;
    }

    public int getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public void setLoyaltyLevel(int loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }

    public void setHonestyLevel(int honestyLevel) {
        this.honestyLevel = honestyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousnessLevel == that.industriousnessLevel && loyaltyLevel == that.loyaltyLevel && honestyLevel == that.honestyLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), industriousnessLevel, loyaltyLevel, honestyLevel);
    }
}
