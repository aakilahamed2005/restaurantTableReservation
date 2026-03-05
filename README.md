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


---

## Now after Cloning the repository locally you'll can open it in InteliJ IDE and then RUN
```
src/main/java/com/example/restaurantTableReservation/RestaurantTableReservationApplication.java
```

After program runs, open a web browser and type
```
localhost:8080
localhost:8080/restaurant
```

Try stuffs by your self. 

---
## Additional Git Commands that can be useful

```
git status
```
*git status* this command is used to get the status of the branch

```
git branch 
```

*This command is used to get the all the branches in a repository*


```
git log --oneline
```
output of the above in this repository
```
7ebb855 (HEAD -> aakil-branch, origin/rithika-branch, origin/nivetha-branch, origin/main, origin/jeniviya-branch, origin/bruthapan-branch, origin/anfaz-branch, origin/aakil-branch, origin/HEAD, rithika-branch, nivetha-branch, main, jeniviya-branch, bruthapan-branch, anfaz-branch) Merge pull request #1 from aakilahamed2005/feature-Aakil
c395589 (origin/feature-Aakil) Added homepage
b6bf5df Update README with application run instructions
bfe26b6 Merge branch 'main' of https://github.com/aakilahamed2005/restaurantTableReservation
a201834 Initial commit - project structure
1d9522c Update README with Git instructions for team members
aa1f5ad Initial commit
```


*using this we can get our commit history*

*using the relevent **commit hash** we could revert to the specific commit*


```
git revert <commit-hash>
```
*Git will create a new commit that cancels that commit’s changes.*
