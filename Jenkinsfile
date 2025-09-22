tools {
    # This tells Jenkins to use the specified Maven version.
    # You need to configure this in Jenkins > Manage Jenkins > Tools.
    maven 'Maven 3.9.6'
}

stages {
    stage('Checkout') {
        steps {
            # This step is often implicitly done by Jenkins, but it's good practice
            # to include for clarity. It checks out the code from the Git repository.
            script {
                checkout scm
            }
        }
    }

    stage('Build & Test') {
        steps {
            echo 'Building the application and running tests...'
            # The `sh` step executes a shell command. Here, we're using Maven.
            # The `-DskipTests` flag is removed to ensure tests run.
            sh 'mvn clean install'
        }
    }

    stage('Build Docker Image') {
        steps {
            echo 'Building the Docker image...'
            # Build the Docker image using the Dockerfile in the current directory.
            sh 'docker build -t homeservices .'
        }
    }

    stage('Push Docker Image (Optional)') {
        steps {
            echo 'Pushing the Docker image to a registry...'
            # Replace "your-dockerhub-username" with your actual Docker Hub username.
            # You must configure your Docker Hub credentials in Jenkins.
            sh 'docker tag homeservices your-dockerhub-username/homeservices:latest'
            sh 'docker push your-dockerhub-username/homeservices:latest'
        }