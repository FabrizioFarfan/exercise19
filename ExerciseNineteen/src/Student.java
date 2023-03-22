public class Student {
    private String name;
    private String lastName;
    private String section;
    private String favouriteCourse;
    private int age;
    private int numberOfTimeWeHaveGotTheAge;

    Student(String name, int age, String lastName, String section, String favouriteCourse){
        this.name = name;
        this.age = age;
        this.section = section;
        this.favouriteCourse = favouriteCourse;
        this.lastName = lastName;
    }
    public String getName(){
     return name;
    }
    public String getLastName(){
     return lastName;
    }
    public String getSection(){
     return section;
    }
    public String getFavouriteCourse(){
     return favouriteCourse;
    }
    public int getAge(){
        numberOfTimeWeHaveGotTheAge++;
     return age;
    }

    public int getNumberOfTimeWeHaveGotTheAge() {
        return numberOfTimeWeHaveGotTheAge;
    }

    public void setName(String name) {
        if (name.equals(name.toLowerCase()) || name.equals(name.toUpperCase())){
            System.out.println("The name isn't write on the correct way");
        } else {
        this.name = name;
        }
    }

    public void setFavouriteCourse(String favouriteCourse) {
        this.favouriteCourse = favouriteCourse;
    }

    public void setLastName(String lastName) {
        if (lastName.equals(lastName.toLowerCase()) || lastName.equals(lastName.toUpperCase())){
            System.out.println("The last name isn't write on the correct way");
        } else {
            this.lastName = lastName;
        }
    }

    public void setSection(String section) {
        this.section = section;
    }
    public void setAge(int age) {
        if (age < 14) {
            System.out.println("The student hasn't the enough age to take part of the class");
        } else {
            this.age = age;
        }
    }
}