package info.fahd.learning.common;

import java.util.Date;

public class ResponseObject<T> {
    private T payload;

    private Date date;

    public ResponseObject() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
