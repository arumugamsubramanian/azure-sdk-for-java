// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecureScoreControlDefinitions List. */
public final class SecureScoreControlDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/secureScoreControlDefinitions/ListSecureScoreControlDefinitions_example.json
     */
    /**
     * Sample code: List security controls definition.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityControlsDefinition(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.secureScoreControlDefinitions().list(Context.NONE);
    }
}