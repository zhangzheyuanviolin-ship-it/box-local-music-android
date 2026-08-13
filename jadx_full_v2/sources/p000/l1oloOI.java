            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class l1oloOI implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public boolean I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public l1oloOI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: RuntimeException -> 0x00e4, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:65:0x014d, B:68:0x0166, B:70:0x0175, B:69:0x016d, B:71:0x0188, B:73:0x018e, B:75:0x0194, B:77:0x019a, B:79:0x01a0, B:81:0x01a8, B:83:0x01b0, B:85:0x01b6, B:86:0x01c8, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:94:0x0072 }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x014d A[Catch: RuntimeException -> 0x00e4, TryCatch #0 {RuntimeException -> 0x00e4, blocks: (B:20:0x0072, B:52:0x0106, B:54:0x0111, B:57:0x011e, B:59:0x0124, B:61:0x013e, B:63:0x0147, B:65:0x014d, B:68:0x0166, B:70:0x0175, B:69:0x016d, B:71:0x0188, B:73:0x018e, B:75:0x0194, B:77:0x019a, B:79:0x01a0, B:81:0x01a8, B:83:0x01b0, B:85:0x01b6, B:86:0x01c8, B:25:0x0093, B:27:0x0099, B:29:0x00a3, B:31:0x00a9, B:33:0x00af, B:35:0x00b5, B:37:0x00bd, B:39:0x00c5, B:41:0x00cd, B:43:0x00d5, B:47:0x00e9, B:49:0x00f7), top: B:94:0x0072 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    l01O0IO1ooO0 l01o0io1ooo0;
                    Bundle bundleI01OOiI1o;
                    String str;
/* 5 */             int i = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 550 */                   lOliOlO1Io loliolo1ioI000OOo1O = ((AppMeasurementDynamiteService) this.I00ilO0).I000II.I000OOo1O();
/* 556 */                   il0IOO il0ioo = (il0IOO) this.I00ilI0I1;
/* 560 */                   String str2 = (String) this.I00iiI;
/* 564 */                   String str3 = (String) this.I00iiO;
/* 566 */                   boolean z = this.I00iio;
/* 568 */                   loliolo1ioI000OOo1O.I010II();
/* 571 */                   loliolo1ioI000OOo1O.I010OIo1l();
/* 574 */                   lli10iI lli10iiI011IO1I11OI = loliolo1ioI000OOo1O.I011IO1I11OI(false);
/* 580 */                   lO0oOoOoIOo lo0oooooioo = new lO0oOoOoIOo(i);
/* 583 */                   lo0oooooioo.I00iiI = str2;
/* 585 */                   lo0oooooioo.I00iiO = str3;
/* 587 */                   lo0oooooioo.I00iio = lli10iiI011IO1I11OI;
/* 589 */                   lo0oooooioo.I00ilI0I1 = z;
/* 591 */                   lo0oooooioo.I00io1l = il0ioo;
/* 593 */                   lo0oooooioo.I00ilO0 = loliolo1ioI000OOo1O;
/* 595 */                   VarHandle.storeStoreFence();
/* 598 */                   loliolo1ioI000OOo1O.I0110o(lo0oooooioo);
                            break;
                        case 1:
/* 485 */                   String str4 = (String) this.I00iiI;
/* 489 */                   String str5 = (String) this.I00iiO;
/* 491 */                   boolean z2 = this.I00iio;
/* 501 */                   lOliOlO1Io loliolo1ioI000OOo1O2 = ((l0olllO1i) ((lIl1O1li) this.I00ilO0).I00iOIl).I000OOo1O();
/* 507 */                   AtomicReference atomicReference = (AtomicReference) this.I00ilI0I1;
/* 509 */                   loliolo1ioI000OOo1O2.I010II();
/* 512 */                   loliolo1ioI000OOo1O2.I010OIo1l();
/* 515 */                   lli10iI lli10iiI011IO1I11OI2 = loliolo1ioI000OOo1O2.I011IO1I11OI(false);
/* 522 */                   lO0oOoOoIOo lo0oooooioo2 = new lO0oOoOoIOo(1);
/* 525 */                   lo0oooooioo2.I00io1l = atomicReference;
/* 527 */                   lo0oooooioo2.I00iiI = str4;
/* 529 */                   lo0oooooioo2.I00iiO = str5;
/* 531 */                   lo0oooooioo2.I00iio = lli10iiI011IO1I11OI2;
/* 533 */                   lo0oooooioo2.I00ilI0I1 = z2;
/* 535 */                   lo0oooooioo2.I00ilO0 = loliolo1ioI000OOo1O2;
/* 537 */                   VarHandle.storeStoreFence();
/* 540 */                   loliolo1ioI000OOo1O2.I0110o(lo0oooooioo2);
                            break;
                        case 2:
/* 95 */                    lIl1O1li lil1o1li = (lIl1O1li) ((IlIII0O1il) this.I00ilO0).I00iiI;
/* 99 */                    l0olllO1i l0olllo1i = (l0olllO1i) lil1o1li.I00iOIl;
/* 101 */                   lil1o1li.I010II();
/* 104 */                   iili011O1 iili011o1 = lil1o1li.I00o101lO;
/* 109 */                   String str6 = (String) this.I00iiO;
/* 113 */                   Uri uri = (Uri) this.I00ilI0I1;
                            try {
/* 115 */                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 117 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 119 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 142 */                       if (!TextUtils.isEmpty(str6)) {
/* 152 */                           if (str6.contains("gclid")) {
/* 232 */                               l01o0io1ooo0 = l01o0io1ooo02;
                                    } else {
/* 154 */                               l01o0io1ooo0 = l01o0io1ooo02;
/* 162 */                               if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
/* 218 */                                   l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) lioil0ilioi.I00iOIl).I00ilO0;
/* 220 */                                   l0olllO1i.I000II(l01o0io1ooo03);
/* 225 */                                   l01o0io1ooo03.I00lli11.I00000oOI("Activity created with data 'referrer' without required params");
                                        }
                                    }
