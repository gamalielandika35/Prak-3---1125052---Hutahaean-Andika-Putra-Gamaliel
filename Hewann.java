

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Movable {
    String move();
}

interface Feedable {
    void eat();
}

abstract class Animal {

    private String name;
    private int age;
    private String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public abstract String getjenishewan();
    public abstract String printSound();

    public void printData() {
        System.out.println("Nama : " + name
                + "\nUmur : " + age + " tahun"
                + "\nMakanan : " + food);
    }
}

abstract class LandAnimal extends Animal implements Movable, Feedable {

    private int numberOfLegs;

    public LandAnimal(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Jumlah Kaki : " + numberOfLegs);
        System.out.println(move());
        eat();
    }
}

abstract class SeaAnimal extends Animal implements Movable, Feedable {

    private double depth;

    public SeaAnimal(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Kedalaman : " + depth + " meter");
        System.out.println(move());
        eat();
    }
}

abstract class AirAnimal extends Animal implements Movable, Feedable {

    private double wingSpan;

    public AirAnimal(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Bentang Sayap : " + wingSpan + " meter");
        System.out.println(move());
        eat();
    }
}

class Anjing extends LandAnimal {

    public Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Guk Guk";
    }

    @Override 
    public String getjenishewan(){
        return "Anjing";
    }

    @Override
    public String move() {
        return "Anjing berlari.";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Kucing extends LandAnimal {

    public Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow Meow";
    }

    @Override 
    public String getjenishewan(){
        return "Kucing";
    }

    @Override
    public String move() {
        return "Kucing berjalan dengan lembut.";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Tikus extends LandAnimal {

    public Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Cit Cit";
    }

    @Override
    public String move() {
        return "Tikus berlari dengan cepat.";
    }

    @Override 
    public String getjenishewan(){
        return "Tikus";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Ikan extends SeaAnimal {

    public Ikan(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Blub Blub";
    }

    @Override
    public String move() {
        return "Ikan berenang dengan cepat.";
    }

    @Override 
    public String getjenishewan(){
        return "Ikan";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Hiu extends SeaAnimal {

    public Hiu(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Splash / Silent Predator";
    }

    @Override
    public String move() {
        return "Hiu berenang di laut dalam.";
    }

    @Override 
    public String getjenishewan(){
        return "Hiu";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Paus extends SeaAnimal {

    public Paus(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Echolocation Click / Whistle";
    }

    @Override
    public String move() {
        return "Paus menyelam dengan anggun.";
    }

    @Override 
    public String getjenishewan(){
        return "Paus";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Burung extends AirAnimal {

    public Burung(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Cuit Cuit";
    }

    @Override
    public String move() {
        return "Burung terbang di udara.";
    }

    @Override
    public String getjenishewan() {
        return "Burung";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Elang extends AirAnimal {

    public Elang(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kreeee / Screech";
    }

    @Override
    public String move() {
        return "Elang terbang tinggi di langit.";
    }

    @Override
    public String getjenishewan() {
        return "Elang";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

class Bebek extends AirAnimal {

    public Bebek(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kwek Kwek";
    }

    @Override
    public String move() {
        return "Bebek terbang dan berenang.";
    }

    @Override
    public String getjenishewan() {
        return "Bebek";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " sedang makan " + getFood() + ".");
    }
}

public class Hewann {

    public static void main(String[] args) {

        ArrayList<Animal> listofhewan = new ArrayList<>();

        listofhewan.add(new Anjing("Doggy", 3, "Daging / Tulang", 4));
        listofhewan.add(new Kucing("Milo", 2, "Ikan", 4));
        listofhewan.add(new Tikus("Jerry", 1, "Keju", 4));

        listofhewan.add(new Ikan("Nemo", 1, "Plankton", 15));
        listofhewan.add(new Hiu("Megalo", 10, "Daging", 500));
        listofhewan.add(new Paus("Bluey", 20, "Krill", 1000));

        listofhewan.add(new Burung("Pipit", 1, "Biji-bijian", 0.2));
        listofhewan.add(new Elang("Garuda", 5, "Daging", 2.1));
        listofhewan.add(new Bebek("Donald", 2, "Dedak", 0.8));
        System.out.println();

        for (Animal h : listofhewan) {

            System.out.println("Jenis Hewan : " + h.getjenishewan());
            h.printData();
            h.printSound();
            h.getFood();
            System.out.println("");
        }

        Collections.sort(listofhewan, new Comparator<Animal>() {

            @Override
            public int compare(Animal h1, Animal h2) {
                return h1.getName()
                        .compareToIgnoreCase(h2.getName());
            }
        });

        System.out.println();

        int no = 1;

        for (Animal h : listofhewan) {

            System.out.println(
                    no + ". "
                    + h.getName()
                    + " (" + h.getjenishewan()
                    + ", " + h.getAge() + " tahun)"
            );

            no++;
        }

        Collections.sort(listofhewan, new Comparator<Animal>() {

            @Override
            public int compare(Animal h1, Animal h2) {
                return Integer.compare(
                        h1.getAge(),
                        h2.getAge()
                );
            }
        });

        System.out.println();

        no = 1;

        for (Animal h : listofhewan) {

            System.out.println(
                    no + ". "
                    + h.getName()
                    + " - "
                    + h.getAge()
                    + " tahun"
            );

            no++;
        }
    }
}