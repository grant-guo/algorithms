package grant.guo.algorithms.graph;

/**
 * Build Order: You are given a list of projects and a list of dependencies (which is a list of pairs of
 * projects, where the second project is dependent on the first project). All of a project's dependencies
 * must be built before the project is. Find a build order that will allow the projects to be built. If there
 * is no valid build order, return an error.
 * EXAMPLE
 * Input:
 * projects: a, b, c, d, e, f
 * dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
 * Output: f, e, a, b, d, c
 */
public class BuildOrder {

    public static void main(String[] args) {
        // build the graph first
        // if the nodes have no incoming edges, which means those nodes have no dependencies
        // build those nodes(output them as the first level)
        // remove those nodes from the graph
        // some new nodes which has no incoming edges appears, they become the next level
        // repeat the above steps until the whole graph is empty
    }
}
