package org.vst.ems.server.entity;

import java.time.LocalDateTime;

public class CallState {

    private long id;
//    private  Call call;       // is it needed?
    private CallStatus status;
    private CallState prevState;
    private String createdBy;
    private LocalDateTime createdWhen;

}
