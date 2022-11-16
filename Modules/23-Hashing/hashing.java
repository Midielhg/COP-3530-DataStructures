//implement a hash function that converst a String value to an integer. Test your funtction by computing the hash values of the java keywords. Assume hash table size = 67. Were there collisuions?

public class hashing {
    public static void main(String[] args){
        String[] keywords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};///array of keywords
        int[] hashValues = new int[keywords.length];//array to store hash values
        int hashTableSize = 67;//size of the hash table
        int collisions = 0;//counter for number of collisions
        for (int i = 0; i < keywords.length; i++){//loop to compute hash values
            hashValues[i] = hash(keywords[i], hashTableSize);//compute hash values
            System.out.println(keywords[i] + " " + hashValues[i]);//print the hash values
        }
        for (int i = 0; i < hashValues.length; i++){//loop to check for collisions
            for (int j = i + 1; j < hashValues.length; j++){//loop to check for collisions
                if (hashValues[i] == hashValues[j]){//if there is a collision
                    //print the value with collition 
                    System.out.println("Collision between " + keywords[i] + " and " + keywords[j] + " with hash value " + hashValues[i]);
                    collisions++;//increment the counter
                }
            }
        }
        System.out.println("Total Collisions: " + collisions);    
    }


    public static int hash (String key, int tableSize){//hash function
        int hashVal = 0;//hash value

        for (int i =0; i < key.length(); i++){//loop to compute hash value
            hashVal = 37 * hashVal + key.charAt(i);//compute hash value
        }

        hashVal %= tableSize;//modulus to get hash value
        if(hashVal < 0){//if hash value is negative
            hashVal += tableSize;//add table size to make it positive
        }
        return hashVal;//return hash value
    }
}
