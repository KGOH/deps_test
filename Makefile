build-lib:
	cd lib && clj -Spom && mvn package

cambada-lib:
	cd lib && clj -A:build 0.1

update-lib:
	cd proj/jars && rm -f lib.jar ; ln -s ../../lib/target/lib-0.1.jar lib.jar

update-uberlib:
	cd proj/jars && rm -f lib.jar ; ln -s ../../lib/target/lib-0.1-standalone.jar lib.jar

upgrade-uberlib: build-lib update-uberlib

upgrade-lib: build-lib update-lib

proj-repl:
	cd proj && rm -rf .cpcache && clj -A:test:nrepl

proj-test:
	cd proj && rm -rf .cpcache && clj -A:test:kaocha
