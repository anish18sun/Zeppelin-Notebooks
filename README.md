# Zeppelin-Notebooks

### Description
This repository contains the work done for the Google Summer of Code 2016 project titled 'Zeppelin Notebooks'. The repository contains a set of five notebooks on various public datasets that have been analysed using **Apache Spark** and **Apache Flink** along with the visualization capabilities of **Apache Zeppelin**. Two of the notebooks also contain
the demonstration of Helium application the code for which is contained in the 'Helium App' directory.

Helium application is a pluggable application tool that allows for creation of application at the backend and directly viewing the output at the frontend by running the application, for more information on Helium Application, please see this [link](https://github.com/apache/zeppelin/pull/836). To be able to run the Helium application, please first open the application code in Eclipse IDE or any other IDE of your choice and link the application to the libraries contained in the ZEPPELIN_HOME/zeppelin-interpreter/target/lib directory, which contain the required jars and also to the compiled classes in the ZEPPELIN_HOME/zeppelin-interpreter/target/classes directory. Once the application is linked, one may just run them by their 'main()' method. One more important thing is that a lot of visualizations are generated using D3 libraries and contain the input data in json format. D3 provides a method 'd3.json()' to load the input data, this method makes GET requests to the server on which the application is running which in this case is the Zeppelin Server, so for the data to be available to D3 at runtime, it is important that these data files be present in the ZEPPELIN_HOME/zeppelin-web/dist directory from where the server is read. All of the data files need to be placed here to be able to run the visualizations that depend on them.

A blog site had also been created for this project which contains detailed descriptions about how the notebooks were designed. The blogs may be viewed [here](http://zeppelinnotes.blogspot.in).

A few of the notebooks had video demonstrations, links to which are mentioned below :- 

1. Transportation Notebook [link to video](https://drive.google.com/open?id=0ByXTtaL2yHBuZ0FNdkNuV2JTUjA)
2. Common Crawl Notebook [link to video](https://drive.google.com/open?id=0ByXTtaL2yHBuU2tSTU1WeW1IRnc)
3. SnapBook Notebook [link to video](https://drive.google.com/open?id=0ByXTtaL2yHBuLW9maklXTGg0QlE)
4. Helium Demo [link to video](https://drive.google.com/open?id=0ByXTtaL2yHBuejVUQ0k3ek1IdGc)
