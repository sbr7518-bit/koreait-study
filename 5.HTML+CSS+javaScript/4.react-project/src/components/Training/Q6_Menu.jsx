

function Menu ({menuList}) {

    return (
        <ul>
            { menuList.map((list,index) => {
                return <li key={index}>{list}</li> 
            })}
        </ul>
    )

}

export default Menu;