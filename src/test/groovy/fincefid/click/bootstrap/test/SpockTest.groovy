package fincefid.click.bootstrap.test

import spock.lang.Specification

class SpockTest extends Specification {

    def "first test"() {

        given:
            String hello = 'hello'

        when:
            String result = 'hi'

        then:
            result != hello
    }
}
