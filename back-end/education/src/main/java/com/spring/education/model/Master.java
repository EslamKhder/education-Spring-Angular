package com.spring.education.model;

import com.spring.education.model.enums.Gender;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "teacher")
public class Master extends BaseEntity{

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "age")
    private String age;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "address")
    private String address;

    @Temporal(TemporalType.DATE)
    private Date date;

    @CreationTimestamp
    @Column(name = "date_create")
    private Date dateCreated;

    @UpdateTimestamp
    private Date lastUpdated;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
