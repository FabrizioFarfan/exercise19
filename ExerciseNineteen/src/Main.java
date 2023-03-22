public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student("Mike", 22, "Smith", "5C", "Art");
        student.setName("Rick");
        student.setLastName("Sanchez");
        student.setSection("5D");
        student.setFavouriteCourse("Maths");
        student.setAge(13);
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        System.out.println(student.getSection());
        System.out.println(student.getFavouriteCourse());
        System.out.println(student.getAge());

    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student student = new Student("Rick", 22, "Sanchez", "5C", "Art");
        student.setName("RICK");
        student.setLastName("sanchez");
        student.setAge(13);
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        System.out.println(student.getAge());
        System.out.println(student.getAge());
        System.out.println(student.getNumberOfTimeWeHaveGotTheAge());


    }

}