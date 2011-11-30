import org.scalatest.Spec
import fcx.codestory.FooBarQix2
import fcx.codestory.FooBarQix3

class FooBarQixSpec extends Spec {

  describe("Unit tests of FooBarQix2.java") {

    it("1 --> 1") {
      assert(FooBarQix2.convert(1) == ("1"))
    }
    it("2 --> 2") {
      assert(FooBarQix2.convert(2) == ("2"))
    }
    it("3 --> FooFoo") {
      assert(FooBarQix2.convert(3) == ("FooFoo"))
    }
    it("4 --> 4") {
      assert(FooBarQix2.convert(4) == ("4"))
    }
    it("5 --> BarBar") {
      assert(FooBarQix2.convert(5) == ("BarBar"))
    }
    it("6 --> Foo") {
      assert(FooBarQix2.convert(6) == ("Foo"))
    }
    it("7 --> QixQix") {
      assert(FooBarQix2.convert(7) == ("QixQix"))
    }
    it("8 --> 8") {
      assert(FooBarQix2.convert(8) == ("8"))
    }
    it("9 --> Foo") {
      assert(FooBarQix2.convert(9) == ("Foo"))
    }
    it("10 --> Bar") {
      assert(FooBarQix2.convert(10) == ("Bar"))
    }
    it("13 --> Foo") {
      assert(FooBarQix2.convert(13) == ("Foo"))
    }
    it("15 --> FooBarBar") {
      assert(FooBarQix2.convert(15) == ("FooBarBar"))
    }
    it("21 --> FooQix") {
      assert(FooBarQix2.convert(21) == ("FooQix"))
    }
    it("33 --> FooFooFoo") {
      assert(FooBarQix2.convert(33) == ("FooFooFoo"))
    }
    it("51 --> FooBar") {
      assert(FooBarQix2.convert(51) == ("FooBar"))
    }
    it("53 --> BarFoo") {
      assert(FooBarQix2.convert(53) == ("BarFoo"))
    }
  }

  describe("Unit tests of FooBarQix3.java") {

    it("1 --> 1") {
      assert(FooBarQix3.convert(1) == ("1"))
    }
    it("2 --> 2") {
      assert(FooBarQix3.convert(2) == ("2"))
    }
    it("3 --> FooFoo") {
      assert(FooBarQix3.convert(3) == ("FooFoo"))
    }
    it("4 --> 4") {
      assert(FooBarQix3.convert(4) == ("4"))
    }
    it("5 --> BarBar") {
      assert(FooBarQix3.convert(5) == ("BarBar"))
    }
    it("6 --> Foo") {
      assert(FooBarQix3.convert(6) == ("Foo"))
    }
    it("7 --> QixQix") {
      assert(FooBarQix3.convert(7) == ("QixQix"))
    }
    it("8 --> 8") {
      assert(FooBarQix3.convert(8) == ("8"))
    }
    it("9 --> Foo") {
      assert(FooBarQix3.convert(9) == ("Foo"))
    }
    it("10 --> Bar") {
      assert(FooBarQix3.convert(10) == ("Bar"))
    }
    it("13 --> Foo") {
      assert(FooBarQix3.convert(13) == ("Foo"))
    }
    it("15 --> FooBarBar") {
      assert(FooBarQix3.convert(15) == ("FooBarBar"))
    }
    it("21 --> FooQix") {
      assert(FooBarQix3.convert(21) == ("FooQix"))
    }
    it("33 --> FooFooFoo") {
      assert(FooBarQix3.convert(33) == ("FooFooFoo"))
    }
    it("51 --> FooBar") {
      assert(FooBarQix3.convert(51) == ("FooBar"))
    }
    it("53 --> BarFoo") {
      assert(FooBarQix3.convert(53) == ("BarFoo"))
    }
  }

}
