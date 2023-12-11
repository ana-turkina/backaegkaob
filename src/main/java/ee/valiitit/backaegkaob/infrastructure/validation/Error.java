package ee.valiitit.backaegkaob.infrastructure.validation;

import lombok.Getter;

@Getter
public enum Error {
    INCORRECT_CREDENTIALS("Vale kasutajanimi või parool", 111),
    FUNERAL_INSTRUCTIONS_DOES_NOT_EXIST("Matuseinfot ei ole salvestatud", 110);


    private final String message;
    private final int errorCode;

    Error(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
