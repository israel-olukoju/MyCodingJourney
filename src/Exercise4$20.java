public class Exercise4$20 {
    public static void main(String[] args) {
        final String s1 = " Welcome ";
        final String s2 = " welcome ";
        // Check whether s1 is equal to s2 and assign the result to a Boolean variable isEqual.
        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);
        // Check whether s1 is equal to s2, ignoring case, and assign the result to a Boolean variable isEqual.
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s2);
        System.out.println(isEqualIgnoreCase);
        // Compare s1 with s2 and assign the result to an int variable x.
        int x = s1.compareTo(s2);
        System.out.println(x);
        // Compare s1 with s2, ignoring case, and assign the result to an int variable x.
        int xIgnoreCase = s1.compareToIgnoreCase(s2);
        System.out.println(xIgnoreCase);
        // Check whether s1 has the prefix AAA and assign the result to a Boolean variable b.
        boolean bPrefix = s1.startsWith("AAA");
        System.out.println(bPrefix);
        // Check whether s1 has the suffix AAA and assign the result to a Boolean variable b.
        boolean bSuffix = s1.endsWith(s2);
        System.out.println(bSuffix);
        // Assign the length of s1 to an int variable x.
        int xLength = s1.length();
        System.out.println(xLength);
        // Assign the first character of s1 to a char variable x.
        char xChar = s1.charAt(0);
        System.out.println(xChar);
        // Create a new string s3 that combines s1 with s2.
        String s3 = s1.concat(s2);
        System.out.println(s3);
        // Create a substring of s1 starting from index 1.
        String s1SubString = s1.substring(1);
        System.out.println(s1SubString);
        // Create a substring of s1 from index 1 to index 4.
        String s1SubString1 = s1.substring(1, 4);
        System.out.println(s1SubString1);
        // Create a new string s3 that converts s1 to lowercase.
        String s3CovertToLowerCase = s1.toLowerCase();
        System.out.println(s3CovertToLowerCase);
        // Create a new string s3 that converts s1 to uppercase.
        String s3ConvertToUpperCase = s1.toUpperCase();
        System.out.println(s3ConvertToUpperCase);
        // Create a new string s3 that trims whitespace characters on both ends of s1.
        String s3Trim = s1.trim();
        System.out.println(s3Trim);
        // Assign the index of the first occurrence of the character e in s1 to an int variable x.
        int xFirstOccurrence = s1.indexOf('e');
        System.out.println(xFirstOccurrence);
        // Assign the index of the last occurrence of the string abc in s1 to an int variable x.
        int xLastOccurrence = s1.lastIndexOf("abc");
        System.out.println(xLastOccurrence);
    }
}
