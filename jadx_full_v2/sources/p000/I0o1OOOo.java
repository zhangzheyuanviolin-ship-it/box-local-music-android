            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class I0o1OOOo extends Oi10IOIi implements IlliIl1l11O {
                public final int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0o1OOOo(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00ilI0I1 = obj;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Object obj2 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 24 */                    I0o1OOOo i0o1OOOo = new I0o1OOOo((I0o1iIoolIi) obj2, iOoil1iiIilo, 0);
/* 27 */                    i0o1OOOo.I00iio = obj;
/* 29 */                    return i0o1OOOo;
                        default:
/* 13 */                    I0o1OOOo i0o1OOOo2 = new I0o1OOOo((OO1i0l) obj2, iOoil1iiIilo, 1);
/* 16 */                    i0o1OOOo2.I00iio = obj;
/* 18 */                    return i0o1OOOo2;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iiI;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Oll11lOlo oll11lOlo = (Oll11lOlo) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I0o1OOOo) create(oll11lOlo, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
                
                    if (r13 == r0) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
                
                    if (r13 != r0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007c). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Oll11lOlo oll11lOlo;
                    Object obj2;
/* 1 */             int i = this.I00iiI;
/* 3 */             Object obj3 = this.I00ilI0I1;
                    switch (i) {
                        case 0:
/* 48 */                    I0o1iIoolIi i0o1iIoolIi = (I0o1iIoolIi) obj3;
/* 50 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 52 */                    int i2 = this.I00iiO;
/* 55 */                    if (i2 != 0) {
/* 57 */                        if (i2 != 1) {
/* 59 */                            if (i2 != 2) {
/* 69 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                                 return null;
                                    }
/* 63 */                            oll11lOlo = (Oll11lOlo) this.I00iio;
/* 65 */                            lIoii1l01l0i.I00000oOI(obj);
/* 127 */                           List list = ((OO1Oooio101) obj).I00000oIO;
/* 135 */                           ArrayList arrayList = new ArrayList(list.size());
/* 141 */                           int size = list.size();
/* 145 */                           int i3 = 0;
/* 147 */                           for (int i4 = 0; i4 < size; i4++) {
/* 149 */                               Object obj4 = list.get(i4);
/* 158 */                               if (((OO1il00lI) obj4).I0000O) {
/* 160 */                                   arrayList.add(obj4);
                                        }
                                    }
/* 166 */                           int size2 = arrayList.size();
                                    while (true) {
/* 170 */                               if (i3 < size2) {
/* 172 */                                   obj2 = arrayList.get(i3);
/* 187 */                                   if (!lI1ioiO0.I00000oIO(((OO1il00lI) obj2).I00000oIO, i0o1iIoolIi.I000O01llI0)) {
/* 190 */                                       i3++;
                                            }
                                        } else {
/* 193 */                                   obj2 = null;
                                        }
                                    }
/* 194 */                           OO1il00lI oO1il00lI = (OO1il00lI) obj2;
/* 196 */                           if (oO1il00lI == null) {
/* 203 */                               oO1il00lI = (OO1il00lI) IOOi0Ool1i.I00II0Ol1O0l(arrayList);
                                    }
/* 205 */                           if (oO1il00lI != null) {
/* 209 */                               i0o1iIoolIi.I000O01llI0 = oO1il00lI.I00000oIO;
/* 213 */                               i0o1iIoolIi.I00000oOI = oO1il00lI.I0000Il00O;
                                    }
/* 219 */                           if (arrayList.isEmpty()) {
/* 223 */                               i0o1iIoolIi.I000O01llI0 = -1L;
/* 225 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 111 */                           this.I00iio = oll11lOlo;
/* 113 */                           this.I00iiO = 2;
/* 117 */                           obj = oll11lOlo.I00000oOI(OO1i0l.I00iiI, this);
                                    break;
                                } else {
/* 76 */                            oll11lOlo = (Oll11lOlo) this.I00iio;
/* 78 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
                            } else {
/* 82 */                        lIoii1l01l0i.I00000oOI(obj);
/* 88 */                        oll11lOlo = (Oll11lOlo) this.I00iio;
/* 90 */                        this.I00iio = oll11lOlo;
/* 92 */                        this.I00iiO = 1;
/* 94 */                        obj = OloI0l1i1oO.I00000oOI(oll11lOlo, this, 2);
                                break;
                            }
/* 101 */                   OO1il00lI oO1il00lI2 = (OO1il00lI) obj;
/* 105 */                   i0o1iIoolIi.I000O01llI0 = oO1il00lI2.I00000oIO;
/* 109 */                   i0o1iIoolIi.I00000oOI = oO1il00lI2.I0000Il00O;
/* 111 */                   this.I00iio = oll11lOlo;
/* 113 */                   this.I00iiO = 2;
/* 117 */                   obj = oll11lOlo.I00000oOI(OO1i0l.I00iiI, this);
                        default:
/* 12 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 14 */                    int i5 = this.I00iiO;
/* 16 */                    if (i5 == 0) {
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
/* 38 */                        this.I00iiO = 1;
/* 40 */                        Object objI000OiO = OloI0l1i1oO.I000OiO((Oll11lOlo) this.I00iio, (OO1i0l) obj3, this);
                                return objI000OiO == ii0111o2 ? ii0111o2 : objI000OiO;
                            }
/* 18 */                    if (i5 == 1) {
/* 20 */                        lIoii1l01l0i.I00000oOI(obj);
/* 47 */                        return obj;
                            }
/* 24 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                     return null;
                    }
                }
            }
