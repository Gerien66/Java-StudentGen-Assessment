package com.generation.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private ArrayList<Course> enrolledCourses;
    private ArrayList<Course> passedCourses;


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
        this.enrolledCourses = new ArrayList<>();
        this.passedCourses = new ArrayList<>();

    }

    public void enrollToCourse( Course course )
    {
        //TODO
        this.enrolledCourses.add(course);
    }

//    public boolean passCourse(Course course) {
//        if (course.getGrade() > 5 || course.getGrade() < 1) {
//            System.out.println("Please enter a grade between 1 and 5");
//        }
//
//        if (course.getGrade() > 3) {
//            return true;
//        }
//
//        return false;
//
//    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
//       for (Course course: this.studentGrades.keySet()) {
//           if (course.getGrade() > 5 || course.getGrade() < 1) {
//               System.out.println("Please enter a grade between 1 and 5");
//           } else if (course.getGrade() >= 3) {
//               this.passedCourses.add(course);
//           }
//           return this.passedCourses;
//       }

        for (Course course: this.enrolledCourses) {
            if (course.getGrade() > 5 || course.getGrade() < 1) {
                System.out.println("Please enter a grade between 1 and 5");
            }
            if (course.getGrade() >= 3) {
                this.passedCourses.add(course);
            }
        }

       return this.passedCourses;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
        for (Course course: this.enrolledCourses) {
            if (course.getCode().equals(courseId)) {
                return course;
            }
        }
        System.out.println("Please enter a valid course code");
        return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
        return this.enrolledCourses;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
