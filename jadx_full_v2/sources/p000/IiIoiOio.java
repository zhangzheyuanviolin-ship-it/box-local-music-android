            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class IiIoiOio implements OilO0iOl {
                public final CharSequence I00000oIO;
                public final int I00000oOI;
                public final IlliIl1l11O I0000Il00O;

                public IiIoiOio(CharSequence charSequence, int i, IlliIl1l11O illiIl1l11O) {
/* 4 */             this.I00000oIO = charSequence;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = illiIl1l11O;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             IiIoiOO01I iiIoiOO01I = new IiIoiOO01I();
/* 6 */             iiIoiOO01I.I00ilO0 = this;
/* 9 */             iiIoiOO01I.I00iOIl = -1;
/* 18 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(0, 0, this.I00000oIO.length());
/* 22 */            iiIoiOO01I.I00iiI = iI0000Il00O;
/* 24 */            iiIoiOO01I.I00iiO = iI0000Il00O;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            return iiIoiOO01I;
                }
            }
