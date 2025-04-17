pipeline {
    agent any
    environment {
        ARTIFACTORY_KEY_USR = credentials('artifactory-username')
        ARTIFACTORY_KEY_PSW = credentials('artifactory-password')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -s settings.xml clean install'
            }
        }
        stage('Package') {
            steps {
                sh '''
                zip -r ericsson-nssmf-md.zip target/*.jar nero/*
                echo "Package created: ericsson-nssmf-md.zip"
                '''
            }
        }
    }
}
