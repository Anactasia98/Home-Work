//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //lTrim                                      +      metod udalyayet probeli s leva
    //RTrim                                             metod udalyayet probeli s prava
    public static char[] trimR(char[] arr) {
        int countR = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                countR++;
            } else {
                break;
            }
        }
        char[] newArr = new char[arr.length - countR];
        for (int i = 0, j = 0; i < arr.length - countR; i++, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }

    //Trim                                       +      metod udalyayet probeli s prava i s leva
    //equals                                            metod proveryayet s ucetom registra
    public static boolean Equals(char[] one, char[] two) {
        if (one.length != two.length) {
            return false;
        }
        for (int i = 0; i < one.length; i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }
        return true;
    }

    //startsWith     metod proveryayet nacinaetsa li stroka na ukazannuyu stroku
    public static boolean startsWith(char[] stroka1, char[] stroka2) {
        if (stroka2.length > stroka1.length) {
            return false;
        }
        for (int i = 0; i < stroka2.length; i++) {
            if (stroka1[i] != stroka2[i]) {
                return false;
            }
        }
        return true;
    }

    //replace            metod zamenyayet staruyu stroku na novuyu
    public static boolean contains(char[] arr, char[] search, int start) {
        int i = 0;
        while (i < search.length) {
            if (arr[i + start] != search[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int countVxojdeniy(char[] arr, char[] search) {
        int count = 0;
        int i = 0;
        while (i <= arr.length - search.length) {
            if (contains(arr, search, i)) {
                i += search.length;
                count++;
            }
            i++;
        }
        return count;
    }

    public static int indexOf(char[] arr, char[] search, int start) {
        int i = start;
        while (i <= arr.length - search.length) {
            if (contains(arr, search, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static char[] replaceAll(char[] original, char[] oldStr, char[] newStr) {
        int countEnter = countVxojdeniy(original, oldStr);

        if (countEnter == 0) {
            return original;
        }
        //10        -            (3*2)            +         (1*2) => 6
        int newSize = original.length - (oldStr.length * countEnter) + (newStr.length * countEnter);

        char[] result = new char[newSize];


        int startIndex = 0;//po staromu massivu
        int findIndex = 0;//index vxojdeniya
        int resultIndex = 0;//po novomu massivu


        while ((findIndex = indexOf(original, oldStr, startIndex)) != -1) {//findex => pervoqo vxojdeniya

            result = arrayCopy(original, startIndex, result, resultIndex, findIndex - startIndex);
            resultIndex += findIndex - startIndex;

            result = arrayCopy(newStr, 0, result, resultIndex, newStr.length);
            resultIndex += newStr.length;

            startIndex = findIndex + oldStr.length;
        }


        result = arrayCopy(original, startIndex, result, resultIndex, original.length - startIndex);

        return result;
    }

    public static char[] arrayCopy(char[] str, int strIndex, char[] dest, int destIndex, int leng) {
        int i = 0;
        while (i < leng) {
            dest[destIndex + i] = str[strIndex + i];
            i++;
        }
        return dest;
    }

    //equalsIgnoreCase                           +      metod proveryayet s bez uceta registra
    //concat                                            metod kotoriy dobovlyayew k tekusey stroke novuyu stroku
    public static char[] concat(char[] stroka1, char[] stroka2) {
        char[] newStroka = new char[stroka1.length + stroka2.length];
        for (int i = 0, j = 0; i < newStroka.length; i++) {
            if (i <= stroka1.length - 1) {
                newStroka[i] = stroka1[i];
            } else {
                newStroka[i] = stroka2[j];
                j++;
            }
        }
        return newStroka;
    }

    //endsWith     metod proveryayet zakancivaetsa li stroka na ukazannuyu stroku
    public static boolean endsWith(char[] stroka1, char[] stroka2) {
        if (stroka2.length > stroka1.length) {
            return false;
        }
        for (int i = stroka2.length - 1, j = stroka1.length - 1; i >= 0; i--, j--) {
            if (stroka1[j] != stroka2[i]) {
                return false;
            }
        }
        return true;
    }

    //substring             metod izvlekaet pod stroku iz tekusey straki
    public static char[] substring(char[] stroka, int indexStart, int indexExit) {
        int count = 0;

        for (int i = indexStart; i < indexExit; i++) {
            count++;

        }
        char[] newStroka = new char[count];
        for (int i = indexStart, j = 0; i < indexExit; i++, j++) {
            newStroka[j] = stroka[i];
            System.out.print(newStroka[j]);
        }
        return newStroka;

    }

    //toCharArray               metod konvirtiruet stroku v massiv char
    //charAt()
    public static char[] toCharArray(String texst) {
        char[] newTexst = new char[texst.length()];
        for (int i = 0; i < newTexst.length; i++) {
            newTexst[i] = texst.charAt(i);
        }

        return newTexst;
    }
    //indexOf( char a)                           +      metod vozvrasaet index dannoqo simvola

    //indexOf( char a , int fromIndex)                  metod vozvrasaet index dannoqo slova esli ono est , nacinaya s fromIndex , inace -1
    //        String text="Hi! My name Nasty.";
    //        char[]perevodText= toCharArray(text);
    //        char[]slovo={'M','y'};
    //        System.out.println(indexOf1(perevodText,slovo,4));
    public static int indexOf1(char[] stroka, char[] slovo, int fromIndex) {
        for (int i = fromIndex; i <= stroka.length - slovo.length; i++) {
            int j = 0;
            while (j < slovo.length) {
                if (stroka[i] != slovo[j])
                    break;
                if (j == slovo.length - 1) {
                    return i - j;
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    //lastIndexOf( char a)                       +      metod vozvrasaet index dannoqo simvola s konca , inace -1
    //lastIndexOf( char a , int fromIndex)              metod vozvrasaet index dannoqo slova s konca esli ono est nacinaya s fromIndex , inace -1
    public static int indexOf2(char[] stroka, char[] slovo, int fromIndex) {
        for (int i = fromIndex; i >= 0; i--) {
            int j = slovo.length - 1;
            while (j >= 0) {
                if (stroka[i] != slovo[j])
                    break;
                if (j == 0) {
                    return i - j;
                }
                i--;
                j--;
            }
        }
        return -1;
    }

    //lastIndexOf( char[] a)                            metod vozvrasaet index dannoqo slova s konca esli ono est , inace -1
    public static int lastIndexOf(char[] stroka, char[] slovo) {
        for (int i = stroka.length-1; i >= 0; i--) {
            int j = slovo.length - 1;
            while (j >= 0) {
                if (stroka[i] != slovo[j])
                    break;
                if (j == 0) {
                    return i - j;
                }
                i--;
                j--;
            }
        }
        return -1;
    }
    //indexOf( char[] a)                         +      metod vozvrasaet index dannoqo slova esli ono est , inace -1
    //contains                                          metod proveryayet soderjit li stroka ukazannuyu stroku
    public static boolean contains1(char[] stroka, char[] slovo){
        for (int i = 0; i <= stroka.length - slovo.length; i++) {
            int j = 0;
            while (j < slovo.length) {
                if (stroka[i] != slovo[j])
                    break;
                if (j == slovo.length - 1) {
                    return true;
                }
                i++;
                j++;
            }
        }
        return false;
    }
    //split           metod razdelyayet stroku na pod stroku
    public static String[] split(char[] arr, char delimiter) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delimiter) {
                count++;
            }
        }
        count++;
        String[] str = new String[count];
        int index = 0;

        for (int i = 0, strIndex = 0; i < arr.length; i++) {
            if (arr[i] == delimiter) {
                str[strIndex] = substring1(arr, index, i);
                strIndex++;
                index = i + 1;

                if (strIndex == count - 1) {
                    str[strIndex] = substring1(arr, index, arr.length);
                    break;
                }
            }
        }

        return str;
    }


    public static String substring1(char[] arr, int start, int end) {
        String str = "";
        for (int i = start; i < end; i++) {
            str += arr[i];
        }
        return str;
    }

    public static void main(String[] args) {
        // trimR
        String str = "          Nasty hi!   ";
        char[] array = str.toCharArray();
        char[] rezalt = trimR(array);
        System.out.print("trimR: ");
        System.out.print(rezalt);
        System.out.println();
        //Equals
        String oneStr = "Nasty";
        String twoStr = "NaSSty";
        char[] one = oneStr.toCharArray();
        char[] two = twoStr.toCharArray();
        boolean rezaitEquals = Equals(one, two);
        System.out.print("Equals: ");
        System.out.println(rezaitEquals);
        //startsWith
        char[] stroka1 = {'N', 'a', 's', 't', 'y'};
        char[] stroka2 = {'s', 't', 'y'};
        System.out.println("startsWith: " + startsWith(stroka1, stroka2));
        //replace
        char[] str1 = "kak dela? Nasty ti tut? Poka Nasty!".toCharArray();
        char[] search = "Nasty".toCharArray();
        char[] old = "Olecy".toCharArray();
        System.out.print("My function => ");
        char[] result = replaceAll(str1, search, old);
        int i = 0;
        while (i < result.length) {
            System.out.print(result[i]);
            i++;
        }
        System.out.println();

        String original = "Nasty kak dela? Nasty ti tut? Poka Nasty!";
        original = original.replaceAll("Nasty", "Olecy");
        System.out.println("Original    => " + original);
        //concat
        char[] rezaltConcat = concat(stroka1, stroka2);
        for (int j = 0; j < rezaltConcat.length; j++) {
            System.out.print(rezaltConcat[j]);
        }
        System.out.println();
        //endsWith
//        char[]stroka1={'N','a','s','t','y'};
//        char[]stroka2={'N','a','s'};
        System.out.println("endsWith: " + endsWith(stroka1, stroka2));
        //substring
        System.out.print("substring: ");
        char[] strokaDlysubstring = "kak dela? Nasty ti tut? Poka Nasty!".toCharArray();
        substring(strokaDlysubstring, 4, 15);
        System.out.println();
        //toCharArray
        String text = "Hi! My name Nasty.";
        char[] rezalttoCharArray = toCharArray(text);
        System.out.print("toCharArray: ");
        for (int j = 0; j < rezalttoCharArray.length; j++) {
            System.out.print(rezalttoCharArray[j]);
        }
        System.out.println();
        //indexOf1
        //String text="Hi! My name Nasty.";
        char[] perevodText = toCharArray(text);
        char[] slovo = {'t','y'};
        System.out.println("indexOf1: " + indexOf1(perevodText, slovo, 3));
        //indexOf2
        //String text="Hi! My name Nasty.";
//        char[]perevodText= toCharArray(text);
//        char[]slovo={'M','y'};
        System.out.println("indexOf2: " + indexOf2(perevodText, slovo, 5));
        //lastIndexOf
        //String text="Hi! My name Nasty.";
//        char[]perevodText= toCharArray(text);
//        char[]slovo={'M','y'};
        System.out.println("lastIndexOf: " + lastIndexOf(perevodText,slovo));
        // contains1
        System.out.println("contains1: " + contains1(perevodText, slovo));
        //split
        String name = "kak dela? Nasty ti tut? Poka Nasty!";
       String[]arr=split(name.toCharArray(),'a');
        for (int j = 0; j < arr.length; j++) {
            System.out.println("split: ");
            System.out.println(arr[j]);
        }
    }
}
