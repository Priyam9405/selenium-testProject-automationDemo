pipeline{
agent any
stages {
  stage('maven install') {
    steps {
withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'TestMaven', mavenSettingsConfig: '', traceability: true) {
    bat 'mvn clean install'
}    
    }
  }
  stage('Publish Test Results'){
steps{
echo "Publishinf JUnit test reports..."
  junit '**/target/surefire-reports/*.xml'
  }
  }

}

}
