package com.shrreyabhatachaarya.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import com.shrreyabhatachaarya.jokes.Joke;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.shrreyabhatachaarya.com",
                ownerName = "backend.builditbigger.shrreyabhatachaarya.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();
        response.setData(Joke.getJoke());
        return response;
    }

}
