package jpabasic.ex1hellojpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Item {

    @Id  @Column(name = "ITEM_ID")
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}
