            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class Il0OOo extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;
                public Object I00io1l;
                public final Object I00ioIO;
                public Object I00l0I0l0lO1;
                public final Object I00l0OO0IO;
                public final Object I00li1OI;
                public final Object I00ll1;
                public final Object I00lli11;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il0OOo(Context context, O0oiOi o0oiOi, IlliIl1l11O illiIl1l11O, int i, int i2, IIo0l1 iIo0l1, IllOOo00lI illOOo00lI, Function1 function1, O1OIi1 o1OIi1, OI10i0Il oI10i0Il, IOoil1iiIilo iOoil1iiIilo) {
/* 25 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ilO0 = context;
/* 6 */             this.I00io1l = o0oiOi;
/* 8 */             this.I00ioIO = illiIl1l11O;
/* 10 */            this.I00iiO = i;
/* 12 */            this.I00iio = i2;
/* 14 */            this.I00l0I0l0lO1 = iIo0l1;
/* 16 */            this.I00l0OO0IO = illOOo00lI;
/* 18 */            this.I00li1OI = function1;
/* 20 */            this.I00ll1 = o1OIi1;
/* 22 */            this.I00lli11 = oI10i0Il;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             int i = this.I00iOIl;
/* 5 */             Object obj2 = this.I00lli11;
/* 7 */             Object obj3 = this.I00ll1;
/* 9 */             Object obj4 = this.I00li1OI;
/* 11 */            Object obj5 = this.I00l0OO0IO;
/* 13 */            Object obj6 = this.I00ioIO;
/* 15 */            Object obj7 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 85 */                    Il0OOo il0OOo = new Il0OOo((Il0OiIi) obj5, (Il0OI1oiIoil) obj4, (OIil0IlIIol) obj6, (List) obj7, (Il10il1) obj3, (IoiOl011o) obj2, iOoil1iiIilo);
/* 91 */                    il0OOo.I00l0I0l0lO1 = obj;
/* 88 */                    return il0OOo;
                        default:
/* 59 */                    return new Il0OOo((Context) obj7, (O0oiOi) this.I00io1l, (IlliIl1l11O) obj6, this.I00iiO, this.I00iio, (IIo0l1) this.I00l0I0l0lO1, (IllOOo00lI) obj5, (Function1) obj4, (O1OIi1) obj3, (OI10i0Il) obj2, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Il0OOo) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Ii0110 ii0110;
                    Bitmap bitmapI00000oIO;
                    List list;
                    int size;
                    OIil0IlIIol oIil0IlIIol;
                    int i;
                    OI10i0Il oI10i0Il;
                    Object objI00000oOI;
/* 1 */             int i2 = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ll1;
/* 5 */             Object obj3 = this.I00li1OI;
/* 7 */             Object obj4 = this.I00ioIO;
/* 9 */             Object obj5 = this.I00lli11;
/* 14 */            Object obj6 = this.I00ilO0;
                    switch (i2) {
                        case 0:
/* 116 */                   Il10il1 il10il1 = (Il10il1) obj2;
/* 118 */                   OIil0IlIIol oIil0IlIIol2 = (OIil0IlIIol) obj4;
/* 121 */                   Il0OI1oiIoil il0OI1oiIoil = (Il0OI1oiIoil) obj3;
/* 123 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 125 */                   int i3 = this.I00iio;
/* 127 */                   if (i3 == 0) {
/* 169 */                       lIoii1l01l0i.I00000oOI(obj);
/* 175 */                       ii0110 = (Ii0110) this.I00l0I0l0lO1;
/* 177 */                       Drawable drawable = il0OI1oiIoil.I00000oIO;
/* 181 */                       if (drawable instanceof BitmapDrawable) {
/* 186 */                           Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
/* 190 */                           Bitmap.Config config = bitmap.getConfig();
/* 194 */                           if (config == null) {
/* 196 */                               config = Bitmap.Config.ARGB_8888;
                                    }
/* 204 */                           if (I1IoiO1l.I0001Ioi1lo(I000O01llI0.I00000oIO, config)) {
/* 206 */                               bitmapI00000oIO = bitmap;
                                    }
/* 221 */                           il10il1.getClass();
/* 224 */                           list = (List) obj6;
/* 226 */                           size = list.size();
/* 232 */                           oIil0IlIIol = oIil0IlIIol2;
/* 233 */                           i = 0;
                                } else {
/* 216 */                           bitmapI00000oIO = ilI00Ioo.I00000oIO(drawable, oIil0IlIIol2.I00000oOI, oIil0IlIIol2.I0000O, oIil0IlIIol2.I0000oI00, oIil0IlIIol2.I0001Ioi1lo);
/* 221 */                           il10il1.getClass();
/* 224 */                           list = (List) obj6;
/* 226 */                           size = list.size();
/* 232 */                           oIil0IlIIol = oIil0IlIIol2;
/* 233 */                           i = 0;
                                }
                            } else {
/* 129 */                       if (i3 != 1) {
/* 165 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                            return null;
                                }
/* 131 */                       size = this.I00iiO;
/* 133 */                       int i4 = this.I00iiI;
/* 137 */                       oIil0IlIIol = (OIil0IlIIol) this.I00io1l;
/* 141 */                       list = (List) this.I00ilI0I1;
/* 147 */                       ii0110 = (Ii0110) this.I00l0I0l0lO1;
/* 149 */                       lIoii1l01l0i.I00000oOI(obj);
/* 154 */                       bitmapI00000oIO = (Bitmap) obj;
/* 160 */                       l01oO1iOo.I0000O(ii0110.I00000oIO());
/* 163 */                       i = i4 + 1;
                            }
/* 234 */                   if (i >= size) {
/* 236 */                       il10il1.getClass();
/* 260 */                       return new Il0OI1oiIoil(new BitmapDrawable(((IoiOl011o) obj5).I00000oIO.getResources(), bitmapI00000oIO), il0OI1oiIoil.I00000oOI, il0OI1oiIoil.I0000Il00O, il0OI1oiIoil.I0000O);
                            }
/* 268 */                   if (list.get(i) != null) {
/* 270 */                       OIiilo1Ool0o.I00000oIO();
/* 16 */                        return null;
                            }
/* 274 */                   Ol0i11lo1l1I ol0i11lo1l1I = oIil0IlIIol.I0000O;
/* 276 */                   this.I00l0I0l0lO1 = ii0110;
/* 280 */                   this.I00ilI0I1 = list;
/* 282 */                   this.I00io1l = oIil0IlIIol;
/* 284 */                   this.I00iiI = i;
/* 286 */                   this.I00iiO = size;
/* 288 */                   this.I00iio = 1;
/* 290 */                   throw null;
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i5 = this.I00iiI;
/* 24 */                    if (i5 == 0) {
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
/* 55 */                        if (iOI10i0I11.I00000oIO((Context) obj6, "android.permission.CAMERA") != 0) {
/* 109 */                           ((O1OIi1) obj2).I00000oIO("android.permission.CAMERA");
/* 112 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 58 */                        oI10i0Il = (OI10i0Il) obj5;
/* 87 */                        this.I00ilI0I1 = oI10i0Il;
/* 89 */                        this.I00iiI = 1;
/* 93 */                        objI00000oOI = iIoOlloI.I00000oOI((Context) obj6, (O0oiOi) this.I00io1l, (IlliIl1l11O) obj4, this.I00iiO, this.I00iio, (IIo0l1) this.I00l0I0l0lO1, (IllOOo00lI) this.I00l0OO0IO, (Function1) obj3, this);
/* 97 */                        if (objI00000oOI == ii0111o2) {
/* 99 */                            return ii0111o2;
                                }
                            } else {
/* 26 */                        if (i5 != 1) {
/* 39 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 16 */                            return null;
                                }
/* 30 */                        OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 32 */                        lIoii1l01l0i.I00000oOI(obj);
/* 35 */                        oI10i0Il = oI10i0Il2;
/* 36 */                        objI00000oOI = obj;
                            }
/* 103 */                   oI10i0Il.setValue((OOIl1Io0) objI00000oOI);
/* 112 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 28 */        public Il0OOo(Il0OiIi il0OiIi, Il0OI1oiIoil il0OI1oiIoil, OIil0IlIIol oIil0IlIIol, List list, Il10il1 il10il1, IoiOl011o ioiOl011o, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 29 */            this.I00l0OO0IO = il0OiIi;
                    this.I00li1OI = il0OI1oiIoil;
                    this.I00ioIO = oIil0IlIIol;
                    this.I00ilO0 = list;
                    this.I00ll1 = il10il1;
                    this.I00lli11 = ioiOl011o;
                }
            }
