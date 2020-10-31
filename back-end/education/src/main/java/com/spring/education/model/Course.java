package com.spring.education.model;

import com.spring.education.model.enums.Content;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private Content content;

    @Column(name = "course_price")
    private String coursePrice;

    @OneToMany(mappedBy = "course")
    private List<Master> masters;
}
