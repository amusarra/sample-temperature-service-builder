/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.dontesta.labs.services.temperature.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Temperature}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Temperature
 * @generated
 */
@ProviderType
public class TemperatureWrapper implements Temperature,
	ModelWrapper<Temperature> {
	public TemperatureWrapper(Temperature temperature) {
		_temperature = temperature;
	}

	@Override
	public Class<?> getModelClass() {
		return Temperature.class;
	}

	@Override
	public String getModelClassName() {
		return Temperature.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("temperatureId", getTemperatureId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("deviceId", getDeviceId());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long temperatureId = (Long)attributes.get("temperatureId");

		if (temperatureId != null) {
			setTemperatureId(temperatureId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String deviceId = (String)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Integer value = (Integer)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _temperature.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _temperature.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _temperature.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _temperature.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<it.dontesta.labs.services.temperature.model.Temperature> toCacheModel() {
		return _temperature.toCacheModel();
	}

	@Override
	public int compareTo(
		it.dontesta.labs.services.temperature.model.Temperature temperature) {
		return _temperature.compareTo(temperature);
	}

	/**
	* Returns the value of this temperature.
	*
	* @return the value of this temperature
	*/
	@Override
	public int getValue() {
		return _temperature.getValue();
	}

	@Override
	public int hashCode() {
		return _temperature.hashCode();
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature toEscapedModel() {
		return new TemperatureWrapper(_temperature.toEscapedModel());
	}

	@Override
	public it.dontesta.labs.services.temperature.model.Temperature toUnescapedModel() {
		return new TemperatureWrapper(_temperature.toUnescapedModel());
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _temperature.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TemperatureWrapper((Temperature)_temperature.clone());
	}

	/**
	* Returns the device ID of this temperature.
	*
	* @return the device ID of this temperature
	*/
	@Override
	public java.lang.String getDeviceId() {
		return _temperature.getDeviceId();
	}

	/**
	* Returns the user name of this temperature.
	*
	* @return the user name of this temperature
	*/
	@Override
	public java.lang.String getUserName() {
		return _temperature.getUserName();
	}

	/**
	* Returns the user uuid of this temperature.
	*
	* @return the user uuid of this temperature
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _temperature.getUserUuid();
	}

	/**
	* Returns the uuid of this temperature.
	*
	* @return the uuid of this temperature
	*/
	@Override
	public java.lang.String getUuid() {
		return _temperature.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _temperature.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _temperature.toXmlString();
	}

	/**
	* Returns the create date of this temperature.
	*
	* @return the create date of this temperature
	*/
	@Override
	public Date getCreateDate() {
		return _temperature.getCreateDate();
	}

	/**
	* Returns the modified date of this temperature.
	*
	* @return the modified date of this temperature
	*/
	@Override
	public Date getModifiedDate() {
		return _temperature.getModifiedDate();
	}

	/**
	* Returns the company ID of this temperature.
	*
	* @return the company ID of this temperature
	*/
	@Override
	public long getCompanyId() {
		return _temperature.getCompanyId();
	}

	/**
	* Returns the group ID of this temperature.
	*
	* @return the group ID of this temperature
	*/
	@Override
	public long getGroupId() {
		return _temperature.getGroupId();
	}

	/**
	* Returns the primary key of this temperature.
	*
	* @return the primary key of this temperature
	*/
	@Override
	public long getPrimaryKey() {
		return _temperature.getPrimaryKey();
	}

	/**
	* Returns the temperature ID of this temperature.
	*
	* @return the temperature ID of this temperature
	*/
	@Override
	public long getTemperatureId() {
		return _temperature.getTemperatureId();
	}

	/**
	* Returns the user ID of this temperature.
	*
	* @return the user ID of this temperature
	*/
	@Override
	public long getUserId() {
		return _temperature.getUserId();
	}

	@Override
	public void persist() {
		_temperature.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_temperature.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this temperature.
	*
	* @param companyId the company ID of this temperature
	*/
	@Override
	public void setCompanyId(long companyId) {
		_temperature.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this temperature.
	*
	* @param createDate the create date of this temperature
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_temperature.setCreateDate(createDate);
	}

	/**
	* Sets the device ID of this temperature.
	*
	* @param deviceId the device ID of this temperature
	*/
	@Override
	public void setDeviceId(java.lang.String deviceId) {
		_temperature.setDeviceId(deviceId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_temperature.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_temperature.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_temperature.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this temperature.
	*
	* @param groupId the group ID of this temperature
	*/
	@Override
	public void setGroupId(long groupId) {
		_temperature.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this temperature.
	*
	* @param modifiedDate the modified date of this temperature
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_temperature.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_temperature.setNew(n);
	}

	/**
	* Sets the primary key of this temperature.
	*
	* @param primaryKey the primary key of this temperature
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_temperature.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_temperature.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the temperature ID of this temperature.
	*
	* @param temperatureId the temperature ID of this temperature
	*/
	@Override
	public void setTemperatureId(long temperatureId) {
		_temperature.setTemperatureId(temperatureId);
	}

	/**
	* Sets the user ID of this temperature.
	*
	* @param userId the user ID of this temperature
	*/
	@Override
	public void setUserId(long userId) {
		_temperature.setUserId(userId);
	}

	/**
	* Sets the user name of this temperature.
	*
	* @param userName the user name of this temperature
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_temperature.setUserName(userName);
	}

	/**
	* Sets the user uuid of this temperature.
	*
	* @param userUuid the user uuid of this temperature
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_temperature.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this temperature.
	*
	* @param uuid the uuid of this temperature
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_temperature.setUuid(uuid);
	}

	/**
	* Sets the value of this temperature.
	*
	* @param value the value of this temperature
	*/
	@Override
	public void setValue(int value) {
		_temperature.setValue(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TemperatureWrapper)) {
			return false;
		}

		TemperatureWrapper temperatureWrapper = (TemperatureWrapper)obj;

		if (Objects.equals(_temperature, temperatureWrapper._temperature)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _temperature.getStagedModelType();
	}

	@Override
	public Temperature getWrappedModel() {
		return _temperature;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _temperature.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _temperature.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_temperature.resetOriginalValues();
	}

	private final Temperature _temperature;
}