pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Les-chomeurs/epsi-dev709-ci.git' 
            }
        }
        stage('Clean') {
            steps {
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/erphrence-improved'){
                    bat './mvnw clean'
                    bat './mvnw compile'
                    bat './mvnw test'
                    bat './mvnw package'
                    bat 'rename target\\erphrense-0.0.1-SNAPSHOT.jar erphrense-%BUILD_NUMBER%.jar'
                    archiveArtifacts artifacts: 'target\\erphrense-*.jar', followSymlinks: false
                }
            }
        }
    }
}
