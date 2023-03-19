package com.project.studyseller.entity;

import com.project.studyseller.constant.ItemSellPrice;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString

public class Document {

    private Long id;    //문서 코드

    private String DocNm;   //문서명

    private int price;  //가격

    private String DocDetail;  //문서 부가 설명

    private ItemSellPrice itemSellPrice;    //문서 가격 상태

    private Boolean DocPrivate; //문서 공개 여부

    private LocalDateTime regTime;  //등록 시간

    private LocalDateTime updateTime;   //수정시간
}
