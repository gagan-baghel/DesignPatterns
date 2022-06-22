public class Student
{

    private String name;
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Setting roll no

    private RollNo rollNo;

    public RollNo getRollNo() {
        return rollNo;
    }

    public void setRollno(String department,int year,String section,int roll) {

        this.rollNo = new Student.RollNo(department,year,section,roll);
    }

    //Static inner RollNo class in Student as Student has rollno

    public static class RollNo
    {
        String department;
        int year;
        String section;
        static int roll;

        public RollNo(String department, int year, String section, int roll) {
            this.department = department;
            this.year = year;
            this.section = section;
            this.roll = roll;
        }

        @Override
        public String toString() {
            return department+year+section+roll;
        }
    }
}
