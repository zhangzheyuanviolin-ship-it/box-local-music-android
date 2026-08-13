            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class IlOioIoiI implements IlOil1ii {
                public final int I00iOIl;
                public IlOil1ii I00iiI;
                public Function3 I00iiO;

                /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
                
                    if (r12 == r4) goto L62;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
                /* JADX WARN: Type inference failed for: r11v0, types: [IlOioIoiI] */
                /* JADX WARN: Type inference failed for: r11v13 */
                /* JADX WARN: Type inference failed for: r11v14 */
                /* JADX WARN: Type inference failed for: r11v2, types: [IOoilo] */
                /* JADX WARN: Type inference failed for: r11v6, types: [IOoilo] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
                    IlOio1IlOo0 ilOio1IlOo0;
                    IlOl1ol ilOl1ol;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             int i2 = 0;
                    switch (i) {
                        case 0:
/* 105 */                   Function3 function3 = this.I00iiO;
/* 109 */                   if (iOoil1iiIilo instanceof IlOio1IlOo0) {
/* 112 */                       ilOio1IlOo0 = (IlOio1IlOo0) iOoil1iiIilo;
/* 114 */                       int i3 = ilOio1IlOo0.I00iiI;
/* 118 */                       if ((i3 & Integer.MIN_VALUE) != 0) {
/* 121 */                           ilOio1IlOo0.I00iiI = i3 - Integer.MIN_VALUE;
                                } else {
/* 126 */                           ilOio1IlOo0 = new IlOio1IlOo0(this, iOoil1iiIilo);
                                }
                            }
/* 129 */                   Object obj = ilOio1IlOo0.I00iOIl;
/* 131 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 133 */                   int i4 = ilOio1IlOo0.I00iiI;
                            try {
                                try {
                                } finally {
/* 223 */                           this.releaseIntercepted();
                                }
                            } catch (Throwable th) {
/* 229 */                       Oo10iolo oo10iolo = new Oo10iolo();
/* 232 */                       oo10iolo.I00iOIl = th;
/* 234 */                       VarHandle.storeStoreFence();
/* 237 */                       ilOio1IlOo0.I00iio = null;
/* 239 */                       ilOio1IlOo0.I00ilI0I1 = th;
/* 241 */                       ilOio1IlOo0.I00ilO0 = i2;
/* 243 */                       ilOio1IlOo0.I00iiI = 2;
/* 249 */                       if (ilOli1oOI10l.I00000oIO(oo10iolo, function3, th, ilOio1IlOo0) != ii0111o) {
/* 253 */                           throw th;
                                }
                            }
/* 136 */                   if (i4 == 0) {
/* 177 */                       lIoii1l01l0i.I00000oOI(obj);
/* 180 */                       IlOil1ii ilOil1ii = this.I00iiI;
/* 182 */                       ilOio1IlOo0.I00iio = ilOil1iooOO0;
/* 184 */                       ilOio1IlOo0.I00ilO0 = 0;
/* 186 */                       ilOio1IlOo0.I00iiI = 1;
/* 192 */                       if (ilOil1ii.I00000oIO(ilOil1iooOO0, ilOio1IlOo0) != ii0111o) {
                                }
/* 251 */                       return ii0111o;
                            }
/* 138 */                   if (i4 != 1) {
/* 140 */                       if (i4 == 2) {
/* 161 */                           Throwable th2 = (Throwable) ilOio1IlOo0.I00ilI0I1;
/* 163 */                           lIoii1l01l0i.I00000oOI(obj);
/* 253 */                           throw th2;
                                }
/* 142 */                       if (i4 != 3) {
/* 154 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                            return null;
                                }
/* 146 */                       OiIOl1io oiIOl1io = (OiIOl1io) ilOio1IlOo0.I00ilI0I1;
/* 148 */                       lIoii1l01l0i.I00000oOI(obj);
                                this = oiIOl1io;
/* 252 */                       return ooiIlOl1iI;
                            }
/* 167 */                   i2 = ilOio1IlOo0.I00ilO0;
/* 169 */                   ilOil1iooOO0 = ilOio1IlOo0.I00iio;
/* 171 */                   lIoii1l01l0i.I00000oOI(obj);
/* 201 */                   OiIOl1io oiIOl1io2 = new OiIOl1io(ilOil1iooOO0, ilOio1IlOo0.getContext());
/* 204 */                   ilOio1IlOo0.I00iio = null;
/* 206 */                   ilOio1IlOo0.I00ilI0I1 = oiIOl1io2;
/* 208 */                   ilOio1IlOo0.I00ilO0 = i2;
/* 210 */                   ilOio1IlOo0.I00iiI = 3;
/* 212 */                   Object objInvoke = function3.invoke(oiIOl1io2, null, ilOio1IlOo0);
                            this = oiIOl1io2;
                            break;
                        default:
/* 18 */                    if (iOoil1iiIilo instanceof IlOl1ol) {
/* 21 */                        ilOl1ol = (IlOl1ol) iOoil1iiIilo;
/* 23 */                        int i5 = ilOl1ol.I00iiI;
/* 27 */                        if ((i5 & Integer.MIN_VALUE) != 0) {
/* 30 */                            ilOl1ol.I00iiI = i5 - Integer.MIN_VALUE;
                                } else {
/* 35 */                            ilOl1ol = new IlOl1ol(this, iOoil1iiIilo);
                                }
                            }
/* 38 */                    Object objI00000oOI = ilOl1ol.I00iOIl;
/* 40 */                    Object obj2 = Ii0111o.I00iOIl;
/* 42 */                    int i6 = ilOl1ol.I00iiI;
/* 44 */                    if (i6 == 0) {
/* 67 */                        lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 70 */                        IlOil1ii ilOil1ii2 = this.I00iiI;
/* 72 */                        ilOl1ol.I00iio = ilOil1iooOO0;
/* 74 */                        ilOl1ol.I00ilI0I1 = 0;
/* 76 */                        ilOl1ol.I00iiI = 1;
/* 78 */                        objI00000oOI = ilOo1lI1o10.I00000oOI(ilOil1ii2, ilOil1iooOO0, ilOl1ol);
/* 82 */                        if (objI00000oOI != obj2) {
                                }
/* 103 */                       return obj2;
                            }
/* 46 */                    if (i6 != 1) {
/* 48 */                        if (i6 == 2) {
/* 50 */                            lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 104 */                           return ooiIlOl1iI;
                                }
/* 54 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 12 */                        return null;
                            }
/* 59 */                    i2 = ilOl1ol.I00ilI0I1;
/* 61 */                    ilOil1iooOO0 = ilOl1ol.I00iio;
/* 63 */                    lIoii1l01l0i.I00000oOI(objI00000oOI);
/* 85 */                    Throwable th3 = (Throwable) objI00000oOI;
/* 87 */                    if (th3 == null) {
/* 104 */                       return ooiIlOl1iI;
                            }
/* 89 */                    Function3 function32 = this.I00iiO;
/* 91 */                    ilOl1ol.I00iio = null;
/* 93 */                    ilOl1ol.I00ilI0I1 = i2;
/* 95 */                    ilOl1ol.I00iiI = 2;
/* 101 */                   if (function32.invoke(ilOil1iooOO0, th3, ilOl1ol) != obj2) {
/* 104 */                       return ooiIlOl1iI;
                            }
/* 103 */                   return obj2;
                    }
                }
            }
