// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VMSkuListResultInner;
import org.junit.jupiter.api.Test;

public final class VMSkuListResultInnerTests {
    @Test
    public void testDeserialize() {
        VMSkuListResultInner model =
            BinaryData
                .fromString(
                    "{\"vmSKUs\":[\"sjswsrms\",\"yzrpzbchckqqzq\"],\"id\":\"xiy\",\"name\":\"iizynkedyatrwyh\",\"type\":\"ibzyhwitsmyp\"}")
                .toObject(VMSkuListResultInner.class);
    }

    @Test
    public void testSerialize() {
        VMSkuListResultInner model = new VMSkuListResultInner();
        model = BinaryData.fromObject(model).toObject(VMSkuListResultInner.class);
    }
}