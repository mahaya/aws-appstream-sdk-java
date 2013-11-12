/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.appstream;


public class CreateApplicationInput {

    //-------------------------------------------------------------
    // Variables - Private
    //-------------------------------------------------------------

    private String name;
    private String description;
    private String installS3Bucket;
    private String installCommand;
    private String launchCommand;


    //-------------------------------------------------------------
    // Constructors
    //-------------------------------------------------------------

    public CreateApplicationInput() {
    }


    public CreateApplicationInput(String name, String description, String installS3Bucket,
                                  String installCommand, String launchCommand) {
        this.name = name;
        this.description = description;
        this.installS3Bucket = installS3Bucket;
        this.installCommand = installCommand;
        this.launchCommand = launchCommand;
    }


    //-------------------------------------------------------------
    // Methods - Getter/Setter
    //-------------------------------------------------------------

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getInstallS3Bucket() {
        return installS3Bucket;
    }


    public void setInstallS3Bucket(String installS3Bucket) {
        this.installS3Bucket = installS3Bucket;
    }


    public String getInstallCommand() {
        return installCommand;
    }


    public void setInstallCommand(String installCommand) {
        this.installCommand = installCommand;
    }


    public String getLaunchCommand() {
        return launchCommand;
    }


    public void setLaunchCommand(String launchCommand) {
        this.launchCommand = launchCommand;
    }
}
