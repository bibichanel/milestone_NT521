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
                 script {
                     def scannerHome = tool 'sonarqube';
                     withSonarQubeEnv('sonarqube') {
                        sh "ls ${scannerHome}"
                        sh "echo ${scannerHome}"
                        sh "${"sonarqube"}/bin/sonar-scanner \
                        -Dsonar.projectKey=Milestone_B \
                        -Dsonar.exclusions=vendor/**, storage/**, resources/**, **/*.java \
                        -Dsonar.sources=." 
                     }
                }
            }
        }
    }
}
