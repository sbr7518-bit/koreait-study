import { create } from "zustand";


const useGugudanStore = create ((set, get) => ({

    a: '',
    b: '',
    answer: '',
    result: '',

    // a 입력
    setA: (value) => set({ a : value }),
    // b 입력
    setB: (value) => set({ b : value }),
    // 사용자가 입력한 정답
    setAnswer : (value) => set({ answer : value }),
    
    // 입력 값 확인

    // 내가 쓴 코드
    // checkAnswer: () => set((state) => {
    //     const check = Number(state.a) * Number(state.b);

    //     // 정답 & 오답 처리 
    //     if(Number(state.answer) === check) {
    //         return{ result : "정답 입니다!" };
    //     } else {
    //         return{ result : "오답 입니다!" };
    //     }
    //   }),

    // 선생님이 쓴 코드
    checkAnswer: () => {
        // get() : 현재 저장소의 상태(state)를 불러오는 함수
        const {a, b, answer } = get();
        const resultCheck = Number(a) * Number(b) === Number(answer);

        // result 안에 넣을 상태를 입력하기 위해 set 함수 사용  (삼항연산자 이용)
        set({ result : resultCheck ? '정답 입니다!' : '오답 입니다!'});
    },

    // 초기화
    clear: () => set({ a : '',
                       b : '',
                       answer : '',
                       result : ''
                    })
}))

export default useGugudanStore;