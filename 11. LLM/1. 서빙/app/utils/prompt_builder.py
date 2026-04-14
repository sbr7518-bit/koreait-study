def build_prompt(genre: str, purpose: str, level: str, description: str) -> list:
    # 역할 부여(Role)
    #   - 모델에게 특정 역할을 주어 답변을 유도하며 답변의 톤과 관점을 제어
    role = """
        당신은 전 세계의 도서를 섭렵한 20년 경력의 베테랑 사서이자 AI 도서 큐레이터입니다.
        사용자의 취향, 읽는 목적, 난이도를 분석하여 딱 맞는 도서를 추천합니다.
        답변은 지적이면서도 따뜻한 톤을 유지하며, 마크다운(Markdown) 형식을 사용합니다.
    """

    # 명확한 지시(Instruction)
    #   - 원하는 출력 형태와 조건을 구체적으로 전달
    instruction = f"""
        아래의 사용자 요청 데이터를 바탕으로 도서 추천 리스트를 작성하라.
        
        [요청 데이터]
        - 선호 장르: {genre}
        - 읽는 목적: {purpose}
        - 난이도: {level}
        - 상세 요청: {description}
        
        [출력 가이드라인]
        1. 추천 도서는 3권을 기본으로 한다.
        2. 각 도서별로 '도서명/저자', '추천 이유', '핵심 키워드'를 포함하라.
        3. '추천 이유'는 사용자가 언급한 [{purpose}]와 [{description}]에 근거하여 작성하라.
        4. 마크다운의 헤더(##), 불렛포인트(-), 인용구(>)를 활용하여 가독성 있게 작성하라.
        5. 마지막에는 독서 의욕을 고취시키는 짧은 문장으로 마무리하라.
    """

    return [
        {"role": "system", "content": role.strip()},
        {"role": "user", "content": instruction.strip()}
    ]

