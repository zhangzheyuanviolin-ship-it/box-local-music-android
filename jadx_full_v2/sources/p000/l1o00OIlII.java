            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Pair;
            import java.lang.invoke.VarHandle;
            import java.net.MalformedURLException;
            import java.net.URL;
            import java.util.HashMap;
            import java.util.Objects;
            
/* 23 */    public final class l1o00OIlII extends iOo0iOlili1 {
                public final int I0000oI00;
                public final lIl1O1li I0001Ioi1lo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public l1o00OIlII(lIl1O1li lil1o1li, l1i11I1I0 l1i11i1i0, int i) {
/* 11 */            super(l1i11i1i0);
/* 1 */             this.I0000oI00 = i;
                    switch (i) {
                        case 2:
/* 15 */                    Objects.requireNonNull(lil1o1li);
/* 18 */                    this.I0001Ioi1lo = lil1o1li;
/* 20 */                    super(l1i11i1i0);
                            break;
                        default:
/* 6 */                     Objects.requireNonNull(lil1o1li);
/* 9 */                     this.I0001Ioi1lo = lil1o1li;
                            break;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0288 A[Catch: IllegalArgumentException | MalformedURLException -> 0x028f, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x028f, blocks: (B:80:0x0240, B:82:0x0288, B:85:0x0291, B:87:0x0297, B:89:0x029f, B:90:0x02a5, B:91:0x02a9), top: B:114:0x0240 }] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0297 A[Catch: IllegalArgumentException | MalformedURLException -> 0x028f, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x028f, blocks: (B:80:0x0240, B:82:0x0288, B:85:0x0291, B:87:0x0297, B:89:0x029f, B:90:0x02a5, B:91:0x02a9), top: B:114:0x0240 }] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oIO() {
                    Pair pair;
                    NetworkInfo activeNetworkInfo;
                    iO0Ol0ol io0ol0olI000oI1ioi;
                    Bundle bundle;
                    String string;
                    l0olllO1i l0olllo1i;
                    URL url;
/* 1 */             int i = this.I0000oI00;
/* 4 */             lIl1O1li lil1o1li = this.I0001Ioi1lo;
                    switch (i) {
                        case 0:
/* 785 */                   lIl1O1li lil1o1li2 = ((l0olllO1i) lil1o1li.I00iOIl).I00lli11;
/* 787 */                   l0olllO1i.I0001Ioi1lo(lil1o1li2);
/* 792 */                   l1lo100oo0 l1lo100oo0Var = new l1lo100oo0(i);
/* 795 */                   l1lo100oo0Var.I00iiI = lil1o1li2;
/* 797 */                   VarHandle.storeStoreFence();
/* 803 */                   new Thread(l1lo100oo0Var).start();
                            break;
                        case 1:
/* 775 */                   lil1o1li.I011olOoO();
                            break;
                        case 2:
/* 771 */                   lil1o1li.I010l1O();
                            break;
                        default:
/* 12 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 14 */                    l0Oi0o l0oi0o = l0olllo1i2.I00ilI0I1;
/* 16 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 18 */                    l0o10OoO0 l0o10ooo0 = l0olllo1i2.I00io1l;
/* 20 */                    l0olllO1i.I000II(l0o10ooo0);
/* 23 */                    l0o10ooo0.I010II();
/* 26 */                    lIloiI liloii = l0olllo1i2.I00o0iI0io1;
/* 28 */                    l0olllO1i.I000II(liloii);
/* 34 */                    l0olllO1i l0olllo1i3 = (l0olllO1i) liloii.I00iOIl;
/* 36 */                    l0olllO1i.I000II(liloii);
/* 43 */                    String strI010l1O = l0olllo1i2.I000iOII().I010l1O();
/* 51 */                    Boolean boolI0110OiO = l0olllo1i2.I00iio.I0110OiO("google_analytics_adid_collection_enabled");
/* 55 */                    if (boolI0110OiO == null || boolI0110OiO.booleanValue()) {
/* 76 */                        l0olllO1i.I0000oI00(l0oi0o);
/* 82 */                        l0olllO1i l0olllo1i4 = (l0olllO1i) l0oi0o.I00iOIl;
/* 84 */                        l0oi0o.I010II();
/* 99 */                        if (l0oi0o.I010l1ol111().I000OOo1O(l1iioiool.AD_STORAGE)) {
/* 103 */                           l0olllo1i4.I00li1OI.getClass();
/* 106 */                           long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 110 */                           String str = l0oi0o.I00ioIO;
/* 112 */                           if (str == null || jElapsedRealtime >= l0oi0o.I00l0OO0IO) {
/* 142 */                               l0oi0o.I00l0OO0IO = l0olllo1i4.I00iio.I010lI0oi(strI010l1O, iol1II1ii1i.I00000oOI) + jElapsedRealtime;
                                        try {
/* 146 */                                   I0OIOIi1 i0OIOIi1I00000oIO = I0OIOO.I00000oIO(l0olllo1i4.I00iOIl);
/* 150 */                                   l0oi0o.I00ioIO = "";
/* 152 */                                   String str2 = i0OIOIi1I00000oIO.I0000Il00O;
/* 154 */                                   if (str2 != null) {
/* 156 */                                       l0oi0o.I00ioIO = str2;
                                            }
/* 163 */                                   l0oi0o.I00l0I0l0lO1 = i0OIOIi1I00000oIO.I00000oOI;
                                        } catch (Exception e) {
/* 166 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i4.I00ilO0;
/* 168 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 175 */                                   l01o0io1ooo02.I00lli11.I0000Il00O("Unable to get advertising id", e);
/* 178 */                                   l0oi0o.I00ioIO = "";
                                        }
/* 190 */                               pair = new Pair(l0oi0o.I00ioIO, Boolean.valueOf(l0oi0o.I00l0I0l0lO1));
                                    } else {
/* 129 */                               pair = new Pair(str, Boolean.valueOf(l0oi0o.I00l0I0l0lO1));
                                    }
                                } else {
/* 198 */                           pair = new Pair("", Boolean.FALSE);
                                }
/* 209 */                       if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
/* 751 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 758 */                           l01o0io1ooo0.I00lll10.I00000oOI("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                                } else {
/* 223 */                           l0olllO1i.I000II(liloii);
/* 226 */                           liloii.I010i10l();
/* 237 */                           ConnectivityManager connectivityManager = (ConnectivityManager) l0olllo1i3.I00iOIl.getSystemService("connectivity");
/* 240 */                           if (connectivityManager != null) {
                                        try {
/* 242 */                                   activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                        } catch (SecurityException unused) {
                                        }
/* 248 */                               if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
/* 258 */                                   StringBuilder sb = new StringBuilder();
/* 261 */                                   lOliOlO1Io loliolo1ioI000OOo1O = l0olllo1i2.I000OOo1O();
/* 265 */                                   loliolo1ioI000OOo1O.I010II();
/* 268 */                                   loliolo1ioI000OOo1O.I010OIo1l();
/* 275 */                                   if (loliolo1ioI000OOo1O.I010l1ol111()) {
/* 282 */                                       lioil0ilIOi lioil0ilioi = ((l0olllO1i) loliolo1ioI000OOo1O.I00iOIl).I00l0I0l0lO1;
/* 284 */                                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 294 */                                       if (lioil0ilioi.I01IlIoOI() < 234200) {
/* 534 */                                           lioil0ilIOi lioil0ilioi2 = l0olllo1i2.I00l0I0l0lO1;
/* 536 */                                           l0olllO1i.I0000oI00(lioil0ilioi2);
/* 549 */                                           ((l0olllO1i) l0olllo1i2.I000iOII().I00iOIl).I00iio.I010l1O();
/* 554 */                                           String str3 = (String) pair.first;
                                                    long jI00000oIO = l0oi0o.I00oO101o.I00000oIO() - 1;
/* 565 */                                           string = sb.toString();
/* 571 */                                           l0olllo1i = (l0olllO1i) lioil0ilioi2.I00iOIl;
/* 577 */                                           lII0I0I000I.I0000O(str3);
/* 580 */                                           lII0I0I000I.I0000O(strI010l1O);
/* 631 */                                           String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + lioil0ilioi2.I01IlIoOI()) + "&rdid=" + str3 + "&bundleid=" + strI010l1O + "&retry=" + jI00000oIO;
/* 647 */                                           if (strI010l1O.equals(l0olllo1i.I00iio.I010ioo("debug.deferred.deeplink"))) {
                                                    }
/* 662 */                                           if (!string.isEmpty()) {
                                                    }
/* 684 */                                           url = new URL(strConcat);
/* 706 */                                           if (url != null) {
                                                    }
                                                }
                                            } else {
/* 296 */                                       lIl1O1li lil1o1li3 = l0olllo1i2.I00lli11;
/* 298 */                                       l0olllO1i.I0001Ioi1lo(lil1o1li3);
/* 303 */                                       l0olllO1i l0olllo1i5 = (l0olllO1i) lil1o1li3.I00iOIl;
/* 305 */                                       lil1o1li3.I010II();
/* 308 */                                       lOliOlO1Io loliolo1ioI000OOo1O2 = l0olllo1i5.I000OOo1O();
/* 314 */                                       l0olllO1i l0olllo1i6 = (l0olllO1i) loliolo1ioI000OOo1O2.I00iOIl;
/* 316 */                                       loliolo1ioI000OOo1O2.I010II();
/* 319 */                                       loliolo1ioI000OOo1O2.I010OIo1l();
/* 322 */                                       iolll0ill1i iolll0ill1iVar = loliolo1ioI000OOo1O2.I00iio;
/* 324 */                                       if (iolll0ill1iVar == null) {
/* 326 */                                           loliolo1ioI000OOo1O2.I010l1O();
/* 329 */                                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i6.I00ilO0;
/* 331 */                                           l0olllO1i.I000II(l01o0io1ooo03);
/* 338 */                                           l01o0io1ooo03.I00lli11.I00000oOI("Failed to get consents; not connected to service yet.");
                                                } else {
                                                    try {
/* 347 */                                               io0ol0olI000oI1ioi = iolll0ill1iVar.I000oI1ioi(loliolo1ioI000OOo1O2.I011IO1I11OI(false));
/* 351 */                                               loliolo1ioI000OOo1O2.I0110OiO();
                                                    } catch (RemoteException e2) {
/* 356 */                                               l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i6.I00ilO0;
/* 358 */                                               l0olllO1i.I000II(l01o0io1ooo04);
/* 365 */                                               l01o0io1ooo04.I00ilO0.I0000Il00O("Failed to get consents; remote exception", e2);
                                                    }
/* 374 */                                           bundle = io0ol0olI000oI1ioi == null ? io0ol0olI000oI1ioi.I00iOIl : null;
/* 376 */                                           if (bundle != null) {
/* 378 */                                               int i2 = l0olllo1i2.I00ooIo0;
/* 382 */                                               l0olllo1i2.I00ooIo0 = i2 + 1;
/* 386 */                                               i = i2 < 10 ? 1 : 0;
/* 389 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 392 */                                               IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lli11;
/* 398 */                                               StringBuilder sb2 = new StringBuilder(69);
/* 403 */                                               sb2.append("Failed to retrieve DMA consent from the service, ");
/* 425 */                                               iOloiOI1.I0000Il00O(IIl001iO0Io.I00100l0(sb2, i2 < 10 ? "Retrying." : "Skipping.", " retryCount"), Integer.valueOf(l0olllo1i2.I00ooIo0));
                                                    } else {
/* 432 */                                               l1ioIO011Oo l1ioio011ooI00000oOI = l1ioIO011Oo.I00000oOI(100, bundle);
/* 438 */                                               sb.append("&gcs=");
/* 445 */                                               sb.append(l1ioio011ooI00000oOI.I0001Ioi1lo());
/* 448 */                                               iOoOIi0i ioooii0iI0000Il00O = iOoOIi0i.I0000Il00O(100, bundle);
/* 452 */                                               String str4 = ioooii0iI0000Il00O.I0000O;
/* 456 */                                               sb.append("&dma=");
/* 459 */                                               Boolean bool = ioooii0iI0000Il00O.I0000Il00O;
/* 461 */                                               Boolean bool2 = Boolean.FALSE;
/* 468 */                                               sb.append(!Objects.equals(bool, bool2) ? 1 : 0);
/* 475 */                                               if (!TextUtils.isEmpty(str4)) {
/* 479 */                                                   sb.append("&dma_cps=");
/* 482 */                                                   sb.append(str4);
                                                        }
/* 495 */                                               int iOrdinal = l1ioIO011Oo.I0000O(bundle.getString("ad_personalization")).ordinal();
/* 500 */                                               if (iOrdinal != 2) {
/* 507 */                                                   bool2 = iOrdinal != 3 ? null : Boolean.TRUE;
                                                        }
/* 515 */                                               int i3 = !Objects.equals(bool2, Boolean.TRUE) ? 1 : 0;
/* 518 */                                               sb.append("&npa=");
/* 521 */                                               sb.append(i3);
/* 524 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 531 */                                               l01o0io1ooo0.I00lll10.I0000Il00O("Consent query parameters to Bow", sb);
/* 534 */                                               lioil0ilIOi lioil0ilioi22 = l0olllo1i2.I00l0I0l0lO1;
/* 536 */                                               l0olllO1i.I0000oI00(lioil0ilioi22);
/* 549 */                                               ((l0olllO1i) l0olllo1i2.I000iOII().I00iOIl).I00iio.I010l1O();
/* 554 */                                               String str32 = (String) pair.first;
                                                        long jI00000oIO2 = l0oi0o.I00oO101o.I00000oIO() - 1;
/* 565 */                                               string = sb.toString();
/* 571 */                                               l0olllo1i = (l0olllO1i) lioil0ilioi22.I00iOIl;
                                                        try {
/* 577 */                                                   lII0I0I000I.I0000O(str32);
/* 580 */                                                   lII0I0I000I.I0000O(strI010l1O);
/* 631 */                                                   String strConcat2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + lioil0ilioi22.I01IlIoOI()) + "&rdid=" + str32 + "&bundleid=" + strI010l1O + "&retry=" + jI00000oIO2;
/* 647 */                                                   if (strI010l1O.equals(l0olllo1i.I00iio.I010ioo("debug.deferred.deeplink"))) {
/* 651 */                                                       strConcat2 = strConcat2.concat("&ddl_test=1");
                                                            }
/* 662 */                                                   if (!string.isEmpty()) {
/* 670 */                                                       if (string.charAt(0) != '&') {
/* 674 */                                                           strConcat2 = strConcat2.concat("&");
                                                                }
/* 678 */                                                       strConcat2 = strConcat2.concat(string);
                                                            }
/* 684 */                                                   url = new URL(strConcat2);
                                                        } catch (IllegalArgumentException | MalformedURLException e3) {
/* 689 */                                                   l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 691 */                                                   l0olllO1i.I000II(l01o0io1ooo05);
/* 702 */                                                   l01o0io1ooo05.I00ilO0.I0000Il00O("Failed to create BOW URL for Deferred Deep Link. exception", e3.getMessage());
/* 705 */                                                   url = null;
                                                        }
/* 706 */                                               if (url != null) {
/* 708 */                                                   l0olllO1i.I000II(liloii);
/* 713 */                                                   i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 716 */                                                   i0oi1l1oo.I00iOIl = l0olllo1i2;
/* 718 */                                                   VarHandle.storeStoreFence();
/* 721 */                                                   liloii.I010i10l();
/* 724 */                                                   l0o10OoO0 l0o10ooo02 = l0olllo1i3.I00io1l;
/* 726 */                                                   l0olllO1i.I000II(l0o10ooo02);
/* 736 */                                                   l0o10ooo02.I01101olii(new l0I0Ii1OIi0(liloii, strI010l1O, url, (byte[]) null, (HashMap) null, i0oi1l1oo));
                                                        }
                                                    }
                                                }
/* 341 */                                       io0ol0olI000oI1ioi = null;
/* 374 */                                       if (io0ol0olI000oI1ioi == null) {
                                                }
/* 376 */                                       if (bundle != null) {
                                                }
                                            }
                                        } else {
/* 740 */                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 747 */                                   l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Network is not available for Deferred Deep Link request. Skipping");
                                        }
                                    } else {
/* 247 */                               activeNetworkInfo = null;
/* 248 */                               if (activeNetworkInfo == null) {
/* 740 */                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 747 */                                   l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Network is not available for Deferred Deep Link request. Skipping");
                                        }
                                    }
                                }
                            } else {
/* 64 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 71 */                        l01o0io1ooo0.I00lll10.I00000oOI("ADID collection is disabled from Manifest. Skipping");
                            }
/* 761 */                   if (i != 0) {
/* 767 */                       lil1o1li.I00oII.I00000oOI(2000L);
                                break;
                            }
                            break;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 24 */        public l1o00OIlII(lIl1O1li lil1o1li, l1i11I1I0 l1i11i1i0, int i, boolean z) {
                    super(l1i11i1i0);
/* 25 */            this.I0000oI00 = i;
                    this.I0001Ioi1lo = lil1o1li;
                }
            }
