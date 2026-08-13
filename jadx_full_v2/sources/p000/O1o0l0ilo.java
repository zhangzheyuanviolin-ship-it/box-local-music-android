            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1o0l0ilo implements Ii0ioo10iO0 {
                public Ol1o0O0O0 I00000oIO;
                public List I00000oOI;
                public OloIl1l1oOii I0000Il00O;

                /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO(Object obj, IloI0lOlll1 iloI0lOlll1, int i) {
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(860982610);
/* 28 */            int i2 = i | (iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(this) ? 32 : 16);
/* 44 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 47 */                Ii0l0Olio10 ii0l0Olio10 = (Ii0l0Olio10) obj;
/* 49 */                OloIl1l1oOii oloIl1l1oOii = this.I0000Il00O;
/* 51 */                O1ol100o0O o1ol100o0O = ii0l0Olio10.I00000oIO;
/* 53 */                float f = ii0l0Olio10.I00000oOI;
/* 55 */                Function1 function1 = ii0l0Olio10.I0000Il00O;
/* 57 */                Ol1o0O0O0 ol1o0O0O0 = this.I00000oIO;
/* 59 */                List list = this.I00000oOI;
/* 61 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(this);
/* 65 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 69 */                if (!zI000OOo1O) {
                            Object obj2 = objI00O0i0ii;
/* 73 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 79 */                        IlIi0Il ilIi0Il = new IlIi0Il(19);
/* 82 */                        ilIi0Il.I00iiI = this;
/* 84 */                        VarHandle.storeStoreFence();
/* 87 */                        iloI0lOlll1.I00iio(ilIi0Il);
                                obj2 = ilIi0Il;
                            }
/* 95 */                    iloI0lOlll12 = iloI0lOlll1;
/* 96 */                    O1o0iO.I0000Il00O(oloIl1l1oOii, o1ol100o0O, null, f, function1, ol1o0O0O0, list, (IllOOo00lI) obj2, iloI0lOlll12, 0);
                        }
                    } else {
/* 100 */               iloI0lOlll12 = iloI0lOlll1;
/* 101 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 104 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 108 */           if (oOloioIlI001IO000 != null) {
/* 114 */               Ilo0lI ilo0lI = new Ilo0lI(27);
/* 117 */               ilo0lI.I00iiI = this;
/* 119 */               ilo0lI.I00iiO = obj;
/* 121 */               VarHandle.storeStoreFence();
/* 124 */               oOloioIlI001IO000.I0000O = ilo0lI;
                    }
                }

                @Override
                public final OloIl1l1oOii I00000oOI() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final void I0000Il00O(Context context, IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, I0IO1io0I i0IO1io0I) {
/* 3 */             this.I00000oIO.clear();
/* 6 */             O111ooi11li o111ooi11li = O111ooi11li.I00000oIO;
/* 10 */            String str = this.I0000Il00O.I00000oIO;
/* 49 */            o111ooi11li.I0000O(context, o1oIOiI11o0, false, false, i0IO1io0I, (Barcode.FORMAT_UPC_A & 64) != 0 ? null : O1o0l1li1ii.I00000oIO(), (Barcode.FORMAT_UPC_A & Barcode.FORMAT_ITF) != 0 ? Il01100l.I00iOIl : this.I00000oOI, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_QR_CODE) == 0, (Barcode.FORMAT_UPC_A & Barcode.FORMAT_UPC_A) != 0 ? null : null);
                }

                @Override
                public final void I0000O(IOO11li1OoII iOO11li1OoII, O1oIOiI11o0 o1oIOiI11o0, O1oiilO o1oiilO) {
/* 3 */             this.I00000oIO.clear();
/* 8 */             O111ooi11li.I00000oIO.I00000oIO(o1oIOiI11o0, o1oiilO);
                }
            }
