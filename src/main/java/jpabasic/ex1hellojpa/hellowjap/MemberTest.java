package jpabasic.ex1hellojpa.hellowjap;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
// @Table(name = "USER")  // USER라는 테이블에 인설트 하라는 쿼리가 나감
@Getter @Setter
public class MemberTest {

    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String userName;

    /*@Column(name = "TEAM_ID")
    private Long teamId;*/

    @ManyToOne   // jpa에게 어떤 관계인지 알려주는 것.
    @JoinColumn(name = "TEAM_ID") // 어떤 컬럼과 조인할 것인지 명명
    private TeamTest team;

    public void changeTeam(TeamTest team){
        this.team = team;
        team.getMembers().add(this); // this는 Member객체 나자신
    }

    @Override
    public String toString() {
        return "MemberTest{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", team=" + team +
                '}';
    }
}
