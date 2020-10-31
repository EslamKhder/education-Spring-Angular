package com.spring.education.model;


import com.spring.education.model.enums.Content;

import java.util.List;

public class Course {

    private Long id;

    private String courseName;

    private String coursePrice;

    private Content content;

    private List<Master> masters;
}
