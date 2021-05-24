docker run -it --rm \
-v %cd%/conf:/opt/gatling/conf \
-v %cd%/user-files:/opt/gatling/user-files \
-v %cd%/results:/opt/gatling/results \
--network="host" \
denvazh/gatling:3.2.1