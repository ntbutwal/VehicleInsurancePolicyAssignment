create database VehicleInsurance;
use VehicleInsurance;
create table Policy(
id bigint not null auto_increment primary key,
Type varchar(50) not null,
Policy_No varchar(50) not null,
Start_Date date not null,
Expiry_date date not null,
Customer_Id bigint not null,
Is_Active boolean,
foreign key(Customer_Id) references Customer(id)
);

create table Customer(
id bigint not null auto_increment primary key,
Primary_Holder_Name varchar(100) not null,
License_No varchar(40) not null,
Email varchar(100) not null,
Phone varchar(20) not null,
Gender varchar(20),
Last_four_Digit_SSN varchar(10) not null,
Date_of_Birth date not null
);

create table Address(
id bigint not null auto_increment primary key,
Street_Line1 varchar(100) not null,
Street_Line2 varchar(100),
City varchar(40),
State varchar(50),
Zip varchar(10),
Customer_Id bigint not null,
foreign key(Customer_Id) references Customer(id)
);

create table Additional_Drivers(
id bigint not null auto_increment primary key,
Additional_Drive_Name varchar(100) not null,
License_No varchar(40) not null,
Issued_State varchar(20) not null,
Is_Active boolean,
Policy_Id bigint not null,
foreign key(Policy_Id) references Policy(id)
);

create table Covered_Vehicle(
id bigint not null auto_increment primary key,
VIN varchar(50) not null,
Make varchar(40) not null,
Model varchar(40) not null,
Year varchar(10) not null,
Is_Active boolean,
Policy_Id bigint not null,
foreign keyAdditional_Drivers(Policy_Id) references Policy(id)
);

