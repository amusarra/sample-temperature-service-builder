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

package it.dontesta.labs.services.temperature.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import it.dontesta.labs.services.temperature.model.Temperature;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Temperature in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TemperatureCacheModel
	implements CacheModel<Temperature>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TemperatureCacheModel)) {
			return false;
		}

		TemperatureCacheModel temperatureCacheModel =
			(TemperatureCacheModel)object;

		if (temperatureId == temperatureCacheModel.temperatureId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, temperatureId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", temperatureId=");
		sb.append(temperatureId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", deviceId=");
		sb.append(deviceId);
		sb.append(", value=");
		sb.append(value);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Temperature toEntityModel() {
		TemperatureImpl temperatureImpl = new TemperatureImpl();

		if (uuid == null) {
			temperatureImpl.setUuid("");
		}
		else {
			temperatureImpl.setUuid(uuid);
		}

		temperatureImpl.setTemperatureId(temperatureId);
		temperatureImpl.setGroupId(groupId);
		temperatureImpl.setCompanyId(companyId);
		temperatureImpl.setUserId(userId);

		if (userName == null) {
			temperatureImpl.setUserName("");
		}
		else {
			temperatureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			temperatureImpl.setCreateDate(null);
		}
		else {
			temperatureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			temperatureImpl.setModifiedDate(null);
		}
		else {
			temperatureImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (deviceId == null) {
			temperatureImpl.setDeviceId("");
		}
		else {
			temperatureImpl.setDeviceId(deviceId);
		}

		temperatureImpl.setValue(value);
		temperatureImpl.setStatus(status);

		temperatureImpl.resetOriginalValues();

		return temperatureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		temperatureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		deviceId = objectInput.readUTF();

		value = objectInput.readInt();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(temperatureId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (deviceId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deviceId);
		}

		objectOutput.writeInt(value);

		objectOutput.writeInt(status);
	}

	public String uuid;
	public long temperatureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String deviceId;
	public int value;
	public int status;

}