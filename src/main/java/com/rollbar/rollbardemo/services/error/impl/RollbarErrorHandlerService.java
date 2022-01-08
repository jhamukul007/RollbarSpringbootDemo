package com.rollbar.rollbardemo.services.error.impl;

import com.rollbar.notifier.Rollbar;
import com.rollbar.rollbardemo.services.error.ExternalErrorHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RollbarErrorHandlerService implements ExternalErrorHandlerService {
    private final Rollbar rollbar;

    @Autowired
    public RollbarErrorHandlerService(@Qualifier("rollbar") Rollbar rollbar) {
        this.rollbar = rollbar;
    }

    @Override
    public void sendError(Exception e) {
        rollbar.error(e);
    }

    @Override
    public void sendError(Exception e, String message) {
        rollbar.error(e,message);
    }

    @Override
    public void sendInfo(Exception e) {
        rollbar.info(e);
    }

    @Override
    public void sendInfo(Exception e, String message) {
        rollbar.info(e,message);
    }

    @Override
    public void sendDebug(Exception e) {
        rollbar.debug(e);
    }

    @Override
    public void sendDebug(Exception e, String message) {
        rollbar.debug(e,message);
    }
}
