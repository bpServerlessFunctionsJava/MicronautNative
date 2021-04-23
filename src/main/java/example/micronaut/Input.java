package example.micronaut;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Input {
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
