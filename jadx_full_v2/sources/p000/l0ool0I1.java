            package p000;

            import android.os.Parcel;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class l0ool0I1 extends i0IiIO {
                public final IlloIo0O I000O01llI0;
                public final iiloi0IlI I000OOo1O;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l0ool0I1(l10Io11o1Ol l10io11o1ol, IlloIo0O illoIo0O, iiloi0IlI iiloi0ili) {
/* 9 */             super("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback", 10);
/* 1 */             this.I000O01llI0 = illoIo0O;
/* 3 */             this.I000OOo1O = iiloi0ili;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, lOI1lll1l10] */
                /* JADX WARN: Type inference failed for: r7v22 */
                /* JADX WARN: Type inference failed for: r7v23 */
                /* JADX WARN: Type inference failed for: r7v5, types: [int] */
                /* JADX WARN: Type inference failed for: r8v2 */
                /* JADX WARN: Type inference failed for: r8v3, types: [int] */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5 */
                /* JADX WARN: Type inference failed for: r8v6 */
                @Override
                public final boolean I00IoiI(int i, Parcel parcel) {
                    ?? r8;
                    l0I0O000II l0i0o000ii;
/* 9 */             IIiOOI iIiOOI = this.I000O01llI0.I00iOIl;
/* 16 */            iiloi0IlI iiloi0ili = this.I000OOo1O;
/* 19 */            boolean z = false;
/* 20 */            if (i != 2) {
/* 23 */                if (i != 3) {
/* 19 */                    return false;
                        }
/* 32 */                iIOoiIIoi iiooiiioi = (iIOoiIIoi) lO0Ooi.I00000oIO(parcel, iIOoiIIoi.CREATOR);
/* 34 */                lO0Ooi.I00000oOI(parcel);
/* 37 */                int i2 = iiooiiioi.I00iOIl;
/* 39 */                ll0oil ll0oilVar = iiooiiioi.I00iiO;
/* 41 */                if (ll0oilVar != null) {
/* 59 */                    iIiOOI.I0000O(new ilIoOl(ll0oilVar.I00iOIl, ll0oilVar.I00iiI, ll0oilVar.getMessage(), null, ll0oilVar.I00iio));
                        } else {
/* 69 */                    iIiOOI.I0000O(ilIoOl.I00000oOI(i2, null, "Inference failed."));
                        }
                        try {
/* 72 */                    iiloi0ili.zzb();
/* 443 */                   return true;
                        } catch (IOException e) {
/* 78 */                    Log.e("l10Io11o1Ol", "Failed to close all file descriptors", e);
/* 443 */                   return true;
                        }
                    }
/* 89 */            iio11liiI1I iio11liii1i = (iio11liiI1I) lO0Ooi.I00000oIO(parcel, iio11liiI1I.CREATOR);
/* 91 */            lO0Ooi.I00000oOI(parcel);
/* 94 */            lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 96 */            int i3 = 4;
/* 99 */            ll0iOo11011i.I00000oOI(4, "initialCapacity");
/* 102 */           Object[] objArrCopyOf = new Object[4];
/* 104 */           lOI1lll1l10 loi1lll1l10 = iio11liii1i.I00iOIl;
/* 106 */           int size = loi1lll1l10.size();
/* 110 */           int i4 = 0;
/* 111 */           int i5 = 0;
/* 112 */           while (i4 < size) {
/* 118 */               iilOIlOio iiloiloio = (iilOIlOio) loi1lll1l10.get(i4);
/* 122 */               ArrayList arrayList = new ArrayList();
/* 125 */               ArrayList arrayList2 = iiloiloio.I00io1l;
/* 127 */               if (arrayList2 != null) {
/* 129 */                   Iterator it = arrayList2.iterator();
/* 137 */                   while (it.hasNext()) {
/* 143 */                       boolean z2 = z;
/* 147 */                       il1O0O01 il1o0o01 = (il1O0O01) it.next();
/* 149 */                       iiloi0IlI iiloi0ili2 = iiloi0ili;
/* 153 */                       Iterator it2 = it;
/* 157 */                       I00Ol00 i00Ol00 = new I00Ol00(i3, 22);
/* 160 */                       lOliil loliilI00000oOI = il1o0o01.I00000oOI();
/* 164 */                       if (loliilI00000oOI != null) {
/* 178 */                           for (OoiOOoOlo ooiOOoOloI000iOII = loliilI00000oOI.entrySet().I000iOII(); ooiOOoOloI000iOII.hasNext(); ooiOOoOloI000iOII = ooiOOoOloI000iOII) {
/* 184 */                               Map.Entry entry = (Map.Entry) ooiOOoOloI000iOII.next();
/* 206 */                               i00Ol00.I001iOo1i0O((String) entry.getKey(), l1I010loO1l.I000O01llI0((il0olIi) entry.getValue()));
                                    }
                                }
/* 215 */                       lOliil.I00000oIO(lOliil.I00io1l);
/* 218 */                       String str = il1o0o01.I00iOIl;
/* 220 */                       if (str == null) {
/* 255 */                           IOOlIIilOl0.I000II("Null name");
/* 258 */                           return z2;
                                }
/* 226 */                       lOliil loliilI00000oIO = lOliil.I00000oIO(i00Ol00.I001lllioOl());
/* 232 */                       l1II0OlloloO l1ii0olloloo = new l1II0OlloloO();
/* 235 */                       l1ii0olloloo.I00000oIO = str;
/* 237 */                       l1ii0olloloo.I00000oOI = loliilI00000oIO;
/* 239 */                       VarHandle.storeStoreFence();
/* 242 */                       arrayList.add(l1ii0olloloo);
/* 245 */                       it = it2;
/* 247 */                       iiloi0ili = iiloi0ili2;
/* 249 */                       z = z2;
/* 251 */                       i3 = 4;
                            }
                        }
/* 259 */               iiloi0IlI iiloi0ili3 = iiloi0ili;
/* 261 */               boolean z3 = z;
/* 275 */               l0OOIlOO11 l0ooiloo11I00000oIO = l0OOIlOO11.I00000oIO(iiloiloio.I00iOIl, iiloiloio.I00iio, iiloiloio.I00iiO, l10Io11o1Ol.I000II(iiloiloio.I00ilO0), arrayList);
/* 279 */               int length = objArrCopyOf.length;
/* 280 */               int i6 = i5 + 1;
/* 282 */               int iI000OiO = IoilIilo.I000OiO(length, i6);
/* 286 */               if (iI000OiO > length) {
/* 289 */                   objArrCopyOf = Arrays.copyOf(objArrCopyOf, iI000OiO);
                        }
/* 294 */               objArrCopyOf[i5] = l0ooiloo11I00000oIO;
/* 296 */               i4++;
/* 298 */               i5 = i6;
/* 299 */               iiloi0ili = iiloi0ili3;
/* 301 */               z = z3;
/* 303 */               i3 = 4;
                    }
/* 307 */           iiloi0IlI iiloi0ili4 = iiloi0ili;
/* 309 */           int i7 = i3;
/* 310 */           boolean z4 = z;
/* 312 */           ll0iOo11011i.I00000oOI(i7, "initialCapacity");
/* 315 */           Object[] objArrCopyOf2 = new Object[i7];
/* 317 */           ?? r2 = iio11liii1i.I00iio;
/* 319 */           if (r2 != 0) {
/* 321 */               int size2 = r2.size();
/* 325 */               boolean z5 = z4;
/* 327 */               r8 = z5;
/* 328 */               for (?? r7 = z5; r7 < size2; r7++) {
/* 334 */                   iilOIlOio iiloiloio2 = (iilOIlOio) r2.get(r7);
/* 350 */                   l0OOIlOO11 l0ooiloo11I00000oIO2 = l0OOIlOO11.I00000oIO(iiloiloio2.I00iOIl, iiloiloio2.I00iio, iiloiloio2.I00iiO, l10Io11o1Ol.I000II(iiloiloio2.I00ilO0), lOl10OOloi.I00ilI0I1);
/* 354 */                   int length2 = objArrCopyOf2.length;
/* 355 */                   int i8 = (r8 == true ? 1 : 0) + 1;
/* 357 */                   int iI000OiO2 = IoilIilo.I000OiO(length2, i8);
/* 361 */                   if (iI000OiO2 > length2) {
/* 364 */                       objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iI000OiO2);
                            }
/* 368 */                   objArrCopyOf2[r8 == true ? 1 : 0] = l0ooiloo11I00000oIO2;
/* 372 */                   r8 = i8;
                        }
                    } else {
/* 374 */               r8 = z4;
                    }
/* 376 */           lOl10OOloi lol10ooloiI000oI1ioi = lOI1lll1l10.I000oI1ioi(i5, objArrCopyOf);
/* 380 */           iiOi1illIO1o iioi1illio1o = iio11liii1i.I00iiI;
/* 382 */           iio1oo0Ioo iio1oo0ioo = iio11liii1i.I00iiO;
/* 384 */           if (iio1oo0ioo == null) {
/* 386 */               l0i0o000ii = null;
                    } else {
/* 388 */               String str2 = iio1oo0ioo.I00iOIl;
/* 390 */               if (str2 == null) {
/* 453 */                   IOOlIIilOl0.I000II("Null modelVersion");
/* 900 */                   return z4;
                        }
/* 394 */               l0i0o000ii = new l0I0O000II();
/* 397 */               l0i0o000ii.I00000oIO = str2;
/* 399 */               VarHandle.storeStoreFence();
                    }
/* 402 */           lOl10OOloi lol10ooloiI000oI1ioi2 = lOI1lll1l10.I000oI1ioi(r8, objArrCopyOf2);
/* 408 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I = lOI1lll1l10.I000o00OoI0I(lol10ooloiI000oI1ioi);
/* 412 */           lOI1lll1l10 loi1lll1l10I000o00OoI0I2 = lOI1lll1l10.I000o00OoI0I(lol10ooloiI000oI1ioi2);
/* 416 */           l0i10Il l0i10il = new l0i10Il();
/* 419 */           if (loi1lll1l10I000o00OoI0I == null) {
/* 447 */               IOOlIIilOl0.I000II("Null results");
/* 450 */               return z4;
                    }
/* 421 */           l0i10il.I00000oIO = loi1lll1l10I000o00OoI0I;
/* 423 */           l0i10il.I00000oOI = iioi1illio1o;
/* 425 */           l0i10il.I0000Il00O = l0i0o000ii;
/* 427 */           l0i10il.I0000O = loi1lll1l10I000o00OoI0I2;
/* 429 */           VarHandle.storeStoreFence();
/* 432 */           iIiOOI.I00000oOI(l0i10il);
                    try {
/* 435 */               iiloi0ili4.zzb();
/* 443 */               return true;
                    } catch (IOException e2) {
/* 440 */               Log.e("l10Io11o1Ol", "Failed to close all file descriptors", e2);
/* 443 */               return true;
                    }
                }
            }
