package com.icss.domain;

import lombok.Data;
import lombok.ToString;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Data
@ToString
@Table(name="user")
public class User  implements Serializable {
    //主键
    @Id
    private Integer id;
    private String emailphone;
    private String password;



}