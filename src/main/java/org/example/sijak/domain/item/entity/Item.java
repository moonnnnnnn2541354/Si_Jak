package org.example.sijak.domain.item.entity;

import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Table(name="tb_item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;

    private String itemName;
    private String imgTop;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String content;
    private int price;
    private boolean closed;
}
