# Alex Moore ITCS 3153

import random

# Calculate h-value for given state
def calculate_h(state):
    h = 0
    for i in range(len(state)):
        for j in range(len(state[i])):
            if state[i][j] == 1:

                # check for horizontal conflicts

                for k in range(len(state[i])):
                    if k != j and state[i][k] == 1:
                        h += 1
                # check vertical conflicts
                for k in range(len(state)):
                    if k != i and state[k][j] == 1:
                        h += 1
    return h

def generate_state(size):
    state = [[0] * size for _ in range(size)]
    for i in range(size):
        j = random.randint(0, size - 1)
        state[i][j] = 1
    return state

def print_state(state):
    for row in state:
        print(','.join(map(str, row)))

size = 8
max_iterations = 20
current_state = generate_state(size)
current_h = calculate_h(current_state)
iterations = 0
state_changes = 0
restarts = 0

while current_h > 0 and iterations < max_iterations:
    print("\nCurrent h:", current_h)
    print("Current State")
    print_state(current_state)

    neighbors = []
    for i in range(size):
        for j in range(size):
            if current_state[i][j] == 1:
                for k in range(size):
                    if current_state[i][k] == 0:
                        neighbor = [row[:] for row in current_state]
                        neighbor[i][j] = 0
                        neighbor[i][k] = 1
                        neighbors.append(neighbor)

    neighbors_h = [calculate_h(neighbor) for neighbor in neighbors]
    min_h = min(neighbors_h)

    if min_h < current_h:
        min_h_neighbors = [neighbor for neighbor, h in zip(neighbors, neighbors_h) if h == min_h]
        current_state = random.choice(min_h_neighbors)
        current_h = min_h
        print("Neighbors found with lower h:", len(min_h_neighbors))
        print("Setting new current state")
        state_changes += 1
    else:
        print("Local minimum found. Restarting...")
        current_state = generate_state(size)
        current_h = calculate_h(current_state)
        restarts += 1

    iterations += 1

if current_h == 0:
    print("\nCurrent State")
    print_state(current_state)
    print("Solution found!")
else:
    print("\nNo solution found in", max_iterations, "iterations.")

print("State changes:", state_changes)
print("Restarts:", restarts)
