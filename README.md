# Loads-Api
This project is made with Java Spring Boot and Postgres SQL Database which loads the following api's:

1. POST "/load"

payload:
{
	"loadingPoint": "delhi",
  
	"unloadingPoint": "jaipur",
	
  "productType": "chemicals",
	
  "truckType": "canter",
	
  "noOfTrucks": 1,
	
  "weight": 100,
  
  "comment": "",
	
  "shipperId" : "shipper:<UUID>",
	
  "Date" : "dd-mm-yyyy"
	
}
Response:loads details added successfully 

      2. GET “/load”

Query params - (shipperId)

Response:list of loads with this shipperId

GET “load/{loadId}”
	
	
PUT “load/{loadId}”
{
	"loadingPoint": "alwar",
	
  "unloadingPoint": "jaipur",
	
  "productType": "chemicals",
	
  "truckType": "canter",
	
  "noOfTrucks": 1,
	
  "weight": 100,
  
  "comment": "",
  
  "Date" : "dd-mm-yyyy"	
}
	
	
DELETE “load/{loadId}”
