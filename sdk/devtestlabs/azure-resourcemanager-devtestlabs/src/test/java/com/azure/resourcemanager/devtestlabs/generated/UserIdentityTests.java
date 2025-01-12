// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.UserIdentity;
import org.junit.jupiter.api.Assertions;

public final class UserIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserIdentity model =
            BinaryData
                .fromString(
                    "{\"principalName\":\"tsttktlahbq\",\"principalId\":\"tx\",\"tenantId\":\"zukxitmmqtgqq\",\"objectId\":\"hrnxrxc\",\"appId\":\"uisavokq\"}")
                .toObject(UserIdentity.class);
        Assertions.assertEquals("tsttktlahbq", model.principalName());
        Assertions.assertEquals("tx", model.principalId());
        Assertions.assertEquals("zukxitmmqtgqq", model.tenantId());
        Assertions.assertEquals("hrnxrxc", model.objectId());
        Assertions.assertEquals("uisavokq", model.appId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserIdentity model =
            new UserIdentity()
                .withPrincipalName("tsttktlahbq")
                .withPrincipalId("tx")
                .withTenantId("zukxitmmqtgqq")
                .withObjectId("hrnxrxc")
                .withAppId("uisavokq");
        model = BinaryData.fromObject(model).toObject(UserIdentity.class);
        Assertions.assertEquals("tsttktlahbq", model.principalName());
        Assertions.assertEquals("tx", model.principalId());
        Assertions.assertEquals("zukxitmmqtgqq", model.tenantId());
        Assertions.assertEquals("hrnxrxc", model.objectId());
        Assertions.assertEquals("uisavokq", model.appId());
    }
}
