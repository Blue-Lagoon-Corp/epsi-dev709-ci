pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning Workspace...'
                mvn --version
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
