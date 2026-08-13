            package p000;

            import android.content.Context;
            import android.os.ParcelFileDescriptor;
            import android.util.Log;
            import com.google.mlkit.genai.common.GenAiException;
            import com.google.mlkit.genai.prompt.CachedContext;
            import com.google.mlkit.genai.prompt.Caches;
            import com.google.mlkit.genai.prompt.CreateCachedContextRequest;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class o0lOiOlII implements Caches {
                public Context I00000oIO;
                public o0OO0i I00000oOI;
                public o0lo1I I0000Il00O;

                /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object create(CreateCachedContextRequest createCachedContextRequest, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o0l1iil o0l1iilVar;
                    String textString;
                    Object objI001l0I00;
                    String str;
                    CreateCachedContextRequest createCachedContextRequest2;
                    String str2;
                    Object objI0000oI00;
                    CreateCachedContextRequest createCachedContextRequest3;
                    String str3;
                    String str4;
                    ParcelFileDescriptor parcelFileDescriptor;
/* 5 */             o0OO0i o0oo0i = this.I00000oOI;
/* 9 */             if (iOoil1iiIilo instanceof o0l1iil) {
/* 12 */                o0l1iilVar = (o0l1iil) iOoil1iiIilo;
/* 14 */                int i = o0l1iilVar.I00iiO;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    o0l1iilVar.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    o0l1iilVar = new o0l1iil(this, iOoil1iiIilo);
                        }
                    }
/* 31 */            Object obj = o0l1iilVar.I00iOIl;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = o0l1iilVar.I00iiO;
/* 41 */            Object obj2 = null;
/* 42 */            if (i2 == 0) {
/* 87 */                lIoii1l01l0i.I00000oOI(obj);
/* 90 */                String zza = createCachedContextRequest.getZza();
/* 98 */                textString = createCachedContextRequest.getZzb().getTextString();
/* 104 */               o0l1iilVar.I00iio = createCachedContextRequest;
/* 106 */               o0l1iilVar.I00ilI0I1 = zza;
/* 108 */               o0l1iilVar.I00ilO0 = textString;
/* 110 */               o0l1iilVar.I00iiO = 1;
/* 112 */               objI001l0I00 = iOil1lO10l.I001l0I00(o0oo0i, o0l1iilVar);
/* 116 */               if (objI001l0I00 != ii0111o) {
/* 120 */                   str = zza;
/* 121 */                   createCachedContextRequest2 = createCachedContextRequest;
                        }
                    }
/* 44 */            if (i2 != 1) {
/* 46 */                if (i2 != 2) {
/* 48 */                    if (i2 == 3) {
/* 50 */                        lIoii1l01l0i.I00000oOI(obj);
/* 53 */                        return obj;
                            }
/* 56 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 60 */                str3 = o0l1iilVar.I00ilO0;
/* 62 */                str4 = o0l1iilVar.I00ilI0I1;
/* 64 */                createCachedContextRequest3 = o0l1iilVar.I00iio;
/* 66 */                lIoii1l01l0i.I00000oOI(obj);
/* 228 */               parcelFileDescriptor = (ParcelFileDescriptor) obj;
/* 230 */               if (parcelFileDescriptor != null) {
/* 276 */                   throw new GenAiException("Failed to open file descriptor to create cache for name: ".concat(String.valueOf(str4)), (Throwable) null, GenAiException.ErrorCode.CACHE_PROCESSING_ERROR);
                        }
/* 235 */               i1O0O0O i1o0o0o = new i1O0O0O(str3, parcelFileDescriptor, null, 4);
/* 238 */               o0l1iilVar.I00iio = null;
/* 240 */               o0l1iilVar.I00ilI0I1 = null;
/* 242 */               o0l1iilVar.I00ilO0 = null;
/* 244 */               o0l1iilVar.I00iiO = 3;
/* 251 */               Object objI0000Il00O = il001oo1.I0000Il00O(new o0OIO0il(i1o0o0o, o0oo0i, createCachedContextRequest3, null), o0l1iilVar);
                        return objI0000Il00O == ii0111o ? ii0111o : objI0000Il00O;
                    }
/* 71 */            textString = o0l1iilVar.I00ilO0;
/* 73 */            String str5 = o0l1iilVar.I00ilI0I1;
/* 75 */            CreateCachedContextRequest createCachedContextRequest4 = o0l1iilVar.I00iio;
/* 77 */            lIoii1l01l0i.I00000oOI(obj);
/* 82 */            objI001l0I00 = obj;
/* 83 */            createCachedContextRequest2 = createCachedContextRequest4;
/* 84 */            str = str5;
/* 123 */           o0lo1I o0lo1i = this.I0000Il00O;
/* 125 */           Context context = this.I00000oIO;
/* 127 */           String str6 = (String) objI001l0I00;
/* 129 */           o0l1iilVar.I00iio = createCachedContextRequest2;
/* 131 */           o0l1iilVar.I00ilI0I1 = str;
/* 133 */           o0l1iilVar.I00ilO0 = textString;
/* 135 */           o0l1iilVar.I00iiO = 2;
/* 143 */           if (OlOoOIi0o.I001l0I00(str)) {
/* 147 */               Log.w("ExplicitCacheManager", "Cache name is blank. Will not open cache for writing.");
                    } else {
/* 157 */               if (!OlOoOIi0o.I001l0I00(textString)) {
/* 197 */                   o0loO110 o0loo110 = new o0loO110(str, ll1i1lil01I1.I00000oIO(), textString, str6);
/* 200 */                   IOiOol0 iOiOol0 = o0lo1i.I00000oIO;
/* 208 */                   str2 = str;
/* 218 */                   objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new I10i01i0Iilo(o0loo110, iOiOol0, context, obj2, null, 7), o0l1iilVar);
/* 222 */                   if (objI0000oI00 != ii0111o) {
/* 224 */                       createCachedContextRequest3 = createCachedContextRequest2;
/* 225 */                       obj = objI0000oI00;
/* 226 */                       str3 = textString;
/* 227 */                       str4 = str2;
/* 228 */                       parcelFileDescriptor = (ParcelFileDescriptor) obj;
/* 230 */                       if (parcelFileDescriptor != null) {
                                }
                            }
                        }
/* 167 */               StringBuilder sb = new StringBuilder(str.length() + 73);
/* 172 */               sb.append("Prompt prefix is blank for cache name: ");
/* 175 */               sb.append(str);
/* 180 */               sb.append(". Will not open cache for writing.");
/* 187 */               Log.w("ExplicitCacheManager", sb.toString());
                    }
/* 150 */           str2 = str;
/* 151 */           objI0000oI00 = null;
/* 222 */           if (objI0000oI00 != ii0111o) {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object delete(String str, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o0lIO0OIOo1 o0lio0oioo1;
/* 1 */             Context context = this.I00000oIO;
/* 3 */             o0lo1I o0lo1i = this.I0000Il00O;
/* 7 */             if (iOoil1iiIilo instanceof o0lIO0OIOo1) {
/* 10 */                o0lio0oioo1 = (o0lIO0OIOo1) iOoil1iiIilo;
/* 12 */                int i = o0lio0oioo1.I00iiO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    o0lio0oioo1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    o0lio0oioo1 = new o0lIO0OIOo1(this, iOoil1iiIilo);
                        }
                    }
/* 29 */            Object objI00000oIO = o0lio0oioo1.I00iOIl;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = o0lio0oioo1.I00iiO;
/* 38 */            if (i2 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 61 */                o0lio0oioo1.I00iiO = 1;
/* 63 */                objI00000oIO = o0lo1I.I00000oIO(o0lo1i, context, str, null, o0lio0oioo1);
/* 67 */                if (objI00000oIO != ii0111o) {
                        }
                    }
/* 40 */            if (i2 != 1) {
/* 42 */                if (i2 == 2) {
/* 44 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 47 */                    return objI00000oIO;
                        }
/* 50 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                return null;
                    }
/* 54 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 69 */            o0loO110 o0loo110 = (o0loO110) objI00000oIO;
/* 71 */            if (o0loo110 == null) {
/* 100 */               return Boolean.FALSE;
                    }
/* 73 */            o0lio0oioo1.I00iiO = 2;
/* 75 */            IOiOol0 iOiOol0 = o0lo1i.I00000oIO;
/* 92 */            Object objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) iOiOol0.I00ioIO).I00iiI, new i00Iooii0i(iOiOol0, (IOoil1iiIilo) null, context, o0loo110.zza()), o0lio0oioo1);
                    return objI0000oI00 == ii0111o ? ii0111o : objI0000oI00;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object get(String str, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o0lIOl1IOo o0liol1ioo;
/* 3 */             if (iOoil1iiIilo instanceof o0lIOl1IOo) {
/* 6 */                 o0liol1ioo = (o0lIOl1IOo) iOoil1iiIilo;
/* 8 */                 int i = o0liol1ioo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0liol1ioo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0liol1ioo = new o0lIOl1IOo(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00000oIO = o0liol1ioo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0liol1ioo.I00iiO;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 50 */                o0lo1I o0lo1i = this.I0000Il00O;
/* 52 */                Context context = this.I00000oIO;
/* 54 */                o0liol1ioo.I00iiO = 1;
/* 56 */                objI00000oIO = o0lo1I.I00000oIO(o0lo1i, context, str, null, o0liol1ioo);
/* 60 */                if (objI00000oIO == ii0111o) {
/* 106 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
                    }
/* 62 */            o0loO110 o0loo110 = (o0loO110) objI00000oIO;
/* 64 */            if (o0loo110 != null) {
/* 68 */                return CachedContext.Companion.zza(o0loo110.I00000oIO);
                    }
/* 31 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object list(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    o0lO1ll0i1 o0lo1ll0i1;
/* 3 */             if (iOoil1iiIilo instanceof o0lO1ll0i1) {
/* 6 */                 o0lo1ll0i1 = (o0lO1ll0i1) iOoil1iiIilo;
/* 8 */                 int i = o0lo1ll0i1.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0lo1ll0i1.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0lo1ll0i1 = new o0lO1ll0i1(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI00OOll1 = o0lo1ll0i1.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0lo1ll0i1.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo2 = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
/* 50 */                o0lo1I o0lo1i = this.I0000Il00O;
/* 52 */                Context context = this.I00000oIO;
/* 54 */                o0lo1ll0i1.I00iiO = 1;
/* 66 */                objI00OOll1 = o0lo1i.I00000oIO.I00OOll1(context, new I0I1oi(2, iOoil1iiIilo2, 11), o0lo1ll0i1);
/* 70 */                if (objI00OOll1 == ii0111o) {
/* 168 */                   return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI00OOll1);
                    }
/* 74 */            Collection collectionValues = ((Map) objI00OOll1).values();
/* 88 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(collectionValues, 10));
/* 91 */            Iterator it = collectionValues.iterator();
/* 99 */            while (it.hasNext()) {
/* 113 */               arrayList.add(CachedContext.Companion.zza(((o0loO110) it.next()).I00000oIO));
                    }
/* 117 */           return arrayList;
                }
            }
