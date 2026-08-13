            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class OI1o1o1iO1l {
                public Context I00000oIO;
                public OI1i0llli I00000oOI;
                public I1O0ol I0000Il00O;
                public Activity I0000O;
                public boolean I0000oI00;
                public I1lo101oIi1 I0001Ioi1lo;
                public boolean I000II;

                public static void I0000Il00O(OI1o1o1iO1l oI1o1o1iO1l, String str) {
/* 1 */             OI1i0llli oI1i0llli = oI1o1o1iO1l.I00000oOI;
/* 5 */             if (oI1i0llli.I0000Il00O == null) {
/* 114 */               IoOOl0iOl1io.I000iOII("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", oI1i0llli, 46);
/* 332 */               return;
                    }
/* 7 */             OI1lo1liOO oI1lo1liOOI000OOo1O = oI1i0llli.I000OOo1O();
/* 12 */            OI1il00IOO oI1il00IOOI000lI = oI1lo1liOOI000OOo1O.I000lI(str, true, oI1lo1liOOI000OOo1O);
/* 16 */            if (oI1il00IOOI000lI == null) {
/* 91 */                StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
/* 97 */                sbI001IIilI0O.append(oI1i0llli.I0000Il00O);
/* 107 */               throw new IllegalArgumentException(sbI001IIilI0O.toString());
                    }
/* 18 */            OI1ilOI1ioo0 oI1ilOI1ioo0 = oI1il00IOOI000lI.I00iOIl;
/* 22 */            Bundle bundleI00000oOI = oI1ilOI1ioo0.I00000oOI(oI1il00IOOI000lI.I00iiI);
/* 26 */            if (bundleI00000oOI == null) {
/* 37 */                bundleI00000oOI = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
                    }
/* 41 */            int i = OI1ilOI1ioo0.I00ilI0I1;
/* 47 */            String str2 = (String) oI1ilOI1ioo0.I00iiI.I0001Ioi1lo;
/* 60 */            Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
/* 66 */            Intent intent = new Intent();
/* 70 */            intent.setDataAndType(uri, null);
/* 73 */            intent.setAction(null);
/* 78 */            bundleI00000oOI.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
/* 81 */            oI1i0llli.I000iOII(oI1ilOI1ioo0, bundleI00000oOI, null);
                }

                public final OI1Ooo I00000oIO(OII1Il1IlOO oII1Il1IlOO) {
/* 3 */             OI1Ooo oI1Ooo = new OI1Ooo();
/* 6 */             oI1Ooo.I000O01llI0 = this;
/* 15 */            oI1Ooo.I00000oIO = new lolIo0(15);
/* 19 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(Il01100l.I00iOIl);
/* 23 */            oI1Ooo.I00000oOI = olO0OIIl1I00000oIO;
/* 27 */            OlO0OIIl1 olO0OIIl1I00000oIO2 = OlO0iOl0il.I00000oIO(Il01llIol0.I00iOIl);
/* 31 */            oI1Ooo.I0000Il00O = olO0OIIl1I00000oIO2;
/* 37 */            oI1Ooo.I0000oI00 = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
/* 43 */            oI1Ooo.I0001Ioi1lo = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO2);
/* 45 */            oI1Ooo.I000II = oII1Il1IlOO;
/* 47 */            VarHandle.storeStoreFence();
/* 77 */            return oI1Ooo;
                }

                public final int I00000oOI() {
/* 3 */             I1Il0loi i1Il0loi = this.I00000oOI.I0001Ioi1lo;
/* 5 */             int i = 0;
/* 6 */             if (i1Il0loi != null && i1Il0loi.isEmpty()) {
/* 5 */                 return 0;
                    }
/* 15 */            Iterator<E> it = i1Il0loi.iterator();
/* 23 */            while (it.hasNext()) {
/* 35 */                if (!(((OI1OloOIO1O) it.next()).I00iiI instanceof OI1lo1liOO) && (i = i + 1) < 0) {
/* 42 */                    IOOi1I.I000l1();
/* 46 */                    throw null;
                        }
                    }
/* 55 */            return i;
                }

                public final void I0000O() {
                    Bundle bundleI00000oOI;
                    Intent intent;
/* 1 */             OI1i0llli oI1i0llli = this.I00000oOI;
/* 3 */             Activity activity = this.I0000O;
/* 10 */            if (I00000oOI() != 1) {
/* 436 */               I0000oI00();
/* 743 */               return;
                    }
/* 26 */            Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
/* 41 */            int i = 0;
/* 42 */            if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
/* 272 */               int i2 = oI1i0llli.I0001Ioi1lo().I00iiI.I00000oOI;
/* 276 */               for (OI1lo1liOO oI1lo1liOO = r3.I00iiO; oI1lo1liOO != null; oI1lo1liOO = oI1lo1liOO.I00iiO) {
/* 278 */                   I11l01l i11l01l = oI1lo1liOO.I00iiI;
/* 284 */                   if (oI1lo1liOO.I00ilO0.I00iiI != i2) {
/* 294 */                       Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 298 */                       if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
/* 320 */                           bundleI00000oIO.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
/* 323 */                           OI1lo1liOO oI1lo1liOOI000OOo1O = oI1i0llli.I000OOo1O();
/* 327 */                           Intent intent2 = activity.getIntent();
/* 333 */                           Uri data = intent2.getData();
/* 337 */                           String action = intent2.getAction();
/* 341 */                           String type = intent2.getType();
/* 347 */                           IOO000ilo iOO000ilo = new IOO000ilo(21);
/* 350 */                           iOO000ilo.I00iiI = data;
/* 352 */                           iOO000ilo.I00iiO = action;
/* 354 */                           iOO000ilo.I00iio = type;
/* 356 */                           VarHandle.storeStoreFence();
/* 359 */                           OI1il00IOO oI1il00IOOI000iOII = oI1lo1liOOI000OOo1O.I000iOII(iOO000ilo, oI1lo1liOOI000OOo1O);
/* 369 */                           if ((oI1il00IOOI000iOII != null ? oI1il00IOOI000iOII.I00iiI : null) != null && (bundleI00000oOI = oI1il00IOOI000iOII.I00iOIl.I00000oOI(oI1il00IOOI000iOII.I00iiI)) != null) {
/* 381 */                               bundleI00000oIO.putAll(bundleI00000oOI);
                                    }
                                }
/* 386 */                       I1ii1o0 i1ii1o0 = new I1ii1o0(this);
/* 389 */                       int i3 = i11l01l.I00000oOI;
/* 393 */                       ArrayList arrayList = (ArrayList) i1ii1o0.I00ilO0;
/* 395 */                       arrayList.clear();
/* 403 */                       arrayList.add(new OI1iiioIOi1(i3, null));
/* 406 */                       i1ii1o0.I00Iooi00oi();
/* 413 */                       ((Intent) i1ii1o0.I00iio).putExtra("android-support-nav:controller:deepLinkExtras", bundleI00000oIO);
/* 420 */                       i1ii1o0.I001lIiIIo1O().I0000oI00();
/* 423 */                       if (activity != null) {
/* 425 */                           activity.finish();
/* 428 */                           return;
                                }
/* 435 */                       return;
                            }
/* 429 */                   i2 = i11l01l.I00000oOI;
                        }
