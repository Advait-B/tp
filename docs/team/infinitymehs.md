# Eugenia - Project Portfolio Page

## Overview

FlashCLI is a lightweight command-line flashcard application for students who prefer a fast, keyboard-first study workflow. It allows users to create, manage, and review flashcard decks entirely from the terminal, making it ideal for students comfortable with CLI environments who want minimal friction in their study sessions.

---

## Summary of Contributions

### Code Contributed

[RepoSense Dashboard](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=infinitymehs&breakdown=true)

---

### New Feature: Confidence Level Rating System 

- **What it does:** It allows users to rank their confidence level of each card during a study session. Cards with lower confidence ratings are prioritised and appear earlier in the subsequent study sessions. 
- **Justification:** Without this feature, cards would be studied in insertion order, which is inefficient for users who are already comfortable with certain cards. This confidence level rating system encourages more effective and targeted revision.  
- **Highlights:** The sorting of cards during a study session was designed to not affect the original underlying deck order and preserves the insertion order for commands like `listCards`. 

---

### New Feature: `editCard` Command
 
- **What it does:** The `editCard` command allows users to update and edit the question or/and answer of a previously added card.    
- **Justification:** Without this feature, users would need to delete and re-add a card whenever they wanted to edit or update their cards, which is extremely inefficient. 
- **Highlights:** The `editCard` command had to be integrated with its own custom parsing and additional logic was needed to account for the user editing only the question or answer.  

---

### Enhancements to Existing Features

- Implemented the `Card` and `Deck` classes
- Implemented checking for duplicate cards after adding a new card
- Implemented the custom argument parsing for the `editCard` commnad 
- Implemented the `StudySession` logic to account for the sorting of confidence level
- Implemented the full JUnit tests for `Deck`, `Card`, `editCardCommand`

---

### Contributions to Team-Based Tasks
- Edited formatting and indentation across files to pass Checkstyle tests
- Reviewed PRs and gave comments when necessary 

---

### Documentation

#### User Guide

- Wrote all of the `Deck` and `Card` related commands in the feature section


#### Developer Guide

- Wrote the target user and value proposition sections
- Wrote the full `Deck` section and added in the relevant class and sequence diagrams
