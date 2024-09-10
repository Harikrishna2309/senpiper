"# senpiper" 
1. Create Training Center
API: (http://localhost:8084/api/trainingcenters/create)
Method: POST
samle data: {
  "centerName": "check",
  "centerCode": "ABC123456789",
  "address": {
    "detailedAddress": "check",
    "city": "check",
    "state": "checke",
    "pincode": "123456"
  },
  "studentCapacity": 100,
  "coursesOffered": ["Java", "Spring Boot"],
  "contactEmail": "info@liv2train.com",
  "contactPhone": "9876543210"
}


2. Get All Training Centers
API: (http://localhost:8084/api/trainingcenters)
Method: GET
result: Array of json data;
"# senpiper" 
