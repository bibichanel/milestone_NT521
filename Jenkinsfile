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
                withSonarQubeEnv('sonarqube') { 
                    sh "${sonarqube}/bin/sonar-scanner \
                    -Dsonar.projectKey=Milestone_B \
                    -Dsonar.exclusions=vendor/**, storage/**, resources/**, **/*.java \
                    -Dsonar.sources=." 
                }
            }
        }
    }
}
