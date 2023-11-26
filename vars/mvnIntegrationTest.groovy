def call(Map stageParams){
    sh 'mvn verify -DskipUnitTests'
}