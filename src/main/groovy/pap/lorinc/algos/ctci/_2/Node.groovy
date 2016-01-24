package pap.lorinc.algos.ctci._2

import groovy.transform.*

@TupleConstructor @EqualsAndHashCode(includes = 'value') @ToString(includePackage = false)
class Node<T> implements Iterable<Node<T>> {
    static final SENTINEL = new Node<>()

    T value
    Node<T> next = SENTINEL

    static Node<T> from(Object elems) {
        def preHead = new Node()
        elems.inject(preHead) { Node node, T value -> node.addAfter(value) }
        preHead.next
    }
    def Node<T> copy() { from(toList()) }
    def List<T> toList() { iterator()*.value }

    def replace(Node<T> node) {
        value = node.value
        next = node.next
    }
    def addAfter(T value) { next = new Node(value, next) }
    def addBefore(T value) { new Node(value, this) }

    def hasNext() { next != null }

    @Override Iterator<Node<T>> iterator() {
        new Iterator<Node<T>>() {
            def previous = Node.this.addBefore(null)
            @Override boolean hasNext() { previous?.next?.hasNext() }
            @Override Node<T> next() { previous = previous?.next }
        }
    }
}
