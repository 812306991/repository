@echo off
set base=%~dp0

set class=%base%\bin
set BASEPATH=%base%\lib
SET class_path=%class%;%BASEPATH%\asm-3.3.1.jar;%BASEPATH%\cglib-2.2.2.jar;%BASEPATH%\commons-logging-1.1.1.jar;%BASEPATH%\javassist-3.17.1-GA.jar;%BASEPATH%\log4j-1.2.17.jar;%BASEPATH%\log4j-api-2.0-rc1.jar;%BASEPATH%\log4j-core-2.0-rc1.jar;%BASEPATH%\mybatis-3.2.7.jar;%BASEPATH%\ojdbc7.jar;%BASEPATH%\slf4j-api-1.7.5.jar;%BASEPATH%\slf4j-log4j12-1.7.5.jar;%BASEPATH%\commons-beanutils-1.8.3.jar;%BASEPATH%\dom4j-1_6_1.jar;%BASEPATH%\jackson-annotations-2.7.0.jar;%BASEPATH%\jackson-core-2.7.0.jar;%BASEPATH%\jackson-core-asl-1.9.2.jar;;%BASEPATH%\jackson-databind-2.7.0.jar;%BASEPATH%\jackson-jaxrs-1.9.2.jar;%BASEPATH%\jackson-mapper-asl-1.9.2.jar;%BASEPATH%\jackson-xc-1.9.3.jar;%BASEPATH%\jaxen-1_1_beta_9.jar;
java -classpath %class_path%  cn.itcast.obtainPhoto.app.ObtainPhotoApp

@pause