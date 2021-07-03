package com.zhou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Analysis {
    private Integer id;
    private Integer time;
    private String event;
    private Integer num;
}
