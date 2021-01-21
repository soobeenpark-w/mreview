package org.zerock.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    private Long mno;

    private String title;

    @Builder.Default
    private List<MovieImageDTO> imageDTOList = new ArrayList<>();

    // Review avg score
    private double avg;

    // Number of reviews
    private int reviewCnt;

    private LocalDateTime regDate;

    private LocalDateTime modDate;
}
