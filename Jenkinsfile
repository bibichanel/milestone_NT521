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
                def scannerHome = tool 'SonarScanner 4.0';
                withSonarQubeEnv('sonarqube') { 
                    sh "${scannerHome }/bin/sonar-scanner \
                    -Dsonar.projectKey=Milestone_B \
                    -Dsonar.exclusions=vendor/**, storage/**, resources/**, **/*.java \
                    -Dsonar.sources=." 
                }
            }
        }
    }
}
