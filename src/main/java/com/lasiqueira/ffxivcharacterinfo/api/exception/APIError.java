package com.lasiqueira.ffxivcharacterinfo.api.exception;

public class CharacterError {
    public CharacterError(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private String errorMsg
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
