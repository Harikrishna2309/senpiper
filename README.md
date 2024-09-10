# senpiper

## APIs

### 1. Create Training Center API
- Endpoint: [POST] http://localhost:8084/api/trainingcenters/create
- Request Body:
    json
    {
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
    
- Description: Creates a new training center with the provided details.### 2. Get All Training Centers API
- Endpoint: [GET] http://localhost:8084/api/trainingcenters
- Response: Array of training center objects.
- Description: Retrieves a list of all training centers."# senpiper" 
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
<<<<<<< HEAD
"# senpiper" 
=======
>>>>>>> 57e50530bda0b31f91224cd89ea62fe63bfd41d7
