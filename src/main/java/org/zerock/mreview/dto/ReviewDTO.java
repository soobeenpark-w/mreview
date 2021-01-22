package org.zerock.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {

    // Review ID
    private Long reviewnum;

    // Move ID
    private Long mno;

    // Member ID
    private Long mid;
    // Member nickname
    private String nickname;
    // Member email
    private String email;

    private int grade;

    private String text;

    private LocalDateTime regDate, modDate;
}
