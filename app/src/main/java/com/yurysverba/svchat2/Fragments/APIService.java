package com.yurysverba.svchat2.Fragments;

import com.yurysverba.svchat2.Notifications.MyResponse;
import com.yurysverba.svchat2.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAMDYtL3c:APA91bHx3JhK2O3UOoI9401_t8Au_EyA_GOOUXrpLGTVI6_CGfddUANqZ2kYoNowHvmOnNFfdCIv4RH8USnddZBP-rp0YqWoxCChq1LmbKLYeb-CvdftaOEAm288NMwiXCKPQGY7-LQ5"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
