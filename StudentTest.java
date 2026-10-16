public class StudentTest {

    public static void main(String[] args) {

        // PART 1: Mutable Student
        // TODO: Create a MutableStudent object.
        MutableStudent mstu = new MutableStudent("Charles", 17);


        // TODO: Display the student's original information.
        mstu.displayInfo();


        // TODO: Use the setter methods to change the student's data.
        mstu.setName("Carson");


        // TODO: Display the student again.
        // Question: Did the SAME object change? Yes
        mstu.displayInfo();


        System.out.println();

        // PART 2: Immutable Student
        // TODO: Create an ImmutableStudent object.
        ImmutableStudent istu = new ImmutableStudent("Charles", 17);


        // TODO: Display the student's information.
        istu.displayInfo();


        // Try to answer this in a comment:
        // Why can you not change the ImmutableStudent object
        // using setter methods? Because there are none


        // PART 3: Compare
        // Add comments that answer:
        // 1. Which class is mutable? MutableStudent
        // 2. Which class is immutable? ImutableStudent
        // 3. What is the biggest difference you noticed? Mutable is more versitile
    }
}
