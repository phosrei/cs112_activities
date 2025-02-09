package studentmanagement;

public class Student {
    private String name;
    private String idNumber;
    private String course;
    private int yearLevel;
    private int numOfSubjects;
    private final String[] listOfSubjects = new String[10];

    public Student() {
        this.idNumber = "";
        this.name = "";
        this.yearLevel = 0;
        this.numOfSubjects = 0;
    }

    public Student(String idNumber, String name, int yearLevel, int numOfSubjects) {
        this.idNumber = idNumber;
        this.name = name;
        this.yearLevel = yearLevel;
        this.numOfSubjects = numOfSubjects;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public int getNumOfSubjects() {
        return numOfSubjects;
    }

    public void setNumOfSubjects(int numOfSubjects) {
        this.numOfSubjects = numOfSubjects;
    }

    public void changeCourse(String course) {
        this.course = course;
    }

    public void promoteYearLevel() {
        this.yearLevel++;
    }

    public void addSubject(String subject) {
        // if current array index is not null, add subject
        for (int i = 0; i < this.listOfSubjects.length; i++) {
            if (this.listOfSubjects[i] == null) {
                this.listOfSubjects[i] = subject;
                break;
            }
        }
    }

    public void removeSubject(String toRemove) {
        // if current array position is not null and found subject to remove, remove
        for (int i = 0; i < this.listOfSubjects.length; i++) {
            if (this.listOfSubjects[i] != null && this.listOfSubjects[i].equalsIgnoreCase(toRemove)) {
                this.listOfSubjects[i] = null;
                break;
            }
        }
    }

    public String toString() {
        StringBuilder subjects = new StringBuilder();
        for (String subject : this.listOfSubjects) {
            if (subject != null) {
                if (!subjects.isEmpty()) {
                    subjects.append(", ");
                }
                subjects.append(subject);
            }
        }

        return "\nID Number: " + this.idNumber +
                "\nName: " + this.name +
                "\nCourse: " + this.course +
                "\nYear: " + this.yearLevel +
                "\nNo. of Subjects: " + this.numOfSubjects +
                "\nSubjects: " + subjects;
    }
}
