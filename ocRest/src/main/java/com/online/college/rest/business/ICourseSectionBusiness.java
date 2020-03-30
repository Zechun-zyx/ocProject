package com.online.college.rest.business;

import com.online.college.rest.dto.CourseSectionDto;

import java.util.Map;

public interface ICourseSectionBusiness {

    /**
     * 获取某个课程的章节数据
     *
     * @param courseId
     * @return
     */
    Map<Long, CourseSectionDto> getAllCourseSections(Long courseId);

}
