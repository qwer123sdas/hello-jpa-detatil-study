package jpabasic.ex1hellojpa.hellowjap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMainTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();  // 하이버네이트는 트랜잭션 필수?!??
        tx.begin();
        
        // 정석 코드
        try {
            //Member member = new Member();
            // insert
            /*member.setId(2L);
            member.setName("HelloB");
            em.persist(member);*/

            // select
            //Member findMember = em.find(Member.class, 1L);
            /*System.out.println(findMember.getId());
            System.out.println(findMember.getName());*/

            // 전체 회원 조회
/*            List<Member> result = em.createQuery("select m from Member m", Member.class)
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();*/

            // delete
            // em.delete(findMember);

            //update
            //findMember.setName("HelloJPA!"); // 자바 컬랙션을 다루는 것처럼 설계되어있어서 = dirty scan

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();


    }
}
