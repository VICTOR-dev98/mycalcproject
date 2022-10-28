package project.calculator;

public class Add implements Operate {

    public Double getResults(Double...numbers) {
        Double sum = 0.0;

        for (Double num : numbers) {
            sum +=num;
        }

        return sum;
    }

    @Override
    public Double getResult(Double... numbers) {
        return null;
    }
}
