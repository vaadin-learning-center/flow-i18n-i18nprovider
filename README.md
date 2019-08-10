<center>
<a href="https://vaadin.com">
 <img src="https://vaadin.com/images/hero-reindeer.svg" width="200" height="200" /></a>
</center>

# Flow I18NProvider
In this tutorial we will learn how to implement an I18NProvider
that is used for the translation functionality inside Flow.
Focus will be the question, how to deal with different languages (I18N).

For more detailed information, read the tutorial at 
[https://vaadin.com/tutorials/i18n/i18nprovider](https://vaadin.com/tutorials/i18n/i18nprovider) please.

> All tutorials are available under [https://vaadin.com/tutorials](https://vaadin.com/tutorials)

## Demo running on a local Docker
If you want to run this demo on your local machine, you can try out the 
docker image that is provided. 
To run this type:

```bash
docker pull vaadintutorials/flow-i18n-i18nprovider
docker run -p8899:8899 --name demo vaadintutorials/flow-i18n-i18nprovider
```
After the images/container started you can try this demo with your local browser
by calling the following URL [http://localhost:8899](http://localhost:8899)

### cleaning up after trying
After you used this docker image you can clean up your system with the following commands.

```bash
docker rm demo
docker image rm vaadintutorials/flow-i18n-i18nprovider
```

### building this Docker-image by yourself
If you want to build this docker image on your machine you can use the provided **Dockerfile**

```bash
docker build -t vaadintutorials/flow-i18n-i18nprovider .
```

## Demo running on Heroku
On Heroku you find a deployed version.
[https://flow-i18n-i18nprovider.herokuapp.com/](https://flow-i18n-i18nprovider.herokuapp.com/)

## How to build this locally?
If you want to build this demo check out the repository and invoke
the command: **mvn clean package -Dvaadin-install-nodejs**

Together with this demo, 
you will find some jUnit5 Selenium UI Tests based on **[Testbench](https://vaadin.com/testbench)** 
To get this running you need a license, or you can request a trial from [https://vaadin.com/trial](https://vaadin.com/trial)

To activate the Testbench tests during the maven build process set the environment variable **TESTBENCH** with the value **on**
With your IDE you can run every test without setting this variable.

## How to prepare a vaadin app for Heroku
To support the Heroku pipeline we need a few preparations.
1) the app must be able to get a configured port for the http port during the start up
1) add the shade plugin to create a fat jar
1) create the file **Procfile** and add the line 
    ``web: java -jar target/vaadin-app.jar -port $PORT```
    * **web** - to activate the web profile
    * **-jar** - define what fat jar must be started
    * **-port** make the dynamic associated port available for the app
1) add a file **settings.xml** to configure the maven build process





