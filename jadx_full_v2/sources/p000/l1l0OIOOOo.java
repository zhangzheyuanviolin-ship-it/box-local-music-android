            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1l0OIOOOo {
                public static final Oo10Oioll0 I00000oIO(O1ooOo o1ooOo, Function1 function1) {
/* 1 */             O0iiOioolIi o0iiOioolIiI000O01llI0 = il0lI1i1olii.I000O01llI0(o1ooOo);
/* 5 */             int i = o0iiOioolIiI000O01llI0.I00iiI;
/* 13 */            OOo0Olol0o rectManager = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIiI000O01llI0)).getRectManager();
/* 17 */            Oo10ili0oo0 oo10ili0oo0 = rectManager.I0000O;
/* 19 */            oo10ili0oo0.getClass();
/* 22 */            OI0l1oli1I oI0l1oli1I = oo10ili0oo0.I00000oIO;
/* 26 */            Oo10Oioll0 oo10Oioll0 = new Oo10Oioll0();
/* 29 */            oo10Oioll0.I000O01llI0 = oo10ili0oo0;
/* 31 */            oo10Oioll0.I00000oIO = i;
/* 33 */            oo10Oioll0.I00000oOI = o1ooOo;
/* 35 */            oo10Oioll0.I0000Il00O = function1;
/* 39 */            oo10Oioll0.I000II = Long.MIN_VALUE;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            Object objI00000oOI = oI0l1oli1I.I00000oOI(i);
/* 48 */            if (objI00000oOI == null) {
/* 50 */                oI0l1oli1I.I000OOo1O(i, oo10Oioll0);
/* 53 */                objI00000oOI = oo10Oioll0;
                    }
/* 54 */            Oo10Oioll0 oo10Oioll02 = (Oo10Oioll0) objI00000oOI;
/* 56 */            if (oo10Oioll02 != oo10Oioll0) {
                        while (true) {
/* 58 */                    Oo10Oioll0 oo10Oioll03 = oo10Oioll02.I0000O;
/* 60 */                    if (oo10Oioll03 == null) {
                                break;
                            }
/* 62 */                    oo10Oioll02 = oo10Oioll03;
                        }
/* 64 */                oo10Oioll02.I0000O = oo10Oioll0;
                    }
/* 68 */            O0iiOioolIi o0iiOioolIiI000O01llI02 = il0lI1i1olii.I000O01llI0(o1ooOo.I00iOIl);
/* 75 */            if (o0iiOioolIiI000O01llI02.I00io1l != -4) {
/* 77 */                I00Ol00 i00Ol00 = rectManager.I0000Il00O;
/* 79 */                int iI0000O = rectManager.I0000O(o0iiOioolIiI000O01llI02);
/* 85 */                long[] jArr = (long[]) i00Ol00.I0000Il00O;
/* 87 */                int i2 = iI0000O + 2;
/* 100 */               jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
                    }
/* 103 */           rectManager.I0001Ioi1lo = true;
/* 105 */           rectManager.I000OiO();
/* 332 */           return oo10Oioll0;
                }
            }
