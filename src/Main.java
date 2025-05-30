import leetcode.Kolos;
import leetcode.LeetCode;
import leetcode.Revision;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //startLeetCode();
        //startRevision();
        startKolos();
    }

    public static void startKolos() {
        Kolos myKolos = new Kolos();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        myKolos.zadanie1(nums,target);
//        int x = 121;
//        myKolos.zadanie9(x);
//        String s = "MCMXCIV";
//        myKolos.zadanie13(s);
//        myKolos.zadanie13("III");
//        String[] strs = {"flower","flow","flight"};
//        myKolos.zadanie14(strs);
//        String haystack = "sadbutsad";
//        String needle = "sad";
//        myKolos.zadanie28(haystack, needle);
//        String s = "luffy is still    joyboy";
//        myKolos.zadanie58(s);
//        int [] nums = {1,3,5,6};
//        int target = 7;
//        myKolos.zadanie35(nums, target);
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        myKolos.zadanie26(nums);
//        int[] nums = {0,1,2,2,3,0,4,2};
//        int value = 2;
//        myKolos.zadanie27(nums, value);
//        int[] digits = {4,3,9,1};
//        myKolos.zadanie66(digits);
//        int[] num1 = {1,2,3,0,0,0};
//        int [] num2 = {2,5,6};
//        int m = 3;
//        int n = 3;
//        myKolos.zadanie88(num1, m, num2, n);
//        int[] prices = {7,1,5,3,6,4};
//        myKolos.zadanie121(prices);
//        String s = "A man, a plan, a canal: Panama";
//        myKolos.zadanie125(s);
//        myKolos.zadanieEksra();
//        int[] nums1 = {4,1,2,1,2};
//        myKolos.zadanie136(nums1);
//        int[] nums = {2,2,1,1,1,2,2};
//        myKolos.zadanie169(nums);
//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        myKolos.zadanie169v2(nums);
//        String columnTitle = "ZY";
//        myKolos.zadanie171(columnTitle);
//        int n = 19;
//        myKolos.zadanie202(n);
//        String s = "egg";
//        String t = "add";
//        myKolos.zadanie205(s,t);
//        String s = "egge";
//        String t = "adda";
//        myKolos.zadanie205V2(s,t);
//        System.out.println(myKolos.zadanie205V2(s,t));
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
//        myKolos.zadanie217(nums);
//        int[] nums = {1,2,3,1,2,3};
//        int k = 2;
//        myKolos.zadanie219(nums,k);
//        int[] nums = {0,2,3,4,6,8,9};
//        myKolos.zadanie228(nums);
//        System.out.println(myKolos.zadanie228(nums));
//        int n = 16;
//        myKolos.zadanie231(n);
//        System.out.println(myKolos.zadanie231(n));
//        String s = "anagram";
//        String t = "nagaram";
//        myKolos.zadanie242(s,t);
//        int num = 388;
//        myKolos.zadanie258(num);
//        int n = 22;
//        myKolos.zadanie263(n);
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//        myKolos.zadanie268(nums);
//        int[] nums = {0,1,0,3,12};
//        myKolos.zadanie283(nums);
//        String pattern = "abba";
//        String s = "dog cat cat dog";
//        myKolos.zadanie290(pattern,s);
//        int n = 27;
//        myKolos.zadanie326(n);
//        int n = 5;
//        myKolos.zadanie338(n);
//        int n = 16;
//        myKolos.zadanie342(n);
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        myKolos.zadanie344(s);
//        String s = "leetcode";
//        myKolos.zadanie345(s);
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
//        myKolos.zadanie349(nums1, nums2);
//        System.out.println(Arrays.toString(myKolos.zadanie349(nums1,nums2)));
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {3,2,2};
//        myKolos.zadanie350(nums1,nums2);
//        int num = 16;
//        myKolos.zadanie367(num);
//        String ransomNote = "aa";
//        String magazine = "ab";
//        myKolos.zadanie383(ransomNote,magazine);
//        String s = "loveleetcode";
//        myKolos.zadanie387(s);
//        String s = "abcd";
//        String t = "abcde";
//        myKolos.zadanie389(s,t);
//        String s = "abc";
//        String t = "ahbgdc";
//        myKolos.zadanie392(s,t);
//        int num = 26;
//        myKolos.zadanie405(num);
//        String s = "abccccdd";
//        myKolos.zadanie409(s);
//        String num1 = "456";
//        String num2 = "77";
//        myKolos.zadanie415(num1, num2);
//        String s = "Hello, my name is John";
//        myKolos.zadanie434(s);
//        System.out.println(myKolos.zadanie434(s));
//        int n = 6;
//        myKolos.zadanie441(n);
//        System.out.println(myKolos.zadanie441(n));
//        int[] nums = {4,3,2,7,8,2,3,1};
//        myKolos.zadanie448(nums);
//        int[] g = {1,2};
//        int[] s = {1,2,3};
//        myKolos.zadanie455(g, s);
//        String s = "abcabcabcabc";
//        myKolos.zadanie459(s);
//        int[][] grid = {
//                {0, 1, 0, 0},
//                {1, 1, 1, 0},
//                {0, 1, 0, 0},
//                {1, 1, 0, 0}
//        };
//        myKolos.zadanie463(grid);
//        int num = 5;
//        myKolos.zadanie476(num);
//        String s = "5F3Z-2e-9-w";
//        int k = 4;
//        myKolos.zadanie482(s, k);
//        int[] nums = {1,0,1,1,0,1};
//        myKolos.zadanie485(nums);
//        int area = 122122;
//        myKolos.zadanie492(area);
//        int[] timesSeries = {1,2};
//        int duration = 2;
//        myKolos.zadanie495(timesSeries,duration);
//        String[] words = {"Hello","Alaska","Dad","Peace"};
//        myKolos.zadanie500(words);
//        int[] score = {10,3,8,9,4};
//        myKolos.zadanie506(score);
//        int num = 28;
//        myKolos.zadanie507(num);
//        int n = 4;
//        myKolos.zadanie509(n);
//        String word = "FlaG";
//        myKolos.zadanie520(word);
//        String a = "adada";
//        String b = "dadaa";
//        myKolos.zadanie521(a,b);
//        String s = "123 456 789";
//        System.out.println(myKolos.zadanie557V2(s));
//        int[] nums = {6,2,6,5,1,2};
//        myKolos.zadanie561(nums);
//        int[] candyType = {1,1,2,3};
//        myKolos.zadanie575(candyType);
//        int[] nums = {1,3,2,2,5,2,3,7};
//        myKolos.zadanie594(nums);
//        int m = 3;
//        int n = 3;
//        int[][] ops = {
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3}
//        };
//        myKolos.zadanie598(m,n,ops);
    }

    public static void startRevision() {
        Revision myRevision = new Revision();
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        myRevision.zadanie1(nums,target);
//        int x = 121;
//        myRevision.zadanie9(x);
//        String s = "MCMXCIV";
//        myRevision.zadanie13(s);
//        String[] strs = {"flower","flow","flight"};
//        myRevision.zadanie14(strs);
//        String haystack = "sadbutsad";
//        String needle = "sad";
//        myRevision.zadanie28(haystack,needle);
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        myRevision.zadanie26(nums);
//        int[] nums = {0,1,2,2,3,0,4,2};
//        int val = 2;
//        myRevision.zadanie27(nums,val);
//        int[] nums = {1,3,5,6};
//        int target = 2;
//        myRevision.zadanie35(nums,target);
//        int[] digits = {9,9,9,9};
//        System.out.println(Arrays.toString(myRevision.zadanie66(digits)));
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        myRevision.zadanie88(nums1,m,nums2,n);
//        int[] prices = {7,1,5,3,6,4};
//        myRevision.zadanie121(prices);
//        String s = "A man, a plan, a canal: Panama";
//        myRevision.zadanie125(s);
//        int[] nums = {4,1,2,1,2};
//        myRevision.zadanie136(nums);
//        int[] nums = {2,2,1,1,1,2,2};
//        myRevision.zadanie169(nums);
//        String s = "ZY";
//        myRevision.zadanie171(s);
//        int n = 19;
//        myRevision.zadanie202(n);
//        String s = "foo";
//        String t = "bar";
//        myRevision.zadanie205(s,t);
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
//        myRevision.zadanie217(nums);
//        int[] nums = {1,2,3,1,2,3};
//        int k = 2;
//        myRevision.zadanie219(nums,k);
//        int[] nums = {0,1,2,4,5,7};
//        myRevision.zadanie228(nums);
//        int n = 16;
//        myRevision.zadanie231(n);
//        String s = "anagram";
//        String t = "nagaram";
//        myRevision.zadanie242(s,t);
//        int num = 38;
//        myRevision.zadanie258(num);
//        int n = 64;
//        myRevision.zadanie263(n);
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//        myRevision.zadanie268(nums);
//        int[] nums = {0,1,0,3,12};
//        myRevision.zadanie283(nums);
//        String pattern = "abba";
//        String s = "dog cat cat fish";
//        myRevision.zadanie290(pattern,s);
//        int n = 27;
//        myRevision.zadanie326(n);
//        int n = 5;
//        myRevision.zadanie338(n);
//        int n = 16;
//        myRevision.zadanie342(n);
//        char[] s =  {'h', 'e', 'l', 'l', 'o'};
//        myRevision.zadanie344(s);
//        String s = "hello";
//        myRevision.zadanie345(s);
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
//        myRevision.zadanie349(nums1,nums2);
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
//        myRevision.zadanie350(nums1,nums2);
//        int num = 16;
//        myRevision.zadanie367(num);
//        String ransomNote = "a";
//        String magazine = "b";
//        myRevision.zadanie383(ransomNote,magazine);
//        String s = "loveleetcode";
//        myRevision.zadanie387(s);
//        String s = "abcd";
//        String t = "abcde";
//        myRevision.zadanie389(s,t);
//        String s = "abc";
//        String t = "ahbgdc";
//        myRevision.zadanie392(s,t);
//        int num = 26;
//        myRevision.zadanie405(num);
//        String s = "abccccdd";
//        myRevision.zadanie409(s);
//        String num1 = "11";
//        String num2 = "123";
//        myRevision.zadanie415(num1,num2);
//        String s = "Hello, my name is John";
//        myRevision.zadanie434(s);
//        int n = 8;
//        myRevision.zadanie441(n);
//        int[] nums = {4,3,2,7,8,2,3,1};
//        myRevision.zadanie448(nums);
//        int[] g = {1,2};
//        int[] s = {1,2,3};
//        myRevision.zadanie455(g,s);
//        String s = "abcabcabcabc";
//        myRevision.zadanie459(s);
//                int[][] grid = {
//                {0, 1, 0, 0},
//                {1, 1, 1, 0},
//                {0, 1, 0, 0},
//                {1, 1, 0, 0}
//        };
//        myRevision.zadanie463(grid);
//        int num = 5;
//        myRevision.zadanie476(num);
//        String s = "5F3Z-2e-9-w";
//        int k = 4;
//        myRevision.zadanie482(s,k);
//        int[] nums = {1,1,0,1,1,1};
//        myRevision.zadanie485(nums);
//        int area = 122122;
//        myRevision.zadanie492(area);
//        int[] timeSeries = {1,4};
//        int duration = 2;
//        myRevision.zadanie495(timeSeries,duration);
//        String[] words = {"Hello","Alaska","Dad","Peace"};
//        myRevision.zadanie500(words);
//        int[] score = {10,3,8,9,4};
//        myRevision.zadanie506(score);
//        int num = 28;
//        myRevision.zadanie507(num);
//        int n = 4;
//        myRevision.zadanie509(n);
//        String word = "USA";
//        myRevision.zadanie520(word);
//        String a = "aaa";
//        String b = "aaa";
//        myRevision.zadanie521(a,b);
//        String s = "Let's take LeetCode contest";
//        myRevision.zadanie557(s);
//        int[] nums = {6,2,6,5,1,2};
//        myRevision.zadanie561(nums);
//        int[] candyType = {6,6,6,6};
//        myRevision.zadanie575(candyType);
//        int[] nums = {1,3,2,2,5,2,3,7};
//        myRevision.zadanie594(nums);
//        int m = 3;
//        int n = 3;
//        int[][] ops = {
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3}
//        };
//        myRevision.zadanie598(m,n,ops);
//        String[] list1 = {"happy","sad","good"};
//        String[] list2 = {"sad","happy","good"};
//        myRevision.zadanie599(list1,list2);
//        int[] nums = {1,12,-5,-6,50,3};
//        int k = 4;
//        myRevision.zadanie643(nums,k);
//        int[] nums = {1,1};
//        myRevision.zadanie645(nums);
//        String moves = "UD";
//        myRevision.zadanie657(moves);
//        int[][] img = {
//                {100, 200, 100},
//                {200, 50, 200},
//                {100, 200, 100}
//        };
//        myRevision.zadanie661(img);
//        int[] nums = {1,3,5,4,7};
//        myRevision.zadanie674(nums);
//        String s = "abca";
//        myRevision.zadanie680(s);
//        int n = 7;
//        myRevision.zadanie693(n);
//        String s = "00110011";
//        myRevision.zadanie696(s);
//        int[] nums = {1,2,2,3,1};
//        myRevision.zadanie697(nums);
//        int[] nums = {-1,0,3,5,9,12,14,16,18,19,111,112,444};
//        int target = 19;
//        myRevision.zadanie704(nums,target);
//        String s = "LOVELY";
//        myRevision.zadanie709(s);
//        int[] nums = {1,7,3,6,5,6};
//        myRevision.zadanie724(nums);
//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;
//        myRevision.zadanie88V2(nums1,m,nums2,n);
//        int[] nums = {2,2,1,1,1,2,2};
//        myRevision.zadanie169V2(nums);
//        int[] nums = {0,2,3,4,6,8,9};
//        myRevision.zadanie228V2(nums);
//        String pattern = "abba";
//        String s = "dog cat cat dog";
//        myRevision.zadanie290V2(pattern,s);
//        String s = "leetcode";
//        myRevision.zadanie345V2(s);
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
//        myRevision.zadanie349V2(nums1,nums2);
//        String ransomNote = "aa";
//        String magazine = "aab";
//        myRevision.zadanie383V2(ransomNote,magazine);
//        int num = 3340;
//        myRevision.zadanie405V2(num);
//        String s = "abab";
//        myRevision.zadanie459V2(s);
//        int[][] grid = {
//                {0, 1, 0, 0},
//                {1, 1, 1, 0},
//                {0, 1, 0, 0},
//                {1, 1, 0, 0}
//        };
//        myRevision.zadanie463V2(grid);
//        int num = 5;
//        myRevision.zadanie476V2(num);
//        String[] words = {"Hello","Alaska","Dad","Peace"};
//        myRevision.zadanie500V2(words);
//        int[] score = {10,3,8,9,4};
//        myRevision.zadanie506V2(score);
//        String word = "FlaG";
//        myRevision.zadanie520V2(word);
//        int[] nums = {1,3,2,2,5,2,3,7};
//        myRevision.zadanie594V2(nums);
//        int m = 3;
//        int n = 3;
//        int[][] ops = {
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3},
//                {2, 2},
//                {3, 3},
//                {3, 3},
//                {3, 3}
//        };
//        myRevision.zadanie598V2(m,n,ops);
//        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
//        String[] list2 = {"KFC","Shogun","Burger King"};
//        myRevision.zadanie599V2(list1,list2);
//        int[] nums = {5};
//        int k = 1;
//        myRevision.zadanie643V2(nums,k);
//                int[][] img = {
//                {100, 200, 100},
//                {200, 50, 200},
//                {100, 200, 100}
//        };
//        myRevision.zadanie661V2(img);
//        int n = 10;
//        myRevision.zadanie693V2(n);
//        String s = "00110011";
//        myRevision.zadanie696V2(s);
//        int[] nums = {1,2,2,3,1,4,2};
//        myRevision.zadanie697V2(nums);
    }

    public static void startLeetCode() {
        LeetCode myLeetCode = new LeetCode();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        myLeetCode.zadanie1(nums, target);
//        myLeetCode.zadanie2(121);
//        myLeetCode.zadanie3("MCMXCIV");
//        String[] arrayList = {"flower", "flow", "flight"};
//        myLeetCode.zadanie4(arrayList);
//        myLeetCode.isPalindrome(123321);
//        System.out.println("is palindrome " + myLeetCode.isPalindrome2(123321));
//        int wynik = myLeetCode.zadanie28("abcsaxxdbutsaxxsxx", "sad");
//        System.out.println(wynik);
//        myLeetCode.zadanie58("   fly me   to   the moon  ");
//        int[] nums1 = {1, 3, 5, 6};
//        int target1 = 5;
//        myLeetCode.zadanie35(nums1, target1);
//        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        myLeetCode.zadanie26(nums2);
//        int[] nums3 = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 2;
//        myLeetCode.zadanie27(nums3, val);
//        int[] digits = {9};
//        int[] newDigits6 = myLeetCode.zadanie66(digits);
//        myLeetCode.zadanie66(digits);
//        System.out.println(Arrays.toString(digits));
//        myLeetCode.zadanie70(4);
//        myLeetCode.zadanie70V2(4);
//        int[] nums4 = {1, 2, 3, 0, 0, 0};
//        int[] nums5 = {2, 5, 6};
//        myLeetCode.zadanie88(3, 3, nums4, nums5);
//        int[] nums6 = {7, 1, 5, 3, 6, 4};
//        myLeetCode.zadanie121(nums6);
//        myLeetCode.zadanie125("A man, a plan, a canal: Panama");
//        int[] nums7 = {2, 2, 1};
//        myLeetCode.zadanie136(nums7);
//        int[] nums8 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//        myLeetCode.zadanie217(nums8);
//        String ss = "egg";
//        String t = "add";
//        myLeetCode.zadanie205(ss, t);
//        String columnTitle = "ZY";
//        myLeetCode.zadanie171(columnTitle);
//        int[] nums9 = {4, 1, 2, 1, 2};
//        myLeetCode.zadanie136(nums9);
//        int[] nums10 = {2, 2, 1, 1, 1, 2, 2};
//        myLeetCode.zadanie169(nums10);
//        int n = 19;
//        myLeetCode.zadanie202(n);
//        int[] nums10 = {1, 2, 3, 1};
//        int k = 3;
//        myLeetCode.zadanie219(nums10, k);
//        int n = 5;
//        System.out.println(myLeetCode.zadanie231V2(n));
//        String s1 = "rat";
//        String s2 = "tar";
//        System.out.println(myLeetCode.zadanie242(s1, s2));
//        int num = 44;
//        System.out.println(myLeetCode.zadanie258(num));
//        int n = 56;
//        System.out.println(myLeetCode.zadanie263(n));
//        int[] nums11 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        System.out.println(myLeetCode.zadanie268(nums11));
//        int[] nums12 = {0, 1, 0, 3, 12};
//        myLeetCode.zadanie283(nums12);
//        String pattern = "abba";
//        String s3 = "dog cat cat dog";
//        myLeetCode.zadanie290(pattern, s3);
//        int n = 21;
//        myLeetCode.zadanie292(n);
//        int n = 27;
//        myLeetCode.zadanie326(n);
//        int n = 5;
//        myLeetCode.zadanie338(n);
//        int n = 16;
//        myLeetCode.zadanie342(n);
//        char[] s5 = {'h', 'e', 'l', 'l', 'o'};
//        myLeetCode.zadanie344(s5);
//        String s1 = "leetcode";
//        myLeetCode.zadanie345(s1);
//        int[] nums11 = {1, 2, 2, 1};
//        int[] nums12 = {2, 2};
//        myLeetCode.zadanie349(nums11, nums12);
//        int[] nums13 = {1, 2, 2, 1};
//        int[] nums14 = {2, 2};
//        myLeetCode.zadanie350(nums13, nums14);
//        int num = 10;
//        myLeetCode.zadanie367(num);
//        myLeetCode.zadanie367V2(num);
//        String ransomNote = "aaab";
//        String magazine = "aaaabbb";
//        myLeetCode.zadanie383(ransomNote, magazine);
//        String s11 = "loveleetcode";
//        myLeetCode.zadanie387(s);
//        String s12 = "abcd";
//        String t = "abcde";
//        myLeetCode.zadanie389(s12, t);
//        String s13 = "abc";
//        String t = "ahbgdc";
//        myLeetCode.zadanie392(s13, t);
//        int num = 26;
//        myLeetCode.zadanie405(num);
//        String s14 = "abccccdd";
//        myLeetCode.zadanie409(s14);
//        int n = 15;
//        myLeetCode.zadanie412(n);
//        int[] nums15 = {2, 2, 3, 1};
//        myLeetCode.zadanie414(nums15);
//        String num1 = "456";
//        String num2 = "77";
//        myLeetCode.zadanie415(num1, num2);
//        String s14 = "Hello, my name is John";
//        myLeetCode.zadanie434(s);
//        int n = 6;
//        myLeetCode.zadanie441(n);
//        int[] nums16 = {4, 3, 2, 7, 8, 2, 3, 1};
//        myLeetCode.zadanie448(nums16);
//        int[] g = {1, 2};
//        int[] s11 = {1, 2, 3};
//        myLeetCode.zadanie455(g, s11);
//        String s15 = "abcabcabcabc";
//        myLeetCode.zadanie459(s15);
//        System.out.println(myLeetCode.zadanie459(s15));
//        int[][] grid = {
//                {0, 1, 0, 0},
//                {1, 1, 1, 0},
//                {0, 1, 0, 0},
//                {1, 1, 0, 0}
//        };
//        myLeetCode.zadanie463(grid);
//        int num = 5;
//        myLeetCode.zadanie476(num);
//        String s16 = "5F3Z-2e-9-w";
//        int k = 4;
//        myLeetCode.zadanie482(s16, k);
//        int[] nums17 = {1, 0, 1, 1, 0, 1};
//        myLeetCode.zadanie485(nums17);
//        int area = 122122;
//        myLeetCode.zadanie492(area);
//        int[] timeSeries = {1, 2, 4, 5};
//        int duration = 2;
//        myLeetCode.zadanie495(timeSeries, duration);
//        System.out.println(myLeetCode.zadanie495(timeSeries, duration));
//        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
//        myLeetCode.zadanie500(words);
//        int[] score = {10, 3, 8, 9, 4};
//        myLeetCode.zadanie506(score);
//        int num = 28;
//        myLeetCode.zadanie507(num);
//        int n = 4;
//        myLeetCode.zadanie509(n);
//        String word = "USA";
//        myLeetCode.zadanie520(word);
//        String a = "aba";
//        String b = "bbb";
//        myLeetCode.zadanie521(a, b);
//        String s = "Let's take LeetCode contest";
//        myLeetCode.zadanie557(s);
//        int[] nums = {6, 2, 6, 5, 1, 2};
//        myLeetCode.zadanie561(nums);
//        int[] candyType = {1, 1, 2, 2, 3, 3};
//        myLeetCode.zadanie575(candyType);
//        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
//        myLeetCode.zadanie594(nums);
//        int m = 3;
//        int n = 3;
//        int[][] ops = {
//                {1, 2},
//                {3, 4},
//                {5, 6},
//                {7, 8},
//                {9, 10},
//                {11, 12},
//                {13, 14},
//                {15, 16},
//                {17, 18},
//                {19, 20},
//                {21, 22},
//                {23, 24}
//        };
//        myLeetCode.zadanie598(m, n, ops);
//        System.out.println(ops[0][1]);
//        myLeetCode.arraysSort();
//        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
//        myLeetCode.zadanie599(list1, list2);
//        int[] nums = {1, 12, -5, -6, 50, 3};
//        int k = 4;
//        myLeetCode.zadanie643(nums, k);
//        int[] nums = {1, 2, 2, 4};
//        myLeetCode.zadanie645(nums);
//        String moves = "UD";
//        myLeetCode.zadanie657(moves);
//        int[][] img = {
//                {100, 200, 100},
//                {200, 50, 200},
//                {100, 200, 100}
//        };
//        myLeetCode.zadanie661(img);
//        int[] nums = {1, 3, 5, 4, 7};
//        myLeetCode.zadanie674(nums);
//        String s = "abca";
//        myLeetCode.zadanie680(s);
//        int n = 7;
//        myLeetCode.zadanie693(n);
//        String s = "00110011";
//        myLeetCode.zadanie696(s);
//        int[] nums = {1, 2, 2, 3, 1, 4, 2};
//        myLeetCode.zadanie697(nums);
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 9;
//        myLeetCode.zadanie704(nums, target);
//        String s = "Hello";
//        myLeetCode.zadanie709(s);
//        int[] nums = {2, 1, -1};
//        System.out.println(myLeetCode.zadanie724(nums));
    }
}
