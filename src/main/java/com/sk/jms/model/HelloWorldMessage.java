package com.sk.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorldMessage  implements Serializable {

    static final long  serialVersionUID = -9149930194082554329L;
    private UUID id;
    private String message;
}
