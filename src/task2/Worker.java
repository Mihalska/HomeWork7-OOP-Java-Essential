package task2;

public   class Worker implements Comparable <Worker> {
    String surname;
    String position;
    public int age;

    public Worker(String surname, String position, int age) {
        this.surname = surname;
        this.position = position;
        this.age = age;
    }

    @Override
    public String toString() {
    return String.format ("Прізвище та ініціали: %s, посада: %s, рік:%4d", surname, position,age);

    }
    @Override
    public int  compareTo(Worker o) {
        if (this.age > o.age) {
            System.out.println( this.surname);
        }
        return this.surname.compareTo(o.surname);
    }
}