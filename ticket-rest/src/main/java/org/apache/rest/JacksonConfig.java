package org.apache.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * Created by bugg on 11/05/16.
 */
public class JacksonConfig extends ObjectMapper {

    public JacksonConfig() {
        this.enableDefaultTyping();
        this.registerModule(new Hibernate4Module());
    }
}
