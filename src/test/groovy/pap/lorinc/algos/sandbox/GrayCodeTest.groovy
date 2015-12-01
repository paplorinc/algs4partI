package pap.lorinc.algos.sandbox

import spock.lang.Specification

class GrayCodeTest extends Specification {
    /*@formatter:off*/
    def 'can convert from Gray to Binary and back'() {
        expect: GrayCode.fromBinary(binary) == gray
                GrayCode.toBinary(gray) == binary
        where:  binary    || gray
                0b00000   || 0b00000
                0b00001   || 0b00001
                0b00010   || 0b00011
                0b00011   || 0b00010
                0b00100   || 0b00110
                0b00101   || 0b00111
                0b00110   || 0b00101
                0b00111   || 0b00100
                0b01000   || 0b01100
                0b01001   || 0b01101
                0b01010   || 0b01111
                0b01011   || 0b01110
                0b01100   || 0b01010
                0b01101   || 0b01011
                0b01110   || 0b01001
                0b01111   || 0b01000
                0b10000   || 0b11000
                0b10001   || 0b11001
                0b10010   || 0b11011
                0b10011   || 0b11010
                0b10100   || 0b11110
                0b10101   || 0b11111
                0b10110   || 0b11101
                0b10111   || 0b11100
                0b11000   || 0b10100
                0b11001   || 0b10101
                0b11010   || 0b10111
                0b11011   || 0b10110
                0b11100   || 0b10010
                0b11101   || 0b10011
                0b11110   || 0b10001
                0b11111   || 0b10000

                0b1101001 || 0b1011101
    }
    /*@formatter:on*/
}