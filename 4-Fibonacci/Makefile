build:
	@javac -d out src/*.java
	@echo "Build Complete"

run:
	@bash -c "time java -cp out Main $(ARGS)"

clean:
	@rm -rf out/*
	@echo "Cleaning Complete"

dev: build run