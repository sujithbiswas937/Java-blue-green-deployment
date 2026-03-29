pipeline {
    agent any

    tools {
    maven 'Maven'
    }

    environment {
        REPO_URL = 'https://github.com/sujithbiswas937/Java-blue-green-deployment.git'
        BRANCH = 'main'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: "${BRANCH}", url: "${REPO_URL}"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo "Build Success 🚀"
        }
        failure {
            echo "Build Failed ❌"
        }
    }
}