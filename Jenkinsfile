pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning Workspace...'
                mvn clean
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Integration') {
            steps {
                echo 'Integration....'
            }
        }
    }
}
