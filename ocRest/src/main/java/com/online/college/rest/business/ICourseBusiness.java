package com.online.college.rest.business;

import com.online.college.core.course.domain.Course;

import java.util.List;
import java.util.Map;

public interface ICourseBusiness {

    Map<String, List<Course>> getCourses();

}
