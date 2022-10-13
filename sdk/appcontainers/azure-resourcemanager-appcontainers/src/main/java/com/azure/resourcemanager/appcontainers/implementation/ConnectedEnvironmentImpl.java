// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironment;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentProvisioningState;
import com.azure.resourcemanager.appcontainers.models.CustomDomainConfiguration;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocation;
import java.util.Collections;
import java.util.Map;

public final class ConnectedEnvironmentImpl
    implements ConnectedEnvironment, ConnectedEnvironment.Definition, ConnectedEnvironment.Update {
    private ConnectedEnvironmentInner innerObject;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ConnectedEnvironmentProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String deploymentErrors() {
        return this.innerModel().deploymentErrors();
    }

    public String defaultDomain() {
        return this.innerModel().defaultDomain();
    }

    public String staticIp() {
        return this.innerModel().staticIp();
    }

    public String daprAIConnectionString() {
        return this.innerModel().daprAIConnectionString();
    }

    public CustomDomainConfiguration customDomainConfiguration() {
        return this.innerModel().customDomainConfiguration();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ConnectedEnvironmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String connectedEnvironmentName;

    public ConnectedEnvironmentImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ConnectedEnvironment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .createOrUpdate(resourceGroupName, connectedEnvironmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConnectedEnvironment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .createOrUpdate(resourceGroupName, connectedEnvironmentName, this.innerModel(), context);
        return this;
    }

    ConnectedEnvironmentImpl(
        String name, com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = new ConnectedEnvironmentInner();
        this.serviceManager = serviceManager;
        this.connectedEnvironmentName = name;
    }

    public ConnectedEnvironmentImpl update() {
        return this;
    }

    public ConnectedEnvironment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .createOrUpdate(resourceGroupName, connectedEnvironmentName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConnectedEnvironment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .createOrUpdate(resourceGroupName, connectedEnvironmentName, this.innerModel(), context);
        return this;
    }

    ConnectedEnvironmentImpl(
        ConnectedEnvironmentInner innerObject,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.connectedEnvironmentName = Utils.getValueFromIdByName(innerObject.id(), "connectedEnvironments");
    }

    public ConnectedEnvironment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, connectedEnvironmentName, Context.NONE)
                .getValue();
        return this;
    }

    public ConnectedEnvironment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConnectedEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, connectedEnvironmentName, context)
                .getValue();
        return this;
    }

    public ConnectedEnvironmentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConnectedEnvironmentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConnectedEnvironmentImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ConnectedEnvironmentImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public ConnectedEnvironmentImpl withStaticIp(String staticIp) {
        this.innerModel().withStaticIp(staticIp);
        return this;
    }

    public ConnectedEnvironmentImpl withDaprAIConnectionString(String daprAIConnectionString) {
        this.innerModel().withDaprAIConnectionString(daprAIConnectionString);
        return this;
    }

    public ConnectedEnvironmentImpl withCustomDomainConfiguration(CustomDomainConfiguration customDomainConfiguration) {
        this.innerModel().withCustomDomainConfiguration(customDomainConfiguration);
        return this;
    }
}