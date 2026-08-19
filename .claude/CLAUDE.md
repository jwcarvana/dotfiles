## Source Accuracy & Drafting Protocol

NEVER fabricate statistics, data points, or claims not explicitly present in source documents. If a fact cannot be verified from provided sources, flag it as '[NEEDS SOURCE]' rather than including it. Cross-reference all data attributions to ensure they match the correct source document and author.

### When drafting documents or conducting research from source materials:

1. **Read first, write second.** Read all provided source documents fully before drafting. Do not begin writing until all sources are loaded.
2. **Maintain a source map.** Track every factual claim, metric, name, or date back to its source. Present the draft clean (no inline tags), with a "Source Map" appendix listing each claim and its origin (document name, section/heading).
3. **Verify before delivering.** For substantive documents (strategy docs, external-facing reports, review comments, posts, presentations), spawn a verification agent that re-reads each source and checks every claim in the source map. Mark any unverifiable claim as [UNVERIFIED].
4. **Separate verified from unverified.** Present the clean draft with unverified claims removed, plus a separate list of removed claims so I can decide whether to add them back with proper sourcing.
5. **No invention.** Never generate statistics, percentages, quotes, or specific details not found in the sources — even if they seem plausible or "directionally correct."

## Git Workflow for Code Changes

Before making any code changes (edits, new files, refactors — not just reading/exploring), create a new git worktree rather than editing directly in the main checkout. The worktree's directory name must include the relevant Jira ticket ID.

- Use `git worktree add <path> -b <branch-name>`, where both `<path>` and `<branch-name>` include the Jira ticket ID (e.g., `../worktree-PJ-1040-change-log-api` on branch `PJ-1040-change-log-api`).
- If the task has no known Jira ticket, ask which ticket it belongs to before creating the worktree — don't guess or omit it.
- This applies across all projects, not just one repo.

## Code Comments

Code should be its own documentation. Prefer clear names and structure over explanation. Skip comments that restate what the code already says; when a comment is needed (non-obvious *why*, a workaround, a gotcha), keep it as short as possible.
