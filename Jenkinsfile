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
            post {
                 // If Maven was able to run the tests, even if some of the test
                 // failed, record the test results and archive the jar file.
                 success { allure([
                 includeProperties: false,
                 jdk: '',
                 properties: [],
                 reportBuildPolicy: 'ALWAYS',
                 results: [[path: 'target/allure-results']]
               ])
              }
            }
        }

        stage ('Fim'){
                    steps{
                    bat 'echo fim'
                    }
                }
    }
}