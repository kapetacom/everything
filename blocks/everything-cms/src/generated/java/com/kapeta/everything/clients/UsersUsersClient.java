/**
 * GENERATED SOURCE - DO NOT EDIT
 */
package com.kapeta.everything.clients;

import com.kapeta.everything.dto.TokenDTO;
import com.kapeta.everything.dto.TokenWithPasswordDTO;
import com.kapeta.everything.dto.UserAuthPasswordDTO;
import com.kapeta.everything.dto.UserDTO;
import com.kapeta.everything.dto.UserRegistrationDTO;
import com.kapeta.spring.annotation.KapetaRestClient;
import java.util.*;
import retrofit2.Call;
import retrofit2.http.*;

@KapetaRestClient("users")
public interface UsersUsersClient {
    @POST("users/register")
    Call<TokenDTO> registerUser(@Body UserRegistrationDTO payload);

    @POST("users/activate")
    Call<UserDTO> activateUser(@Body TokenDTO token);

    @POST("users/authenticate")
    Call<TokenDTO> authenticate(@Body UserAuthPasswordDTO auth);

    @POST("users/recover-password")
    Call<TokenDTO> recoverPassword(@Query("email") String email);

    @POST("users/recover-password/apply")
    Call<Void> applyNewPassword(@Body TokenWithPasswordDTO token);

    @GET("users/me")
    Call<UserDTO> getCurrentUser();

    @POST("users/me")
    Call<UserDTO> updateCurrentUser(@Body UserDTO user);
}
