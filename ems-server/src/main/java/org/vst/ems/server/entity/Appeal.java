package org.vst.ems.server.entity;

import java.time.LocalDateTime;

public class Appeal {

    private long id;
    private AppealSource source;
    private String phoneNumber;
    private AppealResult result;
    private boolean technical;
//    private List<Call> calls;
    private LocalDateTime createdWhen;
    private String createdBy;

}
