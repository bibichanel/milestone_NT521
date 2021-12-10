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
                    sh "${tool("sonarqube-scanner")}/bin/sonar-scanner\
                   -Dsonar.projectKey=Milestone_B \
                   -Dsonar.exclusions=vendor/**, storage/**, resources/**, **/*.java \
                   -Dsonar.sources=. \
                   -Dsonar.host.url=http://192.168.1.11:9000 \
                   -Dsonar.login=your-generated-token-from-sonarqube-container"
               }
            }
        }
    }
}
