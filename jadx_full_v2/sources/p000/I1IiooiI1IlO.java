            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class I1IiooiI1IlO {
                public static final I1IiOI0 I00000oIO = new I1IiOI0(3);
                public static final I1IiOI0 I00000oOI = new I1IiOI0(2);
                public static final I1IiOIiOli I0000Il00O = new I1IiOIiOli(1);
                public static final I1IiOIiOli I0000O = new I1IiOIiOli(0);
                public static final looil0O1Io1 I0000oI00;
                public static final o0iOli I0001Ioi1lo;

                static {
/* 35 */            int i = 8;
/* 37 */            looil0O1Io1 looil0o1io1 = new looil0O1Io1(i);
/* 40 */            VarHandle.storeStoreFence();
/* 43 */            I0000oI00 = looil0o1io1;
/* 47 */            o0iOli o0ioli = new o0iOli(i);
/* 50 */            VarHandle.storeStoreFence();
/* 53 */            I0001Ioi1lo = o0ioli;
                }

                public static void I00000oIO(int i, int[] iArr, int[] iArr2, boolean z) {
/* 2 */             int i2 = 0;
/* 4 */             int i3 = 0;
/* 5 */             for (int i4 : iArr) {
/* 9 */                 i3 += i4;
                    }
/* 17 */            float f = (i - i3) / 2.0f;
/* 18 */            if (!z) {
/* 20 */                int length = iArr.length;
/* 21 */                int i5 = 0;
/* 22 */                while (i2 < length) {
/* 24 */                    int i6 = iArr[i2];
/* 32 */                    iArr2[i5] = Math.round(f);
/* 35 */                    f += i6;
/* 36 */                    i2++;
/* 26 */                    i5++;
                        }
/* 204 */               return;
                    }
/* 40 */            int length2 = iArr.length;
                    while (true) {
                        length2--;
/* 44 */                if (-1 >= length2) {
/* 204 */                   return;
                        }
/* 46 */                int i7 = iArr[length2];
/* 52 */                iArr2[length2] = Math.round(f);
/* 55 */                f += i7;
                    }
                }

                public static void I00000oOI(int[] iArr, int[] iArr2, boolean z) {
/* 1 */             int i = 0;
/* 2 */             if (!z) {
/* 4 */                 int length = iArr.length;
/* 5 */                 int i2 = 0;
/* 6 */                 int i3 = 0;
/* 7 */                 while (i < length) {
/* 9 */                     int i4 = iArr[i];
/* 13 */                    iArr2[i2] = i3;
/* 15 */                    i3 += i4;
/* 16 */                    i++;
/* 11 */                    i2++;
                        }
/* 98 */                return;
                    }
/* 20 */            int length2 = iArr.length;
                    while (true) {
                        length2--;
/* 24 */                if (-1 >= length2) {
/* 98 */                    return;
                        }
/* 26 */                int i5 = iArr[length2];
/* 28 */                iArr2[length2] = i;
/* 30 */                i += i5;
                    }
                }

                public static void I0000Il00O(int i, int[] iArr, int[] iArr2, boolean z) {
/* 2 */             int i2 = 0;
/* 4 */             int i3 = 0;
/* 5 */             for (int i4 : iArr) {
/* 9 */                 i3 += i4;
                    }
/* 13 */            int i5 = i - i3;
/* 14 */            if (!z) {
/* 16 */                int length = iArr.length;
/* 17 */                int i6 = 0;
/* 18 */                while (i2 < length) {
/* 20 */                    int i7 = iArr[i2];
/* 24 */                    iArr2[i6] = i5;
/* 26 */                    i5 += i7;
/* 27 */                    i2++;
/* 22 */                    i6++;
                        }
/* 204 */               return;
                    }
/* 31 */            int length2 = iArr.length;
                    while (true) {
                        length2--;
/* 35 */                if (-1 >= length2) {
/* 204 */                   return;
                        }
/* 37 */                int i8 = iArr[length2];
/* 39 */                iArr2[length2] = i5;
/* 41 */                i5 += i8;
                    }
                }

                public static void I0000O(int i, int[] iArr, int[] iArr2, boolean z) {
/* 2 */             if (iArr.length == 0) {
/* 204 */               return;
                    }
/* 6 */             int i2 = 0;
/* 8 */             int i3 = 0;
/* 9 */             for (int i4 : iArr) {
/* 13 */                i3 += i4;
                    }
/* 27 */            float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
/* 35 */            float f = (z && iArr.length == 1) ? fMax : 0.0f;
/* 36 */            if (z) {
/* 62 */                for (int length = iArr.length - 1; -1 < length; length--) {
/* 64 */                    int i5 = iArr[length];
/* 70 */                    iArr2[length] = Math.round(f);
/* 74 */                    f += i5 + fMax;
                        }
/* 204 */               return;
                    }
/* 38 */            int length2 = iArr.length;
/* 39 */            int i6 = 0;
/* 40 */            while (i2 < length2) {
/* 42 */                int i7 = iArr[i2];
/* 50 */                iArr2[i6] = Math.round(f);
/* 54 */                f += i7 + fMax;
/* 55 */                i2++;
/* 44 */                i6++;
                    }
                }

                public static I1IioI I0000oI00(float f) {
/* 11 */            return new I1IioI(f, true, new I000II(11));
                }
            }
