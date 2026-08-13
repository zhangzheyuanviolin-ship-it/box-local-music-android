            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ooio00oo extends O1ooOo implements O0iOoioOoI {
                public float I00o0iI0io1;
                public float I00o0l1o1o0;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    int iI000l1;
                    int iI000iOII;
/* 8 */             if (Float.isNaN(this.I00o0iI0io1) || IOo0oO11ll1O.I000l1(j) != 0) {
/* 34 */                iI000l1 = IOo0oO11ll1O.I000l1(j);
                    } else {
/* 18 */                int iI00l0OO0IO = o1iOIoOiO0.I00l0OO0IO(this.I00o0iI0io1);
/* 22 */                iI000l1 = IOo0oO11ll1O.I000OiO(j);
/* 26 */                if (iI00l0OO0IO < 0) {
/* 28 */                    iI00l0OO0IO = 0;
                        }
/* 29 */                if (iI00l0OO0IO <= iI000l1) {
/* 32 */                    iI000l1 = iI00l0OO0IO;
                        }
                    }
/* 38 */            int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 48 */            if (Float.isNaN(this.I00o0l1o1o0) || IOo0oO11ll1O.I000iOII(j) != 0) {
/* 75 */                iI000iOII = IOo0oO11ll1O.I000iOII(j);
                    } else {
/* 58 */                int iI00l0OO0IO2 = o1iOIoOiO0.I00l0OO0IO(this.I00o0l1o1o0);
/* 62 */                iI000iOII = IOo0oO11ll1O.I000OOo1O(j);
/* 66 */                int i = iI00l0OO0IO2 >= 0 ? iI00l0OO0IO2 : 0;
/* 70 */                if (i <= iI000iOII) {
/* 73 */                    iI000iOII = i;
                        }
                    }
/* 87 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I00000oIO(iI000l1, iI000OiO, iI000iOII, IOo0oO11ll1O.I000OOo1O(j)));
/* 91 */            int i2 = oO1I0001000iI001lllioOl.I00iOIl;
/* 93 */            int i3 = oO1I0001000iI001lllioOl.I00iiI;
/* 99 */            I0li0o i0li0o = new I0li0o(17);
/* 102 */           i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 104 */           VarHandle.storeStoreFence();
/* 109 */           return o1iOIoOiO0.I001i1lo1io(i2, i3, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             int iI001iOo1i0O = o1iIo0ll.I001iOo1i0O(i);
/* 20 */            int iI00l0OO0IO = !Float.isNaN(this.I00o0iI0io1) ? o1IiO0l.I00l0OO0IO(this.I00o0iI0io1) : 0;
                    return iI001iOo1i0O < iI00l0OO0IO ? iI00l0OO0IO : iI001iOo1i0O;
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             int iI0000Il00O = o1iIo0ll.I0000Il00O(i);
/* 20 */            int iI00l0OO0IO = !Float.isNaN(this.I00o0l1o1o0) ? o1IiO0l.I00l0OO0IO(this.I00o0l1o1o0) : 0;
                    return iI0000Il00O < iI00l0OO0IO ? iI00l0OO0IO : iI0000Il00O;
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             int iI00OI1 = o1iIo0ll.I00OI1(i);
/* 20 */            int iI00l0OO0IO = !Float.isNaN(this.I00o0l1o1o0) ? o1IiO0l.I00l0OO0IO(this.I00o0l1o1o0) : 0;
                    return iI00OI1 < iI00l0OO0IO ? iI00l0OO0IO : iI00OI1;
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 1 */             int iI000l1 = o1iIo0ll.I000l1(i);
/* 20 */            int iI00l0OO0IO = !Float.isNaN(this.I00o0iI0io1) ? o1IiO0l.I00l0OO0IO(this.I00o0iI0io1) : 0;
                    return iI000l1 < iI00l0OO0IO ? iI00l0OO0IO : iI000l1;
                }
            }
