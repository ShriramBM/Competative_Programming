# Binary Tree

A tree is a popular data sturcture that is non -linear in nature.

Binary tree  contains two pointers that are left child and right child of parent node

## <u><b>Root</b></u>
> The root of a tree is the topmost node of the tree that has no parent node. There is only one root node in every tree.

>``` mermaid
>flowchart LR
>    id1((root)) --> Root_Node
>```

## <u><b>Edge</b></u>
> Edge acts as a link between the parent node and child node
> ``` mermaid
> flowchart TD
>    id1((root)) --> |edge|id2((node))
> ```

## <u><b>Leaf </b></u>
> A node that has no child is know as leaf node. it is the last node of the tree. there can be multiple leaf node on a tree

> ``` mermaid
> flowchart TD
>    id1((root)) --> |edge|id2((leaf1))
>    id1((root)) --> |edge|id3((leaf2))
> ```

## <u><b>Subtree</b></u>
> The subtree of a node is the tree considering that particular node as the root node.

> ``` mermaid
> flowchart TD
>    id1((A)) --> |edge|id2((B))
>    id1((A)) --> |edge|id3((C))
>    id3 --> |edge|id5((D))
>    id3 --> |edge|id6((E))
>    id6 --> |edge|id7((F))
>    id6 --> |edge|id8((G))
> ```
> Consider C, E are the subtree

## <u><b>Depth</b></u>
> The Dept of the node is the distance from the root node to that particular node

> ``` mermaid
> flowchart TD
>    id1((D0)) --> |edge|id2((D1))
>    id1 --> |edge|id3((D1))
>    id3 --> |edge|id5((D2))
>    id3 --> |edge|id6((D2))
>    id6 --> |edge|id7((D3))
>    id6 --> |edge|id8((D3))
> ```
> D - represent Dept with number

## <u><b>Height</b></u>