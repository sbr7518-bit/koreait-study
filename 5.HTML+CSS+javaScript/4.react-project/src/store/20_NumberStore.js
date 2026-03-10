import { create } from "zustand";


const useNumberStore = create ((set) => ({
    numbers: [],
    addNumber: (num) =>  set((state) => ({ numbers : [...state.numbers, num]})),
    removeNumber: (removeIndex) => set((state) => ({
        //                           '_' 자릿 수 채우는 용. (변수를 비어두겠다)
        numbers: state.numbers.filter((_, index ) => index !== removeIndex)
    }))
}))

export default useNumberStore;