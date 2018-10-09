package ru.job.professions;

public class Teacher extends Profession {
    private Grade grade;

    public void teach(Student student) {
        student.setGrade(grade);
    }
}
