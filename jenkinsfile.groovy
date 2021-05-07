node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
    }
    stage ('DeuxiemeEtape'){
      sh "echo 'Hello World 2 !!'"
    }
  }
  finally{
    cleanWs()
  }
}
