Create table Roles(
RoleID int Primary key identity(1,1),
RoleType Nvarchar(50)
)

Create table Users(
UserID int Primary key identity(1,1),
UserName Nvarchar(50),
UserPass Nvarchar(255),
UserEmail Nvarchar(255),
UserAddress Nvarchar(255),
UserStatus int,
UserIMG Nvarchar(255),
RoleID int,
CreateDate Datetime default getdate()
Foreign key (RoleID) references Roles(RoleID)
)

Create table Reports(
ReportID int Primary key identity(1,1),
ReporterID int,
ReportedID int,
ReportDetails Nvarchar(255),
CreateDate Datetime default getdate()
Foreign key (ReporterID) References Users(UserID),
Foreign key (ReportedID) References Users(UserID)
)

Create table BanStatus(
UserID int,
AdminID int,
CreateDate Datetime default getdate(),
Foreign key (UserID) References Users(UserID),
Foreign key (AdminID) References Users(UserID)
)

Create table Orders(
OrderID int Primary key identity(1,1),
BuyerID int,
OrderStatus Nvarchar(50),
CreateDate Datetime default getDate(),
Foreign key (BuyerID) References Users(UserID)
)

Create table Payments(
PaymentID int Primary key identity(1,1),
OrderID int,
PaymentAmount Float,
PaymentMethod Nvarchar(50),
PaymentStatus Nvarchar(50),
CreateDate Datetime default getdate(),
Foreign key (OrderID) References Orders(OrderID)
)


Create table Shipments(
ShipmentID int Primary key identity(1,1),
ShipperID int,
OrderID int,
ShipmentAddress Nvarchar(255),
ShipmentPrice Float,
ShipmentStatus Nvarchar(50),
CreateDate Datetime default getDate()
Foreign key (ShipperID) References Users(UserID),
Foreign key (OrderID) References Orders(OrderID)
)

Create table ProductTypes(
ProductTypeID int Primary key identity(1,1),
ProductType Nvarchar(50)
)

Create table Products(
ProductID int Primary key identity(1,1),
SellerID int,
ProductTypeID int,
ProductName Nvarchar(50),
ProductPrice Float,
ProductTitle Nvarchar(100),
ProductDescription text,
ProductQuantity int,
ProductStatus Nvarchar(50),
FarmingMethod Nvarchar(50),
HarvestDate Datetime,
ExpiryDate Datetime,
CreateDate Datetime default getdate(),
ProductIMG Nvarchar(255),
Foreign key (SellerID) References Users(UserID),
Foreign key (ProductTypeID) References ProductTypes(ProductTypeID)
)

Create table Promotionals(
PromotionalID int Primary key identity(1,1),
ProductID int,
PromotionalDetails text,
Discount Int,
StartDate Datetime,
EndDate Datetime,
Foreign key (ProductID) References Products(ProductID)
)

Create table Wishlist(
UserID int,
ProductID int,
Foreign key (ProductID) References Products(ProductID),
Foreign key (UserID) References Users(UserID)
)

Create table OrderDetails(
OrderID int,
ProductID int,
ProductAmount int,
Foreign key (ProductID) References Products(ProductID),
Foreign key (OrderID) References Orders(OrderID)
)

Create table Feedbacks(
FeedbackID int Primary key identity(1,1),
ProductID int,
BuyerID int,
FeedbackText text,
Rating int,
CreateDate Datetime default getDate()
Foreign key (ProductID) References Products(ProductID),
Foreign key (BuyerID) References Users(UserID)
)

Create table Responses(
ResponseID int Primary key identity(1,1),
FeedbackID int,
SellerID int,
ResopnseText text,
CreateDate Datetime default getDate(),
Foreign key (FeedbackID) References Feedbacks(FeedbackID),
Foreign key (SellerID) References Users(UserID)
)

Create table News (
NewsID int Primary key identity(1,1),
UserID int,
NewsTitle Nvarchar(100),
NewsContent text,
NewsStatus Nvarchar(50),
CreateDate Datetime default getDate()
Foreign key (UserID) References Users(UserID)
)

Create table NewsComments(
UserID int,
NewsID int,
Comment text,
Foreign key (UserID) References Users(UserID),
Foreign key (NewsID) References News(NewsID)
)
