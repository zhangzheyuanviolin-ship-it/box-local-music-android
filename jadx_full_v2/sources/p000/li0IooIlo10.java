            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public abstract class li0IooIlo10 {
                public static final Oooi0I I00000oIO(ArrayList arrayList, Function1 function1) {
/* 1 */             liIoOiiO1Oi liiooiio1oi = Oooi0I.I00iOIl;
/* 3 */             Iterator it = arrayList.iterator();
/* 7 */             int i = 0;
/* 8 */             int i2 = 0;
/* 17 */            while (it.hasNext()) {
/* 31 */                int iI001l0I00 = ((OolIl0ii1) function1.invoke((Ool10o) it.next())).I001l0I00();
/* 35 */                if (iI001l0I00 != 0) {
/* 37 */                    if (i2 != iI001l0I00 && i2 != 0) {
/* 49 */                        l11I11lO.I0000oI00("UseCaseUtil", Oi010OO0.I0010o("Unexpected configurations: Overwriting current previewStabilizationMode(", i2, ") with useCasePreviewStabilization(", iI001l0I00, ")!"));
                            }
/* 52 */                    i2 = iI001l0I00;
                        }
                    }
/* 54 */            Iterator it2 = arrayList.iterator();
/* 62 */            while (it2.hasNext()) {
/* 76 */                int iI00111O = ((OolIl0ii1) function1.invoke((Ool10o) it2.next())).I00111O();
/* 80 */                if (iI00111O != 0) {
/* 82 */                    if (i != iI00111O && i != 0) {
/* 94 */                        l11I11lO.I0000oI00("UseCaseUtil", Oi010OO0.I0010o("Unexpected configurations: Overwriting current videoStabilizationMode(", i, ") with useCaseVideoStabilization(", iI00111O, ")!"));
                            }
/* 97 */                    i = iI00111O;
                        }
                    }
/* 99 */            liiooiio1oi.getClass();
                    return (i2 == 1 || i == 1) ? Oooi0I.I00iiO : i2 == 2 ? Oooi0I.I00ilI0I1 : i == 2 ? Oooi0I.I00iio : Oooi0I.I00iiI;
                }

                public static final boolean I00000oOI(Ool10o ool10o) {
/* 10 */            if (ool10o.I000OOo1O.I000O01llI0(OolIl0ii1.I00OIl)) {
                        return ool10o.I000OOo1O.I0010o() == OolO01iOo0O.I00iio;
                    }
/* 44 */            l11I11lO.I00000oIO("UseCaseUtil", ool10o + " UseCase does not have capture type.");
/* 9 */             return false;
                }
            }
