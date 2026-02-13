package kr.co.studyProject.board.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@ToString
public class ResBoardDTO {
	
	private Long id; 
	private String email;
	private String category;
	private String title;     //제목
	private String content;      // 작성내용
	private String writerName;     // 작성자
	private LocalDateTime createdAt;    // 작성일
	private int viewCount; 

}
