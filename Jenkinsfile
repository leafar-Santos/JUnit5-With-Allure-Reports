pipeline {
    agent any
    stages{
        stage ('Inicio'){
            steps{
                bat 'echo inicio'
            }
        }

        stage ('Executando testes JUnit 5'){
           steps{
              bat 'mvn clean test'
           }
        post{
            always{ allure([
                 includeProperties: true,
                 jdk: '',
                 properties:[],
                 reportBuildPolicy: 'ALWAYS',
                 report: 'allure_reports',
                 results: [[path: 'target/allure-results']]
            ])

                }
            }
        }
        
        stage('Rapport Allure') {
            script {
                allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'allure-results']]
                        ])
                }
            }
    }
}