package com.online.college.rest.business;

import com.online.college.rest.dto.ClassifyDto;

import java.util.Map;

public interface IClassifyBusiness {

    Map<String, ClassifyDto> getAllClassify();

}
