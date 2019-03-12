package com.steam.app.api;

import com.steam.app.mould.LoginReq;
import com.steam.app.mould.LoginResp;
import com.steam.app.mould.RegisterReq;
import com.steam.app.mould.RegisterResp;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author zshp
 */
public interface ApiInterface {

    /**
     * 注册
     *
     * @return
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST(ApiUrl.REGISTER)
    Observable<RegisterResp> register(@Body RegisterReq requestBean);

    /**
     * 登录
     *
     * @return
     */
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST(ApiUrl.LOGIN)
    Observable<LoginResp> login(@Body LoginReq requestBean);
}