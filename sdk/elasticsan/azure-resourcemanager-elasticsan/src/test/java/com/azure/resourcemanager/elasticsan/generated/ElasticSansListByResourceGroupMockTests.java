// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.ElasticSan;
import com.azure.resourcemanager.elasticsan.models.SkuName;
import com.azure.resourcemanager.elasticsan.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ElasticSansListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"sku\":{\"name\":\"Premium_LRS\",\"tier\":\"Premium\"},\"availabilityZones\":[\"mnubexkpzksmond\",\"mquxvypo\",\"gkopkwhojvpajqgx\",\"smocmbq\"],\"provisioningState\":\"Failed\",\"baseSizeTiB\":2080717942090846717,\"extendedCapacitySizeTiB\":4393936245762938181,\"totalVolumeSizeGiB\":9205614201426151802,\"volumeGroupCount\":5899001695027882086,\"totalIops\":8877607325390723490,\"totalMBps\":4333811039870085147,\"totalSizeTiB\":3216178139310379008,\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"groupIds\":[\"cuejrjxgci\",\"ibrhosxsdqr\",\"zoymibmrqyibahw\"]},\"id\":\"uszdtmhrkwof\",\"name\":\"yvoqa\",\"type\":\"piexpbtgiw\"}]},\"location\":\"oenwashr\",\"tags\":{\"ulpiuj\":\"kcnqxwbpo\",\"obyu\":\"aasipqi\"},\"id\":\"erpqlpqwcciuqg\",\"name\":\"dbutauvfbtkuwhh\",\"type\":\"hykojoxafnndlpic\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ElasticSan> response =
            manager.elasticSans().listByResourceGroup("rfouyftaakcpw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("oenwashr", response.iterator().next().location());
        Assertions.assertEquals("kcnqxwbpo", response.iterator().next().tags().get("ulpiuj"));
        Assertions.assertEquals(SkuName.PREMIUM_LRS, response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, response.iterator().next().sku().tier());
        Assertions.assertEquals("mnubexkpzksmond", response.iterator().next().availabilityZones().get(0));
        Assertions.assertEquals(2080717942090846717L, response.iterator().next().baseSizeTiB());
        Assertions.assertEquals(4393936245762938181L, response.iterator().next().extendedCapacitySizeTiB());
    }
}
