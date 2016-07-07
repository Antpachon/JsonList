package utils;

import com.antonio.jsonlist_mvp.model.Data;

import java.io.IOException;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MockData {

    public static Call<Data> okResponse(){

        return new Call<Data>() {
            @Override
            public Response<Data> execute() throws IOException {
                return null;
            }

            @Override
            public void enqueue(Callback<Data> callback) {
                Data testData = new Data(); //Create custom responses here
                callback.onResponse(this, Response.<Data>success(testData));
            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<Data> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }


    public static Call<Data> errorResponse(){

        return new Call<Data>() {
            @Override
            public Response<Data> execute() throws IOException {
                return null;
            }

            @Override
            public void enqueue(Callback<Data> callback) {
                callback.onFailure(this,new Throwable());
            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<Data> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
    }

}
