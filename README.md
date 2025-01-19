# impact.com CLI Demo

A simple CLI application created as part of my co-op application to impact.com. This project demonstrates the use of picocli to create a command-line interface that displays the impact.com company name.

## Features

- ASCII art display of impact.com logo
- Color output option
- Animation option
- Standard help and version commands

## Building the Project

```bash
mvn clean package
```

This will create a runnable JAR file in the `target` directory.

## Running the Application

```bash
java -jar target/impact-cli-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Options

- `-c, --color`: Display the logo in color
- `-a, --animate`: Show an animated display of the logo
- `-h, --help`: Show help message
- `-V, --version`: Display version info

## Example Usage

Basic display:
```bash
java -jar target/impact-cli-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Colored, animated display:
```bash
java -jar target/impact-cli-1.0-SNAPSHOT-jar-with-dependencies.jar -c -a
```

## Technologies Used

- Java 17
- picocli 4.7.5
- Maven

Created by Finley Vickers for impact.com Co-op Application 2025
