# GitHub Repository Analyzer

A Java CLI tool that analyzes public GitHub repositories using the GitHub REST API and returns a concise summary of repository metadata.

This project focuses on API consumption, JSON parsing, console output formatting, and simple command-line application design.

## Features

- Fetch repository metadata from the GitHub REST API
- Display stars, forks, and primary language
- Accept repository input in `owner/repository` format
- Show clean console output for quick inspection
- Lightweight Java CLI structure

## Tech Stack

- **Language:** Java
- **API:** GitHub REST API
- **Interface:** Command line
- **Concepts:** HTTP requests, JSON parsing, CLI tooling

## Project Structure

```text
github-repo-analyzer/
│
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

## Example Usage

### Compile

```bash
javac src/Main.java
```

### Run

```bash
java -cp src Main owner/repository
```

### Example

```bash
java -cp src Main torvalds/linux
```

## Sample Output

```text
Repository Analysis
-------------------
Stars           : 180000
Forks           : 58000
Main Language   : C
-------------------
```

## Skills Demonstrated

- Java programming
- REST API usage
- Command-line application development
- HTTP request handling
- JSON parsing
- Console formatting

## Limitations

- Currently supports one repository per run
- Returns a focused metadata summary rather than a full report
- Uses a simple CLI structure without argument flags

## Future Improvements

- Add support for multiple repositories in one command
- Include open issues, watchers, and license info
- Export results to CSV or JSON
- Add better argument validation
- Support authenticated GitHub API requests for higher rate limits

## Why I Built This

I built this project to practice Java API integration and create a simple but useful CLI tool that works with real public data.

## Author

**Slavcho Vlakeski**
