public class array1 {

    public static void main(String[] args) {
        String[] students = getStudents();
        loop(students);
    }

    public static String[] getStudents() {
        String[] studentArray = {"Vivek", "Sun", "Moon", "River"};
        return studentArray;
    }

    public static void loop(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i]);
        }
    }

    public static String NAME(){
        
        String X=name;
        return X;
    }
    public void show(){
        NAME();

        System.out.println("Student Name:"+name);
        System.out.println("Student marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println(sub[i]);
        }
        System.out.println("Student total marks:"+total);
        System.out.println("Student percentage:"+percent);
        if(percent>90)
         System.out.println("Grade: A");
        else if(percent>80)
        System.out.println("Grade : B");
        else if(percent>70)
        System.out.println("grade :c");
        else if(percent>60)
        System.out.println("grade :D");
        else if(percent>50)
        System.out.println("Grade E");
        else{
            System.out.println("F");
        }
    }
    






}






