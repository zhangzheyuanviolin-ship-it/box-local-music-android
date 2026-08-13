            package p000;

            import android.content.Context;
            
            public final class OilIl1i extends Oll0io implements IlliIl1l11O {
                public String I00iOIl;
                public OI11ol I00iiI;
                public Oil1lO I00iiO;
                public O1oIOiI11o0 I00iio;
                public Context I00ilI0I1;
                public OilIlo I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public final OilIlo I00l0I0l0lO1;
                public final O1oIOiI11o0 I00l0OO0IO;
                public final Oil1lO I00li1OI;
                public final Context I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OilIl1i(OilIlo oilIlo, O1oIOiI11o0 o1oIOiI11o0, Oil1lO oil1lO, Context context, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00l0I0l0lO1 = oilIlo;
/* 3 */             this.I00l0OO0IO = o1oIOiI11o0;
/* 5 */             this.I00li1OI = oil1lO;
/* 7 */             this.I00ll1 = context;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new OilIl1i(this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OilIl1i) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
                /* JADX WARN: Type inference failed for: r10v3, types: [OI11ol] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O1oIOiI11o0 o1oIOiI11o0;
                    String str;
                    OI1I0OoOl oI1I0OoOl;
                    Oil1lO oil1lO;
                    int i;
                    Context context;
                    Oil1lO oil1lO2;
                    OI11ol oI11ol;
                    Object objI0000oI00;
/* 3 */             OilIlo oilIlo = this.I00l0I0l0lO1;
/* 5 */             OlO0OIIl1 olO0OIIl1 = oilIlo.I00000oOI;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i2 = this.I00ioIO;
                    try {
/* 14 */                if (i2 == 0) {
/* 60 */                    lIoii1l01l0i.I00000oOI(obj);
/* 89 */                    olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, null, null, null, false, false, false, true, null, 767));
/* 94 */                    o1oIOiI11o0 = this.I00l0OO0IO;
/* 96 */                    O1oIOoi0oo o1oIOoi0ooI00000oIO = o1oIOiI11o0.I00000oIO("tokens");
/* 106 */                   str = o1oIOoi0ooI00000oIO != null ? o1oIOoi0ooI00000oIO.I0000Il00O : "tokens.txt";
/* 109 */                   oI1I0OoOl = oilIlo.I000II;
/* 111 */                   this.I00iOIl = str;
/* 113 */                   this.I00iiI = oI1I0OoOl;
/* 115 */                   oil1lO = this.I00li1OI;
/* 117 */                   this.I00iiO = oil1lO;
/* 119 */                   this.I00iio = o1oIOiI11o0;
/* 121 */                   Context context2 = this.I00ll1;
/* 123 */                   this.I00ilI0I1 = context2;
/* 125 */                   this.I00ilO0 = oilIlo;
/* 127 */                   i = 0;
/* 128 */                   this.I00io1l = 0;
/* 130 */                   this.I00ioIO = 1;
/* 136 */                   if (oI1I0OoOl.I00000oIO(this) != ii0111o) {
/* 139 */                       context = context2;
                            }
/* 209 */                   return ii0111o;
                        }
/* 16 */                if (i2 != 1) {
/* 18 */                    if (i2 != 2) {
/* 34 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 20 */                    oI11ol = this.I00iiI;
                            try {
/* 22 */                        lIoii1l01l0i.I00000oOI(obj);
/* 25 */                        objI0000oI00 = obj;
/* 213 */                       boolean zBooleanValue = ((Boolean) objI0000oI00).booleanValue();
/* 217 */                       oI11ol.I00000oOI(null);
/* 260 */                       olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, null, null, null, false, false, false, false, !zBooleanValue ? ((OilIl00O1o) olO0OIIl1.getValue()).I000OiO : "Failed to apply settings", 255));
/* 263 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th) {
/* 29 */                        th = th;
/* 270 */                       oI11ol.I00000oOI(null);
/* 437 */                       throw th;
                            }
                        }
/* 38 */                int i3 = this.I00io1l;
/* 40 */                OilIlo oilIlo2 = this.I00ilO0;
/* 42 */                context = this.I00ilI0I1;
/* 44 */                o1oIOiI11o0 = this.I00iio;
/* 46 */                oil1lO = this.I00iiO;
/* 48 */                ?? r10 = this.I00iiI;
/* 50 */                str = this.I00iOIl;
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 55 */                i = i3;
/* 56 */                oilIlo = oilIlo2;
/* 57 */                oI1I0OoOl = r10;
/* 143 */               String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 147 */               String strI00000oOI2 = o1oIOiI11o0.I00000oOI(context, str);
/* 159 */               String str2 = ((OilIl00O1o) oilIlo.I00000oOI.getValue()).I0000oI00;
/* 169 */               boolean z = ((OilIl00O1o) oilIlo.I00000oOI.getValue()).I0001Ioi1lo;
/* 171 */               this.I00iOIl = null;
/* 173 */               this.I00iiI = oI1I0OoOl;
/* 175 */               this.I00iiO = null;
/* 177 */               this.I00iio = null;
/* 179 */               this.I00ilI0I1 = null;
/* 181 */               this.I00ilO0 = null;
/* 183 */               this.I00io1l = i;
/* 185 */               this.I00ioIO = 2;
/* 187 */               oil1lO2.getClass();
/* 203 */               objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new Oil1l0lOIl(oil1lO2, strI00000oOI, str2, z, strI00000oOI2, null), this);
/* 207 */               if (objI0000oI00 != ii0111o) {
/* 210 */                   oI11ol = oI1I0OoOl;
/* 213 */                   boolean zBooleanValue2 = ((Boolean) objI0000oI00).booleanValue();
/* 217 */                   oI11ol.I00000oOI(null);
/* 260 */                   olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, null, null, null, false, false, false, false, !zBooleanValue2 ? ((OilIl00O1o) olO0OIIl1.getValue()).I000OiO : "Failed to apply settings", 255));
/* 263 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 209 */               return ii0111o;
                    } catch (Throwable th2) {
/* 268 */               th = th2;
/* 266 */               oI11ol = oI1I0OoOl;
/* 270 */               oI11ol.I00000oOI(null);
/* 437 */               throw th;
                    }
/* 58 */            oil1lO2 = oil1lO;
                }
            }
