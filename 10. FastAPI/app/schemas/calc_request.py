from pydantic import BaseModel

class CalcRequest(BaseModel):
    a: int
    b: int
    op : str