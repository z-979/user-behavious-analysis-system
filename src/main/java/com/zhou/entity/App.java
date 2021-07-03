package com.zhou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class App {
    private Integer id;
    private Integer time;
    private String content;
    private Integer sex;
    private Integer num;
    private Integer ratio;
}
