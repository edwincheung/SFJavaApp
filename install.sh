#!/bin/bash
set -ex
sfctl application upload --path SFJavaApp --show-progress
sfctl application provision --application-type-build-path SFJavaApp
sfctl application create --app-name fabric:/SFJavaApp --app-type SFJavaAppType --app-version 1.0.0
