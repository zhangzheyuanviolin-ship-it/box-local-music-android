            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lIl0ooI0O1 {
                public static final Iolo0O1 I00000oIO(String str) {
/* 4 */             Iolo0O1 iolo0O1 = new Iolo0O1(1);
/* 7 */             iolo0O1.I0001Ioi1lo = str;
/* 15 */            iolo0O1.I00000oOI = new IoI1O1i1(1, null);
/* 23 */            iolo0O1.I0000Il00O = new IoI1O1i1(0, null);
/* 30 */            iolo0O1.I0000O = new IoI1O1i1(1, null);
/* 37 */            iolo0O1.I0000oI00 = new IoI1O1i1(0, null);
/* 39 */            VarHandle.storeStoreFence();
/* 77 */            return iolo0O1;
                }

                public static final Iolo0O1 I00000oOI(Iolo0O1... iolo0O1Arr) {
/* 3 */             int i = 0;
/* 4 */             Iolo0O1 iolo0O1 = new Iolo0O1(i);
/* 7 */             iolo0O1.I0001Ioi1lo = iolo0O1Arr;
/* 9 */             int length = iolo0O1Arr.length;
/* 10 */            IoI1O1i1[] ioI1O1i1Arr = new IoI1O1i1[length];
/* 13 */            for (int i2 = 0; i2 < length; i2++) {
/* 21 */                ioI1O1i1Arr[i2] = iolo0O1Arr[i2].I00000oOI();
                    }
/* 28 */            int i3 = 1;
/* 29 */            OooOo0oli0lI oooOo0oli0lI = new OooOo0oli0lI(i3);
/* 32 */            oooOo0oli0lI.I00iiI = ioI1O1i1Arr;
/* 34 */            VarHandle.storeStoreFence();
/* 42 */            iolo0O1.I00000oOI = new IoI1O1i1(1, oooOo0oli0lI);
/* 44 */            int length2 = iolo0O1Arr.length;
/* 45 */            IoI1O1i1[] ioI1O1i1Arr2 = new IoI1O1i1[length2];
/* 48 */            for (int i4 = 0; i4 < length2; i4++) {
/* 56 */                ioI1O1i1Arr2[i4] = iolo0O1Arr[i4].I0000O();
                    }
/* 65 */            IoI1Ilo ioI1Ilo = new IoI1Ilo(i3);
/* 68 */            ioI1Ilo.I00iiI = ioI1O1i1Arr2;
/* 70 */            VarHandle.storeStoreFence();
/* 76 */            iolo0O1.I0000Il00O = new IoI1O1i1(0, ioI1Ilo);
/* 78 */            int length3 = iolo0O1Arr.length;
/* 79 */            IoI1O1i1[] ioI1O1i1Arr3 = new IoI1O1i1[length3];
/* 82 */            for (int i5 = 0; i5 < length3; i5++) {
/* 90 */                ioI1O1i1Arr3[i5] = iolo0O1Arr[i5].I0000Il00O();
                    }
/* 97 */            OooOo0oli0lI oooOo0oli0lI2 = new OooOo0oli0lI(i);
/* 100 */           oooOo0oli0lI2.I00iiI = ioI1O1i1Arr3;
/* 102 */           VarHandle.storeStoreFence();
/* 110 */           iolo0O1.I0000O = new IoI1O1i1(1, oooOo0oli0lI2);
/* 112 */           int length4 = iolo0O1Arr.length;
/* 113 */           IoI1O1i1[] ioI1O1i1Arr4 = new IoI1O1i1[length4];
/* 116 */           for (int i6 = 0; i6 < length4; i6++) {
/* 124 */               ioI1O1i1Arr4[i6] = iolo0O1Arr[i6].I00000oIO();
                    }
/* 133 */           IoI1Ilo ioI1Ilo2 = new IoI1Ilo(i);
/* 136 */           ioI1Ilo2.I00iiI = ioI1O1i1Arr4;
/* 138 */           VarHandle.storeStoreFence();
/* 144 */           iolo0O1.I0000oI00 = new IoI1O1i1(0, ioI1Ilo2);
/* 146 */           VarHandle.storeStoreFence();
/* 168 */           return iolo0O1;
                }
            }
