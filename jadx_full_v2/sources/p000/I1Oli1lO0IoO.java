            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class I1Oli1lO0IoO implements OlO01l1oOil {
                public List I00iOIl;
                public OoOlII I00iiI;
                public Function1 I00iiO;
                public OIooliIO0 I00iio;
                public boolean I00ilI0I1;

                /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:14:0x0036, B:34:0x00a1, B:21:0x004e, B:23:0x0053, B:27:0x0079, B:32:0x0094), top: B:39:0x0026 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a1 -> B:35:0x00aa). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    I1OlOlii1 i1OlOlii1;
                    int size;
                    List list;
                    int i;
                    OoOlioiilil ooOlioiilil;
/* 1 */             Function1 function1 = this.I00iiO;
/* 3 */             OIooliIO0 oIooliIO0 = this.I00iio;
/* 7 */             if (iOoilo instanceof I1OlOlii1) {
/* 10 */                i1OlOlii1 = (I1OlOlii1) iOoilo;
/* 12 */                int i2 = i1OlOlii1.I00io1l;
/* 18 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 21 */                    i1OlOlii1.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    i1OlOlii1 = new I1OlOlii1(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = i1OlOlii1.I00ilI0I1;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i3 = i1OlOlii1.I00io1l;
/* 35 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 39 */                if (i3 != 0) {
/* 43 */                    if (i3 == 1) {
/* 69 */                        int i4 = i1OlOlii1.I00iio;
/* 71 */                        int i5 = i1OlOlii1.I00iiO;
/* 73 */                        Oi0l1olOi oi0l1olOi = i1OlOlii1.I00iiI;
/* 75 */                        List list2 = i1OlOlii1.I00iOIl;
/* 79 */                        lIoii1l01l0i.I00000oOI(obj);
/* 82 */                        if (obj != null) {
/* 84 */                            OoOlII ooOlII = this.I00iiI;
/* 96 */                            oIooliIO0.setValue(iliioilIlo1.I00000oIO(ooOlII.I0000O, obj, oi0l1olOi, ooOlII.I00000oOI, ooOlII.I0000Il00O));
/* 103 */                           boolean zI000II = l01oO1iOo.I000II(i1OlOlii1.getContext());
/* 107 */                           this.I00ilI0I1 = false;
/* 115 */                           ooOlioiilil = new OoOlioiilil(oIooliIO0.getValue(), zI000II);
/* 118 */                           function1.invoke(ooOlioiilil);
/* 121 */                           return ooiIlOl1iI;
                                }
/* 125 */                       i1OlOlii1.I00iOIl = list2;
/* 127 */                       i1OlOlii1.I00iiI = null;
/* 129 */                       i1OlOlii1.I00iiO = i5;
/* 131 */                       i1OlOlii1.I00iio = i4;
/* 133 */                       i1OlOlii1.I00io1l = 2;
/* 139 */                       if (liIOo01oO.I00000oIO(i1OlOlii1) == ii0111o) {
/* 141 */                           return ii0111o;
                                }
/* 142 */                       size = i4;
/* 143 */                       i = i5;
/* 144 */                       list = list2;
                            } else {
/* 45 */                        if (i3 != 2) {
/* 65 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                            return null;
                                }
/* 47 */                        size = i1OlOlii1.I00iio;
/* 49 */                        i = i1OlOlii1.I00iiO;
/* 51 */                        list = i1OlOlii1.I00iOIl;
/* 55 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 171 */                   i++;
/* 160 */                   if (i < size) {
/* 168 */                       ((Oi0l1olOi) list.get(i)).getClass();
/* 171 */                       i++;
/* 160 */                       if (i < size) {
/* 177 */                           boolean zI000II2 = l01oO1iOo.I000II(i1OlOlii1.getContext());
/* 181 */                           this.I00ilI0I1 = false;
/* 189 */                           ooOlioiilil = new OoOlioiilil(oIooliIO0.getValue(), zI000II2);
/* 118 */                           function1.invoke(ooOlioiilil);
/* 121 */                           return ooiIlOl1iI;
                                }
                            }
                        } else {
/* 146 */                   lIoii1l01l0i.I00000oOI(obj);
/* 149 */                   List list3 = this.I00iOIl;
/* 154 */                   size = list3.size();
/* 158 */                   list = list3;
/* 159 */                   i = 0;
/* 160 */                   if (i < size) {
                            }
                        }
                    } catch (Throwable th) {
/* 197 */               boolean zI000II3 = l01oO1iOo.I000II(i1OlOlii1.getContext());
/* 201 */               this.I00ilI0I1 = false;
/* 212 */               function1.invoke(new OoOlioiilil(oIooliIO0.getValue(), zI000II3));
/* 437 */               throw th;
                    }
                }

                @Override
                public final Object getValue() {
/* 3 */             return this.I00iio.getValue();
                }
            }
