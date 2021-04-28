

describe("my test cases", () => {
    var x = new sample();
    // const x=require(".sample");
    it("should be able to add 2 numbers", () => {
        expect(x.sum(5, 99)).toEqual(104)
    });
    it("should be able to verify its even", () => {
        expect(x.isEven(96)).toBe(true);
    });
    it("should be able to verify its odd", () => {
        expect(x.isOdd(55)).toBe(true);
    });
    it("should be able conveert string to lowercase", () => {
        expect(x.isLowerCase).toBeDefined();
        expect(x.isLowerCase('Hello World')).toEqual('hello world');
    });
    it("should be able conveert string to uppercase", () => {
        expect(x.isUpperCase).toBeDefined();
        expect(x.isUpperCase('Hello World')).toEqual('HELLO WORLD');
    });
});