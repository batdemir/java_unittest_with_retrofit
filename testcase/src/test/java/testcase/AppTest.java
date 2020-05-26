package testcase;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.junit.Test;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        //String uuid = UUID.randomUUID().toString();
        assertTrue(true);
    }

    @Test
    public void something() {
        final CountDownLatch latch = new CountDownLatch(1);
        IPerson person = RetrofitClient.getRetrofit().create(IPerson.class);
        person.getPersons().enqueue(new Callback<ResponseModel<List<PersonModel>>>() {

            @Override
            public void onResponse(Call<ResponseModel<List<PersonModel>>> call,
                    Response<ResponseModel<List<PersonModel>>> response) {

                ResponseModel<List<PersonModel>> body = response.body();
                for (PersonModel personModel : body.getModel()) {
                    System.out.println("Person Id: \t" + personModel.getId() + "\n");
                    System.out.println("Person Name: \t" + personModel.getName() + "\n");
                    System.out.println("Person Surname: \t" + personModel.getSurName() + "\n");
                }
                latch.countDown();
            }

            @Override
            public void onFailure(Call<ResponseModel<List<PersonModel>>> call, Throwable t) {
                fail(t.getMessage());
                latch.countDown();
            }
        });

        try {
            latch.await();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void somethingWithId() {
        final CountDownLatch latch = new CountDownLatch(1);
        IPerson person = RetrofitClient.getRetrofit().create(IPerson.class);
        person.getPerson("3fa85f64-5717-4562-b3fc-2c963f66afa6").enqueue(new Callback<ResponseModel<PersonModel>>() {

            @Override
            public void onResponse(Call<ResponseModel<PersonModel>> call,
                    Response<ResponseModel<PersonModel>> response) {
                ResponseModel<PersonModel> body = response.body();
                System.out.println(body.getModel().getId() + "\n");
                System.out.println(body.getModel().getName() + "\n");
                System.out.println(body.getModel().getSurName() + "\n");
                latch.countDown();
            }

            @Override
            public void onFailure(Call<ResponseModel<PersonModel>> call, Throwable t) {
                fail(t.getMessage());
                latch.countDown();
            }
        });

        try {
            latch.await();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
