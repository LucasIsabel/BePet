package helloworld.teste.com.bepet.interfacesRetrofit;

import helloworld.teste.com.bepet.model.OngContainer;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by ricardo on 23/08/2015.
 */
public interface OngService {
    @GET("/doacaoanimais")
    void listOngs(Callback<OngContainer> callback);
}

