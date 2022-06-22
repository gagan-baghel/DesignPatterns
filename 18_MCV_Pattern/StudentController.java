/**
 * Created by Vedant Chimote #CS19B44 on 20-04-2022
 */


//Controller
public class StudentController
{
    private Student model;

    private StudentView view;

    public StudentController(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name)
    {
        model.setName(name);
    }

    public String getStudentName()
    {
        return model.getName();
    }

    public void setStudentRollNo(int rollno)
    {
        Student.RollNo.roll=rollno;
    }

    public Student.RollNo getRollNo()
    {
        return model.getRollNo();
    }


    //responsible to print the data from the model to the view
    //business logic
    public void updateView()
    {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
