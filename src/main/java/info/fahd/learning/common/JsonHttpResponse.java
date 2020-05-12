package info.fahd.learning.common;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class JsonHttpResponse extends BaseHttpResponse {

    public JsonHttpResponse(ResponseObject<?> response) {
        super.setStatus(HttpStatus.OK);
        this.setResponse(response);
    }

    @Override
    public void setResponse(ResponseObject<?> response) {
        super.response = response;
    }
}
