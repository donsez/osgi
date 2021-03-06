# UPnP Cmd

A simply Gogo shell command for inspecting UPnP devices
 

## Build
git clone 
cd upnp.cmd
mvn clean install

## Run
Install the [Apache Felix framework](http://felix.apache.org/downloads.cgi)

```shell
cd ..
cd felix
java -jar bin/felix.jar
```

In the Apache Felix Gogo Shell
```
obr:list | grep UPnP
obr:deploy "Apache Felix UPnP Base Driver"
obr:deploy "Apache Felix UPnP Extra"
obr:deploy -s "Apache Felix UPnP Tester"
obr:deploy -s "Apache Felix UPnP Base Driver"

start http://apache.mirrors.ovh.net/ftp.apache.org/dist//felix/org.apache.felix.ipojo-1.12.1.jar
start http://apache.mirrors.ovh.net/ftp.apache.org/dist//felix/org.apache.felix.ipojo.api-1.12.1.jar
start file:///../upnp.cmd/target/upnp.cmd-0.1.0.jar

lb

help

upnp:devices
upnp:subscribe uuid:XXXXXX urn:microsoft.com:serviceId:X_MS_MediaReceiverRegistrar
upnp:unsubscribe uuid:XXXXXX urn:microsoft.com:serviceId:X_MS_MediaReceiverRegistrar
```
## TODO
* implement missing commands "services", "statevariables", "actions"
* add command for invoking an action

## License

Copyright (C) 2016 Didier DONSEZ
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
