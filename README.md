ht-java-play23
===========
Sample project that use Java Playframework 2.3 for Heroku training.

Heroku
--------------
If it is to push the master branch of Git, wercker will automatically deploy to heroku

[Heroku project](https://dashboard.heroku.com/apps/gramp-heroku-play23/resources/)  
[Heroku app URL](http://gramp-heroku-play23.herokuapp.com/)


How to deploy
--------------

### Step1  

Clone app from Github  

```
$ git clone git@github.com:flect/ht-java-play23.git
$ cd ht-java-play23/
```

### Step2  

Create Heroku application

```
$ heroku create
```

### Step3  

Deploy application
```
$ git push heroku master
```

### Step 4

Visit application

```
$ heroku open
```
