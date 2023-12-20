# Autoconfiguration Demo

## Problem Statement

### Prerequisites

- Two beans exist in the project: `MainBean` and `DependencyBean`;
- `MainBean` is annotated with a stereotype, but `DependencyBean` is not, instead it is defined in Autoconfiguration;
- `DependencyBean` has no dependencies, thus can be easily created, but `MainBean` depends on the existence of `DependencyBean`;

### Expected Result

If `DependencyBean` has no dependencies it should be created. `MainBean` has a dependency on `DependencyBean`,
but since `DependencyBean` will be created then `MainBean` should also be created.

### Actual Result

None of the beans created.
