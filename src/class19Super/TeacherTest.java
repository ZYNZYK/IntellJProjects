package class19Super;

public class TeacherTest {

    public static void main(String[] args) {
        MathTeacher mathTeacher=
                new MathTeacher("Gulcan",18,5);
        mathTeacher.teach();
        PianoTeacher pt=new PianoTeacher(
                "James",
                25,
                6,"Grand"
        );
        pt.teach();
    }
}
