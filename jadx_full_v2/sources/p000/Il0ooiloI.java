            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            
            public final class Il0ooiloI {
                public static final Il0ooiloI I00000oIO = new Il0ooiloI();
                public static final Il0oiI1 I00000oOI = Il0oiI1.I00iOIl;
                public static final Il0oIio1i I0000Il00O;
                public static final Il0oo01OllO0 I0000O;
                public static final Set I0000oI00;

                static {
/* 14 */            Il0oOiiliio[] il0oOiiliioArr = Il0oOiiliio.I00iOIl;
/* 37 */            Il0oIio1i il0oIio1i = new Il0oIio1i(OI1Iio0ii1.I000II(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
/* 40 */            I0000Il00O = il0oIio1i;
/* 51 */            I0000O = I00000oOI(Il0ooO1IO.I00ioIO, new String[0]);
/* 57 */            Il0oo01OllO0 il0oo01OllO0I00000oOI = I00000oOI(Il0ooO1IO.I00oO101o, new String[0]);
/* 63 */            Il0oiOO il0oiOO = new Il0oiOO();
/* 66 */            O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iio;
/* 68 */            IiOiOloo0 iiOiOloo0 = IiOiioI.I00000oIO;
/* 80 */            OOOO1o oOOO1oI010ioo = OOOO1o.I010ioo(il0oIio1i, o1oIIloii0, true, OI1Iio0ii1.I000II("<Error property>"), 1, OlI1o0ooI.I00IO1);
/* 86 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 90 */            oOOO1oI010ioo.I01101IOlO(il0oo01OllO0I00000oOI, il01100l, null, null, il01100l);
/* 93 */            il0oiOO.I00iOIl = oOOO1oI010ioo;
/* 95 */            VarHandle.storeStoreFence();
/* 102 */           I0000oI00 = Collections.singleton(il0oiOO);
                }

                public static final Il0ol1 I00000oIO(Il0olOol il0olOol, boolean z, String... strArr) {
/* 1 */             if (!z) {
/* 32 */                return new Il0ol1(il0olOol, (String[]) Arrays.copyOf(strArr, strArr.length));
                    }
/* 10 */            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
/* 19 */            return new Oo10lIli0(il0olOol, (String[]) Arrays.copyOf(strArr2, strArr2.length));
                }

                public static final Il0oo01OllO0 I00000oOI(Il0ooO1IO il0ooO1IO, String... strArr) {
/* 6 */             String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
/* 28 */            return I0000O(il0ooO1IO, Il01100l.I00iOIl, I0000Il00O(il0ooO1IO, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
                }

                public static Il0ooI I0000Il00O(Il0ooO1IO il0ooO1IO, String... strArr) {
/* 8 */             String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
/* 10 */            Il0ooI il0ooI = new Il0ooI();
/* 13 */            il0ooI.I00iOIl = il0ooO1IO;
/* 15 */            il0ooI.I00iiI = strArr2;
/* 17 */            Il0oOiiliio[] il0oOiiliioArr = Il0oOiiliio.I00iOIl;
/* 19 */            String str = il0ooO1IO.I00iOIl;
/* 22 */            Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
/* 50 */            il0ooI.I00iiO = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
/* 52 */            VarHandle.storeStoreFence();
/* 89 */            return il0ooI;
                }

                public static Il0oo01OllO0 I0000O(Il0ooO1IO il0ooO1IO, List list, OoOIOoO1I ooOIOoO1I, String... strArr) {
/* 37 */            return new Il0oo01OllO0(ooOIOoO1I, I00000oIO(Il0olOol.I00ilI0I1, false, (String[]) Arrays.copyOf(new String[]{ooOIOoO1I.toString()}, 1)), il0ooO1IO, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
                }

                public static final boolean I0000oI00(Ii1Ool1 ii1Ool1) {
/* 1 */             if (ii1Ool1 != null) {
                        return (ii1Ool1 instanceof Il0oIio1i) || (ii1Ool1.I000lI() instanceof Il0oIio1i) || ii1Ool1 == I00000oOI;
                    }
/* 21 */            return false;
                }
            }
