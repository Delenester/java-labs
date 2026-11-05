package org.example;

class University {
    private String name;
    private int studentsCount;
    private int faculties;

    private static int totalUniversities = 0;
    private static int totalStudents = 0;

    public static void printStatic(){
        System.out.println(totalUniversities);
        System.out.println(totalStudents);
    }
    public void printIsn(){
        System.out.println(name);
        System.out.println(studentsCount);
        System.out.println(faculties);
    }
    /*
   University.printStatic();
   University myUniversity = new University("БГУ", 20000, 15);
   myUniversity.printIsn();
     */
    static {
        System.out.println("Статический инициализатор University");
    }

    public University(String name, int studentsCount, int faculties) {
        this.name = name;
        this.studentsCount = studentsCount;
        this.faculties = faculties;
        totalUniversities++;
        totalStudents += studentsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public int getFaculties() {
        return faculties;
    }

    public void setFaculties(int faculties) {
        this.faculties = faculties;
    }

    public static int getTotalUniversities() {
        return totalUniversities;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static double getAverageStudents() {
        if (totalUniversities == 0) {
            return 0;
        }
        return (double) totalStudents / totalUniversities;
    }
}
