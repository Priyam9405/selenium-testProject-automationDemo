pipeline{
agent any
stages {
  stage('Build & Test') {
    steps {
      echo "Building the project and running tests..."
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
  stage('Archieving Artifacts'){
    steps{
echo "Archieving important build artifacts..."
    archieveArtifacts artifacts : '**/target/*.jar', fingerprint:true
    }
}
}

}
