package Assignment_9;

public class Student {

    private int rollno;
    private String name;
    private int age ;
    private String course;

    public Student (int rollno, String name, int age, String course) throws AgeNotWithinRangeException,NameInvalidException  {
        super();
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getAge() {

        if (this.age < 15 && this.age > 21) {
            try {
                throw new AgeNotWithinRangeException("Age should be between 15 and 21");
            } catch (AgeNotWithinRangeException e) {
                e.printStackTrace();
            }
        } else {
            return age;
        }
        return age; }

    public String getName()  {
        int f=0;
        for(int i=0;i<name.length();i++)
        {
            char c =name.charAt(i);
            if((c<'A' || c>'Z') && (c<'a' || c>'z'))
            {
                f=1;
                break;
            }
        }
        if(f==1) {
            try {
                throw new NameInvalidException("Name should contain alphabets only");
            } catch (NameInvalidException e) {
                e.printStackTrace();
            }
        }
        else {
return  name;

        }
        return  name;
    }


    public static void main(String args[]) {
        Student s = null;
        try {
            s = new Student(1, "ABC", 23, "Science");
        } catch (AgeNotWithinRangeException e) {
            e.printStackTrace();
        } catch (NameInvalidException e) {
            e.printStackTrace();
        }

            int ans = s.getAge();
            String ans2 = s.getName();
            System.out.println(ans);
            System.out.println(ans2);

    }
}