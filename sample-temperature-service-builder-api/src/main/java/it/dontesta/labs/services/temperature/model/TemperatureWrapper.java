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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Temperature}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Temperature
 * @generated
 */
public class TemperatureWrapper
	extends BaseModelWrapper<Temperature>
	implements ModelWrapper<Temperature>, Temperature {

	public TemperatureWrapper(Temperature temperature) {
		super(temperature);
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
		attributes.put("status", getStatus());

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

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the company ID of this temperature.
	 *
	 * @return the company ID of this temperature
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this temperature.
	 *
	 * @return the create date of this temperature
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the device ID of this temperature.
	 *
	 * @return the device ID of this temperature
	 */
	@Override
	public String getDeviceId() {
		return model.getDeviceId();
	}

	/**
	 * Returns the group ID of this temperature.
	 *
	 * @return the group ID of this temperature
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this temperature.
	 *
	 * @return the modified date of this temperature
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this temperature.
	 *
	 * @return the primary key of this temperature
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this temperature.
	 *
	 * @return the status of this temperature
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the temperature ID of this temperature.
	 *
	 * @return the temperature ID of this temperature
	 */
	@Override
	public long getTemperatureId() {
		return model.getTemperatureId();
	}

	/**
	 * Returns the user ID of this temperature.
	 *
	 * @return the user ID of this temperature
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this temperature.
	 *
	 * @return the user name of this temperature
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this temperature.
	 *
	 * @return the user uuid of this temperature
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this temperature.
	 *
	 * @return the uuid of this temperature
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the value of this temperature.
	 *
	 * @return the value of this temperature
	 */
	@Override
	public int getValue() {
		return model.getValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this temperature.
	 *
	 * @param companyId the company ID of this temperature
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this temperature.
	 *
	 * @param createDate the create date of this temperature
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the device ID of this temperature.
	 *
	 * @param deviceId the device ID of this temperature
	 */
	@Override
	public void setDeviceId(String deviceId) {
		model.setDeviceId(deviceId);
	}

	/**
	 * Sets the group ID of this temperature.
	 *
	 * @param groupId the group ID of this temperature
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this temperature.
	 *
	 * @param modifiedDate the modified date of this temperature
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this temperature.
	 *
	 * @param primaryKey the primary key of this temperature
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this temperature.
	 *
	 * @param status the status of this temperature
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the temperature ID of this temperature.
	 *
	 * @param temperatureId the temperature ID of this temperature
	 */
	@Override
	public void setTemperatureId(long temperatureId) {
		model.setTemperatureId(temperatureId);
	}

	/**
	 * Sets the user ID of this temperature.
	 *
	 * @param userId the user ID of this temperature
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this temperature.
	 *
	 * @param userName the user name of this temperature
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this temperature.
	 *
	 * @param userUuid the user uuid of this temperature
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this temperature.
	 *
	 * @param uuid the uuid of this temperature
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the value of this temperature.
	 *
	 * @param value the value of this temperature
	 */
	@Override
	public void setValue(int value) {
		model.setValue(value);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TemperatureWrapper wrap(Temperature temperature) {
		return new TemperatureWrapper(temperature);
	}

}