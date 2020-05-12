package info.fahd.learning.common;

import org.springframework.http.HttpStatus;

import java.util.Date;

abstract class BaseHttpResponse{

    private HttpStatus status;

    protected ResponseObject<?> response;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public ResponseObject<?> getResponse() {
        return response;
    }

    public abstract void setResponse(ResponseObject<?> response);
}
