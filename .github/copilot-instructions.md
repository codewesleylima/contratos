# Copilot Agent Instructions

## Commit Convention

Follow conventional commits with this exact pattern:
- Format: `type(scope): description in english, lowercase, no period`
- Types: `feat`, `fix`, `refactor`, `doc`, `config`, `test`, `chore`
- Scopes: `controller`, `service`, `serviceImpl`, `repository`, `model`,
  `properties`, `build.gradle`, `readme`
- Each file change = one commit (atomic commits)
- Description must be concise and explain WHAT was done

Examples from this project:
- `feat(serviceImpl): build new method for list all contracts`
- `fix(controller): fixed name of path`
- `fix(properties): remove unnecessary resource`
- `fix(build.gradle): remove dependencie that not is necessary for this moment`
- `doc(readme): build my readme for direct users of my project about contracts`
- `refactor(service): refected method about list contracts for using names`
- `feat(controller): build a new method for request a method that get all contracts`
- `config(build.gradle): add depencencies starter for jpa, web, validation`
- `config(properties): build config for connect with my local database`

## PR Description Convention

When creating a PR, write the description as a bullet list that groups
related commits by category. Each bullet starts with a verb and ends
with semicolon.

Example format:
- Add contract listing feature with service and controller layers;
- Refactor service logic for better readability and naming;
- Fix controller path mapping issue;
- Remove unnecessary imports, dependencies, and configurations;
- Improve README with usage instructions and new feature documentation;

## Branch Naming

- Features: `feature/short-description`
- Fixes: `fix/short-description`
- Refactors: `refactor/short-description`

## Important Rules

1. NEVER auto-approve or auto-merge PRs
2. Always push to the feature branch, never directly to main
3. Update README when adding new endpoints or features
4. Commit each file change separately (atomic commits)