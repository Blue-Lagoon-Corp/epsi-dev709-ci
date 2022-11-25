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
                        bat './mvnw clean verify sonar:sonar -Dsonar.login=634b3180737f5b08ef57317c4263be4fa13370cf -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=les-chomeurs -Dsonar.projectKey=Les-chomeurs_epsi-dev709-ci'
                    }
                }
            }
        stage('Compile'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/erphrence-improved'){
                    bat './mvnw compile verify sonar:sonar -Dsonar.login=634b3180737f5b08ef57317c4263be4fa13370cf -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=les-chomeurs -Dsonar.projectKey=Les-chomeurs_epsi-dev709-ci'
                }
            }
        }
        stage('Test'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/erphrence-improved'){
                    bat './mvnw test verify sonar:sonar -Dsonar.login=634b3180737f5b08ef57317c4263be4fa13370cf -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=les-chomeurs -Dsonar.projectKey=Les-chomeurs_epsi-dev709-ci'
                }
            }
        }
        stage('Package'){
            steps{
                dir('C:/ProgramData/Jenkins/.jenkins/workspace/erphrence-improved'){
                    bat './mvnw package verify sonar:sonar -Dsonar.login=634b3180737f5b08ef57317c4263be4fa13370cf -Dsonar.host.url=https://sonarcloud.io -Dsonar.organization=les-chomeurs -Dsonar.projectKey=Les-chomeurs_epsi-dev709-ci'
                    bat 'rename target\\erphrense-0.0.1-SNAPSHOT.jar erphrense-%BUILD_NUMBER%.jar'
                    archiveArtifacts artifacts: 'target\\erphrense-*.jar', followSymlinks: false 
                }
            }
        }
    }
}
