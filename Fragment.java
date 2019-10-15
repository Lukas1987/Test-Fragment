package sk.itsovy.mati.fragment;

public class Fragment {
    private int numerator;
    private int demoninator;
}

    public void Fragment(int numerator, int demoninator){
    if(demoninator ==0);
        denominator = 1;
    this.numerator = numerator;
    this.demoninator = demoninator;
}
    public Fragment(Fragment otherFragment){
    numerator = otherFragment.getNumerator();
    demoninator = otherFragment.getDenominator();
}
    public int getNumerator() (return numerator;)

    public void setNumberator(int numerator) (this.numerator = numerator;)

    public double getRealValue(){

}
    public void changeToBasicChange(){
    int commonDivisor=getTheLargestCommonDivision();
    while (numerator % commonDivisor != || demoninator%commonDivisor != 0){
        commonDivisor--;
    }

}
    public void reverse(){
    int temp=numerator;
    numerator=demoninator;
    demoninator=temp;
}

    public void opposite(){

    }
    public Fragment copy(){
    Fragment newFragment=new Fragment()
    return null;

    }

    private int getTheLargestCommonDivision(){//
    // if numerator < demoninator
        int absNumerator = Math.abs(numerator);
        int absdenominator = Math.abs(demoninator);

    int min= numerator<absdemoninator?absnumerator:absdemoninator;
    while (absNumerator % commonDivisor !=0  || absdenominator%commonDivisor != 0)
        commonDivisor--;

    }

    return commonDivisor;
            }
            public boolean isFragmentinBasicChange(){
    if (getTheLargeCommonDivisor()==1){
        return true;
        else
            return false;
        }
        }
        @Override
        public String toString(){
    return numerator" / " + denominator;
        }


