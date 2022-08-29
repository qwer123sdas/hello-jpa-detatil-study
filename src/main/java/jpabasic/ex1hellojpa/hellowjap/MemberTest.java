package jpabasic.ex1hellojpa.hellowjap;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
// @Table(name = "USER")  // USER라는 테이블에 인설트 하라는 쿼리가 나감
@Getter @Setter
public class MemberTest {

    @Id
    private Long id;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public MemberTest(){}
    //Getter, Setter…

}
