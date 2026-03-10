import { create } from "zustand";

const DropdownStore =  create((set) => ({
    selectOption: '',
    setSelectOption: (value) => set({setSelectOption: value})

}))

export default DropdownStore;