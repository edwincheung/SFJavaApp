sfctl application upload --path SFJavaApp --show-progress
sfctl application provision --application-type-build-path SFJavaApp
sfctl application upgrade --application-name fabric:/SFJavaApp --application-version 1.0.1 --parameters "{}" --mode Monitored