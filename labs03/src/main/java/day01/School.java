package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(152);
        students.addHeight(165);
        students.addHeight(170);
        students.addHeight(168);
        students.addHeight(175);

        students.isHeightsIncreasing();

        System.out.println(students.isHeightsIncreasing());
    }
}