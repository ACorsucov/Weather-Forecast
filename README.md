# Weather-Forecast

# Build app with maven

command: mvn clean package -DskipTests

# Build docker image

command: docker build --tag=weather-forecast-app:latest .

# Run the iamge

command: docker run -p 8080:8080 weather-forecast-app:latest
