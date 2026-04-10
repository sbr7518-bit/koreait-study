class InferenceService:
    
#                     매개변수타입 -> 반환타입
    def predict(self, text: str) -> dict:
        return {
            "label": text,
            "score": 0.95
        }