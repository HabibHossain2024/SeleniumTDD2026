pipeline {
    agent any
    environment {
        JAVA_HOME = '/opt/homebrew/opt/openjdk@25'
        PATH = "/opt/homebrew/bin:${env.PATH}"
    }
    stages {
        stage('Run Tests') {
            steps { sh 'mvn -version && mvn clean test' }
        }
    }
    post {
        always {
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/surefire-reports/**', allowEmptyArchive: true
        }
    }
}
