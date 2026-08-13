            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            public abstract class IO1I1oO10O11 {
                public static final int I00000oIO = 0;

                static {
                    long j;
                    long j2;
                    long j3;
/* 5 */             int i = 0;
/* 16 */            iOOIlolo00O.I00000oIO(IoIolIO1.I000O01llI0, new IO1I11OO(i), new I000OiO(10));
/* 24 */            IooO11l iooO11l = new IooO11l(0, 255, 1);
/* 33 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iooO11l, 10));
/* 36 */            Iterator it = iooO11l.iterator();
/* 45 */            while (((IooO10lI) it).I00iiO) {
/* 50 */                int iNextInt = ((IooIlO1) it).nextInt();
/* 56 */                if (48 > iNextInt || iNextInt >= 58) {
                            j = iNextInt;
/* 72 */                    if (j >= 97 && j <= 102) {
/* 80 */                        j3 = 87;
                            } else if (j < 65 || j > 70) {
/* 98 */                        j2 = -1;
/* 104 */                       arrayList.add(Long.valueOf(j2));
                            } else {
/* 95 */                        j3 = 55;
                            }
                        } else {
                            j = iNextInt;
/* 63 */                    j3 = 48;
                        }
/* 65 */                j2 = j - j3;
/* 104 */               arrayList.add(Long.valueOf(j2));
                    }
/* 108 */           IOOi0Ool1i.I00iOIl(arrayList);
/* 115 */           IooO11l iooO11l2 = new IooO11l(0, 15, 1);
/* 124 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(iooO11l2, 10));
/* 127 */           Iterator it2 = iooO11l2.iterator();
/* 136 */           while (((IooO10lI) it2).I00iiO) {
/* 141 */               int iNextInt2 = ((IooIlO1) it2).nextInt();
/* 161 */               arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
                    }
/* 169 */           byte[] bArr = new byte[arrayList2.size()];
/* 171 */           Iterator it3 = arrayList2.iterator();
/* 179 */           while (it3.hasNext()) {
/* 193 */               bArr[i] = ((Number) it3.next()).byteValue();
/* 191 */               i++;
                    }
                }

                public static final int I00000oIO(CharSequence charSequence, int i, int i2) {
/* 1 */             int i3 = 0;
/* 2 */             while (i < i2) {
/* 4 */                 int iCharAt = charSequence.charAt(i);
/* 10 */                if (65 <= iCharAt && iCharAt < 91) {
/* 16 */                    iCharAt += 32;
                        }
/* 20 */                i3 = (i3 * 31) + iCharAt;
/* 21 */                i++;
                    }
/* 215 */           return i3;
                }

                public static final void I00000oOI(IO10oOlIiO iO10oOlIiO, int i) {
/* 89 */            throw new NumberFormatException("Invalid number: " + ((Object) iO10oOlIiO) + ", wrong digit: " + iO10oOlIiO.charAt(i) + " at position " + i);
                }
            }
