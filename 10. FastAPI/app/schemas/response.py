from pydantic import BaseModel


class InferenceResponse(BaseModel):
    label: str
    score: float