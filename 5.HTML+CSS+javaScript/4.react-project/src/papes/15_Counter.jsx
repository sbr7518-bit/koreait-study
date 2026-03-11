import useCounterStore from "../store/14_CounterStore"

function Counter2() {
    const { count, increase } = useCounterStore();

    // const count = useCounterStore((state) => state.count)
    // const increase = useCounterStore((state) => state.increase)

    return(
        <>
            <p>{count}</p>
            <button onClick={increase}>클릭</button>
        </>

    )
}
export default Counter2