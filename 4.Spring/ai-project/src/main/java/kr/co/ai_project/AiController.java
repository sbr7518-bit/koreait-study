package kr.co.ai_project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AiController {
   private final AiService aiService;
   
   @PostMapping("/ai/generate")
   public ResponseEntity<?> generate(@RequestBody AiDto.RequestAi req, HttpSession session) {
      
      UserDto.ResponseLogin loginUser = (UserDto.ResponseLogin) session.getAttribute("LOGIN_USER");
      
      if (loginUser == null) return ResponseEntity.status(401).body("로그인이 필요합니다.");
      
      String result = aiService.callFastApi(loginUser.getUserId(), req);
      
      return ResponseEntity.ok(result);
   }
}
