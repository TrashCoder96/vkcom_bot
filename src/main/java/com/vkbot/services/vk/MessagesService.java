package com.vkbot.services.vk;

import com.vkbot.services.vo.messages.send.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ivan on 15.03.17.
 */
public interface MessagesService {

    @GET("messages.send")
    Call<Response> sendMessage(@Query("access_token") String access_token, @Query("user_id") String user_id, @Query("user_ids") String user_ids, @Query("message") String message);



}
