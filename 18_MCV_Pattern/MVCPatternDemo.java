public class MVCPatternDemo
{
    public static void main(String[] args)
    {
        System.out.println("\n/---------------Loaded from Database---------------/\n");
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println("\n/-------------------Let's make some chnages to the Model----------------------/\n");
        System.out.println("Setting the Name as Gagan and Roll no as 33");

        controller.setStudentName("Gagan");
        controller.setStudentRollNo(33);

        System.out.println("\n/-------------------Let's display the updated data----------------------/\n");
        controller.updateView();
    }
    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("gag");
        student.setRollno("CS",19,"B",30);
        return student;
    }
}
