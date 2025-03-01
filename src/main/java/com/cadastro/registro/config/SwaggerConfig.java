package com.cadastro.registro.config;

import org.springdoc.core.models.GroupedOpenApi;

public class SwaggerConfig {

    public GroupedOpenApi publicApic(){
        return GroupedOpenApi.builder().group("public").pathsToMatch("/swagger").build();
    }
}
