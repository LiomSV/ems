package org.vst.ems.server.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Call {

    private long id;
    private LocalDateTime createdWhen;
    private LocalDateTime finishedWhen;
    private List<Appeal> appeals;
    private ILocation location;
//    private Patient patient;
    private CallCause cause;
//    private CallState state;
    private String description;
//    private List<CallNote> notes;

}

