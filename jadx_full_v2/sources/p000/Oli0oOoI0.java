            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Oli0oOoI0 implements Function1 {
                public Oli0oiO I00iOIl;
                public long I00iiI;
                public OO1I0001000i I00iiO;
                public float I00iio;
                public float I00ilI0I1;
                public float I00ilO0;
                public float I00io1l;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             Oli0oiO oli0oiO = this.I00iOIl;
/* 3 */             long j = this.I00iiI;
/* 5 */             OO1I0001000i oO1I0001000i = this.I00iiO;
/* 7 */             float f = this.I00iio;
/* 9 */             float f2 = this.I00ilI0I1;
/* 11 */            float f3 = this.I00ilO0;
/* 13 */            float f4 = this.I00io1l;
/* 15 */            OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 19 */            Oli100iIoOOO oli100iIoOOOI01101IOlO = Oli0oiO.I01101IOlO(oli0oiO, 12);
/* 52 */            int iRound = (oli100iIoOOOI01101IOlO.I001IO000((byte) 13) || !oli100iIoOOOI01101IOlO.I001IO000((byte) 15)) ? Math.round(f2) : (IOo0oO11ll1O.I000OiO(j) - oO1I0001000i.I00iOIl) - Math.round(f);
/* 86 */            int iRound2 = (!oli100iIoOOOI01101IOlO.I001IO000((byte) 16) || oli100iIoOOOI01101IOlO.I001IO000((byte) 14)) ? Math.round(f4) : (IOo0oO11ll1O.I000OOo1O(j) - oO1I0001000i.I00iiI) - Math.round(f3);
/* 97 */            if ((oli100iIoOOOI01101IOlO.I0010I0i() & 4) != 0) {
/* 99 */                Ol1OiIli00Ii ol1OiIli00Ii = oli0oiO.I00oo1iO0ll;
/* 101 */               if (ol1OiIli00Ii == null) {
/* 106 */                   ol1OiIli00Ii = new Ol1OiIli00Ii(3);
/* 109 */                   ol1OiIli00Ii.I00iiI = oli0oiO;
/* 111 */                   VarHandle.storeStoreFence();
/* 114 */                   oli0oiO.I00oo1iO0ll = ol1OiIli00Ii;
                        }
/* 119 */               OO11o0IO.I0010o(oO11o0IO, oO1I0001000i, iRound, iRound2, ol1OiIli00Ii, 4);
                    } else {
/* 2 */                 oO11o0IO.I000O01llI0(oO1I0001000i, iRound, iRound2, 0.0f);
                    }
/* 127 */           return OoiIlOl1iI.I00000oIO;
                }
            }
