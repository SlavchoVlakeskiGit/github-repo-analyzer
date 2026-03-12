# GitHub Repository Analyzer

A simple Java CLI tool that analyzes GitHub repositories using the GitHub REST API.

## Features

- Fetch repository metadata
- Display stars and forks
- Identify main programming language
- Clean console output

## Usage

1. **Compile**

```bash
javac src/Main.java
```

2. **Run**

```bash
java -cp src Main owner/repository
```
3. **Example**


```bash
java -cp src Main torvalds/linux
```

## Sample Output

```
Repository Analysis
-------------------
Stars           : 180000
Forks           : 58000
Main Language   : C
-------------------
```

## Skills Demonstrated

-   Java programming

-   REST API usage

-   CLI application development

-   JSON parsing

## Future Improvements

-   Add support for multiple repositories at once

-   Fetch additional metrics like issues, pull     requests, watchers

-   Output results to a CSV file