pipeline {
    agent any
    stages {
        stage('Clone'){
            steps {
                git 'https://github.com/bibichanel/milestone_NT521.git'
            }
        }
        stage('Build') { 
            steps {
                // sh 'mvn clean install -f Milestone_Pipeline/pom.xml'
                sh './mvnw spring-boot:run'
            }
        }
        stage('SonarQube analysis'){
            steps{ 
                 script {
                     def scannerHome = tool 'sonarqube';
                     withSonarQubeEnv('sonarqube') {
                        sh "${scannerHome}/bin/sonar-scanner \
                        -Dsonar.projectKey=Milestone_B_Pipeline \
                        -Dsonar.exclusions='vendor/**, storage/**, resources/**, **/*.java' \
                        -Dsonar.login='04217f79c80991193dad9a2d8c725ef7e6342fc6' \
                        -Dsonar.sources=." 
                     }
                }
            }
        }
    }
}
