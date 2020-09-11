//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.mppkvvcl.dto;

public class StatusDTO {
    private boolean isException;
    private String exceptionMessage;
    private String messageType;
    private int count;

    public StatusDTO(boolean isException, String exceptionMessage, String messageType, int count) {
        this.isException = isException;
        this.exceptionMessage = exceptionMessage;
        this.messageType = messageType;
        this.count = count;
    }

    public boolean isIsException() {
        return this.isException;
    }

    public void setIsException(boolean isException) {
        this.isException = isException;
    }

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
