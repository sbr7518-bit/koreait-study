import { create } from "zustand";

const useCounterStore = create((set) => ({
    count: 0,
    increase: () => set((setate) => ({count: setate.count+1}))
}))

export default useCounterStore;