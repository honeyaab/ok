package com;

import lombok.Data;

import java.io.Serializable;

/**
 * @author:Zbei
 * @date:2020.03.11 11:41
 */
@Data
public class Student implements Serializable {
    static final long serialVersionUID=1L;
    private String name;
    private int age;
}
