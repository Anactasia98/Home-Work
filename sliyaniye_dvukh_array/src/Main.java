import java.util.Arrays;


public class Main {

    public static int[] getNewArray(int[] arr1, int[] arr2) {
        int[] newarr = new int[arr1.length+arr2.length];

        int i=0; //newarr
        int ar1=0;//arr1
        int ar2=0;//arr2

//         int[] newarr = {-10,1,-1,0,0,0,0,0,0,0,0,0,0};
//        int[]arr1 = {-2, -1, 0, 4, 7, 10, 12}; 6элем 7размер
//        int[] arr2 = {-10, 1, 1, 1, 2, 3, 6, 7, 10, 100, 1000}; 10элем 11размер

        while(ar1<arr1.length && ar2<arr2.length){
            if(arr1[ar1]<=arr2[ar2]){ //-2<=-10 false //-2<=1 true //-1<=1
                newarr[i]=arr1[ar1]; //ar1=-2 =newarr
                ar1++;
            }else{
                newarr[i]=arr2[ar2]; //ar2=-10= newarr
                ar2++; //ar2=1
            }
            i++;
        }

        while (ar1<arr1.length){ //7<7 faise
            newarr[i]=arr1[ar1];
            i++;
            ar1++;
        }


        while (ar2<arr2.length){ //9<11 true
            newarr[i]=arr2[ar2];
            i++;
            ar2++;
        }

        return newarr;
    }

    public static void main(String[] args) {


        int[]arr1 = {-2, -1, 0, 4, 7, 10, 12};
        int[] arr2 = {-10, 1, 1, 1, 2, 3, 6, 7, 10, 100, 1000};

        int[] result = getNewArray(arr1, arr2);
        System.out.println(Arrays.toString(getNewArray(arr1, arr2)));

    }
}