package com.spring.education.model;

import com.spring.education.model.enums.Content;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Entity
@Table(name = "course")
public class Course extends BaseEntity{

    @Enumerated(EnumType.ORDINAL)
    private Content content;

    @Column(name = "course_price")
    private String coursePrice;

    @OneToMany(mappedBy = "course")
    private List<Master> masters;
}
