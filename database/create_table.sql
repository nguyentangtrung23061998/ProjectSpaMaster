create table customer(
	customerid bigint not null primary key auto_increment,
    username varchar(255) not NULL,
    password varchar(255) not NULL,
    email varchar(50) null,
    telephone varchar(50) null,
    token varchar(400) not null,
    createddate TIMESTAMP NULL,
    modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL,
	employeeid bigint not null
);
create table gallery(
	id bigint not null primary key auto_increment,
    imagepath varchar(255) not null,
    content varchar(255) null,
    storekeeperid bigint not null
);
create table employee(
	employeeid bigint not null primary key auto_increment,
	fullname nvarchar(255) not null,
	email varchar(50) not null,
    telephone varchar(50) not null,
    sex bit not null,
    address nvarchar(255) null,
    createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL,
	storeid bigint not null
);

create table service(
	serviceid bigint not null primary key auto_increment,
    nameservice varchar(255)  not null,
    minutes int not null,
    price int not null,
    description nvarchar(255) not null,
    createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL
);

create table booking(
	bookingid bigint not null primary key auto_increment,
    bookingdate timestamp not null,
    minutes int not null,
    price int not null,
    discount int not null,
    starttime int not null,
    endtime int not null,
    createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL,
    storeid bigint not null,
	serviceid bigint not null,
    employeeid bigint not null,
    customerid bigint not null,
    bookingstatusid bigint not null
);

create table bookingstatus(
	bookingstatusid bigint not null primary key auto_increment,
    bookingstatuscode nvarchar(50) not null,
    createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL
);

create table storekeeper(
	storekeeperid bigint not null primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(50) not null,
    fullname nvarchar(255) not null,
    telephone varchar(50) not null,
    token varchar(400) not null,
	createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL
);
create table store(
	storeid bigint not null primary key auto_increment,
    address nvarchar(255) not null,
    description nvarchar(255) not null,
    opentime int not null, 
    closetime int not null,
    createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL
);
create table employe_service(
	employe_serviceid bigint not null primary key auto_increment,
    employeeid bigint not null,
    serviceid bigint not null,
	createddate TIMESTAMP NULL,
	modifieddate TIMESTAMP NULL,
	createdby VARCHAR(255) NULL,
	modifiedby VARCHAR(255) NULL
);
/*alter table*/	
/*customer*/
alter table customer add foreign key(employeeid) references employee(employeeid);
/*employee*/
alter table employee add foreign key(storeid) references store(storeid);
/*booking*/
alter table booking add foreign key(storeid) references store(storeid);
alter table booking add foreign key(serviceid) references service(serviceid);
alter table booking add foreign key(employeeid) references employee(employeeid);
alter table booking add foreign key(customerid) references customer(customerid);
alter table booking add foreign key(bookingstatusid) references bookingstatus(bookingstatusid);
/*store keeper*/
alter table storekeeper add storeid bigint not null;
alter table storekeeper add foreign key(storeid) references store(storeid);
/*employee service*/
alter table employe_service add foreign key(employeeid) references employee(employeeid);
alter table employe_service add foreign key(serviceid) references service(serviceid);