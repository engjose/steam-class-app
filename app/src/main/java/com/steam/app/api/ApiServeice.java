package com.steam.app.api;


import com.steam.app.mould.LoginReq;
import com.steam.app.mould.LoginResp;
import com.steam.app.mould.RegisterReq;
import com.steam.app.mould.RegisterResp;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;

/**
 * @author zshp
 */
public class ApiServeice {

    /**
     * 注册
     *
     * @param nickName
     * @param password
     * @return
     */
    public static Observable<RegisterResp> register(String nickName, String password) {
        RegisterReq registerReq = new RegisterReq();
        registerReq.nickName = nickName;
        registerReq.password = password;
        return RetrofitHelper.getInstance().getApiService(ApiUrl.BASE_URL, ApiInterface.class, null)
                .register(registerReq)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 登录
     *
     * @param nickName
     * @param password
     * @return
     */
    public static Observable<LoginResp> login(String nickName, String password) {
        LoginReq loginReq = new LoginReq();
        loginReq.nickName = nickName;
        loginReq.password = password;
        return RetrofitHelper.getInstance().getApiService(ApiUrl.BASE_URL, ApiInterface.class, null)
                .login(loginReq)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}