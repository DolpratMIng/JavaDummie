package com.company;

    public class Temperature {
        // field variable
        private double number;

        private TempScale scale;

        // four constructors
        public Temperature() {
            number = 0.0;
            scale = TempScale.FAHRENHEIT;
        }

        public Temperature(double number) {
            this.number = number;
            scale = TempScale.FAHRENHEIT;
        }

        public Temperature(TempScale scale) {
            number = 0.0;
            this.scale = scale;
        }

        public Temperature(double number, TempScale scale) {
            this.number = number;
            this.scale = scale;
        }

        // setter and getter
        public void setNumber(double number) {
            this.number = number;
        }

        public double getNumber() {
            return number;
        }

        public void setScale(TempScale scale) {
            this.scale = scale;
        }

        public TempScale getScale() {
            return scale;
        }
    }

