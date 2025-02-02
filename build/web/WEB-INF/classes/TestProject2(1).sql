Insert into Roles (RoleType)
values ('Admin'),('Buyer'),('Seller'),('Shipper')

Select * from Roles

Insert into Users(UserName, UserPass, UserAddress, UserEmail, UserStatus, RoleID, PhoneNumber)
values ('Admin1','123',N'Tổ 22 Khuê Mỹ','nguyennv2107@gmail.com','1','1','0903210704')



ALTER TABLE Users
ADD PhoneNumber Nvarchar(10);

Select *from Users

Select *from Users Where UserName = 'Admin1' and UserPass = '123'

Update Users
set UserName ='admin1' where UserID=1

DBCC CHECKIDENT ('Users', RESEED, 0);
Delete from Users where UserID = 1