/* 242 */                           bundleI01OOiI1o = lioil0ilioi.I01OOiI1o(Uri.parse("https://google.com/search?".concat(str6)));
/* 246 */                           if (bundleI01OOiI1o != null) {
/* 250 */                               bundleI01OOiI1o.putString("_cis", "referrer");
                                    }
/* 255 */                           String str7 = (String) this.I00iiI;
/* 261 */                           if (!this.I00iio) {
/* 263 */                               lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 265 */                               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 268 */                               Bundle bundleI01OOiI1o2 = lioil0ilioi2.I01OOiI1o(uri);
/* 272 */                               if (bundleI01OOiI1o2 != null) {
/* 276 */                                   bundleI01OOiI1o2.putString("_cis", "intent");
/* 283 */                                   if (bundleI01OOiI1o2.containsKey("gclid") || bundleI01OOiI1o == null || !bundleI01OOiI1o.containsKey("gclid")) {
/* 130 */                                       str = "Activity created with data 'referrer' without required params";
                                            } else {
/* 130 */                                       str = "Activity created with data 'referrer' without required params";
/* 313 */                                       bundleI01OOiI1o2.putString("_cer", "gclid=" + bundleI01OOiI1o.getString("gclid"));
                                            }
/* 319 */                                   lil1o1li.I010l1ol111(str7, "_cmp", bundleI01OOiI1o2);
/* 322 */                                   iili011o1.I00000oIO(str7, bundleI01OOiI1o2);
                                        } else {
/* 130 */                                   str = "Activity created with data 'referrer' without required params";
                                        }
                                    }
