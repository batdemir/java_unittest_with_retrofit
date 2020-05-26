package testcase;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPerson {

    @GET("Person")
    Call<ResponseModel<List<PersonModel>>> getPersons();

    @GET("Person/{id}")
    Call<ResponseModel<PersonModel>> getPerson(@Path("id") String id);
}