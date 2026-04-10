class CalcService:

    def calculate(self, request):
        a = request.a
        b = request.b
        op = request.op

        if op == "+":
            return a + b
        elif op == "-":
            return a - b
        elif op == "*":
            return a * b
        elif op == "/":
            return a / b
        else:
            return "지원하지 않는 연산자입니다."
