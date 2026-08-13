            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O0l0O0I1 {
                public IIlio101Io I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public O0l0IoOl I0000O;
                public I0oiil10Ili I0000oI00;
                public IIlio101Io I0001Ioi1lo;

                public final long I00000oIO(int i, int i2) {
                    int i3;
/* 1 */             IIlio101Io iIlio101Io = this.I00000oIO;
/* 5 */             int[] iArr = (int[]) iIlio101Io.I00iiI;
/* 8 */             if (i2 == 1) {
/* 10 */                i3 = iArr[i];
                    } else {
/* 14 */                int i4 = (i2 + i) - 1;
/* 17 */                int[] iArr2 = (int[]) iIlio101Io.I00iiO;
/* 26 */                i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
                    }
/* 29 */            if (i3 < 0) {
/* 31 */                i3 = 0;
                    }
/* 32 */            if (i3 < 0) {
/* 37 */                Ioliol1Ii.I00000oIO("width must be >= 0");
                    }
/* 43 */            return IOo0olo.I000O01llI0(i3, i3, 0, Integer.MAX_VALUE);
                }

                public final O0l0iOoOliOl I00000oOI(int i) {
/* 3 */             IlilOiIoo ililOiIooI000OiO = this.I0000oI00.I000OiO(i);
/* 7 */             int i2 = ililOiIooI000OiO.I00000oIO;
/* 9 */             List list = ililOiIooI000OiO.I00000oOI;
/* 11 */            int size = list.size();
/* 29 */            int i3 = (size == 0 || i2 + size == this.I00000oOI) ? 0 : this.I0000Il00O;
/* 30 */            O0l0iI[] o0l0iIArr = new O0l0iI[size];
/* 32 */            int i4 = 0;
/* 34 */            for (int i5 = 0; i5 < size; i5++) {
/* 44 */                int i6 = (int) ((Io10ioOo1) list.get(i5)).I00000oIO;
/* 53 */                O0l0iI o0l0iII010OIo1l = this.I0000O.I010OIo1l(i2 + i5, i4, i6, I00000oIO(i4, i6), i3);
/* 57 */                i4 += i6;
/* 58 */                o0l0iIArr[i5] = o0l0iII010OIo1l;
                    }
/* 65 */            IIlio101Io iIlio101Io = this.I0001Ioi1lo;
/* 67 */            O0l0iOoOliOl o0l0iOoOliOl = new O0l0iOoOliOl();
/* 70 */            o0l0iOoOliOl.I00000oIO = i;
/* 72 */            o0l0iOoOliOl.I00000oOI = o0l0iIArr;
/* 74 */            o0l0iOoOliOl.I0000Il00O = iIlio101Io;
/* 76 */            o0l0iOoOliOl.I0000O = list;
/* 78 */            o0l0iOoOliOl.I0000oI00 = i3;
/* 81 */            int iMax = 0;
/* 82 */            for (int i7 = 0; i7 < size; i7++) {
/* 88 */                iMax = Math.max(iMax, o0l0iIArr[i7].I000o00OoI0I);
                    }
/* 95 */            o0l0iOoOliOl.I0001Ioi1lo = iMax;
/* 99 */            int i8 = iMax + o0l0iOoOliOl.I0000oI00;
/* 104 */           o0l0iOoOliOl.I000II = i8 >= 0 ? i8 : 0;
/* 106 */           VarHandle.storeStoreFence();
/* 168 */           return o0l0iOoOliOl;
                }
            }
