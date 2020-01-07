package org.robmorris.casaba.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
public class Task {

    private int taskID;

    private int status;

    private String taskName;

    private String taskDescripion;

    private int taskCategory;

    private String owner;

    private String assignee;

    private Date started;

    private Date completed;

    private List<Critereon> criteria;

}
