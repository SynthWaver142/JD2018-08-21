package by.it.kisielev.jd01_09;

class Scalar extends Var {
    public double getValue() {
        return value;
    }

    private double value;

    Scalar(double value) {
        this.value = value;
    }

    Scalar(Scalar otherScalar){
        value=otherScalar.value;
    }

    public Scalar(String strValue) {
        value=Double.parseDouble(strValue);
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double sub=this.value+((Scalar) other).value;
            return new Scalar(sub);
        }
        else
            return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double sub=this.value-((Scalar) other).value;
            return new Scalar(sub);
        }
        else {
            Var minus=new Scalar(-1);
            return minus.mul(other).add(this);
        }
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double sub=this.value*((Scalar) other).value;
            return new Scalar(sub);
        }
        else
            return other.mul(this);
    }

    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            double sub=this.value/((Scalar) other).value;
            return new Scalar(sub);
        }
        else
            return super.div(this);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
