from pydantic import BaseModel

class GPTRequest(BaseModel):
    genre: str
    purpose: str
    level: str
    description: str
    max_completion_tokens: int = 2000
    temperature: float = 0.3

class GPTResponse(BaseModel):
    result: str