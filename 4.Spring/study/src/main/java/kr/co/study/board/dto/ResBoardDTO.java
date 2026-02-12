package kr.co.study.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResBoardDTO {
	private Long id; 
	private String category;
	private String title;     //제목
	private String content;      // 작성내용
	private String writerName;     // 작성자
	private LocalDateTime createdAt;    // 작성일
	private int viewCount;     // 조회수
	
}
