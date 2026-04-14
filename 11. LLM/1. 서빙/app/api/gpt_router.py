from fastapi import APIRouter, Header, HTTPException
from starlette import status

from app.schemas.gpt_schema import GPTResponse, GPTRequest
from app.service.gpt_service import GPTService

router = APIRouter(prefix="/gpt", tags=["GPT"])

service = GPTService()

@router.post("/generate", response_model=GPTResponse)
def generate_text(req: GPTRequest, x_user_id: str = Header(default="anonymous")):

    # if x_user_id == "anonymous":
    #     raise HTTPException( # 예외 발생 시키기 (자바의 throw new ~~Exception)
    #        status_code=status.HTTP_401_UNAUTHORIZED,
    #        detail="인증이 필요합니다."
    #     )

    result = service.generate_text(
        genre=req.genre,
        purpose=req.purpose,
        level=req.level,
        description=req.description,
        max_completion_tokens = req.max_completion_tokens,
        temperature = req.temperature
    )

    return GPTResponse(result=result)