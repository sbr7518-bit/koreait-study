import axios from 'axios';

const API_BASE_URL = 'https://d59b76tlbmdxy.cloudfront.net';


const axiosInstance = axios.create({

    // baseURL -> 기존 URL 잡을 때 앞에 로컬 호스트를 계속 불러오고 '/api' 만 작성하면 되게끔 만들어준다. 
    baseURL: API_BASE_URL,
    timeout: 10000,
    headers:{
        'Content-Type' : 'application/json'
    }


}) 

export default axiosInstance;