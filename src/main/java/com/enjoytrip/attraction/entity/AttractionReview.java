package com.enjoytrip.attraction.entity;

import lombok.*;

@Getter
@NoArgsConstructor
@Setter
@Builder
@AllArgsConstructor
@ToString
public class AttractionReview {
    private Long id;
    private String title;
    private String content;
    private int score;
    private Long userId;
    private Long attractionId;

}
