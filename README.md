# GitHub Repo Analyzer

A small Java CLI tool for analyzing public GitHub repositories using the GitHub REST API.

The project is deliberately narrow in scope. I built it to practice consuming an external API, parsing JSON cleanly, and presenting the result in a simple command-line format.

## What it does

- sends requests to the GitHub API
- fetches repository metadata
- parses the JSON response
- prints a short summary of the repo

## Why I built it

I wanted a smaller project centered around API consumption instead of database work.

It also forced me to keep the code straightforward, which was kind of the point of the project in the first place.

## Project structure

```text
github-repo-analyzer/
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

## Example usage

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

## Sample output

```text
Repository Analysis
-------------------
Stars           : 180000
Forks           : 58000
Main Language   : C
-------------------
```

## Limitations

- supports one repository per run
- returns a focused metadata summary rather than a full report
- uses a simple CLI structure without argument flags

## Possible next improvements

- support multiple repositories in one command
- include open issues, watchers, and license info
- handle rate limits more explicitly

It’s a simple tool, but it helped me get more comfortable working with external APIs.
