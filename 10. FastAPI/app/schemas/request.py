from pydantic import BaseModel

class InferenceRequest(BaseModel):
    text: str   #text 라는 변수는 문자열이다.