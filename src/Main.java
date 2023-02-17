import hogwarts.*;
import hogwarts.facultys.Gryffindor;
import hogwarts.facultys.Hufflepuff;
import hogwarts.facultys.Ravenclaw;
import hogwarts.facultys.Slytherin;

public class Main {
    public static void main(String[] args) {

        Hogwarts student1 = new Gryffindor("Гарри Поттер", 6, 60, 8, 8, 8);
        Hogwarts student2 = new Gryffindor("Гермиона Грейнджер", 7, 80, 8, 8, 8);
        Hogwarts student3 = new Gryffindor("Рон Уизли", 4, 40, 8, 8, 8);

        Hogwarts student4 = new Hufflepuff("Захария Смит", 5, 50, 8, 8, 8);
        Hogwarts student5 = new Hufflepuff("Седрик Диггори", 6, 80, 9, 9, 9);
        Hogwarts student6 = new Hufflepuff("Джастин Финч-Флетчли", 5, 50, 7, 7, 7);

        Hogwarts student7 = new Ravenclaw("Чжоу Чанг", 5, 60, 7, 7, 7, 8);
        Hogwarts student8 = new Ravenclaw("Падма Патил", 4, 40, 6, 6, 6, 6);
        Hogwarts student9 = new Ravenclaw("Маркус Белби", 4, 40, 6, 6, 6, 6);


        Hogwarts student10 = new Slytherin("Драко Малфой", 5, 50, 6, 6, 6, 6, 8);
        Hogwarts student11= new Slytherin("Грэхэм Монтегю", 4, 50, 6, 6, 6, 6, 7);
        Hogwarts student12= new Slytherin("Грегори Гойл", 4, 50, 5, 5, 5, 6, 7);

        HogwartsService hogwartsService = new HogwartsService();

        //вывести всю инвормацию о любом студенте
        System.out.println("Студенты Хогвартса");
        hogwartsService.printStudent(student1);
        hogwartsService.printStudent(student5);
        hogwartsService.printStudent(student7);
        hogwartsService.printStudent(student10);
        System.out.println();
        // сравнение любых студентов по уровню магии и трансгрессированию
        hogwartsService.compareAllStudents(student1, student10);
        hogwartsService.compareAllStudents(student3, student12);
        System.out.println();
        //сравнение учеников внутри своих факультетов
        hogwartsService.compareGryffindorStudents(student1, student2);
        hogwartsService.compareHufflepuffStudents(student4, student6);
        hogwartsService.compareRavenclawStudents(student9, student8);
        hogwartsService.compareSlytherinStudents(student10, student11);




    }


}