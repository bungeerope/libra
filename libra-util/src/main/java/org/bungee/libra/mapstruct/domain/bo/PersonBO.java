package org.bungee.libra.mapstruct.domain.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gongtai
 */
@Data
public class PersonBO implements Serializable {

    private static final long serialVersionUID = 8005612970210429118L;
    private String uid;
    private String userName;
}
