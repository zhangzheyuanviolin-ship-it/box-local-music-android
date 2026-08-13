            package p000;

            import android.app.BroadcastOptions;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ResolveInfo;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 38 */    public class i0OI1l1Oo implements i0Ii0I1ll, I1oIlIIIiOo0, i1lOii1oOOO, liOII1010il, lIlOiO0OoO0, OOooilOIIl0I, OliiillO {
                public Object I00iOIl;

                /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oIO(int i, Throwable th, byte[] bArr) {
                    l01O0IO1ooO0 l01o0io1ooo0;
                    l01O0IO1ooO0 l01o0io1ooo02;
/* 1 */             int i2 = i;
/* 11 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 25 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 29 */            if (i2 == 200 || i2 == 204) {
/* 44 */                if (th == null) {
/* 46 */                    l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 48 */                    l0olllO1i.I0000oI00(l0oi0o);
/* 54 */                    l0oi0o.I00oIiI10.I00000oOI(true);
/* 57 */                    if (bArr == null || bArr.length == 0) {
/* 329 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 336 */                       l01o0io1ooo03.I00lli11.I00000oOI("Deferred Deep Link response empty.");
/* 339 */                       return;
                            }
                            try {
/* 72 */                        JSONObject jSONObject = new JSONObject(new String(bArr));
/* 75 */                        String strOptString = jSONObject.optString("deeplink", "");
/* 83 */                        if (TextUtils.isEmpty(strOptString)) {
/* 85 */                            l0olllO1i.I000II(l01o0io1ooo03);
/* 92 */                            l01o0io1ooo03.I00lli11.I00000oOI("Deferred Deep Link is empty.");
/* 95 */                            return;
                                }
/* 100 */                       String strOptString2 = jSONObject.optString("gclid", "");
/* 104 */                       String strOptString3 = jSONObject.optString("gbraid", "");
/* 108 */                       String strOptString4 = jSONObject.optString("gad_source", "");
/* 114 */                       double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
/* 120 */                       Bundle bundle = new Bundle();
/* 123 */                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 125 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 130 */                       l0olllO1i l0olllo1i2 = (l0olllO1i) lioil0ilioi.I00iOIl;
/* 136 */                       if (TextUtils.isEmpty(strOptString)) {
/* 138 */                           l01o0io1ooo02 = l01o0io1ooo03;
                                } else {
/* 144 */                           Context context = l0olllo1i2.I00iOIl;
/* 150 */                           l01o0io1ooo02 = l01o0io1ooo03;
                                    try {
/* 168 */                               List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
/* 172 */                               if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
/* 184 */                                   if (!TextUtils.isEmpty(strOptString3)) {
/* 186 */                                       bundle.putString("gbraid", strOptString3);
                                            }
/* 199 */                                   if (!TextUtils.isEmpty(strOptString4)) {
/* 201 */                                       bundle.putString("gad_source", strOptString4);
                                            }
/* 204 */                                   bundle.putString("gclid", strOptString2);
/* 211 */                                   bundle.putString("_cis", "ddp");
/* 220 */                                   l0olllo1i.I00lli11.I010l1ol111("auto", "_cmp", bundle);
/* 227 */                                   if (TextUtils.isEmpty(strOptString)) {
/* 328 */                                       return;
                                            }
                                            try {
/* 235 */                                       SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
/* 239 */                                       editorEdit.putString("deeplink", strOptString);
/* 246 */                                       editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
/* 253 */                                       if (editorEdit.commit()) {
/* 280 */                                           l0olllo1i2.I00iOIl.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"), null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
/* 283 */                                           return;
                                                }
/* 328 */                                       return;
                                            } catch (RuntimeException e) {
/* 291 */                                       l01O0IO1ooO0 l01o0io1ooo04 = ((l0olllO1i) lioil0ilioi.I00iOIl).I00ilO0;
/* 293 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 300 */                                       l01o0io1ooo04.I00ilO0.I0000Il00O("Failed to persist Deferred Deep Link. exception", e);
/* 328 */                                       return;
                                            }
                                        }
                                    } catch (JSONException e2) {
/* 190 */                               e = e2;
/* 191 */                               l01o0io1ooo0 = l01o0io1ooo02;
/* 318 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 325 */                               l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to parse the Deferred Deep Link response. exception", e);
/* 328 */                               return;
                                    }
                                }
/* 304 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 307 */                       l01o0io1ooo0 = l01o0io1ooo02;
                                try {
/* 313 */                           l01o0io1ooo0.I00l0I0l0lO1.I0000oI00("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
/* 316 */                           return;
                                } catch (JSONException e3) {
/* 317 */                           e = e3;
/* 318 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 325 */                           l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to parse the Deferred Deep Link response. exception", e);
/* 328 */                           return;
                                }
                            } catch (JSONException e4) {
/* 96 */                        e = e4;
/* 97 */                        l01o0io1ooo0 = l01o0io1ooo03;
                            }
                        }
                    } else if (i2 == 304) {
/* 39 */                i2 = 304;
/* 44 */                if (th == null) {
                        }
                    }
/* 340 */           l0olllO1i.I000II(l01o0io1ooo03);
/* 351 */           l01o0io1ooo03.I00l0I0l0lO1.I0000O(Integer.valueOf(i2), "Network Request for Deferred Deep Link failed. response, exception", th);
                }

                public li0I1IiiOi I00000oOI(String str, boolean z) {
/* 7 */             li0I1IiiOi li0i1iiioi = new li0I1IiiOi(str, (IOoi01o) this.I00iOIl);
/* 10 */            li0i1iiioi.I00ilO0 = z;
/* 12 */            VarHandle.storeStoreFence();
/* 37 */            return li0i1iiioi;
                }

                @Override
                public Object I0000Il00O() {
/* 5 */             Context contextI00000oOI = ((i0O00lI) this.I00iOIl).I00000oOI();
/* 11 */            i0OI1ii10 i0oi1ii10 = new i0OI1ii10();
/* 15 */            i0oi1ii10.I00000oOI = -1;
/* 17 */            i0oi1ii10.I00000oIO = contextI00000oOI;
/* 19 */            VarHandle.storeStoreFence();
/* 55 */            return i0oi1ii10;
                }

                @Override
                public void I0000O(int i) {
/* 5 */             ((Io0iOIIio) this.I00iOIl).I0000O(i);
                }

                @Override
                public void I0000oI00() {
/* 5 */             ((Io0iOIIio) this.I00iOIl).I0000oI00();
                }

                public void I0001Ioi1lo(lioiiIOoil lioiiiooil, o01oIol1O o01oiol1o) {
/* 5 */             IOiOol0 iOiOol0 = new IOiOol0(14);
/* 8 */             long j = o01oiol1o.I00000oIO;
/* 14 */            if (j == 0) {
/* 124 */               IOOlIIilOl0.I000iOII();
/* 332 */               return;
                    }
/* 16 */            long j2 = o01oiol1o.I00000oOI;
/* 20 */            if (j2 == 0) {
/* 120 */               IOOlIIilOl0.I000iOII();
/* 123 */               return;
                    }
/* 29 */            Long lValueOf = Long.valueOf(Long.MAX_VALUE & (j2 - j));
/* 33 */            I00IOO i00ioo = o01oiol1o.I0000Il00O;
/* 36 */            i00ioo.I00000oIO = true;
/* 44 */            iiOOi1OolOlO iiooi1oololoI001iOo1i0O = ii01IlIiIo.I001iOo1i0O(i00ioo.I00000oOI, (Object[]) i00ioo.I0000Il00O);
/* 48 */            I00IOO i00ioo2 = o01oiol1o.I0000O;
/* 50 */            i00ioo2.I00000oIO = true;
/* 58 */            iiOOi1OolOlO iiooi1oololoI001iOo1i0O2 = ii01IlIiIo.I001iOo1i0O(i00ioo2.I00000oOI, (Object[]) i00ioo2.I0000Il00O);
/* 62 */            I00IOO i00ioo3 = o01oiol1o.I0000oI00;
/* 64 */            i00ioo3.I00000oIO = true;
/* 72 */            iiOOi1OolOlO iiooi1oololoI001iOo1i0O3 = ii01IlIiIo.I001iOo1i0O(i00ioo3.I00000oOI, (Object[]) i00ioo3.I0000Il00O);
/* 76 */            int i = o01oiol1o.I0001Ioi1lo;
/* 85 */            Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
/* 88 */            loOoIo loooio = new loOoIo();
/* 91 */            loooio.I00000oIO = lValueOf;
/* 93 */            loooio.I00000oOI = iiooi1oololoI001iOo1i0O3;
/* 95 */            loooio.I0000Il00O = iiooi1oololoI001iOo1i0O2;
/* 97 */            loooio.I0000O = iiooi1oololoI001iOo1i0O;
/* 99 */            loooio.I0000oI00 = numValueOf;
/* 101 */           VarHandle.storeStoreFence();
/* 104 */           iOiOol0.I00ioIO = loooio;
/* 116 */           ((o0OIl1o1i0Oi) this.I00iOIl).I00000oOI(o0Oll1li.I00000oOI(iOiOol0), lioiiiooil, "o:a:mlkit:1.0.0");
                }

                public li1IIolo I000II(String str, String str2) {
/* 7 */             li1IIolo li1iiolo = new li1IIolo(str, (IOoi01o) this.I00iOIl);
/* 10 */            li1iiolo.I00ilO0 = str2;
/* 12 */            VarHandle.storeStoreFence();
/* 37 */            return li1iiolo;
                }

                public void I000O01llI0(int i, Object obj, ii0oioOi00i ii0oiooi00i) {
/* 5 */             ii0I1Il ii0i1il = (ii0I1Il) this.I00iOIl;
/* 8 */             ii0i1il.I001i1O0Ol(i, 3);
/* 13 */            ii0oiooi00i.I0000Il00O((ii00oo) obj, ii0i1il.I00000oIO);
/* 17 */            ii0i1il.I001i1O0Ol(i, 4);
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 5 */             int i = lI1i1OI1O0l.I000iOII;
/* 9 */             l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((OloIlI0ll) obj2);
/* 16 */            lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 22 */            byte[] bArrI00000oIO = ((lO1Iill100l1) this.I00iOIl).I00000oIO();
/* 26 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 30 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 33 */            parcelI00Iooi00oi.writeByteArray(bArrI00000oIO);
/* 38 */            liil1lol0ioi.I00O0o1oo(31, parcelI00Iooi00oi);
                }

                @Override
                public Object get() {
/* 3 */             llilooO llilooo = (llilooO) this.I00iOIl;
/* 11 */            OI011o1 oI011o1 = (OI011o1) llilooo.I0000Il00O.get();
/* 13 */            oI011o1.getClass();
/* 22 */            lOIiI0 loiii0 = (lOIiI0) llilooo.I00000oOI.get();
/* 24 */            loiii0.getClass();
/* 27 */            lI1i1OI1O0l li1i1oi1o0l = loiii0.I00000oIO;
/* 29 */            IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 36 */            iili011O1 iili011o1 = new iili011O1(3);
/* 39 */            iili011o1.I00iiI = li1i1oi1o0l;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            iolIIo0o0IioI0000Il00O.I0000Il00O = iili011o1;
/* 52 */            iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1lI0Oi.I0000Il00O};
/* 55 */            iolIIo0o0IioI0000Il00O.I00000oIO = false;
/* 65 */            I00l0OO0IO i00l0OO0IOI00000oOI = lOIiI0.I00000oOI(li1i1oi1o0l.I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO()));
/* 75 */            I00li1OI i00li1OI = new I00li1OI(i00l0OO0IOI00000oOI, lOI1111l.class, iI1l0iillll1.I00ilI0I1);
/* 82 */            i00l0OO0IOI00000oOI.addListener(i00li1OI, l1i0oIO0.I00000oOI(oI011o1, i00li1OI));
/* 88 */            lii0l0 lii0l0Var = new lii0l0(2);
/* 91 */            lii0l0Var.I00iiI = llilooo;
/* 93 */            VarHandle.storeStoreFence();
/* 96 */            int i = I01iIIO.I00li1OI;
/* 100 */           I01iI0l00O i01iI0l00O = new I01iI0l00O(i00li1OI, lii0l0Var);
/* 107 */           i00li1OI.addListener(i01iI0l00O, l1i0oIO0.I00000oOI(oI011o1, i01iI0l00O));
/* 113 */           lOii1o loii1o = new lOii1o(6);
/* 116 */           loii1o.I00iiI = i01iI0l00O;
/* 118 */           VarHandle.storeStoreFence();
/* 121 */           i01iI0l00O.addListener(loii1o, oI011o1);
/* 245 */           return i01iI0l00O;
                }

                @Override
                public void zza(Throwable th) {
/* 3 */             ioii01Ii100 ioii01ii100 = (ioii01Ii100) this.I00iOIl;
                    synchronized (ioii01ii100.I0001Ioi1lo) {
/* 9 */                 ioii01ii100.I000OOo1O = null;
                    }
                }

                @Override
                public i1o1Ioll0I zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 i1lOii1oOOO i1loii1oooo = ((i1lOii1oOOO[]) this.I00iOIl)[i];
/* 15 */                if (i1loii1oooo.zzc(cls)) {
/* 17 */                    return i1loii1oooo.zzb(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 16 */                if (((i1lOii1oOOO[]) this.I00iOIl)[i].zzc(cls)) {
/* 18 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                @Override
/* 39 */        public void zzb(Object obj) {
                }
            }
