package com.online.college.core.consts;

/**
 * 课程使用的枚举
 */
public enum CourseEnum {
    //免费
    FREE(1),
    //收费
    FREE_NOT(0),
    //上架
    ONSALE(1),
    //下架
    ONSALE_NOT(0),
    //课程收藏
    COLLECTION_CLASSIFY_COURSE(1);

    private Integer value;

    private CourseEnum(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return value;
    }
}
