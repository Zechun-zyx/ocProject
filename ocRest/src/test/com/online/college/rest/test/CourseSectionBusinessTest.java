package com.online.college.rest.test;

import com.online.college.common.util.JsonUtil;
import com.online.college.common.web.SpringBeanFactory;
import com.online.college.rest.business.ICourseSectionBusiness;
import com.online.college.rest.dto.CourseSectionDto;
import junit.framework.TestCase;

import java.io.IOException;
import java.util.Map;

public class CourseSectionBusinessTest extends TestCase {

    public void testGetCourseSections() {
        ICourseSectionBusiness bis = (ICourseSectionBusiness) SpringBeanFactory.getBean("courseSectionBusinessImpl");

        Map<Long, CourseSectionDto> map = bis.getAllCourseSections(1L);
        try {
            System.out.println(JsonUtil.toJson(map).toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
