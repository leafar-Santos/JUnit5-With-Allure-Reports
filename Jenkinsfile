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
            success{ allure([
                 includeProperties: false,
                 jdk: '',
                 properties:[],
                 reportBuildPolicy: 'ALWAYS',
                 results: [[path: 'allure_results']]
            ])

                }
            }
        }
    }
}