            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lOioli00i0ii {
                public static final Olol0I1o1IO I00000oIO(IiIill0O0li1 iiIill0O0li1) {
                    Ololoi ololoi;
/* 3 */             OloilI0Ol oloilI0Ol = new OloilI0Ol();
/* 8 */             OI0oiiIO0 oI0oiiIO0 = new OI0oiiIO0();
/* 11 */            oloilI0Ol.I00000oIO = oI0oiiIO0;
/* 18 */            oloilI0Ol.I00000oOI = new OI0oiiIO0();
/* 20 */            VarHandle.storeStoreFence();
/* 35 */            new I00oII(1, oloilI0Ol, OloilI0Ol.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 23);
/* 41 */            Ol1OiIli00Ii ol1OiIli00Ii = new Ol1OiIli00Ii(6);
/* 44 */            ol1OiIli00Ii.I00iiI = oloilI0Ol;
/* 46 */            VarHandle.storeStoreFence();
/* 52 */            Ol1OiIli00Ii ol1OiIli00Ii2 = new Ol1OiIli00Ii(7);
/* 55 */            ol1OiIli00Ii2.I00iiI = ol1OiIli00Ii;
/* 57 */            VarHandle.storeStoreFence();
/* 62 */            lOo1ii0o1.I00000oOI(iiIill0O0li1, Olol1O.I00000oIO, ol1OiIli00Ii2);
/* 67 */            OI0oiiIO0 oI0oiiIO02 = new OI0oiiIO0();
/* 70 */            Object[] objArr = oI0oiiIO0.I00000oIO;
/* 72 */            int i = oI0oiiIO0.I00000oOI;
/* 74 */            int i2 = 0;
/* 77 */            int i3 = 0;
/* 78 */            boolean z = true;
/* 79 */            OloilIOlliOi oloilIOlliOi = null;
                    while (true) {
/* 80 */                ololoi = Ololoi.I00000oOI;
/* 82 */                if (i3 >= i) {
                            break;
                        }
/* 86 */                OloilIOlliOi oloilIOlliOi2 = (OloilIOlliOi) objArr[i3];
/* 88 */                if (!z || oloilIOlliOi2 != ololoi) {
/* 92 */                    if (oloilIOlliOi2 == ololoi && oloilIOlliOi == ololoi) {
/* 125 */                       z = false;
                                break;
                                break;
                            }
/* 97 */                    if (oloilIOlliOi2 != ololoi) {
/* 100 */                       OI0oiiIO0 oI0oiiIO03 = oloilI0Ol.I00000oOI;
/* 102 */                       Object[] objArr2 = oI0oiiIO03.I00000oIO;
/* 104 */                       int i4 = oI0oiiIO03.I00000oOI;
/* 107 */                       for (int i5 = 0; i5 < i4; i5++) {
/* 123 */                           if (!((Boolean) ((Function1) objArr2[i5]).invoke(oloilIOlliOi2)).booleanValue()) {
/* 125 */                               z = false;
                                        break;
                                    }
                                }
                            }
/* 130 */                   oI0oiiIO02.I00000oOI(oloilIOlliOi2);
/* 133 */                   z = false;
/* 134 */                   oloilIOlliOi = oloilIOlliOi2;
                        }
/* 135 */               i3++;
                    }
/* 154 */           if (((OloilIOlliOi) (oI0oiiIO02.I000OOo1O() ? null : oI0oiiIO02.I00000oIO[oI0oiiIO02.I00000oOI - 1])) == ololoi) {
/* 159 */               oI0oiiIO02.I000l1(oI0oiiIO02.I00000oOI - 1);
                    }
/* 164 */           OI0oIOI oI0oIOI = oI0oiiIO02.I0000Il00O;
/* 166 */           if (oI0oIOI == null) {
/* 171 */               oI0oIOI = new OI0oIOI(i2);
/* 174 */               oI0oIOI.I00iiI = oI0oiiIO02;
/* 176 */               VarHandle.storeStoreFence();
/* 179 */               oI0oiiIO02.I0000Il00O = oI0oIOI;
                    }
/* 181 */           return new Olol0I1o1IO(oI0oIOI);
                }
            }
