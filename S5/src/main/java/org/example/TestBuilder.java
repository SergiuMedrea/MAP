package org.example;

enum Operation {equal, greater, less}

public class TestBuilder {
    private String description;
    private Object expected;
    private Operation operation;
    public TestBuilder() {

    }

    public TestBuilder describe(String description) {
        this.description = description;
        return this;
    }

    public TestBuilder expect(Object expected) throws Exception {
        if(this.description == null) {
            throw new Exception("Missing Description");
        }
        this.expected = expected;
        return this;
    }

    public TestBuilder equal() throws Exception {
        if(this.expected == null) {
            throw new Exception("Missing Excepted");
        }
        this.operation = Operation.equal;
        return this;
    }

    public void to(Object actual) throws Exception {
        if(this.operation == null) {
            throw new Exception("Missing Operation");
        }
        if(this.operation == Operation.equal && !this.expected.equals(actual)) {
            throw new AssertionError(this.description + "failed");
        }
    }
}
