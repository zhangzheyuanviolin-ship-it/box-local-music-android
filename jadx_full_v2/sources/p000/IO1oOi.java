            package p000;

            import android.content.Context;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            
            public final class IO1oOi extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final O1oIo0iI00 I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final O1ol100o0O I00iio;
                public final Context I00ilI0I1;
                public final OloIl1l1oOii I00ilO0;
                public final OI10i0Il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1oOi(O1oIo0iI00 o1oIo0iI00, O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, Context context, OloIl1l1oOii oloIl1l1oOii, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o1oIo0iI00;
/* 5 */             this.I00iiO = o1oIOiI11o0;
/* 7 */             this.I00iio = o1ol100o0O;
/* 9 */             this.I00ilI0I1 = context;
/* 11 */            this.I00ilO0 = oloIl1l1oOii;
/* 13 */            this.I00io1l = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 62 */                    return new IO1oOi(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 0);
                        case 1:
/* 42 */                    return new IO1oOi(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 1);
                        default:
/* 22 */                    return new IO1oOi(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, 2);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 38 */                    ((IO1oOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((IO1oOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((IO1oOi) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 6 */             O1oIo0iI00 o1oIo0iI00 = this.I00iiI;
/* 8 */             OI10i0Il oI10i0Il = this.I00io1l;
                    switch (i) {
                        case 0:
/* 99 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 101 */                   lIoii1l01l0i.I00000oOI(obj);
/* 114 */                   if (!((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 122 */                       if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 124 */                           O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 126 */                           String str = o1oIOiI11o0.I00000oIO;
/* 137 */                           O1ol100o0O.I001lIiIIo1O(this.I00iio, this.I00ilI0I1, this.I00ilO0, o1oIOiI11o0, null, 24);
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 55 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 57 */                    lIoii1l01l0i.I00000oOI(obj);
/* 60 */                    Ii0i0o1lliO1 ii0i0o1lliO1 = Ilo1IoOo.I00000oIO;
/* 72 */                    if (!((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 80 */                        if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 82 */                            O1oIOiI11o0 o1oIOiI11o02 = this.I00iiO;
/* 84 */                            String str2 = o1oIOiI11o02.I00000oIO;
/* 95 */                            O1ol100o0O.I001lIiIIo1O(this.I00iio, this.I00ilI0I1, this.I00ilO0, o1oIOiI11o02, null, 24);
                                    break;
                                }
                            }
                            break;
                        default:
/* 13 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 15 */                    lIoii1l01l0i.I00000oOI(obj);
/* 28 */                    if (!((Boolean) oI10i0Il.getValue()).booleanValue()) {
/* 36 */                        if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 38 */                            O1oIOiI11o0 o1oIOiI11o03 = this.I00iiO;
/* 40 */                            String str3 = o1oIOiI11o03.I00000oIO;
/* 51 */                            O1ol100o0O.I001lIiIIo1O(this.I00iio, this.I00ilI0I1, this.I00ilO0, o1oIOiI11o03, null, 24);
                                    break;
                                }
                            }
                            break;
                    }
/* 54 */            return ooiIlOl1iI;
                }
            }
