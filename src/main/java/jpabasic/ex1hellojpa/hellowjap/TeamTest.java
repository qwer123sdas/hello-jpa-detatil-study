package jpabasic.ex1hellojpa.hellowjap;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class TeamTest {

    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;
    @OneToMany(mappedBy = "team") // mappedBy : 어떤 객체와 연결되어있는지 매핑 == @ManyToOne의 필드명
    private List<MemberTest> members = new ArrayList<>();

    public void addMember(MemberTest member){
        member.setTeam(this);
        members.add(member);
    }

    @Override
    public String toString() {
        return "TeamTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
