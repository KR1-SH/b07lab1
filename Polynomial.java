public class Polynomial{
    double[] coefficients;

    public Polynomial(){
        coefficients = new double[1];
        coefficients[0] = 0;
    }

    public Polynomial(double[]coefficients){
        this.coefficients = coefficients;
    }

    public Polynomial add(Polynomial p){
        int length = Math.max(this.coefficients.length, p.coefficients.length);
        double[] new_p = new double[length];

        for (int i=0; i < new_p.length; i++){
            if(i < this.coefficients.length){
                new_p[i] += this.coefficients[i];
            }

            if(i < p.coefficients.length){
                new_p[i] += p.coefficients[i];
            }
        }
        return new Polynomial(new_p);
    }

    public double evaluate(double x){
        double ans = 0;
        for(int i=0; i < coefficients.length; i++){
            ans += coefficients[i] * Math.pow(x, i);
        }
        return ans;
    }

    public boolean hasRoot(double x){
        double sum = this.evaluate(x);
        if(sum == 0){
            return true;
        }
        return false;
    }
}
