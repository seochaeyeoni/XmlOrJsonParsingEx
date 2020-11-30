package com.example.xmlorjsonparsingex.src.main;

import com.example.xmlorjsonparsingex.src.main.interfaces.MainActivityView;
import com.example.xmlorjsonparsingex.src.main.interfaces.MainRetrofitInterface;
import com.example.xmlorjsonparsingex.src.main.models.RiseSetInfoResponse;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.xmlorjsonparsingex.src.ApplicationClass.getRetrofitForXml;


class MainService {
    private final MainActivityView mMainActivityView;

    String serviceKey = "ecNHVHr0cVMUz1qGXVx2jSKriJPbC4LBxtBNnv9Qi54nh9LQc8dVfu4hXPpN545vhtrOzCPVzMaiyYn0%2FCIiWg%3D%3D";
    String decode;

    {
        try {
            decode = URLDecoder.decode(serviceKey, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    String location = URLEncoder.encode("서울");

    MainService(final MainActivityView mainActivityView) {
        this.mMainActivityView = mainActivityView;
    }

    void getTest() {
        final MainRetrofitInterface mainRetrofitInterface = getRetrofitForXml().create(MainRetrofitInterface.class);
        mainRetrofitInterface.getTest("서울", 20150101, decode).enqueue(new Callback<RiseSetInfoResponse>() {
            @Override
            public void onResponse(Call<RiseSetInfoResponse> call, Response<RiseSetInfoResponse> response) {
                final RiseSetInfoResponse riseSetInfoResponse = response.body();
                if (riseSetInfoResponse == null) {
                    mMainActivityView.validateFailure(null);
                    return;
                }

                mMainActivityView.validateSuccess(riseSetInfoResponse.getBody().getItems().getItem().getLocation());
            }

            @Override
            public void onFailure(Call<RiseSetInfoResponse> call, Throwable t) {
                mMainActivityView.validateFailure(null);
            }
        });
    }
}
