            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iioillO0 {
                public static final OO0l00oiO1i1 I00000oIO(int i) {
                    float f = i;
/* 4 */             OO0l00oiO1i1 oO0l00oiO1i1 = new OO0l00oiO1i1();
/* 7 */             oO0l00oiO1i1.I00000oIO = f;
/* 12 */            if (f >= 0.0f && f <= 100.0f) {
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                return oO0l00oiO1i1;
                    }
/* 27 */            Ioll0IliO1l.I00000oIO("The percent should be in the range of [0, 100]");
/* 30 */            VarHandle.storeStoreFence();
/* 77 */            return oO0l00oiO1i1;
                }

                public static final Iil10li1IIo I00000oOI(float f) {
/* 3 */             Iil10li1IIo iil10li1IIo = new Iil10li1IIo();
/* 6 */             iil10li1IIo.I00000oIO = f;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iil10li1IIo;
                }
            }
