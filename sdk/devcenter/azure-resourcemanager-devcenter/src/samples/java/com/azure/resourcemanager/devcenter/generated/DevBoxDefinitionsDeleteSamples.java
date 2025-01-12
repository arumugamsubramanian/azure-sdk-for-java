// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

/** Samples for DevBoxDefinitions Delete. */
public final class DevBoxDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/stable/2023-04-01/examples/DevBoxDefinitions_Delete.json
     */
    /**
     * Sample code: DevBoxDefinitions_Delete.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void devBoxDefinitionsDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.devBoxDefinitions().delete("rg1", "Contoso", "WebDevBox", com.azure.core.util.Context.NONE);
    }
}
