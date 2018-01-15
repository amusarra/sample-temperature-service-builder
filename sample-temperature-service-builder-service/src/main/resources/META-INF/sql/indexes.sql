create index IX_F164A9B0 on DNTLABS_Temperature (deviceId[$COLUMN_LENGTH:75$]);
create index IX_DB0C4BDF on DNTLABS_Temperature (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_ACA43E21 on DNTLABS_Temperature (uuid_[$COLUMN_LENGTH:75$], groupId);