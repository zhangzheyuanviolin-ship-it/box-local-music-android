            package p000;

            import android.content.Context;
            import android.os.ParcelFileDescriptor;
            
            public final class i1Ilio0i0 {
                public static final lOOlOoll I00000oOI = new lOOlOoll(28);
                public static volatile i1Ilio0i0 I0000Il00O;
                public IOiOol0 I00000oIO;

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00000oIO(i1Ilio0i0 i1ilio0i0, Context context, String str, String str2, IOoilo iOoilo) {
                    i1IlOIIo i1iloiio;
/* 3 */             if (iOoilo instanceof i1IlOIIo) {
/* 6 */                 i1iloiio = (i1IlOIIo) iOoilo;
/* 8 */                 int i = i1iloiio.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i1iloiio.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i1iloiio = new i1IlOIIo(i1ilio0i0, iOoilo);
                        }
                    }
/* 25 */            Object objI00OOll1 = i1iloiio.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i1iloiio.I00iiO;
/* 32 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 56 */                if (str.length() != 0) {
/* 59 */                    String strI0000Il00O = I0000Il00O(str, str2);
/* 63 */                    IOiOol0 iOiOol0 = i1ilio0i0.I00000oIO;
/* 65 */                    i1iloiio.I00iio = str2;
/* 67 */                    i1iloiio.I00iiO = 1;
/* 83 */                    objI00OOll1 = strI0000Il00O.length() == 0 ? null : iOiOol0.I00OOll1(context, new Ii1l1iio0lO0(strI0000Il00O, 2, iOoil1iiIilo), i1iloiio);
/* 88 */                    if (objI00OOll1 == ii0111o) {
/* 90 */                        return ii0111o;
                            }
                        }
/* 32 */                return null;
                    }
/* 35 */            if (i2 != 1) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                return null;
                    }
/* 37 */            str2 = i1iloiio.I00iio;
/* 39 */            lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 91 */            i1Ii1ooOII0 i1ii1oooii0 = (i1Ii1ooOII0) objI00OOll1;
/* 103 */           if (O0000Ioio00.I0000O(i1ii1oooii0 != null ? i1ii1oooii0.I0000O : null, str2)) {
/* 105 */               return i1ii1oooii0;
                    }
/* 32 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Object I00000oOI(i1Ilio0i0 i1ilio0i0, Context context, i1Ii1ooOII0 i1ii1oooii0, IOoilo iOoilo) {
                    i1Iil0iO1 i1iil0io1;
                    Context context2;
                    String str;
                    String str2;
                    Context context3;
                    i1Ilio0i0 i1ilio0i02;
                    i1Ii1ooOII0 i1ii1oooii02;
                    ParcelFileDescriptor parcelFileDescriptor;
/* 1 */             i1Ilio0i0 i1ilio0i03 = i1ilio0i0;
/* 9 */             if (iOoilo instanceof i1Iil0iO1) {
/* 12 */                i1iil0io1 = (i1Iil0iO1) iOoilo;
/* 14 */                int i = i1iil0io1.I00ilI0I1;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    i1iil0io1.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    i1iil0io1 = new i1Iil0iO1(i1ilio0i03, iOoilo);
                        }
                    }
/* 31 */            Object objI0000oI00 = i1iil0io1.I00iiO;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = i1iil0io1.I00ilI0I1;
/* 38 */            int i3 = 2;
/* 40 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 41 */            if (i2 == 0) {
/* 98 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 103 */               String str3 = i1ii1oooii0.I00000oIO;
/* 105 */               IOiOol0 iOiOol0 = i1ilio0i03.I00000oIO;
/* 107 */               i1iil0io1.I00iOIl = i1ilio0i03;
/* 109 */               i1iil0io1.I00iiI = context;
/* 111 */               i1iil0io1.I00ilO0 = str3;
/* 113 */               i1iil0io1.I00ilI0I1 = 1;
/* 128 */               Object objI00OOll1 = str3.length() == 0 ? null : iOiOol0.I00OOll1(context, new Ii1l1iio0lO0(str3, i3, iOoil1iiIilo), i1iil0io1);
/* 132 */               if (objI00OOll1 != ii0111o) {
/* 134 */                   context2 = context;
/* 135 */                   str = str3;
/* 136 */                   objI0000oI00 = objI00OOll1;
                        }
/* 1182 */              return ii0111o;
                    }
