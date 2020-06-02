package com.kodilla.basiccalculator;

    class Calculator
    {
        public int addAToB(int a, int b) {
            return a + b;
        }

        public int substractAFromB(int a, int b) {
            return a - b;
        }
    }

    class BasicCalcuatorApplication {
        public static void main(String[] args) {

            Calculator calculator = new Calculator();

            int resultOfAddition = calculator.addAToB(5, 5);
            int resultOfSubstraction = calculator.addAToB(5, 5);

            System.out.println("result od addition: " + resultOfAddition);
            System.out.println("result od substraction: " + resultOfSubstraction);


        }
    }