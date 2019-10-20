package sk.itsovy.mati.projectfragment;

public class Fragment {

        private int numerator;
        private int denominator;

        public Fragment(int numerator, int denominator){
            if (denominator ==0);
            denominator = 1;
            this.numerator = numerator;
            this.denominator = denominator;
        }
        public Fragment (Fragment otherFragment){
            numerator=otherFragment.getNumerator();
            denominator=otherFragment.getDenominator();
        }

        public int getNumerator() {
            return numerator;
        } //dostať čitateľa

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        } //nastaviť čitatela

        public int getDenominator() {
        return denominator;
    } // získať menovateľ

        public void setDenominator(int denominator) {
        this.denominator = denominator;
    } // nastaviť menovateľ

        public void changeToBasicShape(){ // zmena základného tvaru
            int commonDividisor=getTheLargestCommonDivisor();
            numerator=numerator/commonDividisor;
            denominator=denominator/commonDividisor;
        }
        public void extendFragment(int value){ // predĺžiť fragment
            if (value !=0);
            numerator*=value;
            denominator*=value;

        }
        public double getRealValue(){
            return (double)numerator/denominator;
        } // získať skutočnú hodnotu

        public void reverse(){  //zvrátiť
            int temp=numerator;
            numerator=denominator;
            denominator=temp;
        }
        public void opposite (){
            numerator*=-1;
        } // opak

        public Fragment copy(){
            Fragment newFragment=new Fragment(numerator, denominator);
            return newFragment;
        }
        private int getTheLargestCommonDivisor(){
            int absNumerator=Math.abs(numerator);
            int absDemoninator=Math.abs(denominator);

            int commonDivisor=absNumerator<absDemoninator?absNumerator:absDemoninator;
            while (absNumerator % commonDivisor != 0 ││ absDemoninator%commonDivisor != 0){
                commonDivisor--;
            }
            return commonDivisor;
        }
        public boolean isFrameInBasicShape(){
            if (getTheLargestCommonDivisor()==1){
                return true;
            }
            else {
                return false;
            }
            @Override
                    public String toString(){
                return numerator +" / "+denominator;
            }

            public MixedNumber getMixedNumber(){
                int value = numerator/denominator;
                Fragment f=new Fragment(numerator%denominator,denominator );
                return new MixedNumber(value,f);
        }
            int fractionParts = 0; // zlomkove casti
            int numerator = 0;
            int denominator = -2;
            public int[] reducedFraction (int numerator, int denominator)
            {
                int GCD = numerator;
                int tempN = numerator;
                int tempD = denominator;
                int[] fractionParts = {0, numerator, denominator};
                if (numerator == 0){
                    return fractionParts;
                }
                GCD = (numerator < 0) ? -numerator: numerator;
                tempD = (denominator < 0) ? -denominator: denominator;
                while (GCD != tempD){
                    if (GCD > tempD)
                        GCD -= tempD;
                    else
                        tempD-= GCD;
                }
                fractionParts [1] /= GCD;
                fractionParts [2] /= GCD;
                tempN = (fractionParts [1] < 0) ? -fractionParts [1]: fractionParts [1];
                tempD = (fractionParts [2] < 0) ? -fractionParts [2]: fractionParts [2];
                if (tempN < tempD)
            }
            return fractionParts;
            }
            fractionParts [0] = fractionParts [1] / fractionParts [2];
            fractionParts [1] = fractionParts [1] - (fractionParts [1] / fractionParts [2]) * fractionParts [2];
            if (fractionParts [1] < 0 && fractionParts [2] < 0){
                fractionParts [1] = (fractionParts [1] < 0) ? -fractionParts [1]:fractionParts [1];

                fractionParts [2] = (fractionParts [2] < 0) ? -fractionParts [2]: fractionParts [2];
            }
            return fractionParts;
    }
    public void display(){
    if ((reducedFraction (numerator, denominator) [1] == 0)
        c.print (reducedFraction (numerator, denominator) [0]);)

        else if (reducedFraction (numerator, denominator) [0] == 0)
            c.print (reducedFraction (numerator, denominator) [1] + "/" + reducedFraction (numerator, denominator) [2]);
        else
            c.print(reducedFraction (numerator, denominator) [0] + " " + reducedFraction (numerator, denominator) [1] + "/" + reducedFraction (numerator, denominator) [2]);
    }

}


