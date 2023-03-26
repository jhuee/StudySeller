package com.project.studyseller.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
@Table(name = "Document")
@Getter
@Setter
@ToString

public class Document {
    @Id
    @Column(name = "Doc_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)     //JPA 구현체가 자동으로 생성 전략
    private Long DocSN;    //문서 코드


    @Column(nullable = false, length = 50)
    private String DocTitle;   //문서명

    @Column(nullable = false)
    private Integer category;   //문서 카테고리

    @CreatedDate        //Insert 시 시간 자동 저장
    @UpdateTimestamp        //Update 시 시간 자동 저장
    @Column(nullable = false)
    private String DocContent;  //문서 본문

    @Column(name = "price", nullable = false)
    private int price;  //가격

    @Lob
    @Column(nullable = true)
    private String DocDetail;  //문서 부가 설명

    @Column(nullable = false)
    private Boolean itemSellPrice;    //유무료 결정


    @Column(nullable = false)
    private Boolean DocPrivate; //문서 공개 여부
    @Column(nullable = false)
    private LocalDateTime regTime;  //등록 시간
    @Column()
    private LocalDateTime updateTime;   //수정시간


}
