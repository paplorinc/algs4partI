package pap.lorinc.algos.sort

import groovy.transform.CompileStatic
import pap.lorinc.algos.union_find.tools.Random

@CompileStatic class Main {
    static void main(String... args) {
        def rand = Random.random()
        def elems = (0..<1000).collect { rand.nextInt() }.asImmutable()
        def referenceSortedElems = elems.sort(false).asImmutable()

        def insertionSorted = Insertion.sort(elems)
        assert insertionSorted == referenceSortedElems
    }
}