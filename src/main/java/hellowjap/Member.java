package hellowjap;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// @Table(name = "USER")  // USER라는 테이블에 인설트 하라는 쿼리가 나감
@Getter @Setter
public class Member {

    @Id
    private Long id;
    // @Column(name = "username") // User테이블의 username이라는 컬럼에 저장하고 싶을 때
    private String name;

    public Member(){}

    public Member(Long id, String name){
        this.id = id;
        this.name = name;
    }

}
