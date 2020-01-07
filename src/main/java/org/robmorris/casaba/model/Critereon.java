package org.robmorris.casaba.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Critereon {

    private int criteriaID;

    private int parentTaskID;

    private boolean isDone;

    private String critereonName;

    private String critereonDescription;
}
