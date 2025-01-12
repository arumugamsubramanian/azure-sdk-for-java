// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trino user plugin. */
@Fluent
public final class TrinoUserPlugin {
    /*
     * Denotes whether the plugin is active or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * This field maps to the sub-directory in trino plugins location, that will contain all the plugins under path.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Fully qualified path to the folder containing the plugins.
     */
    @JsonProperty(value = "path")
    private String path;

    /** Creates an instance of TrinoUserPlugin class. */
    public TrinoUserPlugin() {
    }

    /**
     * Get the enabled property: Denotes whether the plugin is active or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Denotes whether the plugin is active or not.
     *
     * @param enabled the enabled value to set.
     * @return the TrinoUserPlugin object itself.
     */
    public TrinoUserPlugin withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the name property: This field maps to the sub-directory in trino plugins location, that will contain all the
     * plugins under path.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: This field maps to the sub-directory in trino plugins location, that will contain all the
     * plugins under path.
     *
     * @param name the name value to set.
     * @return the TrinoUserPlugin object itself.
     */
    public TrinoUserPlugin withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the path property: Fully qualified path to the folder containing the plugins.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Fully qualified path to the folder containing the plugins.
     *
     * @param path the path value to set.
     * @return the TrinoUserPlugin object itself.
     */
    public TrinoUserPlugin withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
