from pydantic import BaseModel


class TsInferenceRequest(BaseModel):
    x: float

class TsInferenceResponse(BaseModel):
    input: float
    output: float