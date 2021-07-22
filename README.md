# Weather-Forecast

# Build project with maven
Command: mvn clean package -DskipTests

# Build docker image
Command: docker build --tag=weather-forecast-app:latest .

# Run Docker image
Command: docker run -p 8080:8080 weather-forecast-app:latest
