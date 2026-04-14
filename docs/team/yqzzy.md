# Ong Yi Qian - Project Portfolio Page

## Overview

FlashCLI is a lightweight command-line flashcard application for students who prefer a
fast, keyboard-first study workflow. It allows users to create, manage, and review
flashcard decks entirely from the terminal, making it ideal for students comfortable with
CLI environments who want minimal friction in their study sessions.

My primary contribution was implementing the study package, the deck manager, and the deleteDeck feature.

---

## Summary of Contributions

### Code Contributed

[RepoSense Dashboard](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=yqzzy&breakdown=true)

---

### New Feature: `deleteDeck` Command

- **What it does:** Allows users to permanently delete a named deck and all its cards.
- **Justification:** Without this command, users had no way to remove decks they no
  longer needed, leaving the deck list cluttered over time.
- **Highlights:** Required a design decision on whether DeckManager.deleteDeck() should validate deck existence internally or rely on a prior getDeck() call as other commands do. The final decision was to validate internally — deleteDeck does not need the Deck object back and a public method should not assume callers always pre-validate. Implemented end-to-end: DeleteDeckCommand, DeckManager.deleteDeck(), Parser support, and Ui.showDeckDeleted().

---

### Main classes: Study Package and DeckManager
- Implemented the full `DeckManager` class — the central data manager every deck-related command goes through. Added null/blank input guards, duplicate name detection, and post-condition assertions on all methods.
- Implemented the full `SessionManager` class — the facade managing study session lifecycle. `finishSession()` is safe to call with no active session, simplifying `StudyCommand`'s multiple exit paths.
- Implemented the `StudySession` class excluding confidence-based sorting — index-based card traversal with pre/post-condition assertions
- Added `java.util.logging.Logger` to `DeckManager`, `SessionManager`, and `StudySession` with `FINE`/`WARNING`/`INFO` logging at all public method boundaries.

---

### Contributions to Team-Based Tasks
- Wrote the **Acknowledgements** section in Developer Guide citing Anki, Quizlet, and AB3.

---
### Mentoring Contributions
- Provided non-trivia PR reviews: [#1](https://github.com/AY2526S2-CS2113-T10-1/tp/pull/1), [#183](https://github.com/AY2526S2-CS2113-T10-1/tp/pull/183)
- Fixed general bugs to ensure the project consistently passed automated build tests
---

### Contributions beyond the Project Team

- Added 6 PR review comments for T09-1's Developer Guide ([Link](https://github.com/NUS-CS2113-AY2526-S2/tp/pull/38))
- Reported 11 bugs during PE Dry Run ([Link](https://github.com/NUS-CS2113-AY2526-S2/ped-yqzzy/issues))

---
### Documentation

#### User Guide

- Wrote the **`study` command** section, full step-by-step session flow, confidence
  rating scale (1–5 with meanings), all three exit paths, empty deck behaviour, and
  persistence note.
- Added the **Table of Contents** with anchor links
- Added the **Notes on Command Format** section
- Standardised formatting across all feature entries

#### Developer Guide

- Wrote the **Study Module** section covering class structure, study session flow,
  confidence-based card ordering, and design rationale (SRP, Facade Pattern, Defensive
  Programming, Immutability of the Original Deck).
- Created three PlantUML diagrams:
    - `study_class.puml` — class diagram of the Study package
    - `study_sequence.puml` — sequence diagram of the full study session flow
    - `study_sorting.puml` — sequence diagram of confidence-based card sorting on session start
