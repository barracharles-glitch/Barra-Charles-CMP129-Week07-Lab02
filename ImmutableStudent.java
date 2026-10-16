public final class ImmutableStudent {

    // TODO: Create two private final fields:
    // 1. name (String)
    // 2. age (int)
    final String name;
    final int age;


    // TODO: Create a constructor that receives name and age.
    // The constructor should initialize both fields.
    ImmutableStudent(String n, int a){
        name = n;
        age = a;
    }


    // TODO: Create a getter for name.
    public String getName(String n){
        return name;
    }


    // TODO: Create a getter for age.
    public int getAge(String i){
        return age;
    }


    // IMPORTANT:
    // Do NOT create setter methods in this class.
    // The object's data should not change after it is created.


    // TODO: Create a displayInfo() method.
    // Display the student's name and age.
    public void displayInfo(){
        System.out.println(age + " " + name);
    }
}
