/****************************************************************************
 * Lcs
 ****************************************************************************
 * longest common subsequence between two strings
 *_____________________________________________________
 * Masrik Dahir
 * 26 february 2023
 * CMSC 525
 ****************************************************************************/

public class Lcs {
    /*
     * find the longest common subsequence between two strings. Note that
     * unlike substrings, subsequences are not required to occupy consecutive
     * positions within the original sequences.
     * @param x - the first string
     * @param y - the second string
     * @returns the longest subsequence
     *
     * example: GGCACCACG,ACGGCGGATACG => GGCAACG
     */
    public static String lcs(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] opt = new int[m+1][n+1];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j)) {
                    opt[i][j] = opt[i+1][j+1] + 1;
                }
                else {
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
                }
            }
        }
// Recover LCS itself.
        String lcs = "";
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (x.charAt(i) == y.charAt(j)) {
                lcs += x.charAt(i);
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) {
                i++;
            }
            else {
                j++;
            }
        }
        return lcs;
    }
}
