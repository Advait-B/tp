# User Guide

## Introduction

FlashCLI is a lightweight command-line flashcard application for students who prefer a fast, keyboard-first study workflow. You organise your flashcards into named decks, add question-and-answer cards to each deck, and run interactive study sessions that adapt to your self-reported confidence level - showing the cards you are least confident about first. This guide walks you through how to install and use FlashCLI.

## Quick Start

1. **Install Java 17.** FlashCLI requires Java 17 or later. Confirm your version with:
   ```
   java -version
   ```
2. **Download FlashCLI.** Either clone the repository or download the pre-built JAR from the releases page and place it anywhere on your computer.
3. **Open a terminal** at the project root (if you cloned) or the folder containing the JAR.
4. **Run FlashCLI.**
    * **From source:**
        * macOS / Linux: `./gradlew run`
        * Windows: `.\gradlew.bat run`
    * **From JAR:** `java -jar flashcli.jar`

   You should see the welcome message:
   ```
   Welcome to FlashCLI!
   ```
5. Type `help` to see every available command, then start by creating your first deck with `createDeck`.

**Data persistence:** FlashCLI automatically saves all your decks and cards to `data/storage.json` after every command. You do not need to save manually.

## Features 

{Give detailed description of each feature}

### Adding a todo: `todo`
Adds a new item to the list of todo items.

Format: `todo n/TODO_NAME d/DEADLINE`

* The `DEADLINE` can be in a natural language format.
* The `TODO_NAME` cannot contain punctuation.  

Example of usage: 

`todo n/Write the rest of the User Guide d/next week`

`todo n/Refactor the User Guide to remove passive voice d/13/04/2020`

## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary

| Command | Format | Example |
|---------|--------|---------|
| `help` | `help` | `help` |
| `createDeck` | `createDeck d/<DECK_NAME>` | `createDeck d/CS2113 Finals` |
| `listDecks` | `listDecks` | `listDecks` |
| `clearDeck` | `clearDeck d/<DECK_NAME>` | `clearDeck d/CS2113 Finals` |
| `deleteDeck` | `deleteDeck d/<DECK_NAME>` | `deleteDeck d/Linear Algebra` |
| `addCard` | `addCard d/<DECK_NAME> q/<QUESTION> a/<ANSWER>` | `addCard d/CS2113 Finals q/What does OOP stand for? a/Object-Oriented Programming` |
| `listCards` | `listCards d/<DECK_NAME>` | `listCards d/CS2113 Finals` |
| `deleteCard` | `deleteCard d/<DECK_NAME> i/<INDEX>` | `deleteCard d/CS2113 Finals i/2` |
| `editCard` | `editCard d/<DECK_NAME> i/<INDEX> q/<QUESTION> a/<ANSWER>` | `editCard d/CS2113 Finals i/1 q/What does OOP stand for? a/Object-Oriented Programming` |
| `study` | `study d/<DECK_NAME>` | `study d/CS2113 Finals` |
| `exit` | `exit` | `exit` |

**Study session controls** (only valid while a session is active):

| Input | Action |
|-------|--------|
| Enter (empty line) | Reveal the current card's answer / advance to the next card |
| `1` – `5` | Submit your confidence rating for the current card |
| `q` | Quit the session early and return to the main prompt |
