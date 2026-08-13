            package p000;

            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class i0I0ooO1IO0i extends Oi10IOIi implements IlliIl1l11O {
                public int I00iiI;
                public Object I00iiO;
                public final OIooO1iiliI I00iio;
                public final float I00ilI0I1;
                public final float I00ilO0;
                public final Ii0110 I00io1l;
                public final OIooO1iiliI I00ioIO;
                public final OIooO1iiliI I00l0I0l0lO1;
                public final Function3 I00l0OO0IO;
                public final OIoIoIO0oI1O I00li1OI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i0I0ooO1IO0i(OIooO1iiliI oIooO1iiliI, float f, float f2, Ii0110 ii0110, OIooO1iiliI oIooO1iiliI2, OIooO1iiliI oIooO1iiliI3, Function3 function3, OIoIoIO0oI1O oIoIoIO0oI1O, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = oIooO1iiliI;
/* 3 */             this.I00ilI0I1 = f;
/* 5 */             this.I00ilO0 = f2;
/* 7 */             this.I00io1l = ii0110;
/* 9 */             this.I00ioIO = oIooO1iiliI2;
/* 11 */            this.I00l0I0l0lO1 = oIooO1iiliI3;
/* 13 */            this.I00l0OO0IO = function3;
/* 15 */            this.I00li1OI = oIoIoIO0oI1O;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            i0I0ooO1IO0i i0i0ooo1io0i = new i0I0ooO1IO0i(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, iOoil1iiIilo);
/* 23 */            i0i0ooo1io0i.I00iiO = obj;
/* 37 */            return i0i0ooo1io0i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((i0I0ooO1IO0i) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
                
                    if (r3 == r2) goto L15;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:16:0x003f). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI00000oOI;
/* 5 */             Oll11lOlo oll11lOlo = (Oll11lOlo) this.I00iiO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iiI;
/* 14 */            boolean z = true;
/* 15 */            if (i == 0) {
/* 37 */                lIoii1l01l0i.I00000oOI(obj);
/* 40 */                this.I00iiO = oll11lOlo;
/* 42 */                this.I00iiI = 1;
/* 48 */                if (OloI0l1i1oO.I00000oOI(oll11lOlo, this, 3) != ii0111o) {
                        }
/* 63 */                return ii0111o;
                    }
/* 17 */            if (i != 1) {
/* 19 */                if (i != 2) {
/* 29 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        }
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 24 */                objI00000oOI = obj;
/* 64 */                OO1Oooio101 oO1Oooio101 = (OO1Oooio101) objI00000oOI;
/* 66 */                List list = oO1Oooio101.I00000oIO;
/* 68 */                list.size();
/* 71 */                OIooO1iiliI oIooO1iiliI = this.I00iio;
/* 73 */                float fI000II = oIooO1iiliI.I000II();
/* 77 */                float fI00000oOI = lOo0lOlo.I00000oOI(oO1Oooio101, z);
/* 82 */                float fI00000oOI2 = lOo0lOlo.I00000oOI(oO1Oooio101, false);
/* 101 */               oIooO1iiliI.I000O01llI0(fI000II * ((fI00000oOI == 0.0f || fI00000oOI2 == 0.0f) ? 1.0f : fI00000oOI / fI00000oOI2));
/* 120 */               oIooO1iiliI.I000O01llI0(Math.max(Math.min(oIooO1iiliI.I000II(), this.I00ilI0I1), this.I00ilO0));
/* 125 */               OIoIoIO0oI1O oIoIoIO0oI1O = this.I00li1OI;
/* 127 */               OIoI0lloOol oIoI0lloOol = new OIoI0lloOol(oIoIoIO0oI1O, null, 3);
/* 130 */               Ii0110 ii0110 = this.I00io1l;
/* 132 */               iOi1II01i0.I0000O(ii0110, null, null, oIoI0lloOol, 3);
/* 135 */               long jI00000oIO = lOo0lOlo.I00000oIO(oO1Oooio101, z);
/* 159 */               long jI0001Ioi1lo = OIOlIiiioi.I0000O(jI00000oIO, 9205357640488583168L) ? 0L : OIOlIiiioi.I0001Ioi1lo(jI00000oIO, lOo0lOlo.I00000oIO(oO1Oooio101, false));
/* 163 */               OIooO1iiliI oIooO1iiliI2 = this.I00ioIO;
/* 179 */               oIooO1iiliI2.I000O01llI0(Float.intBitsToFloat((int) (jI0001Ioi1lo >> 32)) + oIooO1iiliI2.I000II());
/* 182 */               OIooO1iiliI oIooO1iiliI3 = this.I00l0I0l0lO1;
/* 200 */               oIooO1iiliI3.I000O01llI0(Float.intBitsToFloat((int) (jI0001Ioi1lo & 4294967295L)) + oIooO1iiliI3.I000II());
/* 209 */               iOi1II01i0.I0000O(ii0110, null, null, new OIoI0lloOol(oIoIoIO0oI1O, null, 4), 3);
/* 241 */               this.I00l0OO0IO.invoke(new Float(oIooO1iiliI2.I000II()), new Float(oIooO1iiliI3.I000II()), new Float(oIooO1iiliI.I000II()));
/* 246 */               List list2 = list;
/* 250 */               if (!(list2 instanceof Collection) || !list2.isEmpty()) {
/* 262 */                   Iterator it = list2.iterator();
/* 270 */                   while (it.hasNext()) {
/* 280 */                       if (((OO1il00lI) it.next()).I0000O) {
/* 282 */                           z = true;
                                }
                            }
                        }
/* 285 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 33 */            lIoii1l01l0i.I00000oOI(obj);
/* 51 */            this.I00iiO = oll11lOlo;
/* 53 */            this.I00iiI = 2;
/* 57 */            objI00000oOI = oll11lOlo.I00000oOI(OO1i0l.I00iiI, this);
                }
            }
