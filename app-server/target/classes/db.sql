CREATE DATABASE db;
----------------------------------------------------
-- Role
CREATE TABLE db.Role(
	role_id 	tinyint not null AUTO_INCREMENT,
    role_name 	varchar(30),
    PRIMARY KEY (role_id)
);
----------------------------------------------------
-- Users
CREATE TABLE db.Users(
	user_id			int not null AUTO_INCREMENT,	
	username		varchar(30) not null,
	password		varchar(30) not null,
    role_id     	tinyint not null,
	PRIMARY KEY (user_id),
    FOREIGN KEY (role_id) REFERENCES Role(role_id)
);
----------------------------------------------------
-- Staff
CREATE TABLE db.Staff(
	staff_id	        tinyint not null AUTO_INCREMENT,	
	firstname	        varchar(20),
	lastname	        varchar(20),
    date_of_birth		date,
	gender		        varchar(20),
    address             varchar(50),
    citizen_identity    varchar(13),
    phone               varchar(11),
    email               varchar(30),
    user_id             int,
	PRIMARY KEY (staff_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);
----------------------------------------------------
-- Dormitory
CREATE TABLE db.Dormitory(
	dorm_id				tinyint not null AUTO_INCREMENT,
	dorm_name			varchar(11),
    dorm_type			varchar(20),
	dorm_description	varchar(50),
    PRIMARY KEY (dorm_id)
);
----------------------------------------------------
-- Student
CREATE TABLE db.Student(
	student_id	        int not null AUTO_INCREMENT,	
	firstname	        varchar(20),
	lastname	        varchar(20),
    date_of_birth		date,
	gender		        varchar(20),
    address             varchar(50),
    student_code		varchar(7),
    faculty				varchar(20),
    school_year			varchar(11),
    citizen_identity    varchar(13),
    phone               varchar(11),
    email               varchar(30),
    user_id             int,
    dorm_id				tinyint,
	PRIMARY KEY (student_id),
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (dorm_id) REFERENCES Dormitory(dorm_id)
);   
----------------------------------------------------
-- Room
CREATE TABLE db.Room(
	room_id				smallint not null AUTO_INCREMENT,	
	room_name			varchar(11) not null,
    student_count		tinyint not null,
	room_description	varchar(50),
	price				int,
    dorm_id				tinyint,
    PRIMARY KEY (room_id),
    FOREIGN KEY (dorm_id) REFERENCES Dormitory(dorm_id)
);
----------------------------------------------------
-- Contract
CREATE TABLE db.Contract(
	contract_id	int not null AUTO_INCREMENT,
	start_date	date not null,
	end_date	date not null,
	student_id	int not null,
    room_id		smallint not null,
    staff_id 	tinyint not null,
    PRIMARY KEY (contract_id),
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (room_id) REFERENCES Room(room_id)
);
----------------------------------------------------
-- UtilityBill
CREATE TABLE db.Utility_Bill(
	utility_bill_id 		int not null AUTO_INCREMENT,
    billing_date        	date not null,
    start_date				date not null,
	end_date				date not null,
	electricity_previous	smallint,
    electricity_present		smallint,
    water_previous  		smallint,
    water_present   		smallint,
    electricity_price		int,
    water_price				int,
    total					int,
	room_id					smallint not null,
    PRIMARY KEY (utility_bill_id),
    FOREIGN KEY (room_id) REFERENCES Room(room_id)
);
----------------------------------------------------
-- Service
CREATE TABLE db.Service(
	service_id				tinyint not null AUTO_INCREMENT,	
	service_name			varchar(30),
	service_description		varchar(50),
    service_price			int,
    PRIMARY KEY (service_id)
);
----------------------------------------------------
-- Invoice
CREATE TABLE db.Invoice(
	invoice_id		int not null AUTO_INCREMENT,
	start_date		date,
	total			int,
	student_id		int,
    PRIMARY KEY (invoice_id),
    FOREIGN KEY (student_id) REFERENCES Student(student_id)
);
----------------------------------------------------
-- InvoiceDetail
CREATE TABLE db.Invoice_Detail(
	invoice_detail_id		int not null AUTO_INCREMENT,	
    quantity 				tinyint,
    price					int,
	invoice_id				int not null,	
    service_id				tinyint not null,
    PRIMARY KEY (invoice_detail_id),
    FOREIGN KEY (invoice_id) REFERENCES Invoice(invoice_id),
    FOREIGN KEY (service_id) REFERENCES Service(service_id)
);

----------------------------------------------------
INSERT INTO db.Role(role_id,role_name) value(1,'Nhân viên quản lý');
INSERT INTO db.Role(role_id,role_name) value(2,'Sinh viên');
---
INSERT INTO db.Users(user_id, username, password, role_id) value(1,603222,603222,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(2,603333,603333,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(3,603444,603444,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(4,603555,603555,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(5,603666,603666,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(6,603777,603777,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(7,603888,603888,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(8,603999,603999,2);
INSERT INTO db.Users(user_id, username, password, role_id) value(9,'nvchuyen','nvchuyen',1);
INSERT INTO db.Users(user_id, username, password, role_id) value(10,'hxhinh','hxhinh',1);
INSERT INTO db.Users(user_id, username, password, role_id) value(11,'ntvan','ntvan',1);
---
INSERT INTO db.Staff(staff_id, firstname, lastname, date_of_birth, gender, address, citizen_identity, phone, email, user_id) value(1,'Chuyên','Nguyễn Văn', '1990/06/09', 'Nam', 'Hà Nội', '123231221245', '0982719287', 'nvchuyen@gmail.com',9);
INSERT INTO db.Staff(staff_id, firstname, lastname, date_of_birth, gender, address, citizen_identity, phone, email, user_id) value(2,'Hinh','Hoàng Xuân', '1988/02/19', 'Nam', 'Phú Thọ', '123335554544', '0963511231', 'hxhinh@gmail.com',10);
INSERT INTO db.Staff(staff_id, firstname, lastname, date_of_birth, gender, address, citizen_identity, phone, email, user_id) value(3,'Vân','Nguyễn Thị', '1992/08/13', 'Nam', 'Hải Dương', '128231622423', '0921837131', 'ntvan@gmail.com',11);
---
INSERT INTO db.Dormitory(dorm_id, dorm_name, dorm_type, dorm_description) value(1,'Khu nhà A1', 'Nữ', 'Nhà dành cho nữ sinh');
INSERT INTO db.Dormitory(dorm_id, dorm_name, dorm_type, dorm_description) value(2,'Khu nhà A2', 'Nữ', 'Nhà dành cho nữ sinh');
INSERT INTO db.Dormitory(dorm_id, dorm_name, dorm_type, dorm_description) value(3,'Khu nhà B2', 'Nam', 'Nhà dành cho nam sinh');
INSERT INTO db.Dormitory(dorm_id, dorm_name, dorm_type, dorm_description) value(4,'Khu nhà C1', 'Nam', 'Nhà dành cho nam sinh');
---
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(1,'Dương','Tạ Văn', '2000/06/09', 'Nam', 'Hà Nội', '603222', 'Chăn nuôi', '2018-2022', '123132441245', '0923124547', 'tvduong@gmail.com', 1, 3);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(2,'Kiên','Phan Trung', '2000/06/02', 'Nam', 'Hà Nội', '603333', 'Chăn nuôi', '2018-2022', '123132311245', '0923124345', 'ptkien@gmail.com', 2, 3);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(3,'Hà','Nguyễn Thị', '2000/08/03', 'Nữ', 'Hà Nội', '603444', 'Công nghệ thông tin', '2018-2022', '123324351245', '0923124232', 'ntha@gmail.com', 3, 1);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(4,'Lệ','Nguyễn Nhật', '2000/06/02', 'Nữ', 'Hà Nội', '603555', 'Quản lý đất đai', '2018-2022', '123132312245', '0923357897', 'nnle@gmail.com', 4, 2);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(5,'Trung','Hoàng Văn', '2000/06/09', 'Nam', 'Hà Nội', '603666', 'Công nghệ thực phẩm', '2018-2022', '123123123245', '0923122322', 'hvtrungg@gmail.com', 5, 4);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(6,'Trang','Nguyễn Thị', '2000/06/02', 'Nữ', 'Hà Nội', '603777', 'Công nghệ thông tin', '2018-2022', '12312323123', '0923112355', 'nttrang@gmail.com', 6, 2);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(7,'Dũng','Trần Văn', '2000/06/09', 'Nam', 'Hà Nội', '603888', 'Cơ điện', '2018-2022', '123132323155', '0923123243', 'tvdung@gmail.com', 7, 3);
INSERT INTO db.Student(student_id, firstname, lastname, date_of_birth, gender, address, student_code, faculty, school_year, citizen_identity, phone, email, user_id, dorm_id) value(8,'Tiên','Ngô Thị Kiều', '2000/06/02', 'Nữ', 'Hà Nội', '603999', 'Thú y', '2018-2022', '123139863323', '0923124342', 'ntktien@gmail.com', 8, 1);
---
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(1,'A1P102', 4,'Phòng khép kín',400000, 1);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(2,'A1P103', 4,'Phòng khép kín',400000, 1);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(3,'A2P106', 6,'Phòng khép kín',300000, 2);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(4,'A2P107', 6,'Phòng khép kín',300000, 2);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(5,'B2P101', 4,'Phòng khép kín',600000, 3);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(6,'B2P102', 4,'Phòng khép kín',600000, 3);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(7,'C1P102', 4,'Phòng khép kín',400000, 4);
INSERT INTO db.room(room_id, room_name, student_count, room_description, price, dorm_id) value(8,'C1P103', 4,'Phòng khép kín',400000, 4);
---
INSERT INTO db.contract(contract_id, start_date, end_date, student_id, room_id, staff_id) value(1,'2018/09/15', '2019/03/15',3,3,1);
INSERT INTO db.contract(contract_id, start_date, end_date, student_id, room_id, staff_id) value(2,'2018/09/15', '2019/03/15',1,5,1);
INSERT INTO db.contract(contract_id, start_date, end_date, student_id, room_id, staff_id) value(3,'2018/09/15', '2019/03/15',6,3,2);
INSERT INTO db.contract(contract_id, start_date, end_date, student_id, room_id, staff_id) value(4,'2018/09/15', '2019/03/15',4,2,1);
INSERT INTO db.contract(contract_id, start_date, end_date, student_id, room_id, staff_id) value(5,'2018/09/15', '2019/03/15',7,7,2);