/* 332 */                           if (TextUtils.isEmpty(str6)) {
/* 334 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 337 */                               l01O0IO1ooO0 l01o0io1ooo04 = l01o0io1ooo0;
/* 339 */                               IOloiOI1 iOloiOI1 = l01o0io1ooo04.I00lli11;
/* 343 */                               iOloiOI1.I0000Il00O("Activity created with referrer", str6);
/* 355 */                               if (!l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I00ol1)) {
/* 397 */                                   if (!str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
/* 457 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 462 */                                       iOloiOI1.I00000oOI(str);
                                                break;
                                            } else if (!TextUtils.isEmpty(str6)) {
/* 441 */                                       l0olllo1i.I00li1OI.getClass();
/* 453 */                                       lil1o1li.I010oio1OO0("auto", "_ldl", str6, true, System.currentTimeMillis());
                                                break;
                                            }
                                        } else {
/* 357 */                                   if (bundleI01OOiI1o != null) {
/* 359 */                                       lil1o1li.I010l1ol111(str7, "_cmp", bundleI01OOiI1o);
/* 362 */                                       iili011o1.I00000oIO(str7, bundleI01OOiI1o);
                                            } else {
/* 366 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 371 */                                       iOloiOI1.I0000Il00O("Referrer does not contain valid parameters", str6);
                                            }
/* 376 */                                   l0olllo1i.I00li1OI.getClass();
/* 389 */                                   lil1o1li.I010oio1OO0("auto", "_ldl", null, true, System.currentTimeMillis());
                                            break;
                                        }
                                    }
                                } else {
/* 144 */                           l01o0io1ooo0 = l01o0io1ooo02;
                                }
/* 146 */                       bundleI01OOiI1o = null;
/* 255 */                       String str72 = (String) this.I00iiI;
/* 261 */                       if (!this.I00iio) {
                                }
/* 332 */                       if (TextUtils.isEmpty(str6)) {
                                }
                            } catch (RuntimeException e) {
/* 470 */                       l01O0IO1ooO0 l01o0io1ooo05 = ((l0olllO1i) lil1o1li.I00iOIl).I00ilO0;
/* 472 */                       l0olllO1i.I000II(l01o0io1ooo05);
/* 479 */                       l01o0io1ooo05.I00ilO0.I0000Il00O("Throwable caught in handleReferrerForOnActivityCreated", e);
/* 482 */                       return;
                            }
                            break;
                        default:
/* 11 */                    lOliOlO1Io loliolo1io = (lOliOlO1Io) this.I00ilO0;
/* 13 */                    iolll0ill1i iolll0ill1iVar = loliolo1io.I00iio;
/* 17 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) loliolo1io.I00iOIl;
/* 21 */                    if (iolll0ill1iVar == null) {
/* 23 */                        l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i2.I00ilO0;
/* 25 */                        l0olllO1i.I000II(l01o0io1ooo06);
/* 30 */                        l01o0io1ooo06.I00ilO0.I00000oOI("Failed to send default event parameters to service");
                                break;
                            } else {
/* 39 */                        boolean zI01101IOlO = l0olllo1i2.I00iio.I01101IOlO(null, iol1II1ii1i.I010ioo);
/* 45 */                        lli10iI lli10ii = (lli10iI) this.I00ilI0I1;
/* 47 */                        if (zI01101IOlO) {
/* 59 */                            loliolo1io.I011Io0I1ioi(iolll0ill1iVar, this.I00iio ? null : (ii0il0lOolIo) this.I00iiI, lli10ii);
                                    break;
                                } else {
                                    try {
/* 67 */                                iolll0ill1iVar.I00Io1lO((Bundle) this.I00iiO, lli10ii);
/* 70 */                                loliolo1io.I0110OiO();
                                        break;
                                    } catch (RemoteException e2) {
/* 75 */                                l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i2.I00ilO0;
/* 77 */                                l0olllO1i.I000II(l01o0io1ooo07);
/* 82 */                                l01o0io1ooo07.I00ilO0.I0000Il00O("Failed to send default event parameters to service", e2);
                                    }
                                }
                            }
                    }
                }
            }
