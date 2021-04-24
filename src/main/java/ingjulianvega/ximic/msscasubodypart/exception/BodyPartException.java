package ingjulianvega.ximic.msscasubodypart.exception;

import lombok.Getter;

@Getter
public class BodyPartException extends RuntimeException {

    private final String code;

    public BodyPartException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

