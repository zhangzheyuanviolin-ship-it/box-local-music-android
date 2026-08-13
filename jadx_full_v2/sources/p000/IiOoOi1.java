            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IiOoOi1 extends IiIioO0ol1oI {
                public long I00o101lO;
                public long I00oI0i;
                public OlOooI0l0011 I00oII;
                public OlOooI0l0011 I00oIiI10;
                public float I00oO101o;
                public float I00oOio10iI1;
                public float I00ol1;
                public OIooO1iiliI I00olI;
                public OlIl0i I00oli;
                public I10i01 I00oliIiO01i;
                public OlIl0i I00oo1iO0ll;
                public O0ooOII I00ooIo0;
                public IllOOo00lI I00ooiO1I;
                public Function1 I00oooO;
                public float I0100i;
                public float[] I0100o111I;
                public IIi111 I010101Oo1lO;

                @Override
                public final void I010101Oo1lO() {
/* 1 */             I010oio1OO0();
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00oliIiO01i = null;
                }

                public final float[] I010o0o0oO() {
/* 1 */             float[] fArr = this.I0100o111I;
/* 5 */             fArr[0] = 0.0f;
/* 15 */            float fFloatValue = ((Number) this.I00ooiO1I.invoke()).floatValue();
/* 21 */            float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
/* 29 */            if (f > 1.0f) {
/* 31 */                f = 1.0f;
                    }
/* 33 */            fArr[1] = f;
/* 55 */            return fArr;
                }

                public final void I010oio1OO0() {
/* 1 */             OlIl0i olIl0i = this.I00oli;
/* 4 */             if (olIl0i != null) {
/* 6 */                 olIl0i.I000II(null);
                    }
/* 9 */             this.I00oli = null;
/* 13 */            if (this.I00lll10) {
/* 23 */                if (Iil1010O.I00000oOI(this.I00ol1, 0.0f) <= 0 || Iil1010O.I00000oOI(this.I00oOio10iI1, 0.0f) <= 0) {
/* 70 */                    this.I00olI.I000O01llI0(0.0f);
/* 110 */                   return;
                        }
/* 41 */                int iRound = Math.round((this.I00oOio10iI1 / this.I00ol1) * 1000.0f);
/* 47 */                if (iRound < 50) {
/* 49 */                    iRound = 50;
                        }
/* 65 */                this.I00oli = iOi1II01i0.I0000O(I00ooiO1I(), null, null, new I1oO0ooi001(this, iRound, null, 0), 3);
                    }
                }
            }
