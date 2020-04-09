pipeline {

    stages{
        stage('Git pull code') {

            git 'https://github.com/balaji024/Maven-Deploy.git'

        }

        stage('Create Docker image') {

            container('docker') {

                withCredentials([[$class: 'UsernamePasswordMultiBinding',

                    credentialsId: 'DOCKERHUB',

                    usernameVariable: 'DOCKER_HUB_USER',

                    passwordVariable: 'DOCKER_HUB_PASSWORD']]) {

                    sh """

                        docker login -u ${DOCKER_HUB_USER} -p ${DOCKER_HUB_PASSWORD}

                        docker build -t balaji024/cr7live:${BUILD_NUMBER} .

                        docker push balaji024/cr7live:${BUILD_NUMBER}
                         
                        docker run -d -p 7777:8080:${BUILD_NUMBER}


                        """

                    }

            }

        }

      
              
    }