public class Teacher extends Person{

    String subject;
    int sectionCount = 0;
    Section[] sections = new Section[10];

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString() {
        String teacher = this.name + " teaches the following sections: " + getSectionsString();
        return teacher;
    }

    public String getSectionsString() {
        String listOfSections = "";
        for(int i=0; i<sectionCount; i++) {
            listOfSections += sections[i].getName() + ", ";
        }
        return listOfSections;
    }
}