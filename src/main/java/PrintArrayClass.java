public class PrintArrayClass<X,Y,Z>
{
    X[] myXArray;
    Y[] myYArray;
    Z[] myZArray;
    public PrintArrayClass(X[] myXArray,Y[] myYArray,Z[] myZArray)
    {
        this.myXArray=myXArray;
        this.myYArray=myYArray;
        this.myZArray=myZArray;
    }

    public static void main(String[] args)
    {


        Integer[] array={1,2,3,4,};
        Character[] charArray={'A','B','c'};
        Double[]doubleArray={1.1,2.2,3.3};
        printArray(array);
        printArray(charArray);
        printArray(doubleArray);

        new  PrintArrayClass<Integer,Double,Character>(array,doubleArray,charArray).toPrint();

    }

    private void toPrint()
    {
        printArray(myXArray);
        printArray(myYArray);
        printArray(myZArray);

    }


   private static <E> void printArray(E[] array) {
        for (E i:array
             ) {
            System.out.println(i);
        }
    }
}
