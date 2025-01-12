// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerregistry.models.OperationServiceSpecificationDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The definition of Azure Monitoring properties. */
@Fluent
public final class OperationPropertiesDefinition {
    /*
     * The definition of Azure Monitoring service.
     */
    @JsonProperty(value = "serviceSpecification")
    private OperationServiceSpecificationDefinition serviceSpecification;

    /** Creates an instance of OperationPropertiesDefinition class. */
    public OperationPropertiesDefinition() {
    }

    /**
     * Get the serviceSpecification property: The definition of Azure Monitoring service.
     *
     * @return the serviceSpecification value.
     */
    public OperationServiceSpecificationDefinition serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: The definition of Azure Monitoring service.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the OperationPropertiesDefinition object itself.
     */
    public OperationPropertiesDefinition withServiceSpecification(
        OperationServiceSpecificationDefinition serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}
