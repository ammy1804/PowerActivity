package com.example.syncritrage.retrofit


import com.example.syncritrage.data.*
import retrofit2.Call
import retrofit2.http.*


interface RetrofitService {
    @POST("api/auth/signup")
    fun createUser(
        @Body signupModel: SignupModel
    ): Call<SignupResponse>


    @POST("api/auth/signin")
    fun login(
      @Body loginModel: LoginModel
    ): Call<SigninResponse>

/*

    @GET("/users")
    fun getUserList(@Query("since") page: Int): Call<ResponseBody>
*/


    /* @GET("/users/{username}")
     fun getUser(@Path("username")username : String): Call<UserProfileModel>*/
}