public class Calculate {
        private int angka1;
        private int angka2;

        public int getAngka1() {
            return angka1;
        }

        public int setAngka1(int angka1) {
            this.angka1 = angka1;
            return angka1;
        }

        public int getAngka2() {
            return angka2;
        }

        public int setAngka2(int angka2) {
            this.angka2 = angka2;
            return angka2;
        }

        public void addAllnumber() {
            int total = angka1 + angka2;
            System.out.println("Total penjumlahan: " + total);
        }

        public void multiplyNumber(int angka1, int angka2) {
            int result = angka1 * angka2;
            System.out.println("Perkalian: " + result);
        }
    }

