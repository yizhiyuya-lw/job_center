package com.lw.dcsjob.common.log.dto;

import com.lw.dcsjob.common.log.constant.LogFieldConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lw
 * @create 2024-09-27-21:23
 */
public class LogContentDTO {

    private List<TaskLogFieldDTO> fieldList;

    public LogContentDTO() {
        this.fieldList = new ArrayList<>();
    }

    public List<TaskLogFieldDTO> getFieldList() {
        return fieldList;
    }

    public Map<String, String> toMap() {
        return this.fieldList.stream()
                .filter(logTaskDto -> !Objects.isNull(logTaskDto.getValue()))
                .collect(Collectors.toMap(TaskLogFieldDTO::getName, TaskLogFieldDTO::getValue));
    }

    public void addField(String name, String value) {
        fieldList.add(new TaskLogFieldDTO(name, value));
    }

    public void addTimeStamp(Long timeStamp) {
        this.addField(LogFieldConstants.TIME_STAMP, String.valueOf(timeStamp));
    }

    public Long getTimeStamp() {
        return Long.parseLong(fieldList.stream().filter(taskLogFieldDTO -> !Objects.isNull(taskLogFieldDTO.getValue()))
                .collect(Collectors.toMap(TaskLogFieldDTO::getName, TaskLogFieldDTO::getValue))
                .get(LogFieldConstants.TIME_STAMP));
    }

    public void addLevelField(String level) {
        this.addField(LogFieldConstants.LEVEL, level);
    }

    public void addThreadField(String thread) {
        this.addField(LogFieldConstants.THREAD, thread);
    }

    public void addMessageField(String message) {
        this.addField(LogFieldConstants.MESSAGE, message);
    }

    public void addLocationField(String location) {
        this.addField(LogFieldConstants.LOCATION, location);
    }

    public void addThrowableField(String throwable) {
        this.addField(LogFieldConstants.THROWABLE, throwable);
    }

    public void addHostField(String host) {
        this.addField(LogFieldConstants.HOST, host);
    }

    public void addPortField(Integer port) {
        this.addField(LogFieldConstants.PORT, String.valueOf(port));
    }
}
