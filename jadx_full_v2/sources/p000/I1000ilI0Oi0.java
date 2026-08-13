            package p000;

            import android.graphics.BlendModeColorFilter;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class I1000ilI0Oi0 implements Function1 {
                public long I00iOIl;
                public IllOOo00lI I00iiI;
                public boolean I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             long j = this.I00iOIl;
/* 3 */             IllOOo00lI illOOo00lI = this.I00iiI;
/* 5 */             boolean z = this.I00iiO;
/* 7 */             IIi11Illi1I iIi11Illi1I = (IIi11Illi1I) obj;
/* 26 */            I0oO00o i0oO00oI0000O = iOIloO1oiO.I0000O(iIi11Illi1I, Float.intBitsToFloat((int) (iIi11Illi1I.I00iOIl.I0000oI00() >> 32)) / 2.0f);
/* 46 */            II0oIl iI0oIl = new II0oIl(new BlendModeColorFilter(iiO01ll11o1l.I000OOo1O(j), iOIill.I00000oIO(5)));
/* 49 */            iI0oIl.I00000oOI = j;
/* 51 */            iI0oIl.I0000Il00O = 5;
/* 53 */            VarHandle.storeStoreFence();
/* 59 */            I0oo10oIOO i0oo10oIOO = new I0oo10oIOO(0);
/* 62 */            i0oo10oIOO.I00iiO = illOOo00lI;
/* 64 */            i0oo10oIOO.I00iiI = z;
/* 66 */            i0oo10oIOO.I00iio = i0oO00oI0000O;
/* 68 */            i0oo10oIOO.I00ilI0I1 = iI0oIl;
/* 70 */            VarHandle.storeStoreFence();
/* 73 */            return iIi11Illi1I.I00000oOI(i0oo10oIOO);
                }
            }
