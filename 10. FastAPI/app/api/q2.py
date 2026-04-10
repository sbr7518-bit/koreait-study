from fastapi import APIRouter
from app.schemas.calc_request import CalcRequest
from app.services.calc_service import CalcService

router = APIRouter(prefix="/q2")

service = CalcService()

# <api>
# 1. URL : /calc (post)
# 2. 매개변수의 타입은 CalcRequest 으로 들어와야 함
# 3. CalcService 객체의 calculate 메서드를 호출 후 응답 결과를 반환

@router.post("/calc")
def calc(request: CalcRequest):
    result = service.calculate(request)
    return {"result": result}

# <CalcRequest>  schemas
# 파일명 : calc_request / 클래스명 : CalcRequest
# 1. 총 3개의 타입을 검사
#   - a, b : int 타입이어야 함. (사용자가 입력한 숫자 2개)
#   - op : str 타입이어야 함. (사용자가 입력한 연산자, "+", "-", "*")

# <CalcService> service
# 파일명 : calc_service / 클래스명 : CalcService
# 1. calculate 메서드 생성
#   - 연산자 조건 검사
#       > 사용자가 요청한 연산자가 "+"일 경우 a+b 반환
#       > 사용자가 요청한 연산자가 "-"일 경우 a-b 반환
#       > 사용자가 요청한 연산자가 "*"일 경우 a*b 반환
#       > 사용자가 요청한 연산자가 "/"일 경우 a/b 반환

