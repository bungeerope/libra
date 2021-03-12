package org.bungee.libra;

public enum ErrorCode {

    IP_ERR_CODE(421, "Source ip is error: ip = %s"),
    NETWORK_ERR_CODE(423, "Network is down! eth is %s");

    ErrorCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    private Integer code;
    private String description;

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public ErrorCode getErrDescription(Integer errCode) {
        for (ErrorCode x : values()) {
            if (x.code.equals(errCode)) {
                return x;
            }
        }
        return null;
    }
}
