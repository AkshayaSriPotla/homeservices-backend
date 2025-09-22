pipeline {
agent any

stages {
    stage('Checkout') {
        steps {
            // This step is often implicitly done by Jenkins, but it's good practice
            // to include for clarity. It checks out the code from the Git repository.
            script {
                checkout scm
            }
        }
    }

    stage('Build & Test') {
        steps {
            echo 'Building the application and running tests...'
            // We use 'bat' instead of 'sh' because the Jenkins agent is on Windows.
            bat 'mvn clean install'
        }
    }

    stage('Build Docker Image') {
        steps {
            echo 'Building the Docker image...'
            // We use 'bat' for the Docker command as well.
            bat 'docker build -t homeservices .'
        }
    }

    stage('Push Docker Image (Optional)') {
        steps {
            echo 'Pushing the Docker image to a registry...'
            // We use 'bat' for the Docker commands.
            // Replace "your-dockerhub-username" with your actual Docker Hub username.
            // You must configure your Docker Hub credentials in Jenkins.
            bat 'docker tag homeservices your-dockerhub-username/homeservices:latest'
            bat 'docker push your-dockerhub-username/homeservices:latest'
        }
    }
}

}