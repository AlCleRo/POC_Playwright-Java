
pipeline {
    agent any
    stages {
        stage('Run BDD Scenarios') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    script {
                        bat "gradlew clean test -x build"
                    }
                }
            }
        }
        stage('Allure Report') {
            steps {
                script {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'build/allure-results']]
                    ])
                }
            }
        }
        stage('Send to Slack') {
            steps {
                script {
                     bat "slackscript.sh"
                }
            }
        }
    }
}


