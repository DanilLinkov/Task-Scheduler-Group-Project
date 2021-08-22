# Optimal Scheduling Problem

## Solution
The solution of the optimal scheduler problem uses the A* Tree Search algorithm approach that expands the tree based on the f(n) = g(n) + h(n) cost, it will continue expanding until it finds the goal state(every tasks are scheduled) with the lowest f(n). Each state(node) of the schedule is a partial schedule and its children are the possible schedules from that state. It has encountered memory issue but is resolved during optimisation.
## A* Tree Search
### Search
* #### Choosing a node to expand
	The A* Search would proceed by maintaining an open list of nodes that are available to the be chosen and expanded. The data type used for the open list is  a PriorityQueue based on the f(n), the node with lowest f(n) cost would be chosen and it would be checked if goal state is reached. If not, the chosen node would be expanded and it will then be removed from the list, its children nodes would also be added to list and the expansion would continue until goal state is reached.

* #### Expansion of the search Tree
	Once the information of the tasks in the input dot graph has been loaded, the A* search will begin. Initially, the search tree would only consist a root(empty schedule), it would change for every node that what tasks have been scheduled already and what tasks are allowed to be scheduled now. It would expand the search tree by creating children nodes based on the number of tasks available and the number of processors for the scheduling problem.
	
### Heuristics
* #### B-Levels
     
     edit 

## Optimisation
* #### Node Duplication / Memory issue
 	
 	One of the biggest problem that A* Tree Search usually face is that it has a relatively high space complexity compare to DFS Branch and Bound Tree Search. Unlike some algorithms like DFS, A* do not need to backtrack thus it would have a rather large open list to maintain during the search. Node duplication would contribute to most of the memory problem this algorithm face. To further reduced the memory used by the search, a HashSet is used in the AStar.java class to keep track on existing nodes as it is a collection of unique data. Duplicate nodes would be removed from the search thus reduce the memory usage as well as time needed to finish the search.

* #### _scheuleMap in SchdeuleNode
	
	In the previous release, an ArrayList of ArrayList of String is created in every ScheduleNode to keep track of the partial schedule, it has also further contributes to the memory issue. To ease up the memory usage, Hashmap is used again in ScheduleNode.java as ArrayList would resize to a List with 1.5 time the orignal time everytime it exceeds its current limit.
	
### Edge Cases