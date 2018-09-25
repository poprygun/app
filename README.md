## Sample non-Spring App

Covers concepts of packaging and deploying **non Spring** java application to Cloudfoundry.
`app.yml` resource is packaged inside of runnable jar file, and unpacked
in /home/vcap/app directory.

Alternatively, aplication could be packaged as a distZip, defining
>/bin

>/lib

folders in zip file.

At some point, worth trying onejar google plugin. 

## Run program with

```bash
java -jar app.jar config/app.yml
```