package ExceptionPractice;
/*Remember our Pair class from generics. At the moment, users can pass null values to the Pair constructor.
Let us modify the Pair class so that it throws an exception if the left or right value is null.*/

class Pair<First,Second>{
    First first;
    Second second;

    Pair(First first, Second second) {
//        if(first==null||second==null){
//            throw new NullPointerException("Null values are not accepted");
//        }

            if(first == null || second==null){
                throw new NullPointerException();
            }
            else {
                this.first = first;
                this.second = second;
            }


    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}