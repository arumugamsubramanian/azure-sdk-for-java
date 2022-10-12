// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProviderOperationDisplay;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProviderOperationList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceProviderOperationListTests {
    @Test
    public void testDeserialize() {
        ResourceProviderOperationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"isDataAction\":\"cdpu\",\"name\":\"zgmwznmabikns\",\"display\":{\"provider\":\"jhxbld\",\"resource\":\"wwrlkdmtncv\",\"operation\":\"otllxdyhgsyo\",\"description\":\"gjltdtbnnhado\"}},{\"isDataAction\":\"rkvcikhnvpa\",\"name\":\"gxqquezik\",\"display\":{\"provider\":\"gxk\",\"resource\":\"la\",\"operation\":\"elwuipi\",\"description\":\"jzkzi\"}},{\"isDataAction\":\"vvcnayr\",\"name\":\"rnxxmueed\",\"display\":{\"provider\":\"dvstkw\",\"resource\":\"tchealmf\",\"operation\":\"d\",\"description\":\"ygdvwv\"}}],\"nextLink\":\"iohgwxrtfud\"}")
                .toObject(ResourceProviderOperationList.class);
        Assertions.assertEquals("cdpu", model.value().get(0).isDataAction());
        Assertions.assertEquals("zgmwznmabikns", model.value().get(0).name());
        Assertions.assertEquals("jhxbld", model.value().get(0).display().provider());
        Assertions.assertEquals("wwrlkdmtncv", model.value().get(0).display().resource());
        Assertions.assertEquals("otllxdyhgsyo", model.value().get(0).display().operation());
        Assertions.assertEquals("gjltdtbnnhado", model.value().get(0).display().description());
        Assertions.assertEquals("iohgwxrtfud", model.nextLink());
    }

    @Test
    public void testSerialize() {
        ResourceProviderOperationList model =
            new ResourceProviderOperationList()
                .withValue(
                    Arrays
                        .asList(
                            new ResourceProviderOperationInner()
                                .withIsDataAction("cdpu")
                                .withName("zgmwznmabikns")
                                .withDisplay(
                                    new ResourceProviderOperationDisplay()
                                        .withProvider("jhxbld")
                                        .withResource("wwrlkdmtncv")
                                        .withOperation("otllxdyhgsyo")
                                        .withDescription("gjltdtbnnhado")),
                            new ResourceProviderOperationInner()
                                .withIsDataAction("rkvcikhnvpa")
                                .withName("gxqquezik")
                                .withDisplay(
                                    new ResourceProviderOperationDisplay()
                                        .withProvider("gxk")
                                        .withResource("la")
                                        .withOperation("elwuipi")
                                        .withDescription("jzkzi")),
                            new ResourceProviderOperationInner()
                                .withIsDataAction("vvcnayr")
                                .withName("rnxxmueed")
                                .withDisplay(
                                    new ResourceProviderOperationDisplay()
                                        .withProvider("dvstkw")
                                        .withResource("tchealmf")
                                        .withOperation("d")
                                        .withDescription("ygdvwv"))))
                .withNextLink("iohgwxrtfud");
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationList.class);
        Assertions.assertEquals("cdpu", model.value().get(0).isDataAction());
        Assertions.assertEquals("zgmwznmabikns", model.value().get(0).name());
        Assertions.assertEquals("jhxbld", model.value().get(0).display().provider());
        Assertions.assertEquals("wwrlkdmtncv", model.value().get(0).display().resource());
        Assertions.assertEquals("otllxdyhgsyo", model.value().get(0).display().operation());
        Assertions.assertEquals("gjltdtbnnhado", model.value().get(0).display().description());
        Assertions.assertEquals("iohgwxrtfud", model.nextLink());
    }
}