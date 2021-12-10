pipeline {
    agent any
    stages {
        stage('Clone'){
            steps {
                git 'https://github.com/bibichanel/milestone_NT521.git'
            }
        }
        stage('SonarQube analysis'){
            steps{
               withSonarQubeEnv("sonarqube-container") {
                    sh "${tool("milestone")}/bin/sonar-scanner"
               }
            }
        }
    }
}
