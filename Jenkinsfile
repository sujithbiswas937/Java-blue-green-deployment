pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven'
    }

    stages {

        stage('Verify Java') {
            steps {
                sh 'java -version'
            }
        }

        stage('Debug Java & Maven') {
    steps {
        sh 'java -version'
        sh 'mvn -version'
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