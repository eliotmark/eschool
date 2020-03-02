public class Student extends Person{

    int grade;
    int sectionCount = 0;
    Section[] sections = new Section[10];

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        String student = this.name + " is in " + this.grade + "th grade and is enrolled in the following sections: " + getStudentsSectionsString();
        return student;
    }

    public String getStudentsSectionsString() {
        String listOfStudentsSections = "";
        for(int i=0; i<sectionCount; i++) {
            listOfStudentsSections += sections[i].getName() + ", ";
        }
        return listOfStudentsSections;
    }
}