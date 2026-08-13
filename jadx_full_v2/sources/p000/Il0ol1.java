            package p000;

            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public class Il0ol1 implements O1iil1I01o {
                public final String I00000oOI;

                public Il0ol1(Il0olOol il0olOol, String... strArr) {
/* 4 */             String str = il0olOol.I00iOIl;
/* 7 */             Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
/* 20 */            this.I00000oOI = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }

                @Override
                public Collection I00000oIO(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             return I000O01llI0(oI1Iio0ii1);
                }

                @Override
                public Set I00000oOI() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public Collection I0000Il00O(IiOOioIIO0 iiOOioIIO0, Function1 function1) {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public Set I0000O() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                @Override
                public IOIiO1lIl0l I0000oI00(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 3 */             Il0oOiiliio[] il0oOiiliioArr = Il0oOiiliio.I00iOIl;
/* 24 */            return new Il0oIio1i(OI1Iio0ii1.I000II(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{oI1Iio0ii1}, 1))));
                }

                @Override
                public Collection I0001Ioi1lo(OI1Iio0ii1 oI1Iio0ii1, OIIl0iOOlo oIIl0iOOlo) {
/* 1 */             return I000OOo1O(oI1Iio0ii1);
                }

                @Override
                public Set I000II() {
/* 1 */             return Il01llIol0.I00iOIl;
                }

                public Set I000O01llI0(OI1Iio0ii1 oI1Iio0ii1) {
/* 3 */             Il0oIio1i il0oIio1i = Il0ooiloI.I0000Il00O;
/* 5 */             I11IiIloOo i11IiIloOo = i1i0olI.I00iiO;
/* 7 */             Il0oOiiliio[] il0oOiiliioArr = Il0oOiiliio.I00iOIl;
/* 19 */            Il0oi000 il0oi000 = new Il0oi000(il0oIio1i, null, i11IiIloOo, OI1Iio0ii1.I000II("<Error function>"), 1, OlI1o0ooI.I00IO1);
/* 27 */            Il0oo01OllO0 il0oo01OllO0I00000oOI = Il0ooiloI.I00000oOI(Il0ooO1IO.I00ilI0I1, new String[0]);
/* 31 */            O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iio;
/* 33 */            IiOiOloo0 iiOiOloo0 = IiOiioI.I0000oI00;
/* 36 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 40 */            il0oi000.I010lI0oi(null, null, il01100l, il01100l, il01100l, il0oo01OllO0I00000oOI, o1oIIloii0, iiOiOloo0);
/* 43 */            return Collections.singleton(il0oi000);
                }

                public Set I000OOo1O(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             return Il0ooiloI.I0000oI00;
                }

                public String toString() {
/* 12 */            return IlIi0I0.I000oI1ioi(new StringBuilder("ErrorScope{"), this.I00000oOI, '}');
                }
            }
