import Menu from "../../components/Training/Q6_Menu";

function MenuPage () {
    
    return (
        <>
            <p>메뉴 목록</p>

            <Menu menuList = {["홈", "소개", "문의하기"]} />
        </>
    )
}

export default MenuPage;