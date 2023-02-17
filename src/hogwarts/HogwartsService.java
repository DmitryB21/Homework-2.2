package hogwarts;

import hogwarts.facultys.Gryffindor;
import hogwarts.facultys.Hufflepuff;
import hogwarts.facultys.Ravenclaw;
import hogwarts.facultys.Slytherin;

public class HogwartsService {

    public void printStudent(Hogwarts student) {
        if (student.getClass() == Gryffindor.class) {
            System.out.printf("Имя ученика -  %s, уровени магии - %d, дальность трансгрессии - %d, " +
                            " благородство - %d, честь - %d, храбрость - %d%n", student.getFio(), student.getMagicLevel(), student.getRangeToTransgress(),
                    ((Gryffindor) student).getNobilityLevel(), ((Gryffindor) student).getHonorLevel(), ((Gryffindor) student).getBraveryLevel());
        }
        if (student.getClass() == Hufflepuff.class) {
            System.out.printf("Имя ученика -  %s, уровени магии - %d, дальность трансгрессии - %d, " +
                            " трудолюбие - %d, верность - %d, честность - %d%n", student.getFio(), student.getMagicLevel(), student.getRangeToTransgress(),
                    ((Hufflepuff) student).getIndustriousnessLevel(), ((Hufflepuff) student).getLoyaltyLevel(), ((Hufflepuff) student).getHonestyLevel());
        }
        if (student.getClass() == Ravenclaw.class) {
            System.out.printf("Имя ученика -  %s, уровени магии - %d, дальность трансгрессии - %d, " +
                            " ум - %d, мудрость - %d, остроумие - %d, творчество - %d%n", student.getFio(), student.getMagicLevel(), student.getRangeToTransgress(),
                    ((Ravenclaw) student).getMindLevel(), ((Ravenclaw) student).getWisdomLevel(), ((Ravenclaw) student).getWitLevel(), ((Ravenclaw) student).getCreationLevel());
        }
        if (student.getClass() == Slytherin.class) {
            System.out.printf("Имя ученика -  %s, уровени магии - %d, дальность трансгрессии - %d, " +
                            " хитрость - %d, решительность - %d, амбициозность - %d, находчивость  - %d, жажда власти - %d%n", student.getFio(), student.getMagicLevel(), student.getRangeToTransgress(),
                    ((Slytherin) student).getCunningLevel(), ((Slytherin) student).getDeterminationLevel(), ((Slytherin) student).getAmbitionLevel(), ((Slytherin) student).getResourcefulnessLevel(), ((Slytherin) student).getLustForPowerLevel());
        }
    }

    public void compareAllStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicLevel() > student2.getMagicLevel()) {
            System.out.println(student1.getFio() + " обладает большей мощностью магии чем " + student2.getFio());
        } else if(student1.getMagicLevel() < student2.getMagicLevel()){
            System.out.println(student2.getFio() + " обладает большей мощностью магии чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " равен по мощности магии с " + student1.getFio());
        }
        if (student1.getRangeToTransgress() > student2.getRangeToTransgress()) {
            System.out.println(student1.getFio() + " может дальше трансгрессировать чем " + student2.getFio());
        } else if(student1.getMagicLevel() < student2.getMagicLevel()){
            System.out.println(student2.getFio() + " может дальше трансгрессировать чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " имеет одинаковую дальность трансгрессии с " + student1.getFio());
        }
    }

    public void compareGryffindorStudents(Hogwarts student1, Hogwarts student2) {
        if(student1.getClass() != Gryffindor.class || student2.getClass() != Gryffindor.class) {
            System.out.println("Ошибка: можно сравнить только студентов факультета Гриффиндор");
            return;
        }
        int student1Result = ((Gryffindor) student1).getNobilityLevel() + ((Gryffindor) student1).getHonorLevel() + ((Gryffindor) student1).getBraveryLevel();
        int student2Result = ((Gryffindor) student2).getNobilityLevel() + ((Gryffindor) student2).getHonorLevel() + ((Gryffindor) student2).getBraveryLevel();
        if (student1Result > student2Result) {
            System.out.println(student1.getFio() + " круче чем " + student2.getFio());
        } else if((student1Result < student2Result)){
            System.out.println(student2.getFio() + " круче чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " такой же крутой/ая как " + student1.getFio());
        }

    }

    public void compareHufflepuffStudents(Hogwarts student1, Hogwarts student2) {
        if(student1.getClass() != Hufflepuff.class || student2.getClass() != Hufflepuff.class) {
            System.out.println("Ошибка: можно сравнить только студентов факультета Пуффендуй");
            return;
        }
        int student1Result = ((Hufflepuff) student1).getIndustriousnessLevel() + ((Hufflepuff) student1).getLoyaltyLevel() + ((Hufflepuff) student1).getHonestyLevel();
        int student2Result = ((Hufflepuff) student2).getIndustriousnessLevel() + ((Hufflepuff) student2).getLoyaltyLevel() + ((Hufflepuff) student2).getHonestyLevel();
        if (student1Result > student2Result) {
            System.out.println(student1.getFio() + " круче чем " + student2.getFio());
        } else if((student1Result < student2Result)){
            System.out.println(student2.getFio() + " круче чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " такой же крутой/ая как " + student1.getFio());
        }

    }

    public void compareRavenclawStudents(Hogwarts student1, Hogwarts student2) {
        if(student1.getClass() != Ravenclaw.class || student2.getClass() != Ravenclaw.class) {
            System.out.println("Ошибка: можно сравнить только студентов факультета Когтевран");
            return;
        }
        int student1Result = ((Ravenclaw) student1).getMindLevel() + ((Ravenclaw) student1).getWisdomLevel() + ((Ravenclaw) student1).getWitLevel() + ((Ravenclaw) student1).getCreationLevel();
        int student2Result = ((Ravenclaw) student2).getMindLevel() + ((Ravenclaw) student2).getWisdomLevel() + ((Ravenclaw) student2).getWitLevel() + ((Ravenclaw) student2).getCreationLevel();
        if (student1Result > student2Result) {
            System.out.println(student1.getFio() + " круче чем " + student2.getFio());
        } else if((student1Result < student2Result)){
            System.out.println(student2.getFio() + " круче чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " такой же крутой/ая как " + student1.getFio());
        }
    }

    public void compareSlytherinStudents(Hogwarts student1, Hogwarts student2) {
        if(student1.getClass() != Slytherin.class || student2.getClass() != Slytherin.class) {
            System.out.println("Ошибка: можно сравнить только студентов факультета Слизерин");
            return;
        }
        int student1Result = ((Slytherin) student1).getCunningLevel() + ((Slytherin) student1).getDeterminationLevel() + ((Slytherin) student1).getAmbitionLevel() + ((Slytherin) student1).getResourcefulnessLevel() + ((Slytherin) student1).getLustForPowerLevel();
        int student2Result = ((Slytherin) student2).getCunningLevel() + ((Slytherin) student2).getDeterminationLevel() + ((Slytherin) student2).getAmbitionLevel() + ((Slytherin) student2).getResourcefulnessLevel() + ((Slytherin) student2).getLustForPowerLevel();
        if (student1Result > student2Result) {
            System.out.println(student1.getFio() + " круче чем " + student2.getFio());
        } else if((student1Result < student2Result)){
            System.out.println(student2.getFio() + " круче чем " + student1.getFio());
        } else {
            System.out.println(student2.getFio() + " такой же крутой/ая как " + student1.getFio());
        }
    }
}
