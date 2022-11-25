pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Les-chomeurs/epsi-dev709-ci.git' 
            }
        }
        dir('C:/ProgramData/Jenkins/.jenkins/workspace/erphrence-improved'){
            stage('Clean') {
                steps {
                    bat './mvnw clean'
                }
            }
            stage('Compile'){
                steps{
                    bat './mvnw compile'
                }
            }
            stage('Test'){
                steps{
                    bat './mvnw test'
                }
            }
            stage('Package'){
                steps{
                    bat './mvnw package'
                    bat 'rename target\\erphrense-0.0.1-SNAPSHOT.jar erphrense-%BUILD_NUMBER%.jar'
                    archiveArtifacts artifacts: 'target\\erphrense-*.jar', followSymlinks: false 
                }
            }
        }
    }
}
