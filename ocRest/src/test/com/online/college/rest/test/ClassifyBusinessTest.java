package com.online.college.rest.test;

import com.online.college.common.util.JsonUtil;
import com.online.college.common.web.SpringBeanFactory;
import com.online.college.rest.business.IClassifyBusiness;
import com.online.college.rest.dto.ClassifyDto;
import junit.framework.TestCase;

import java.io.IOException;
import java.util.Map;

public class ClassifyBusinessTest extends TestCase {

    public void testGetClassify() {
        IClassifyBusiness bis = (IClassifyBusiness) SpringBeanFactory.getBean("classifyBusinessImpl");

        Map<String, ClassifyDto> map = bis.getAllClassify();
        try {
            System.out.println(JsonUtil.toJson(map).toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
