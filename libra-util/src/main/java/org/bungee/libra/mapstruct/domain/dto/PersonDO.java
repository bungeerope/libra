package org.bungee.libra.mapstruct.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gongtai
 */
@Data
public class PersonDO implements Serializable {

    private static final long serialVersionUID = 1237259453208965964L;
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
}
