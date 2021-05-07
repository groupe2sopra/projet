node{
  cleanWs()
  try{
    stage('PremiereEtape'){
      sh "echo 'Hello World !!'"
      sh " cd .. "
      sh " tar -cf test_build.tar projet"
    }
    stage ('DeuxiemeEtape'){
      sh "echo 'Hello World 2 !!'"
    }
  }
  finally{
    
  }
}
