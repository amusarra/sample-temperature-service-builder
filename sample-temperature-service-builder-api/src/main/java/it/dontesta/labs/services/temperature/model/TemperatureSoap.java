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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link it.dontesta.labs.services.temperature.service.http.TemperatureServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TemperatureSoap implements Serializable {

	public static TemperatureSoap toSoapModel(Temperature model) {
		TemperatureSoap soapModel = new TemperatureSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTemperatureId(model.getTemperatureId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDeviceId(model.getDeviceId());
		soapModel.setValue(model.getValue());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static TemperatureSoap[] toSoapModels(Temperature[] models) {
		TemperatureSoap[] soapModels = new TemperatureSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TemperatureSoap[][] toSoapModels(Temperature[][] models) {
		TemperatureSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TemperatureSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TemperatureSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TemperatureSoap[] toSoapModels(List<Temperature> models) {
		List<TemperatureSoap> soapModels = new ArrayList<TemperatureSoap>(
			models.size());

		for (Temperature model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TemperatureSoap[soapModels.size()]);
	}

	public TemperatureSoap() {
	}

	public long getPrimaryKey() {
		return _temperatureId;
	}

	public void setPrimaryKey(long pk) {
		setTemperatureId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTemperatureId() {
		return _temperatureId;
	}

	public void setTemperatureId(long temperatureId) {
		_temperatureId = temperatureId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getDeviceId() {
		return _deviceId;
	}

	public void setDeviceId(String deviceId) {
		_deviceId = deviceId;
	}

	public int getValue() {
		return _value;
	}

	public void setValue(int value) {
		_value = value;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _temperatureId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _deviceId;
	private int _value;
	private int _status;

}