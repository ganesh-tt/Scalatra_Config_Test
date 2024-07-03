# Step 1: Build stage
FROM hseeberger/scala-sbt:17.0.0_1.5.5_2.13.6 AS build

# Set the working directory
WORKDIR /app

# Copy the project files into the container
COPY . /app

# Build the Scala SBT project
RUN sbt package

# Step 2: Runtime stage
FROM tomcat:latest

# Set the working directory
WORKDIR /app

# Copy the built artifact from the build stage
COPY --from=build /app/target/scala-2.13/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]