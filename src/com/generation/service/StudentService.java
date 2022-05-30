package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        //TODO
        this.students.put(student.getId(), student);
    }

    public Student findStudent( String studentId )
    {
        //TODO
        if (this.students.containsKey(studentId)) {
            return this.students.get(studentId);
        }
        return null;
    }

    public boolean showSummary()
    {
        //TODO
        if (this.students.isEmpty()) return false;

        for (Student student: this.students.values()) {
            System.out.println(student);
            if (student.getId().isEmpty()) {
                System.out.println("You have no enrolled courses");
                continue;
            }

            for (Course course: student.getEnrolledCourses()) {
                System.out.println(course);
            }
        }
        return true;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        if (!this.students.containsKey(studentId)) {
            System.out.println("Sorry, please key in a valid studentId and try again");
        }
        this.students.get(studentId).enrollToCourse(course);

    }

    public void updateGrades(Student student, String courseCode, double grade) {
         student.findCourseById(courseCode).setGrade(grade);

    }


}
