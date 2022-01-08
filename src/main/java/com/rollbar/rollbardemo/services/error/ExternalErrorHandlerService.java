package com.rollbar.rollbardemo.services.error;

public interface ExternalErrorHandlerService {
    void sendError(Exception e);
    void sendError(Exception e, String message);
    void sendInfo(Exception e);
    void sendInfo(Exception e, String message);
    void sendDebug(Exception e);
    void sendDebug(Exception e, String message);
}
