/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Amazon Device Messaging channel definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ADMChannelResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ADMChannelResponse implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the application to which the channel applies. */
    private String applicationId;
    /** The date and time when this channel was created. */
    private String creationDate;
    /** Indicates whether or not the channel is enabled for sending messages. */
    private Boolean enabled;
    /** Not used. Retained for backwards compatibility. */
    private Boolean hasCredential;
    /** (Deprecated) An identifier for the channel. Retained for backwards compatibility. */
    private String id;
    /** Indicates whether or not the channel is archived. */
    private Boolean isArchived;
    /** The user who last updated this channel. */
    private String lastModifiedBy;
    /** The date and time when this channel was last modified. */
    private String lastModifiedDate;
    /** The platform type. For this channel, the value is always "ADM." */
    private String platform;
    /** The channel version. */
    private Integer version;

    /**
     * The ID of the application to which the channel applies.
     * 
     * @param applicationId
     *        The ID of the application to which the channel applies.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The ID of the application to which the channel applies.
     * 
     * @return The ID of the application to which the channel applies.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The ID of the application to which the channel applies.
     * 
     * @param applicationId
     *        The ID of the application to which the channel applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The date and time when this channel was created.
     * 
     * @param creationDate
     *        The date and time when this channel was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The date and time when this channel was created.
     * 
     * @return The date and time when this channel was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * The date and time when this channel was created.
     * 
     * @param creationDate
     *        The date and time when this channel was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @param enabled
     *        Indicates whether or not the channel is enabled for sending messages.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @return Indicates whether or not the channel is enabled for sending messages.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @param enabled
     *        Indicates whether or not the channel is enabled for sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @return Indicates whether or not the channel is enabled for sending messages.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     */

    public void setHasCredential(Boolean hasCredential) {
        this.hasCredential = hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean getHasCredential() {
        return this.hasCredential;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @param hasCredential
     *        Not used. Retained for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withHasCredential(Boolean hasCredential) {
        setHasCredential(hasCredential);
        return this;
    }

    /**
     * Not used. Retained for backwards compatibility.
     * 
     * @return Not used. Retained for backwards compatibility.
     */

    public Boolean isHasCredential() {
        return this.hasCredential;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     * 
     * @param id
     *        (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     * 
     * @return (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     */

    public String getId() {
        return this.id;
    }

    /**
     * (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     * 
     * @param id
     *        (Deprecated) An identifier for the channel. Retained for backwards compatibility.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Indicates whether or not the channel is archived.
     * 
     * @param isArchived
     *        Indicates whether or not the channel is archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * Indicates whether or not the channel is archived.
     * 
     * @return Indicates whether or not the channel is archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * Indicates whether or not the channel is archived.
     * 
     * @param isArchived
     *        Indicates whether or not the channel is archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * Indicates whether or not the channel is archived.
     * 
     * @return Indicates whether or not the channel is archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * The user who last updated this channel.
     * 
     * @param lastModifiedBy
     *        The user who last updated this channel.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * The user who last updated this channel.
     * 
     * @return The user who last updated this channel.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * The user who last updated this channel.
     * 
     * @param lastModifiedBy
     *        The user who last updated this channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * The date and time when this channel was last modified.
     * 
     * @param lastModifiedDate
     *        The date and time when this channel was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date and time when this channel was last modified.
     * 
     * @return The date and time when this channel was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date and time when this channel was last modified.
     * 
     * @param lastModifiedDate
     *        The date and time when this channel was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     * 
     * @param platform
     *        The platform type. For this channel, the value is always "ADM."
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     * 
     * @return The platform type. For this channel, the value is always "ADM."
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * The platform type. For this channel, the value is always "ADM."
     * 
     * @param platform
     *        The platform type. For this channel, the value is always "ADM."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * The channel version.
     * 
     * @param version
     *        The channel version.
     */

    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * The channel version.
     * 
     * @return The channel version.
     */

    public Integer getVersion() {
        return this.version;
    }

    /**
     * The channel version.
     * 
     * @param version
     *        The channel version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelResponse withVersion(Integer version) {
        setVersion(version);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getHasCredential() != null)
            sb.append("HasCredential: ").append(getHasCredential()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ADMChannelResponse == false)
            return false;
        ADMChannelResponse other = (ADMChannelResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getHasCredential() == null ^ this.getHasCredential() == null)
            return false;
        if (other.getHasCredential() != null && other.getHasCredential().equals(this.getHasCredential()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getHasCredential() == null) ? 0 : getHasCredential().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ADMChannelResponse clone() {
        try {
            return (ADMChannelResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ADMChannelResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
