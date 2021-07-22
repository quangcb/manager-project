import React, {useState} from 'react';
import axios from 'axios';

export default function LoginPage() {

    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = e =>{
        e.preventDefault();
        
        const data = {
            username: this.username,
            password: this.password
        };

        axios.post('http://localhost:3000/', data)
            .then(res => {
                    console.log(res);
            })
            .catch(err => {
                    console.log(err);
                }
        );
    }

    return (
        <div className="">
            <div className="min-h-screen bg-gray-13">
                <div className="flex justify-center">
                    <div className="mt-20 bg-white w-96 shadow-lg rounded-lg">
                        <form className="px-5 py-5" onSubmit={handleSubmit}>
                            <div className="flex justify-center pb-4">
                                <img src="/img/icon.png" width="113" height="113" alt="icon-vnua"></img>
                            </div>
                            <div className="py-3 font-bold text-center text-blue-600 text-3xl">Quản Lý Ký Túc Xá</div>
                            <div>
                                <input className="w-full my-4 border border-gray-300 focus:outline-none focus:ring-2 focus:ring-blue-500 px-3 py-2 rounded-lg" autofocus="1" placeholder="Tài khoản của bạn" value={username} onChange={e => setUsername(e.target.value)} type="text" name="student-code"/>
                                <br></br>
                                <input className="w-full border border-gray-300 focus:outline-none focus:ring-2 focus:ring-blue-500 px-3 py-2 rounded-lg" placeholder="Mật khẩu" value={password} onChange={e => setPassword(e.target.value)} type="password" name="password" />
                                <label className="hidden">Mật khẩu bạn đã nhập không chính xác</label>
                            </div>
                            <button className="w-full mt-4 bg-blue-500 hover:bg-blue-700 p-3 rounded-lg text-white text-xl font-bold">Đăng nhập</button>
                        </form>
                    </div>
                </div>
            </div>
            <div className="container mx-auto max-w-5xl p-4 bg-white text-center text-sm text-gray-500 space-y-2">
                <div>Quản lý ký túc xá sinh viên Học viện Nông nghiệp Việt Nam</div>
                <hr></hr>
                <div>Quangcb © 2021 - All rights reserved | Design by <strong>Hoàng Minh Quang.</strong></div>
            </div>
        </div>
    );
  }