public class Section {

    String name;
    Teacher teacher;
    int studentCount = 0;
    Student[] students = new Student[50];
    int currentSize;

    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s) {
        students[studentCount] = s;
        studentCount++;
    }

    public String toString() {
        String section = this.name + " is taught by " + teacher.name + " and has " + studentCount + " students: " + getStudentString();
        return section;
    }

    public String getStudentString() {
        String listOfStudents = "";
        for(int i=0; i<studentCount; i++) {
            listOfStudents += students[i].getName() + ", ";
        }
        return listOfStudents;
    }
}