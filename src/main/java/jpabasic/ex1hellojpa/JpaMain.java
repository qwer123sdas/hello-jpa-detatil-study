package jpabasic.ex1hellojpa;

import jpabasic.ex1hellojpa.domain.Order;
import jpabasic.ex1hellojpa.domain.OrderItem;
import jpabasic.ex1hellojpa.hellowjap.MemberTest;
import jpabasic.ex1hellojpa.hellowjap.TeamTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();  // 하이버네이트는 트랜잭션 필수?!??
        tx.begin();

        // 정석 코드
        try {
            // 저장
            /*
            TeamTest team = new TeamTest();
            team.setName("TeamA");
            em.persist(team);

            MemberTest member = new MemberTest();
            member.setUserName("member1");
            member.setTeam(team);
            em.persist(member);

            em.flush();
            em.clear();

            MemberTest findMember = em.find(MemberTest.class, member.getId());
            List<MemberTest> members = findMember.getTeam().getMembers();
            // 이를 통해 반대 방향으로도 탐색할 수 있게 됨.
            for(MemberTest m : members){
                System.out.println("m = " + m.getUserName());
            }
            */

            Order order = new Order();
            em.persist(order);

            //order.addOrderItem(new OrderItem());
            // 또는
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);

            em.persist(orderItem);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();


    }
}
