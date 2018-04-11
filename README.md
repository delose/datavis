#### Spring Boot with visualization using D3.js framework
Display horizonal a horizontal chart:  
![Sample bargraph with values](https://github.com/delose/datavis/blob/master/images/datavis-horizonal_bargraph_1.PNG)

By passing values through the controller and mapped into the view:
```java
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String home(@RequestParam(name="name", required=false, defaultValue="User") String name, Model model)
            throws ServletException, IOException {
        model.addAttribute("name", name);
        List<Integer> array = new ArrayList<Integer>();
        array.add(100);
        array.add(200);
        array.add(300);
        array.add(400);
        array.add(100);
        array.add(200);
        array.add(300);
        array.add(400);
        model.addAttribute("data", array);
        return "dashboard/dashboard";
    }
```

#### Installation

Generated in http://start.spring.io/

#### Proxy

> Make sure to add proxy details in gradle.properties (if needed)
systemProp.http.proxyHost={host address}
systemProp.https.proxyHost={host address}
systemProp.http.proxyPort={host port}
systemProp.https.proxyPort={host port}

#### Gradle Setup (Eclipse)

> 1. Import > Github URI
2. Right click on the project > Configure > Convert to Gradle Projects
3. Right click on the project > Refresh All

### Optional

> org.gradle.daemon=true
org.gradle.configureondemand=true
org.gradle.parallel=true
org.gradle.jvmargs=-Xmx1536m

#### To restart the app (whenever new dependencies are added)

> You can test actuator
> ./gradlew build && java -jar build/libs/datavis-0.0.1-SNAPSHOT.jar
> Once app is running,
> 

#### Run 

> You may run it as 
> 1. Java Application or Spring Boot App
> 2. To test if running, open URI: http://localhost:9000/json?radius=100

##### Actuator (production-grade services)

> To test,
>  curl -i localhost:9001/actuator/health
>  curl -i localhost:9001/actuator/info

#### Build an executable JAR

> java -jar build/libs/datavis-0.0.1-SNAPSHOT.jar

#### List of Spring Boot 2.x Actuators

> Refer to http://www.baeldung.com/spring-boot-actuators
* /auditevents – lists security audit-related events such as user login/logout. Also, we can filter by principal or type among others fields
* /beans – returns all available beans in our BeanFactory. Unlike /auditevents, it doesn’t support filtering
* /conditions – formerly known as /autoconfig, builds a report of conditions around auto-configuration
* /configprops – allows us to fetch all @ConfigurationProperties beans
* /env – returns the current environment properties. Additionally, we can retrieve single properties
* /health – summarises the health status of our application
* /heapdump – builds and returns a heap dump from the JVM used by our application
* /info – returns general information. It might be custom data, build information or details about the latest commit
* /loggers – enables us to query and modify the logging level of our application
* /metrics – details metrics of our application. This might include generic metrics as well as custom ones
* /scheduledtasks – provides details about every scheduled task within our application
* /threaddump – dumps the thread information of the underlying JVM
* /httptrace
* /error
* /mappings
 
#### Purpose of actuators

> Refer to http://www.baeldung.com/spring-boot-actuators
In essence, Actuator brings production-ready features to our application.
Monitoring our app, gathering metrics, understanding traffic or the state of our database becomes trivial with this dependency.
The main benefit of this library is that we can get production grade tools without having to actually implement these features ourselves.
Actuator is mainly used to expose operational information about the running application – health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.
Once this dependency is on the classpath several endpoints are available for us out of the box. As with most Spring modules, we can easily configure or extend it in many ways.