/* 435 */               return;
                    }
/* 46 */            if (this.I0000oI00) {
/* 50 */                Intent intent3 = activity.getIntent();
/* 54 */                Bundle extras2 = intent3.getExtras();
/* 58 */                int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
/* 65 */                ArrayList arrayList2 = new ArrayList(intArray.length);
/* 70 */                for (int i4 : intArray) {
/* 78 */                    arrayList2.add(Integer.valueOf(i4));
                        }
/* 86 */                ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
/* 94 */                int i5 = 2;
/* 95 */                if (arrayList2.size() < 2) {
/* 435 */                   return;
                        }
/* 105 */               int iIntValue = ((Number) IOOii0O10Io0.I00111O(arrayList2)).intValue();
/* 109 */               if (parcelableArrayList != null) {
                        }
/* 121 */               OI1ilOI1ioo0 oI1ilOI1ioo0I0000O = OI1i0llli.I0000O(iIntValue, oI1i0llli.I000II(), null, false);
/* 127 */               if (oI1ilOI1ioo0I0000O instanceof OI1lo1liOO) {
/* 129 */                   int i6 = OI1lo1liOO.I00io1l;
/* 150 */                   iIntValue = ((OI1ilOI1ioo0) OilO1oiooiII.I000l1(OilO1oiooiII.I000OiO((OI1lo1liOO) oI1ilOI1ioo0I0000O, new OI1lOo(i5)))).I00iiI.I00000oOI;
                        }
/* 152 */               OI1ilOI1ioo0 oI1ilOI1ioo0I0001Ioi1lo = oI1i0llli.I0001Ioi1lo();
/* 156 */               if (oI1ilOI1ioo0I0001Ioi1lo == null || iIntValue != oI1ilOI1ioo0I0001Ioi1lo.I00iiI.I00000oOI) {
/* 435 */                   return;
                        }
/* 166 */               I1ii1o0 i1ii1o02 = new I1ii1o0(this);
/* 177 */               Bundle bundleI00000oIO2 = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 181 */               bundleI00000oIO2.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
/* 184 */               Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
/* 188 */               if (bundle != null) {
/* 190 */                   bundleI00000oIO2.putAll(bundle);
                        }
/* 197 */               ((Intent) i1ii1o02.I00iio).putExtra("android-support-nav:controller:deepLinkExtras", bundleI00000oIO2);
/* 200 */               Iterator it = arrayList2.iterator();
/* 208 */               while (it.hasNext()) {
/* 210 */                   Object next = it.next();
/* 214 */                   int i7 = i + 1;
/* 216 */                   if (i < 0) {
/* 251 */                       IOOi1I.I000lI();
/* 254 */                       throw null;
                            }
/* 243 */                   ((ArrayList) i1ii1o02.I00ilO0).add(new OI1iiioIOi1(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
/* 246 */                   i1ii1o02.I00Iooi00oi();
/* 249 */                   i = i7;
                        }
/* 259 */               i1ii1o02.I001lIiIIo1O().I0000oI00();
/* 262 */               activity.finish();
                    }
                }

                public final boolean I0000oI00() {
/* 1 */             OI1i0llli oI1i0llli = this.I00000oOI;
                    return !oI1i0llli.I0001Ioi1lo.isEmpty() && oI1i0llli.I000l1(oI1i0llli.I0001Ioi1lo().I00iiI.I00000oOI, true, false) && oI1i0llli.I00000oOI();
                }
            }
