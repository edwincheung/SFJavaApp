#!/bin/bash
set -ex
sfctl application delete --application-id SFJavaApp
sfctl application unprovision --application-type-name SFJavaAppType --application-type-version 1.0.0
sfctl store delete --content-path SFJavaApp
