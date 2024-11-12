import java.util.LinkedList;

class HashMap {
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table;

    public HashMap() {
        table = new LinkedList[10];
        for (int i = 0; i < 10; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(int key, int value) {
        int index = key % 10;
        for (Node node : table[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        table[index].add(new Node(key, value));
    }

    public Integer get(int key) {
        int index = key % 10;
        for (Node node : table[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public Integer delete(int key) {
        int index = key % 10;
        for (Node node : table[index]) {
            if (node.key == key) {
                table[index].remove(node);
                return node.value;
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < 10; i++) {
            table[i].clear();
        }
    }
}