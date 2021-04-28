describe("Strings", () => {
    describe("String Lower or Upper", () => {
        it("String is expected to be in lowercase", () => {
            expect(lowerX).toEqual("hello world!");
        });
        it("String is expected to be in UpperCase", () => {
            expect(upperX).toEqual("HELLO WORLD!");
        });
    });
    describe("Concatenation", () => {
        it("String is expected to be concatenated", () => {
            expect(x.concat(y)).toBe("Hello World!This is Jasmine using JS");
        });
    });
});


describe("Numbers", () => {
    it("Expecting number to be even", () => {
        expect(num1%2).toEqual(0);
    });
    it("Expecting the number to be odd", () => {
        expect(Math.abs(num2%2)).toEqual(1);
    });
    it("Checking for addition of numbers", () => {
        expect(num1+num2).toEqual(201);
    });
    it("Checking if it is NaN", () => {
        expect(parseInt(x)).toBeNaN();
    });
    it("expecting the result to be a number", () => {
        expect(parseInt(str)).toEqual(jasmine.any(Number));
    });
    
});

