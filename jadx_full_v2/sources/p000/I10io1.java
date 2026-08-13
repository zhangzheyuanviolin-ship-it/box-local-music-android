            package p000;
            
            public final class I10io1 extends O0iO10011II implements IlliIl1l11O {
                public static final I10io1 I00iiI;
                public static final I10io1 I00iiO;
                public final int I00iOIl;

                static {
/* 3 */             int i = 2;
/* 8 */             I00iiI = new I10io1(i, 0);
/* 16 */            I00iiO = new I10io1(i, 1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10io1(int i, int i2) {
/* 3 */             super(i);
/* 1 */             this.I00iOIl = i2;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 26 */                    long j = ((IooOl0ol01) obj).I00000oIO;
/* 30 */                    long j2 = ((IooOl0ol01) obj2).I00000oIO;
/* 32 */                    OOo0IO oOo0IO = Ooooi01I.I00000oIO;
/* 46 */                    return iOO01lio0.I0000Il00O(0.0f, 400.0f, IooOl0ol01.I00000oIO(4294967297L), 1);
                        default:
/* 9 */                     Il0OoI0oO1Ii il0OoI0oO1Ii = (Il0OoI0oO1Ii) obj2;
/* 19 */                    return Boolean.valueOf(((Il0OoI0oO1Ii) obj) == il0OoI0oO1Ii && il0OoI0oO1Ii == Il0OoI0oO1Ii.I00iiO);
                    }
                }
            }
