create table DNTLABS_Temperature (
	uuid_ VARCHAR(75) null,
	temperatureId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deviceId VARCHAR(75) null,
	value INTEGER,
	status INTEGER
);