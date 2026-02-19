package kr.co.studyProject.board.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import kr.co.studyProject.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	// 게시판 엔티티 저장 
	private String boardType;
	private String category;
	private Integer viewCount = 0;
	private String title;
	
	@Lob
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="writer_id")
	private Member writer;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
		this.updatedAt = LocalDateTime.now();
	}
	
	@PreUpdate
	public void preUpdate() {
		this.updatedAt = LocalDateTime.now();
	}
	
	

}
