            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class IloI1I0oi0O {
                public final ArrayList I00000oIO;
                public final int I00000oOI;
                public int I0000Il00O;
                public final ArrayList I0000O;
                public final OI0l1oli1I I0000oI00;
                public final OllO00oiil I0001Ioi1lo;

                public IloI1I0oi0O(int i, ArrayList arrayList) {
/* 4 */             this.I00000oIO = arrayList;
/* 6 */             this.I00000oOI = i;
/* 8 */             if (i < 0) {
/* 13 */                OO1oio00IO.I00000oIO("Invalid start index");
                    }
/* 21 */            this.I0000O = new ArrayList();
/* 25 */            OI0l1oli1I oI0l1oli1I = new OI0l1oli1I();
/* 28 */            int size = arrayList.size();
/* 33 */            int i2 = 0;
/* 34 */            for (int i3 = 0; i3 < size; i3++) {
/* 42 */                O0O1lI o0O1lI = (O0O1lI) this.I00000oIO.get(i3);
/* 44 */                int i4 = o0O1lI.I0000Il00O;
/* 46 */                int i5 = o0O1lI.I0000O;
/* 53 */                oI0l1oli1I.I000OOo1O(i4, new Io10o01Ol0(i3, i2, i5));
/* 56 */                i2 += i5;
                    }
/* 60 */            this.I0000oI00 = oI0l1oli1I;
/* 66 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(21);
/* 69 */            i01iiIii10O.I00iiI = this;
/* 71 */            VarHandle.storeStoreFence();
/* 79 */            this.I0001Ioi1lo = new OllO00oiil(i01iiIii10O);
                }

                public final boolean I00000oIO(int i, int i2) {
                    Io10o01Ol0 io10o01Ol0;
                    int i3;
                    int i4;
/* 5 */             OI0l1oli1I oI0l1oli1I = this.I0000oI00;
/* 13 */            Io10o01Ol0 io10o01Ol02 = (Io10o01Ol0) oI0l1oli1I.I00000oOI(i);
/* 16 */            if (io10o01Ol02 == null) {
/* 15 */                return false;
                    }
/* 18 */            int i5 = io10o01Ol02.I00000oOI;
/* 22 */            int i6 = i2 - io10o01Ol02.I0000Il00O;
/* 24 */            io10o01Ol02.I0000Il00O = i2;
/* 26 */            if (i6 == 0) {
/* 104 */               return true;
                    }
/* 28 */            Object[] objArr = oI0l1oli1I.I0000Il00O;
/* 30 */            long[] jArr = oI0l1oli1I.I00000oIO;
                    int length = jArr.length - 2;
/* 35 */            if (length < 0) {
/* 104 */               return true;
                    }
/* 37 */            int i7 = 0;
                    while (true) {
/* 38 */                long j = jArr[i7];
/* 52 */                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 61 */                    int i8 = 8 - ((~(i7 - length)) >>> 31);
/* 64 */                    for (int i9 = 0; i9 < i8; i9++) {
/* 73 */                        if ((255 & j) < 128 && (i3 = (io10o01Ol0 = (Io10o01Ol0) objArr[(i7 << 3) + i9]).I00000oOI) >= i5 && io10o01Ol0 != io10o01Ol02 && (i4 = i3 + i6) >= 0) {
/* 91 */                            io10o01Ol0.I00000oOI = i4;
                                }
/* 93 */                        j >>= 8;
                            }
/* 97 */                    if (i8 != 8) {
/* 104 */                       return true;
                            }
                        }
/* 99 */                if (i7 == length) {
/* 104 */                   return true;
                        }
/* 101 */               i7++;
                    }
                }
            }
