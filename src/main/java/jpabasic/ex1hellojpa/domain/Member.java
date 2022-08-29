package jpabasic.ex1hellojpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {

    @Id @Column(name = "MEMVER_ID")
    @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

    public Member(){};
}
