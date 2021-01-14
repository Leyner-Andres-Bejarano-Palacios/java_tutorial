FROM java:8

# add the container directory from the host
RUN mkdir /opt/mainpckg

# copy the app to container directory
ADD . /opt/mainpckg

WORKDIR /opt/mainpckg

RUN javac Main.java

CMD java Main
