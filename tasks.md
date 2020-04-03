# Goals/Agenda

- History of TDD
- What is TDD
- <Exercise>
  - Best practices
- Why bother?
- Further readings

## Exercise

Goal: Implement a `Set collection` 
Assumption: 
 - We dont have access to the collections library
 - Use only primitive types (Int, Boolean..., Object[])
 - Not about syntax
 
Properties:
 - Unique items
 - Unordered
 - Can grow
 
Behavior
- Boolean isEmpty()
- Int size()
- Boolean contains(Object)
- void add(Object)
- void remove(Object)

## Best practices
- Do the minimum to make the tests pass
- Readablity of tests (tests as specs)
- Coding by wishful thinking
- Call the shot (look for valid failure)


## What is TDD
Test Driven Development

**Drive out new behavior with tests** 

|--> Failing test (Red) (T)
|     |
|   Make Code work(Green) (P)
|     |
|--- Clean up(Refactor) (T/P)

**Red -> Green -> Refactor**


## history
1957 IBM NASA punch cards
1987 SUnit - unit tests - Kent Beck 

JUnit
BDD - Gherkin
> Given
> when 
> then

RSpec
Cucumber