/* 43 */            if (i2 != 1) {
/* 45 */                if (i2 != 2) {
/* 47 */                    if (i2 != 3) {
/* 59 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 62 */                        return null;
                            }
/* 51 */                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) i1iil0io1.I00iOIl;
/* 53 */                    lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 56 */                    return parcelFileDescriptor2;
                        }
/* 64 */                i1ii1oooii02 = i1iil0io1.I00io1l;
/* 66 */                String str4 = i1iil0io1.I00ilO0;
/* 68 */                Context context4 = i1iil0io1.I00iiI;
/* 72 */                i1Ilio0i0 i1ilio0i04 = (i1Ilio0i0) i1iil0io1.I00iOIl;
/* 74 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 77 */                str2 = str4;
/* 78 */                context3 = context4;
/* 80 */                i1ilio0i02 = i1ilio0i04;
/* 179 */               parcelFileDescriptor = (ParcelFileDescriptor) objI0000oI00;
/* 181 */               if (parcelFileDescriptor != null) {
/* 183 */                   i1ilio0i02.getClass();
/* 199 */                   i1Ii1ooOII0 i1ii1oooii03 = new i1Ii1ooOII0(System.currentTimeMillis(), str2, i1ii1oooii02.I00000oOI, i1ii1oooii02.I0000O);
/* 202 */                   IOiOol0 iOiOol02 = i1ilio0i02.I00000oIO;
/* 204 */                   i1iil0io1.I00iOIl = parcelFileDescriptor;
/* 206 */                   i1iil0io1.I00iiI = null;
/* 208 */                   i1iil0io1.I00ilO0 = null;
/* 210 */                   i1iil0io1.I00io1l = null;
/* 212 */                   i1iil0io1.I00ilI0I1 = 3;
/* 227 */                   Object objI00OilO00Il = iOiOol02.I00OilO00Il(context3, new I0O0Ooi10l(str2, i1ii1oooii03, iOiOol02, context3, (IOoil1iiIilo) null, 9), i1iil0io1);
/* 231 */                   if (objI00OilO00Il != ii0111o) {
/* 234 */                       objI00OilO00Il = OoiIlOl1iI.I00000oIO;
                            }
/* 236 */                   if (objI00OilO00Il == ii0111o) {
/* 1182 */                      return ii0111o;
                            }
                        }
/* 238 */               return parcelFileDescriptor;
                    }
/* 83 */            String str5 = i1iil0io1.I00ilO0;
/* 85 */            Context context5 = i1iil0io1.I00iiI;
/* 89 */            i1Ilio0i0 i1ilio0i05 = (i1Ilio0i0) i1iil0io1.I00iOIl;
/* 91 */            lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 94 */            context2 = context5;
/* 95 */            str = str5;
/* 96 */            i1ilio0i03 = i1ilio0i05;
/* 138 */           i1Ii1ooOII0 i1ii1oooii04 = (i1Ii1ooOII0) objI0000oI00;
/* 140 */           if (i1ii1oooii04 == null) {
/* 40 */                return null;
                    }
/* 143 */           IOiOol0 iOiOol03 = i1ilio0i03.I00000oIO;
/* 145 */           i1iil0io1.I00iOIl = i1ilio0i03;
/* 147 */           i1iil0io1.I00iiI = context2;
/* 149 */           i1iil0io1.I00ilO0 = str;
/* 151 */           i1iil0io1.I00io1l = i1ii1oooii04;
/* 153 */           i1iil0io1.I00ilI0I1 = 2;
/* 168 */           objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol03.I00ioIO).I00iiI, new O1o1iI((Object) i1ii1oooii04, iOiOol03, context2, iOoil1iiIilo, 25), i1iil0io1);
/* 172 */           if (objI0000oI00 != ii0111o) {
/* 174 */               str2 = str;
/* 175 */               context3 = context2;
/* 177 */               i1ilio0i02 = i1ilio0i03;
/* 178 */               i1ii1oooii02 = i1ii1oooii04;
/* 179 */               parcelFileDescriptor = (ParcelFileDescriptor) objI0000oI00;
/* 181 */               if (parcelFileDescriptor != null) {
                        }
/* 238 */               return parcelFileDescriptor;
                    }
/* 1182 */          return ii0111o;
                }

                public static final String I0000Il00O(String str, String str2) {
/* 27 */            return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "_", str2);
                }
            }
