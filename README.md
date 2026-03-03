# Restaurant Table Reservation Platform

*I made this repository to learn Git.*

*We will make the real one in SLIIT Github account later*

<ins>This is just a testing</ins>

# 📌 Git Instructions for Team Members

Welcome to the **Restaurant Table Reservation Platform** project!  
Follow these instructions to work safely with Git and GitHub.

---

## 1️⃣ Clone the Repository (First Time)

```bash
git clone <repo-url>
cd <project-folder>
```

---
## 2️⃣ Branching Strategy

*Do not work on main branch.*

*Always create a new branch for your feature or fix:*
```bash
git checkout -b feature-yourname
```
Example:
```bash
git checkout -b feature-login
```

Naming convention:
feature-[your-feature] or bugfix-[description]

---

## 3️⃣ Work on Your Branch

*Make changes in your local project*

*Stage and commit your changes with meaningful messages:*
```bash
git add .
git commit -m "Added login controller and form validation"
```

---
## 4️⃣ Keep Your Branch Updated

Before pushing, pull latest changes from main:
```bash
git checkout main
git pull origin main
git checkout feature-yourname
git merge main
```

Resolve any merge conflicts if they occur.
--- 

## 5️⃣ Push Your Branch
```bash
git push origin feature-yourname
```

---

## 6️⃣ Create a Pull Request (PR)

*Go to the repository on GitHub*

*Click Compare & Pull Request*

*Add a title and description*

*Click Create Pull Request*

*Wait for code review*

*Only merge when approved*

---

## 7️⃣ After Pull Request is Merged

Update your local main branch:
```bash
git checkout main
git pull origin main
```

Delete your feature branch locally if done:
```bash
git branch -d feature-yourname
```

---

## 8️⃣ Important Rules

❌ Do not push directly to main

✅ Always create a feature branch

✅ Write meaningful commit messages

✅ Pull before pushing to avoid conflicts

✅ Review PRs carefully before merging
