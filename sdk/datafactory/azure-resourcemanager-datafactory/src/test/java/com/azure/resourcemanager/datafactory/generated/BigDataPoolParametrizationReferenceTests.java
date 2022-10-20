// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class BigDataPoolParametrizationReferenceTests {
    @Test
    public void testDeserialize() {
        BigDataPoolParametrizationReference model =
            BinaryData
                .fromString("{\"type\":\"BigDataPoolReference\"}")
                .toObject(BigDataPoolParametrizationReference.class);
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.type());
    }

    @Test
    public void testSerialize() {
        BigDataPoolParametrizationReference model =
            new BigDataPoolParametrizationReference().withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE);
        model = BinaryData.fromObject(model).toObject(BigDataPoolParametrizationReference.class);
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.type());
    }
}