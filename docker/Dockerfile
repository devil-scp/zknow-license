FROM registry.cn-shanghai.aliyuncs.com/c7n/javabase:jdk8u282-b08
RUN mkdir /choerodon && chown -R www-data:www-data /choerodon
COPY --chown=www-data:www-data app.jar /choerodon/zknow-license.jar
COPY --chown=www-data:www-data license-agent.jar /choerodon/license-agent.jar
WORKDIR /choerodon
USER 33
CMD java $JAVA_OPTS $SKYWALKING_OPTS -javaagent:license-agent.jar -jar /choerodon/zknow-license.jar
