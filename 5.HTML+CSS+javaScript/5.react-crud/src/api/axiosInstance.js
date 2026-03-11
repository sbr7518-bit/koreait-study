import axios from 'axios';

const AxiosInstance = axios.create({

    // baseURL -> 기존 URL 잡을 때 앞에 로컬 호스트를 계속 불러오고 '/api' 만 작성하면 되게끔 만들어준다. 
    baseURL: 'http://localhost:8080',
    timeout: 10000,
    header:{
        'Content-Type' : 'application/json'
    }


}) 

export default AxiosInstance;