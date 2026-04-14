package kr.co.ai_project;

import lombok.Getter;
import lombok.Setter;

public class AiDto {

	@Setter
	@Getter
	public static class RequestAi {
		private String genre;   		// 장르
		private String purpose;  		// 추천 목적
		private String level;  			// 난이도
		private String description;  	// 상세 요청 사항

	}
}
