package org.bungee.libra;

import java.io.Serializable;

public class NetException extends Exception implements Serializable {

    private static final long serialVersionUID = 6896592701829210091L;

    private ErrorCode errorCode;
    private String errorDescription;


    public NetException(ErrorCode errorCode, String errorDescription) {
        this.errorCode = errorCode;
        this.errorDescription = String.format(errorCode.getDescription(), errorDescription);
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }


}
