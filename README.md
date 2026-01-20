# Ecommerce API

A minimal E-commerce Backend API built with Spring Boot and MongoDB.

## Tech Stack

*   **Java**: 21
*   **Framework**: Spring Boot 4.0.1
*   **Database**: MongoDB
*   **Build Tool**: Maven

## Prerequisites

Ensure you have the following installed:

*   [Java SDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
*   [MongoDB](https://www.mongodb.com/try/download/community) (running locally on port 27017)

## Getting Started

### 1. Clone the repository

```bash
git clone <repository_url>
cd ecommerce
```

### 2. Configure MongoDB

The application expects MongoDB to be running at `mongodb://localhost:27017/ecommerce`. You can configure this in `src/main/resources/application.properties` if needed.

### 3. Build and Run

Use the Maven wrapper to build and run the application:

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Documentation

### Health Check

Verify that the API is running.

*   **URL**: `/` or `/health`
*   **Method**: `GET`
*   **Response**: `200 OK`

```bash
curl http://localhost:8080/health
```

### Products

#### List All Products

Get a list of all available products.

*   **URL**: `/api/products`
*   **Method**: `GET`

```bash
curl http://localhost:8080/api/products
```

#### Create a Product

Add a new product to the catalog.

*   **URL**: `/api/products`
*   **Method**: `POST`
*   **Body**: JSON

```json
{
  "name": "Smartphone",
  "description": "Latest model with 5G",
  "price": 699.99,
  "stock": 50
}
```

```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name": "Smartphone", "description": "Latest model", "price": 699.99, "stock": 50}'
```

### Cart

#### Add Item to Cart

Add a product to a user's cart.

*   **URL**: `/api/cart/add`
*   **Method**: `POST`
*   **Body**: JSON

```json
{
  "userId": "user123",
  "productId": "product_id_here",
  "quantity": 1
}
```

```bash
curl -X POST http://localhost:8080/api/cart/add \
  -H "Content-Type: application/json" \
  -d '{"userId": "user123", "productId": "PRODUCT_ID", "quantity": 1}'
```

#### Get User Cart

Retrieve all items in a user's cart.

*   **URL**: `/api/cart/{userId}`
*   **Method**: `GET`

```bash
curl http://localhost:8080/api/cart/user123
```

#### Clear Cart

Remove all items from a user's cart.

*   **URL**: `/api/cart/{userId}`
*   **Method**: `DELETE`

```bash
curl -X DELETE http://localhost:8080/api/cart/user123
```

## Testing

Run unit and integration tests using Maven:

```bash
./mvnw test
```

