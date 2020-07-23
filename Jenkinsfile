pipeline {
    agent any
    tools {
      dockerTool 'Docker'
      maven 'M3'
    }
    stages {
        // stage('Checkout') {
        //     steps {
        //         git 'https://github.com/dbasak2013/cicd-pipeline.git'
        //     }
        // }
        
        stage('Build') {
            steps {
                sh label: '', script: 'mvn clean package'
            }
            
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        
        stage('Build Docker Image') {
            steps {
                sh label: '', script: 'docker build -t dipankar435/springboot_app .'
            }
        }
        
        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker_cred', passwordVariable: 'pass', usernameVariable: 'user')]) {
                    sh label: '', script: "docker login -u ${user} -p ${pass}";
                }
            }
        }
        
        stage('Push Image') {
            steps {
                sh label: '', script: "docker push dipankar435/springboot_app";
            }
        }
    }
}
