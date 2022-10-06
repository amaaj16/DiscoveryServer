job("Build and run tests") {
    container(displayName = "Run gradle build", image = "amazoncorretto:17-alpine") {
        kotlinScript { api ->
            // here can be your complex logic
            api.gradlew("build")
        }
    }
}