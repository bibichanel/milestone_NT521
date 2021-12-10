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
                   sonar.projectKey=Milestone_B \
                   sonar.exclusions=vendor/**, storage/**, resources/**, **/*.java \
                   sonar.sources=. \
                   sonar.host.url=http://192.168.1.11:9000 \
                   sonar.login=your-generated-token-from-sonarqube-container"
               }
            }
        }
    }
}
