public class Main {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 70, 73, 68, 56, 89);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 89, 67, 68, 76, 70);
        Gryffindor ron = new Gryffindor("Рон Уизли",58,67,83,24,45);
        Slytherin draco = new Slytherin("Драко Малфой",65,78,53,56,34,67,78);
        Slytherin graham = new Slytherin("Грэхэм Монтегю",35,67,34,74,87,45,34);
        Slytherin gregory = new Slytherin("Грегори Гойл",56,34,76,32,76,38,56);
        Hufflepuff smith = new Hufflepuff("Захария Смит",56,23,76,88,44);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори",67,34,23,76,45);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли",56,34,75,87,23);
        Ravenclaw zhou= new Ravenclaw("Чжоу Чанг",67,23,86,34,76,43);
        Ravenclaw padma= new Ravenclaw("Падма Патил",57,34,75,87,34,76);
        Ravenclaw marcus= new Ravenclaw("Маркус Белби",56,34,87,45,76,98);

        padma.printStudent();
        hermione.compareGryffindor(ron);
        draco.compareSlytherin(graham);
        harry.compareStudent(zhou);
    }
}