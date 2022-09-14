pipeline {
    agent any
    parameters {
        choice(name: 'BUILD-TOOL',
                choices: ['Gradle','Maven'],
                description: "Select the build tool for the project")
    }
    stages {
        stage('Release'){
            steps {
                script {
                       if(params.BUILD_TOOL == "Gradle"){
                            echo('./gradlew clean build')
                       }
                       else if(params.BUILD_TOOL == "Maven"){
                            sh('./mvnw clean package')
                       }
                }
            }
        }
    }
}