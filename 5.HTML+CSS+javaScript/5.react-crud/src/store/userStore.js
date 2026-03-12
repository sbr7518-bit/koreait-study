import { create } from 'zustand';

// 사용자 관리 
const useUserStore = create((set) => ({
    currentUser: null,

    setCurrentUser: (userData) => 
        set({ currentUser: userData}),

        logout: () => set({ currentUser: null })
    
}))

export default useUserStore;