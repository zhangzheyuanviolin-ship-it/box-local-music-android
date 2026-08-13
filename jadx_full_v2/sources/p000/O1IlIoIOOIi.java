            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class O1IlIoIOOIi {
                public float I00000oIO;
                public O1Ill0ioO10 I00000oOI;

                public final O1IlIoIOOIi I00000oIO(float f) {
/* 3 */             O1Ill0ioO10 o1Ill0ioO10 = this.I00000oOI;
/* 7 */             String str = o1Ill0ioO10.I00000oOI;
/* 9 */             int i = o1Ill0ioO10.I0000Il00O;
/* 11 */            Il1oollOO1iI il1oollOO1iI = o1Ill0ioO10.I0000O;
/* 13 */            O0i1llII o0i1llII = o1Ill0ioO10.I0000oI00;
/* 15 */            O1Ill0ioO10 o1Ill0ioO102 = new O1Ill0ioO10();
/* 18 */            o1Ill0ioO102.I00000oIO = f;
/* 20 */            o1Ill0ioO102.I00000oOI = str;
/* 22 */            o1Ill0ioO102.I0000Il00O = i;
/* 24 */            o1Ill0ioO102.I0000O = il1oollOO1iI;
/* 26 */            o1Ill0ioO102.I0000oI00 = o0i1llII;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            O1IlIoIOOIi o1IlIoIOOIi = new O1IlIoIOOIi();
/* 34 */            o1IlIoIOOIi.I00000oIO = f;
/* 36 */            o1IlIoIOOIi.I00000oOI = o1Ill0ioO102;
/* 38 */            VarHandle.storeStoreFence();
/* 49 */            return o1IlIoIOOIi;
                }

                public final IIOl0O0 I00000oOI(String str) {
/* 2 */             int iI00000oIO = li10ooo.I00000oIO(0, str);
/* 8 */             Il1oollOO1iI il1oollOO1iI = this.I00000oOI.I0000O;
/* 10 */            il1oollOO1iI.getClass();
/* 25 */            return new IIOl0O0(IoOil1.I00000oIO.getCharIndex(il1oollOO1iI.I00000oIO, iI00000oIO), 14);
                }

                public final ArrayList I0000Il00O(String str) {
                    int i;
                    int i2;
                    int i3;
                    String str2;
/* 3 */             int i4 = 0;
/* 4 */             ArrayList arrayList = new ArrayList(0);
/* 7 */             int i5 = 0;
/* 12 */            while (i5 < str.length()) {
/* 16 */                int iI00000oIO = li10ooo.I00000oIO(i5, str);
/* 22 */                if (iI00000oIO >= 0 && iI00000oIO < 65536) {
/* 26 */                    i = 1;
                        } else {
/* 28 */                    if (65536 > iI00000oIO || iI00000oIO >= 1114112) {
/* 275 */                       I000II.I000iOII(Oi010OO0.I000oI1ioi(iI00000oIO, "Invalid Unicode code point: "));
/* 278 */                       return null;
                            }
/* 34 */                    i = 2;
                        }
/* 35 */                i5 += i;
/* 40 */                Il1oollOO1iI il1oollOO1iI = this.I00000oOI.I0000O;
/* 42 */                il1oollOO1iI.getClass();
/* 49 */                int charIndex = IoOil1.I00000oIO.getCharIndex(il1oollOO1iI.I00000oIO, iI00000oIO);
/* 53 */                if (charIndex == 0) {
/* 55 */                    int[] iArr = Io1i1io.I00000oIO;
/* 67 */                    if (Io1iO0OololO.I0000Il00O.I00000oOI.I00000oIO) {
/* 73 */                        char cCharAt = "0123456789abcdef".charAt((iI00000oIO >> 28) & 15);
/* 81 */                        char cCharAt2 = "0123456789abcdef".charAt((iI00000oIO >> 24) & 15);
/* 89 */                        char cCharAt3 = "0123456789abcdef".charAt((iI00000oIO >> 20) & 15);
/* 97 */                        char cCharAt4 = "0123456789abcdef".charAt((iI00000oIO >> 16) & 15);
/* 107 */                       char cCharAt5 = "0123456789abcdef".charAt((iI00000oIO >> 12) & 15);
/* 117 */                       char cCharAt6 = "0123456789abcdef".charAt((iI00000oIO >> 8) & 15);
/* 127 */                       char cCharAt7 = "0123456789abcdef".charAt((iI00000oIO >> 4) & 15);
/* 131 */                       i3 = i4;
/* 135 */                       char cCharAt8 = "0123456789abcdef".charAt(iI00000oIO & 15);
/* 139 */                       char[] cArr = new char[8];
/* 141 */                       cArr[i3] = cCharAt;
/* 143 */                       cArr[1] = cCharAt2;
/* 145 */                       cArr[2] = cCharAt3;
/* 148 */                       cArr[3] = cCharAt4;
/* 150 */                       cArr[4] = cCharAt5;
/* 153 */                       cArr[5] = cCharAt6;
/* 156 */                       cArr[6] = cCharAt7;
/* 159 */                       cArr[7] = cCharAt8;
/* 163 */                       str2 = new String(cArr);
                            } else {
/* 169 */                       i3 = i4;
                                long j = iI00000oIO;
/* 174 */                       char[] cArr2 = new char[8];
/* 176 */                       int i6 = 32;
/* 178 */                       int i7 = i3;
/* 180 */                       int i8 = i7;
/* 181 */                       while (i7 < 8) {
                                    i6 -= 4;
/* 198 */                           cArr2[i8] = "0123456789abcdef".charAt((int) ((j >> i6) & 15));
/* 200 */                           i7++;
/* 192 */                           i8++;
                                }
/* 204 */                       if (i8 == 8) {
/* 208 */                           str2 = new String(cArr2);
                                } else {
/* 213 */                           i2 = i3;
/* 215 */                           iOI0OiiiOl1.I00000oIO(i2, i8, 8);
/* 220 */                           str2 = new String(cArr2, i2, i8);
/* 254 */                           System.out.println((Object) ("getGidListForString codepoint " + str2 + " " + ((char) iI00000oIO) + " mapped to missing glyph"));
                                }
                            }
/* 166 */                   i2 = i3;
/* 254 */                   System.out.println((Object) ("getGidListForString codepoint " + str2 + " " + ((char) iI00000oIO) + " mapped to missing glyph"));
                        } else {
/* 258 */                   i2 = i4;
                        }
/* 263 */               arrayList.add(Integer.valueOf(charIndex));
/* 266 */               i4 = i2;
                    }
/* 966 */           return arrayList;
                }
            }
