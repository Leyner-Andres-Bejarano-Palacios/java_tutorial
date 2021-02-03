FROM java:8

# add the container directory from the host
RUN mkdir /opt/mainpckg

# copy the app to container directory
ADD . /opt/mainpckg

WORKDIR /opt/mainpckg

RUN java -version

RUN javac W3resource_basic_1_num_15.java

CMD java W3resource_basic_1_num_15
