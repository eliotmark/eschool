public class Runner {

    public static void main(String[] args) {
        School BHS = new School("Berkeley High");
        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section compsci = new Section("Computer Science");
        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher albrecht = new Teacher("Albrecht", "Math");
        Teacher mueller = new Teacher("Mueller", "Biology");
        Student me = new Student("Eliot", 11);
        Student lily = new Student("Lily", 11);
        Student safiya = new Student("Safiya", 11);
        Student matthew = new Student("Matthew", 11);
        Student emi = new Student("Emi", 11);
        Student lottie = new Student("Lottie", 10);

        BHS.addSection(math);
        BHS.addSection(bio);
        BHS.addSection(compsci);

        compsci.setTeacher(albinson);
        math.setTeacher(albrecht);
        bio.setTeacher(mueller);

        albinson.addSection(compsci);
        albrecht.addSection(math);
        mueller.addSection(bio);

        compsci.addStudent(me);
        compsci.addStudent(lily);
        compsci.addStudent(safiya);
        compsci.addStudent(matthew);
        compsci.addStudent(emi);
        compsci.addStudent(lottie);

        bio.addStudent(me);
        bio.addStudent(lily);
        bio.addStudent(safiya);
        bio.addStudent(matthew);
        bio.addStudent(emi);
        bio.addStudent(lottie);

        math.addStudent(me);
        math.addStudent(lily);
        math.addStudent(safiya);
        math.addStudent(matthew);
        math.addStudent(emi);
        math.addStudent(lottie);

        me.addSection(compsci);
        lily.addSection(compsci);
        safiya.addSection(compsci);
        matthew.addSection(compsci);
        emi.addSection(compsci);
        lottie.addSection(compsci);

        me.addSection(bio);
        lily.addSection(bio);
        safiya.addSection(bio);
        matthew.addSection(bio);
        emi.addSection(bio);
        lottie.addSection(bio);

        me.addSection(math);
        lily.addSection(math);
        safiya.addSection(math);
        matthew.addSection(math);
        emi.addSection(math);
        lottie.addSection(math);

        System.out.println(BHS.toString());
        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(compsci.toString());
        System.out.println(albinson.toString());
        System.out.println(albrecht.toString());
        System.out.println(mueller.toString());
        System.out.println(me.toString());
        System.out.println(lily.toString());
        System.out.println(safiya.toString());
        System.out.println(matthew.toString());
        System.out.println(emi.toString());
        System.out.println(lottie.toString());
    }
}