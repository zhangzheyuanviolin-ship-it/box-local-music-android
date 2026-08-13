            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ResolveInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteFullException;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Pair;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class lOliOlO1Io extends iolOI0li {
                public lOl001Iii I00iiO;
                public iolll0ill1i I00iio;
                public volatile Boolean I00ilI0I1;
                public lOIIlil0OO I00ilO0;
                public ScheduledExecutorService I00io1l;
                public li1iIiOi10o I00ioIO;
                public ArrayList I00l0I0l0lO1;
                public lOIIlil0OO I00l0OO0IO;

                @Override
                public final boolean I010iIIOlo() {
/* 1 */             return false;
                }

                public final void I010ioo(AtomicReference atomicReference) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 8 */             lli10iI lli10iiI011IO1I11OI = I011IO1I11OI(false);
/* 16 */            O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(16);
/* 19 */            o10oO1IiI1.I00iiI = atomicReference;
/* 21 */            o10oO1IiI1.I00iiO = lli10iiI011IO1I11OI;
/* 23 */            o10oO1IiI1.I00iio = this;
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            I0110o(o10oO1IiI1);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l10O(Bundle bundle) {
                    boolean z;
                    boolean zI010l1ol111;
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 9 */             ii0il0lOolIo ii0il0loolio = new ii0il0lOolIo(bundle);
/* 12 */            I01101olii();
/* 17 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 29 */            if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I010ioo)) {
/* 31 */                l00Ii0II l00ii0iiI000O01llI0 = l0olllo1i.I000O01llI0();
/* 37 */                l0olllO1i l0olllo1i2 = (l0olllO1i) l00ii0iiI000O01llI0.I00iOIl;
/* 39 */                lioil0ilIOi lioil0ilioi = l0olllo1i2.I00l0I0l0lO1;
/* 41 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 43 */                l0olllO1i.I0000oI00(lioil0ilioi);
/* 46 */                byte[] bArrI01IiOO = lioil0ilIOi.I01IiOO(ii0il0loolio);
/* 50 */                if (bArrI01IiOO == null) {
/* 52 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 59 */                    l01o0io1ooo0.I00io1l.I00000oOI("Null default event parameters; not writing to database");
                        } else if (bArrI01IiOO.length > 131072) {
/* 69 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 76 */                    l01o0io1ooo0.I00io1l.I00000oOI("Default event parameters too long for local database. Sending directly to service");
                        } else {
/* 81 */                    zI010l1ol111 = l00ii0iiI000O01llI0.I010l1ol111(4, bArrI01IiOO);
/* 89 */                    z = !zI010l1ol111;
                        }
/* 62 */                zI010l1ol111 = false;
/* 89 */                if (!zI010l1ol111) {
                        }
                    }
/* 90 */            lli10iI lli10iiI011IO1I11OI = I011IO1I11OI(false);
/* 97 */            l1oloOI l1olooi = new l1oloOI(3);
/* 100 */           l1olooi.I00ilI0I1 = lli10iiI011IO1I11OI;
/* 102 */           l1olooi.I00iio = z;
/* 104 */           l1olooi.I00iiI = ii0il0loolio;
/* 106 */           l1olooi.I00iiO = bundle;
/* 108 */           l1olooi.I00ilO0 = this;
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           I0110o(l1olooi);
                }

                public final void I010l1O() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            if (I011IOil()) {
/* 167 */               return;
                    }
/* 20 */            if (I010l1ol111()) {
/* 168 */               lOl001Iii lol001iii = this.I00iiO;
/* 170 */               lOliOlO1Io loliolo1io = lol001iii.I00iiO;
/* 172 */               loliolo1io.I010II();
/* 179 */               Context context = ((l0olllO1i) loliolo1io.I00iOIl).I00iOIl;
                        synchronized (lol001iii) {
                            try {
/* 184 */                       if (lol001iii.I00iOIl) {
/* 192 */                           l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) lol001iii.I00iiO.I00iOIl).I00ilO0;
/* 194 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 201 */                           l01o0io1ooo0.I00lll10.I00000oOI("Connection attempt already in progress");
/* 205 */                           return;
                                } else {
/* 211 */                           if (lol001iii.I00iiI != null && (lol001iii.I00iiI.I00100o1O0lo() || lol001iii.I00iiI.I00100l0())) {
/* 235 */                               l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) lol001iii.I00iiO.I00iOIl).I00ilO0;
/* 237 */                               l0olllO1i.I000II(l01o0io1ooo02);
/* 244 */                               l01o0io1ooo02.I00lll10.I00000oOI("Already awaiting connection attempt");
/* 248 */                               return;
                                    }
/* 268 */                           lol001iii.I00iiI = new l00l1OOOl(context, Looper.getMainLooper(), ll0oOilllo.I00000oIO(context), Io0iI1l01il.I00000oOI, 93, lol001iii, lol001iii, null);
/* 276 */                           l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) lol001iii.I00iiO.I00iOIl).I00ilO0;
/* 278 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 285 */                           l01o0io1ooo03.I00lll10.I00000oOI("Connecting to remote service");
/* 288 */                           lol001iii.I00iOIl = true;
/* 292 */                           lII0I0I000I.I000II(lol001iii.I00iiI);
/* 297 */                           lol001iii.I00iiI.I00000oIO();
/* 301 */                           return;
                                }
                            } finally {
                            }
                        }
                    }
/* 24 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 32 */            if (l0olllo1i.I00iio.I010iIIOlo()) {
/* 167 */               return;
                    }
/* 55 */            List<ResolveInfo> listQueryIntentServices = l0olllo1i.I00iOIl.getPackageManager().queryIntentServices(new Intent().setClassName(l0olllo1i.I00iOIl, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
/* 59 */            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 155 */               l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 157 */               l0olllO1i.I000II(l01o0io1ooo04);
/* 164 */               l01o0io1ooo04.I00ilO0.I00000oOI("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
/* 167 */               return;
                    }
/* 71 */            Intent intent = new Intent("com.google.android.gms.measurement.START");
/* 83 */            intent.setComponent(new ComponentName(l0olllo1i.I00iOIl, "com.google.android.gms.measurement.AppMeasurementService"));
/* 86 */            lOl001Iii lol001iii2 = this.I00iiO;
/* 88 */            lOliOlO1Io loliolo1io2 = lol001iii2.I00iiO;
/* 90 */            loliolo1io2.I010II();
/* 97 */            Context context2 = ((l0olllO1i) loliolo1io2.I00iOIl).I00iOIl;
/* 99 */            IOloio1Ili iOloio1IliI00000oOI = IOloio1Ili.I00000oOI();
                    synchronized (lol001iii2) {
                        try {
/* 104 */                   boolean z = lol001iii2.I00iOIl;
/* 106 */                   lOliOlO1Io loliolo1io3 = lol001iii2.I00iiO;
/* 110 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) loliolo1io3.I00iOIl;
/* 112 */                   if (z) {
/* 114 */                       l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i2.I00ilO0;
/* 116 */                       l0olllO1i.I000II(l01o0io1ooo05);
/* 123 */                       l01o0io1ooo05.I00lll10.I00000oOI("Connection attempt already in progress");
                            } else {
/* 130 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i2.I00ilO0;
/* 132 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 139 */                       l01o0io1ooo06.I00lll10.I00000oOI("Using local app measurement service");
/* 142 */                       lol001iii2.I00iOIl = true;
/* 148 */                       iOloio1IliI00000oOI.I00000oIO(context2, intent, loliolo1io3.I00iiO, 129);
                            }
                        } finally {
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I010l1ol111() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 9 */             if (this.I00ilI0I1 == null) {
/* 11 */                I010II();
/* 14 */                I010OIo1l();
/* 19 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 21 */                l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 23 */                l0olllO1i.I0000oI00(l0oi0o);
/* 26 */                l0oi0o.I010II();
/* 39 */                boolean z = false;
/* 52 */                Boolean boolValueOf = !l0oi0o.I010ioo().contains("use_service") ? null : Boolean.valueOf(l0oi0o.I010ioo().getBoolean("use_service", false));
/* 57 */                if (boolValueOf == null || !boolValueOf.booleanValue()) {
/* 71 */                    iooloO1iOil iooloo1ioilI000iOII = ((l0olllO1i) this.I00iOIl).I000iOII();
/* 75 */                    iooloo1ioilI000iOII.I010OIo1l();
/* 80 */                    if (iooloo1ioilI000iOII.I00lll10 == 1) {
/* 82 */                        z = true;
/* 249 */                       if (!z && l0olllo1i.I00iio.I010iIIOlo()) {
/* 259 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 261 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 268 */                           l01o0io1ooo0.I00ilO0.I00000oOI("No way to upload. Consider using the full version of Analytics");
                                } else if (z) {
/* 274 */                           l0Oi0o l0oi0o2 = l0olllo1i.I00ilI0I1;
/* 276 */                           l0olllO1i.I0000oI00(l0oi0o2);
/* 279 */                           l0oi0o2.I010II();
/* 286 */                           SharedPreferences.Editor editorEdit = l0oi0o2.I010ioo().edit();
/* 290 */                           editorEdit.putBoolean("use_service", z);
/* 293 */                           editorEdit.apply();
                                }
/* 296 */                       z = z;
                            } else {
/* 85 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 87 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 94 */                        l01o0io1ooo02.I00lll10.I00000oOI("Checking service availability");
/* 97 */                        lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 99 */                        l0olllO1i.I0000oI00(lioil0ilioi);
/* 113 */                       int iI00000oOI = Io0iI1l01il.I00000oOI.I00000oOI(((l0olllO1i) lioil0ilioi.I00iOIl).I00iOIl, 12451000);
/* 117 */                       if (iI00000oOI != 0) {
/* 119 */                           if (iI00000oOI == 1) {
/* 222 */                               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 224 */                               l0olllO1i.I000II(l01o0io1ooo03);
/* 231 */                               l01o0io1ooo03.I00lll10.I00000oOI("Service missing");
                                    } else if (iI00000oOI != 2) {
/* 125 */                               if (iI00000oOI != 3) {
/* 127 */                                   l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 131 */                                   if (iI00000oOI == 9) {
/* 164 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 171 */                                       l01o0io1ooo04.I00l0I0l0lO1.I00000oOI("Service invalid");
                                            } else if (iI00000oOI != 18) {
/* 137 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 148 */                                       l01o0io1ooo04.I00l0I0l0lO1.I0000Il00O("Unexpected service status", Integer.valueOf(iI00000oOI));
                                            } else {
/* 153 */                                       l0olllO1i.I000II(l01o0io1ooo04);
/* 160 */                                       l01o0io1ooo04.I00l0I0l0lO1.I00000oOI("Service updating");
                                            }
                                        } else {
/* 175 */                                   l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 177 */                                   l0olllO1i.I000II(l01o0io1ooo05);
/* 184 */                                   l01o0io1ooo05.I00l0I0l0lO1.I00000oOI("Service disabled");
                                        }
/* 151 */                               z = false;
                                    } else {
/* 188 */                               l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i.I00ilO0;
/* 190 */                               l0olllO1i.I000II(l01o0io1ooo06);
/* 197 */                               l01o0io1ooo06.I00lli11.I00000oOI("Service container out of date");
/* 200 */                               lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 202 */                               l0olllO1i.I0000oI00(lioil0ilioi2);
/* 211 */                               if (lioil0ilioi2.I01IlIoOI() >= 17443) {
/* 214 */                                   z = boolValueOf == null;
/* 220 */                                   z = false;
                                        }
                                    }
/* 249 */                           if (!z) {
/* 272 */                               if (z) {
                                        }
/* 296 */                               z = z;
                                    }
                                } else {
/* 235 */                           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i.I00ilO0;
/* 237 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 244 */                           l01o0io1ooo07.I00lll10.I00000oOI("Service available");
                                }
/* 82 */                        z = true;
/* 249 */                       if (!z) {
                                }
                            }
                        }
/* 301 */               this.I00ilI0I1 = Boolean.valueOf(z);
                    }
/* 305 */           return this.I00ilI0I1.booleanValue();
                }

                public final void I010lI0oi() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 7 */             lOl001Iii lol001iii = this.I00iiO;
/* 11 */            if (lol001iii.I00iiI != null && (lol001iii.I00iiI.I00100l0() || lol001iii.I00iiI.I00100o1O0lo())) {
/* 31 */                lol001iii.I00iiI.I0000Il00O();
                    }
/* 35 */            lol001iii.I00iiI = null;
                    try {
/* 47 */                IOloio1Ili.I00000oOI().I0000Il00O(((l0olllO1i) this.I00iOIl).I00iOIl, lol001iii);
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                    }
/* 50 */            this.I00iio = null;
                }

                public final boolean I010o0o0oO() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            if (!I010l1ol111()) {
/* 44 */                return true;
                    }
/* 17 */            lioil0ilIOi lioil0ilioi = ((l0olllO1i) this.I00iOIl).I00l0I0l0lO1;
/* 19 */            l0olllO1i.I0000oI00(lioil0ilioi);
                    return lioil0ilioi.I01IlIoOI() >= ((Integer) iol1II1ii1i.I00oliIiO01i.I00000oIO(null)).intValue();
                }

                public final boolean I010oio1OO0() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            if (!I010l1ol111()) {
/* 34 */                return true;
                    }
/* 17 */            lioil0ilIOi lioil0ilioi = ((l0olllO1i) this.I00iOIl).I00l0I0l0lO1;
/* 19 */            l0olllO1i.I0000oI00(lioil0ilioi);
                    return lioil0ilioi.I01IlIoOI() >= 241200;
                }

                public final void I01101IOlO(ComponentName componentName) {
/* 1 */             I010II();
/* 6 */             if (this.I00iio != null) {
/* 9 */                 this.I00iio = null;
/* 15 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 17 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 24 */                l01o0io1ooo0.I00lll10.I0000Il00O("Disconnected from device MeasurementService", componentName);
/* 27 */                I010II();
/* 30 */                I010l1O();
                    }
                }

                public final void I01101olii() {
/* 5 */             ((l0olllO1i) this.I00iOIl).getClass();
                }

                public final void I0110OiO() {
/* 1 */             I010II();
/* 4 */             li1iIiOi10o li1iiioi10o = this.I00ioIO;
/* 6 */             li1iiioi10o.getClass();
/* 13 */            li1iiioi10o.I00000oIO = SystemClock.elapsedRealtime();
/* 19 */            iIl1iil iil1iil = ((l0olllO1i) this.I00iOIl).I00iio;
/* 36 */            this.I00ilO0.I00000oOI(((Long) iol1II1ii1i.I00OilO00Il.I00000oIO(null)).longValue());
                }

                public final void I0110o(Runnable runnable) {
/* 1 */             I010II();
/* 8 */             if (I011IOil()) {
/* 10 */                runnable.run();
/* 13 */                return;
                    }
/* 14 */            ArrayList arrayList = this.I00l0I0l0lO1;
/* 16 */            long size = arrayList.size();
/* 23 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 25 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 31 */            if (size >= 1000) {
/* 33 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 35 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */                l01o0io1ooo0.I00ilO0.I00000oOI("Discarding data. Max runnable queue size reached");
                    } else {
/* 46 */                arrayList.add(runnable);
/* 54 */                this.I00l0OO0IO.I00000oOI(60000L);
/* 57 */                I010l1O();
                    }
                }

                public final void I0111i() {
/* 1 */             I010II();
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 10 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 13 */            IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 15 */            ArrayList arrayList = this.I00l0I0l0lO1;
/* 27 */            iOloiOI1.I0000Il00O("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
/* 30 */            Iterator it = arrayList.iterator();
/* 38 */            while (it.hasNext()) {
                        try {
/* 46 */                    ((Runnable) it.next()).run();
                        } catch (RuntimeException e) {
/* 51 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 53 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 60 */                    l01o0io1ooo02.I00ilO0.I0000Il00O("Task exception while flushing queue", e);
                        }
                    }
/* 64 */            arrayList.clear();
/* 69 */            this.I00l0OO0IO.I0000Il00O();
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final lli10iI I011IO1I11OI(boolean z) {
                    long jAbs;
                    Pair pair;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             l0olllo1i.getClass();
/* 8 */             iooloO1iOil iooloo1ioilI000iOII = l0olllo1i.I000iOII();
/* 12 */            String strI0010I0i = null;
/* 13 */            if (z) {
/* 15 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 17 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 22 */                l0olllO1i l0olllo1i2 = (l0olllO1i) l01o0io1ooo0.I00iOIl;
/* 24 */                l0Oi0o l0oi0o = l0olllo1i2.I00ilI0I1;
/* 26 */                l0olllO1i.I0000oI00(l0oi0o);
/* 31 */                if (l0oi0o.I00ilI0I1 != null) {
/* 35 */                    l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 37 */                    l0olllO1i.I0000oI00(l0oi0o2);
/* 40 */                    I0Oo1I101o i0Oo1I101o = l0oi0o2.I00ilI0I1;
/* 44 */                    l0Oi0o l0oi0o3 = (l0Oi0o) i0Oo1I101o.I0000oI00;
/* 46 */                    l0oi0o3.I010II();
/* 49 */                    l0oi0o3.I010II();
/* 66 */                    long j = ((l0Oi0o) i0Oo1I101o.I0000oI00).I010ioo().getLong((String) i0Oo1I101o.I00000oOI, 0L);
/* 72 */                    if (j == 0) {
/* 74 */                        i0Oo1I101o.I00000oOI();
/* 77 */                        jAbs = 0;
                            } else {
/* 85 */                        ((l0olllO1i) l0oi0o3.I00iOIl).I00li1OI.getClass();
/* 93 */                        jAbs = Math.abs(j - System.currentTimeMillis());
                            }
/* 97 */                    long j2 = i0Oo1I101o.I00000oIO;
/* 101 */                   if (jAbs < j2) {
/* 103 */                       pair = null;
/* 160 */                       if (pair != null) {
                                }
                            } else if (jAbs > j2 + j2) {
/* 110 */                       i0Oo1I101o.I00000oOI();
/* 103 */                       pair = null;
/* 160 */                       if (pair != null && pair != l0Oi0o.I00oliIiO01i) {
/* 169 */                           String strValueOf = String.valueOf(pair.second);
/* 175 */                           String str = (String) pair.first;
/* 199 */                           strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                                }
                            } else {
/* 122 */                       String string = l0oi0o3.I010ioo().getString((String) i0Oo1I101o.I0000O, null);
/* 134 */                       long j3 = l0oi0o3.I010ioo().getLong((String) i0Oo1I101o.I0000Il00O, 0L);
/* 138 */                       i0Oo1I101o.I00000oOI();
/* 158 */                       pair = (string == null || j3 <= 0) ? l0Oi0o.I00oliIiO01i : new Pair(string, Long.valueOf(j3));
/* 160 */                       if (pair != null) {
/* 169 */                           String strValueOf2 = String.valueOf(pair.second);
/* 175 */                           String str2 = (String) pair.first;
/* 199 */                           strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(strValueOf2.length() + 1 + String.valueOf(str2).length()), strValueOf2, ":", str2);
                                }
                            }
                        }
                    }
/* 203 */           return iooloo1ioilI000iOII.I010ioo(strI0010I0i);
                }

                public final boolean I011IOil() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
                    return this.I00iio != null;
                }

                public final void I011Ill() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            if (I010o0o0oO()) {
/* 14 */                lli10iI lli10iiI011IO1I11OI = I011IO1I11OI(false);
/* 22 */                IlloOIoilIl illoOIoilIl = new IlloOIoilIl(12);
/* 25 */                illoOIoilIl.I00iiI = lli10iiI011IO1I11OI;
/* 27 */                illoOIoilIl.I00iiO = this;
/* 29 */                VarHandle.storeStoreFence();
/* 32 */                I0110o(illoOIoilIl);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:172:0x02d3 A[Catch: all -> 0x01f5, SQLiteException -> 0x02ad, SQLiteDatabaseLockedException -> 0x02b2, SQLiteFullException -> 0x02b6, TryCatch #58 {all -> 0x01f5, blocks: (B:104:0x01e4, B:106:0x01e9, B:121:0x0213, B:122:0x0216, B:120:0x020f, B:125:0x021c, B:127:0x0230, B:134:0x0248, B:135:0x0251, B:136:0x0254, B:132:0x0242, B:139:0x0258, B:141:0x026c, B:148:0x0284, B:149:0x028e, B:150:0x0291, B:146:0x027e, B:153:0x0295, B:157:0x02a9, B:172:0x02d3, B:174:0x02dd, B:175:0x02e0, B:170:0x02cd, B:183:0x02ef, B:184:0x02fa, B:209:0x0358), top: B:401:0x01e4 }] */
                /* JADX WARN: Removed duplicated region for block: B:262:0x0438 A[Catch: all -> 0x0474, TRY_ENTER, TryCatch #57 {all -> 0x0474, blocks: (B:272:0x0464, B:262:0x0438, B:264:0x043e, B:265:0x0441, B:282:0x0485, B:211:0x036d, B:213:0x0377, B:218:0x0388), top: B:399:0x0464 }] */
                /* JADX WARN: Removed duplicated region for block: B:267:0x0450  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x046b  */
                /* JADX WARN: Removed duplicated region for block: B:277:0x0470 A[PHI: r5 r10 r23 r24 r26 r36 r37
                  0x0470: PHI (r5v5 int) = (r5v3 int), (r5v3 int), (r5v6 int) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r10v14 android.database.sqlite.SQLiteDatabase) = 
                  (r10v11 android.database.sqlite.SQLiteDatabase)
                  (r10v12 android.database.sqlite.SQLiteDatabase)
                  (r10v15 android.database.sqlite.SQLiteDatabase)
                 binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]
                  0x0470: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:268:0x0453, B:285:0x0497, B:276:0x046e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:284:0x0494  */
                /* JADX WARN: Removed duplicated region for block: B:289:0x04a8  */
                /* JADX WARN: Removed duplicated region for block: B:291:0x04ad  */
                /* JADX WARN: Removed duplicated region for block: B:296:0x04c8  */
                /* JADX WARN: Removed duplicated region for block: B:297:0x04d1  */
                /* JADX WARN: Removed duplicated region for block: B:302:0x04e7  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x04f0  */
                /* JADX WARN: Removed duplicated region for block: B:310:0x0591  */
                /* JADX WARN: Removed duplicated region for block: B:334:0x0602  */
                /* JADX WARN: Removed duplicated region for block: B:450:0x049a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:451:0x049a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:453:0x049a A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I011Io0I1ioi(iolll0ill1i iolll0ill1iVar, I01OlIoIl i01OlIoIl, lli10iI lli10ii) {
                    ArrayList arrayList;
                    Iioi0lilII iioi0lilII;
                    l01O0IO1ooO0 l01o0io1ooo0;
                    int i;
                    int i2;
                    Cursor cursor;
                    SQLiteDatabase sQLiteDatabase;
                    String str;
                    int i3;
                    String str2;
                    String str3;
                    int i4;
                    Cursor cursor2;
                    Cursor cursorQuery;
                    long j;
                    String str4;
                    String[] strArr;
                    int i5;
                    int i6;
                    int i7;
                    long j2;
                    String string;
                    Parcel parcelObtain;
                    ii0il0lOolIo ii0il0loolioCreateFromParcel;
                    int i8;
                    iII000ol000 iii000ol000CreateFromParcel;
                    lio0llOI0 lio0lloi0CreateFromParcel;
                    int size;
                    int size2;
                    int i9;
                    int i10;
                    l01O0IO1ooO0 l01o0io1ooo02;
                    long jElapsedRealtime;
                    long j3;
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 7 */             I01101olii();
/* 15 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 17 */            iIl1iil iil1iil = l0olllo1i.I00iio;
/* 19 */            iIl1iil iil1iil2 = l0olllo1i.I00iio;
/* 21 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 23 */            Iioi0lilII iioi0lilII2 = l0olllo1i.I00li1OI;
/* 27 */            lli10iI lli10ii2 = lli10ii;
/* 29 */            int i11 = 100;
/* 30 */            int i12 = 0;
/* 33 */            for (int i13 = 100; i12 < 1001 && i11 == i13; i13 = 100) {
/* 39 */                ArrayList arrayList2 = new ArrayList();
/* 42 */                l00Ii0II l00ii0iiI000O01llI0 = l0olllo1i.I000O01llI0();
/* 48 */                String str5 = "entry";
/* 50 */                String str6 = "type";
/* 52 */                int i14 = i13;
/* 54 */                String str7 = "rowid";
/* 59 */                l0olllO1i l0olllo1i2 = (l0olllO1i) l00ii0iiI000O01llI0.I00iOIl;
/* 61 */                l00ii0iiI000O01llI0.I010II();
/* 66 */                l0olllO1i l0olllo1i3 = l0olllo1i;
/* 70 */                if (l00ii0iiI000O01llI0.I00iio) {
/* 72 */                    l01o0io1ooo0 = l01o0io1ooo03;
/* 74 */                    iioi0lilII = iioi0lilII2;
/* 76 */                    i = i12;
                        } else {
/* 84 */                    arrayList = new ArrayList();
/* 93 */                    iioi0lilII = iioi0lilII2;
/* 105 */                   if (((l0olllO1i) l00ii0iiI000O01llI0.I00iOIl).I00iOIl.getDatabasePath("google_app_measurement_local.db").exists()) {
/* 107 */                       int i15 = 5;
/* 108 */                       l01o0io1ooo0 = l01o0io1ooo03;
/* 110 */                       int i16 = 5;
/* 111 */                       i = i12;
/* 113 */                       int i17 = 0;
                                while (true) {
/* 114 */                           if (i17 >= i15) {
/* 1202 */                              i2 = 0;
/* 1203 */                              l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 1205 */                              l0olllO1i.I000II(l01o0io1ooo04);
/* 1212 */                              l01o0io1ooo04.I00l0I0l0lO1.I00000oOI("Failed to read events from database in reasonable time");
/* 1215 */                              arrayList = null;
                                        break;
                                    }
                                    try {
/* 117 */                               SQLiteDatabase sQLiteDatabaseI010l1O = l00ii0iiI000O01llI0.I010l1O();
/* 121 */                               if (sQLiteDatabaseI010l1O == null) {
                                            try {
                                                try {
/* 123 */                                           l00ii0iiI000O01llI0.I00iio = true;
                                                    break;
                                                } catch (Throwable th) {
/* 126 */                                           th = th;
/* 127 */                                           sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 1047 */                                          cursor = null;
/* 1191 */                                          if (cursor != null) {
                                                    }
/* 1196 */                                          if (sQLiteDatabase != null) {
                                                    }
/* 1201 */                                          throw th;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused) {
/* 147 */                                       str = str7;
/* 149 */                                       i3 = i17;
/* 151 */                                       str3 = str6;
/* 153 */                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 156 */                                       i4 = 5;
/* 158 */                                       str2 = str5;
/* 1053 */                                      cursor2 = null;
                                                try {
/* 1125 */                                          SystemClock.sleep(i16);
/* 1128 */                                          i16 += 20;
/* 1130 */                                          if (cursor2 != null) {
                                                    }
/* 1135 */                                          if (sQLiteDatabase == null) {
                                                    }
/* 1179 */                                          i17 = i3 + 1;
/* 1181 */                                          i15 = i4;
/* 1183 */                                          str5 = str2;
/* 1185 */                                          str6 = str3;
/* 1187 */                                          str7 = str;
                                                } catch (Throwable th2) {
/* 1141 */                                          th = th2;
/* 919 */                                           cursor = cursor2;
/* 1191 */                                          if (cursor != null) {
/* 1193 */                                              cursor.close();
                                                    }
/* 1196 */                                          if (sQLiteDatabase != null) {
/* 1198 */                                              sQLiteDatabase.close();
                                                    }
/* 1201 */                                          throw th;
                                                }
                                            } catch (SQLiteFullException e) {
/* 162 */                                       e = e;
/* 163 */                                       str = str7;
/* 165 */                                       i3 = i17;
/* 167 */                                       str3 = str6;
/* 169 */                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 172 */                                       i4 = 5;
/* 174 */                                       str2 = str5;
/* 1056 */                                      cursor2 = null;
/* 1158 */                                      l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i2.I00ilO0;
/* 1160 */                                      l0olllO1i.I000II(l01o0io1ooo05);
/* 1165 */                                      l01o0io1ooo05.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                      if (cursor2 != null) {
/* 1173 */                                          cursor2.close();
                                                }
/* 1176 */                                      if (sQLiteDatabase != null) {
                                                }
/* 1179 */                                      i17 = i3 + 1;
/* 1181 */                                      i15 = i4;
/* 1183 */                                      str5 = str2;
/* 1185 */                                      str6 = str3;
/* 1187 */                                      str7 = str;
                                            } catch (SQLiteException e2) {
/* 131 */                                       e = e2;
/* 132 */                                       str = str7;
/* 134 */                                       i3 = i17;
/* 136 */                                       str3 = str6;
/* 138 */                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 141 */                                       i4 = 5;
/* 143 */                                       str2 = str5;
/* 1050 */                                      cursor2 = null;
/* 1079 */                                      if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
/* 1087 */                                          sQLiteDatabase.endTransaction();
                                                }
/* 1090 */                                      l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i2.I00ilO0;
/* 1092 */                                      l0olllO1i.I000II(l01o0io1ooo06);
/* 1097 */                                      l01o0io1ooo06.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                      if (cursor2 != null) {
/* 1105 */                                          cursor2.close();
                                                }
/* 1108 */                                      if (sQLiteDatabase != null) {
                                                }
/* 1179 */                                      i17 = i3 + 1;
/* 1181 */                                      i15 = i4;
/* 1183 */                                      str5 = str2;
/* 1185 */                                      str6 = str3;
/* 1187 */                                      str7 = str;
                                            }
                                        } else {
/* 178 */                                   sQLiteDatabaseI010l1O.beginTransaction();
                                            try {
/* 203 */                                       cursorQuery = sQLiteDatabaseI010l1O.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                                try {
/* 211 */                                           long j4 = -1;
/* 213 */                                           if (cursorQuery.moveToFirst()) {
/* 215 */                                               i3 = i17;
                                                        try {
/* 218 */                                                   j = cursorQuery.getLong(0);
                                                            try {
/* 222 */                                                       cursorQuery.close();
                                                            } catch (SQLiteDatabaseLockedException unused2) {
/* 230 */                                                       str = str7;
/* 151 */                                                       str3 = str6;
/* 153 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 156 */                                                       i4 = 5;
/* 158 */                                                       str2 = str5;
/* 1053 */                                                      cursor2 = null;
/* 1125 */                                                      SystemClock.sleep(i16);
/* 1128 */                                                      i16 += 20;
/* 1130 */                                                      if (cursor2 != null) {
                                                                }
/* 1135 */                                                      if (sQLiteDatabase == null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            } catch (SQLiteFullException e3) {
/* 233 */                                                       e = e3;
/* 234 */                                                       str = str7;
/* 167 */                                                       str3 = str6;
/* 169 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 172 */                                                       i4 = 5;
/* 174 */                                                       str2 = str5;
/* 1056 */                                                      cursor2 = null;
/* 1158 */                                                      l01O0IO1ooO0 l01o0io1ooo052 = l0olllo1i2.I00ilO0;
/* 1160 */                                                      l0olllO1i.I000II(l01o0io1ooo052);
/* 1165 */                                                      l01o0io1ooo052.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                      if (cursor2 != null) {
                                                                }
/* 1176 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            } catch (SQLiteException e4) {
/* 226 */                                                       e = e4;
/* 227 */                                                       str = str7;
/* 136 */                                                       str3 = str6;
/* 138 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 141 */                                                       i4 = 5;
/* 143 */                                                       str2 = str5;
/* 1050 */                                                      cursor2 = null;
/* 1079 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1090 */                                                      l01O0IO1ooO0 l01o0io1ooo062 = l0olllo1i2.I00ilO0;
/* 1092 */                                                      l0olllO1i.I000II(l01o0io1ooo062);
/* 1097 */                                                      l01o0io1ooo062.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                      if (cursor2 != null) {
                                                                }
/* 1108 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            }
                                                        } catch (Throwable th3) {
/* 237 */                                                   th = th3;
/* 238 */                                                   str = str7;
/* 240 */                                                   str3 = str6;
/* 242 */                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 245 */                                                   i4 = 5;
/* 247 */                                                   str2 = str5;
/* 1034 */                                                  if (cursorQuery != null) {
                                                                try {
/* 1036 */                                                          cursorQuery.close();
                                                                } catch (SQLiteDatabaseLockedException unused3) {
/* 1053 */                                                          cursor2 = null;
/* 1125 */                                                          SystemClock.sleep(i16);
/* 1128 */                                                          i16 += 20;
/* 1130 */                                                          if (cursor2 != null) {
                                                                    }
/* 1135 */                                                          if (sQLiteDatabase == null) {
                                                                    }
/* 1179 */                                                          i17 = i3 + 1;
/* 1181 */                                                          i15 = i4;
/* 1183 */                                                          str5 = str2;
/* 1185 */                                                          str6 = str3;
/* 1187 */                                                          str7 = str;
                                                                } catch (SQLiteFullException e5) {
/* 1044 */                                                          e = e5;
/* 1056 */                                                          cursor2 = null;
/* 1158 */                                                          l01O0IO1ooO0 l01o0io1ooo0522 = l0olllo1i2.I00ilO0;
/* 1160 */                                                          l0olllO1i.I000II(l01o0io1ooo0522);
/* 1165 */                                                          l01o0io1ooo0522.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                          l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                          if (cursor2 != null) {
                                                                    }
/* 1176 */                                                          if (sQLiteDatabase != null) {
                                                                    }
/* 1179 */                                                          i17 = i3 + 1;
/* 1181 */                                                          i15 = i4;
/* 1183 */                                                          str5 = str2;
/* 1185 */                                                          str6 = str3;
/* 1187 */                                                          str7 = str;
                                                                } catch (SQLiteException e6) {
/* 1042 */                                                          e = e6;
/* 1050 */                                                          cursor2 = null;
/* 1079 */                                                          if (sQLiteDatabase != null) {
                                                                    }
/* 1090 */                                                          l01O0IO1ooO0 l01o0io1ooo0622 = l0olllo1i2.I00ilO0;
/* 1092 */                                                          l0olllO1i.I000II(l01o0io1ooo0622);
/* 1097 */                                                          l01o0io1ooo0622.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                          l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                          if (cursor2 != null) {
                                                                    }
/* 1108 */                                                          if (sQLiteDatabase != null) {
                                                                    }
/* 1179 */                                                          i17 = i3 + 1;
/* 1181 */                                                          i15 = i4;
/* 1183 */                                                          str5 = str2;
/* 1185 */                                                          str6 = str3;
/* 1187 */                                                          str7 = str;
                                                                } catch (Throwable th4) {
/* 1040 */                                                          th = th4;
/* 1047 */                                                          cursor = null;
/* 1191 */                                                          if (cursor != null) {
                                                                    }
/* 1196 */                                                          if (sQLiteDatabase != null) {
                                                                    }
/* 1201 */                                                          throw th;
                                                                }
                                                            }
/* 1046 */                                                  throw th;
                                                        }
                                                    } else {
/* 251 */                                               i3 = i17;
/* 253 */                                               cursorQuery.close();
/* 256 */                                               j = -1;
                                                    }
/* 260 */                                           if (j != -1) {
/* 262 */                                               str4 = "rowid<?";
/* 265 */                                               strArr = new String[]{String.valueOf(j)};
                                                    } else {
/* 280 */                                               str4 = null;
/* 282 */                                               strArr = null;
                                                    }
                                                    try {
/* 284 */                                               String[] strArr2 = {str7, str6, str5};
/* 288 */                                               iIl1iil iil1iil3 = l0olllo1i2.I00iio;
/* 290 */                                               iol01I0001 iol01i0001 = iol1II1ii1i.I010ioo;
/* 292 */                                               str = str7;
                                                        try {
                                                            try {
/* 299 */                                                       i5 = 4;
/* 301 */                                                       i6 = 3;
/* 304 */                                                       if (iil1iil3.I01101IOlO(null, iol01i0001)) {
/* 306 */                                                           i7 = 5;
                                                                    try {
/* 307 */                                                               strArr2 = new String[]{str, str6, str5, "app_version", "app_version_int"};
                                                                    } catch (SQLiteDatabaseLockedException unused4) {
/* 340 */                                                               i4 = 5;
/* 342 */                                                               str3 = str6;
/* 344 */                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 158 */                                                               str2 = str5;
/* 1053 */                                                              cursor2 = null;
/* 1125 */                                                              SystemClock.sleep(i16);
/* 1128 */                                                              i16 += 20;
/* 1130 */                                                              if (cursor2 != null) {
                                                                        }
/* 1135 */                                                              if (sQLiteDatabase == null) {
                                                                        }
/* 1179 */                                                              i17 = i3 + 1;
/* 1181 */                                                              i15 = i4;
/* 1183 */                                                              str5 = str2;
/* 1185 */                                                              str6 = str3;
/* 1187 */                                                              str7 = str;
                                                                    } catch (SQLiteFullException e7) {
/* 349 */                                                               e = e7;
/* 350 */                                                               i4 = 5;
/* 352 */                                                               str3 = str6;
/* 354 */                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 174 */                                                               str2 = str5;
/* 1056 */                                                              cursor2 = null;
/* 1158 */                                                              l01O0IO1ooO0 l01o0io1ooo05222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                              l0olllO1i.I000II(l01o0io1ooo05222);
/* 1165 */                                                              l01o0io1ooo05222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                              l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                              if (cursor2 != null) {
                                                                        }
/* 1176 */                                                              if (sQLiteDatabase != null) {
                                                                        }
/* 1179 */                                                              i17 = i3 + 1;
/* 1181 */                                                              i15 = i4;
/* 1183 */                                                              str5 = str2;
/* 1185 */                                                              str6 = str3;
/* 1187 */                                                              str7 = str;
                                                                    } catch (SQLiteException e8) {
/* 330 */                                                               e = e8;
/* 331 */                                                               i4 = 5;
/* 333 */                                                               str3 = str6;
/* 335 */                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 143 */                                                               str2 = str5;
/* 1050 */                                                              cursor2 = null;
/* 1079 */                                                              if (sQLiteDatabase != null) {
                                                                        }
/* 1090 */                                                              l01O0IO1ooO0 l01o0io1ooo06222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                              l0olllO1i.I000II(l01o0io1ooo06222);
/* 1097 */                                                              l01o0io1ooo06222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                              l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                              if (cursor2 != null) {
                                                                        }
/* 1108 */                                                              if (sQLiteDatabase != null) {
                                                                        }
/* 1179 */                                                              i17 = i3 + 1;
/* 1181 */                                                              i15 = i4;
/* 1183 */                                                              str5 = str2;
/* 1185 */                                                              str6 = str3;
/* 1187 */                                                              str7 = str;
                                                                    }
                                                                } else {
/* 359 */                                                           i7 = 5;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused5) {
/* 972 */                                                       str3 = str6;
/* 974 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 977 */                                                       str2 = str5;
/* 979 */                                                       i4 = 5;
/* 1053 */                                                      cursor2 = null;
/* 1125 */                                                      SystemClock.sleep(i16);
/* 1128 */                                                      i16 += 20;
/* 1130 */                                                      if (cursor2 != null) {
/* 1132 */                                                          cursor2.close();
                                                                }
/* 1135 */                                                      if (sQLiteDatabase == null) {
/* 1137 */                                                          sQLiteDatabase.close();
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            }
                                                            try {
/* 373 */                                                       Cursor cursorQuery2 = sQLiteDatabaseI010l1O.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i14));
/* 383 */                                                       while (cursorQuery2.moveToNext()) {
                                                                    try {
                                                                        try {
                                                                            try {
/* 386 */                                                                       j4 = cursorQuery2.getLong(0);
                                                                                try {
/* 391 */                                                                           int i18 = cursorQuery2.getInt(1);
/* 395 */                                                                           str2 = str5;
                                                                                    try {
/* 398 */                                                                               byte[] blob = cursorQuery2.getBlob(2);
/* 404 */                                                                               str3 = str6;
                                                                                        try {
/* 411 */                                                                                   if (l0olllo1i2.I00iio.I01101IOlO(null, iol01i0001)) {
                                                                                                try {
/* 415 */                                                                                           string = cursorQuery2.getString(i6);
/* 421 */                                                                                           j2 = cursorQuery2.getLong(i5);
                                                                                                } catch (SQLiteDatabaseLockedException unused6) {
/* 443 */                                                                                           cursor2 = cursorQuery2;
/* 445 */                                                                                           sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 944 */                                                                                           i4 = 5;
/* 1125 */                                                                                          SystemClock.sleep(i16);
/* 1128 */                                                                                          i16 += 20;
/* 1130 */                                                                                          if (cursor2 != null) {
                                                                                                    }
/* 1135 */                                                                                          if (sQLiteDatabase == null) {
                                                                                                    }
/* 1179 */                                                                                          i17 = i3 + 1;
/* 1181 */                                                                                          i15 = i4;
/* 1183 */                                                                                          str5 = str2;
/* 1185 */                                                                                          str6 = str3;
/* 1187 */                                                                                          str7 = str;
                                                                                                } catch (SQLiteFullException e9) {
/* 450 */                                                                                           e = e9;
/* 451 */                                                                                           cursor2 = cursorQuery2;
/* 453 */                                                                                           sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 957 */                                                                                           i4 = 5;
/* 1158 */                                                                                          l01O0IO1ooO0 l01o0io1ooo052222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                                                          l0olllO1i.I000II(l01o0io1ooo052222);
/* 1165 */                                                                                          l01o0io1ooo052222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                                                          l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                                                          if (cursor2 != null) {
                                                                                                    }
/* 1176 */                                                                                          if (sQLiteDatabase != null) {
                                                                                                    }
/* 1179 */                                                                                          i17 = i3 + 1;
/* 1181 */                                                                                          i15 = i4;
/* 1183 */                                                                                          str5 = str2;
/* 1185 */                                                                                          str6 = str3;
/* 1187 */                                                                                          str7 = str;
                                                                                                } catch (SQLiteException e10) {
/* 435 */                                                                                           e = e10;
/* 436 */                                                                                           cursor2 = cursorQuery2;
/* 438 */                                                                                           sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 932 */                                                                                           i4 = 5;
/* 1079 */                                                                                          if (sQLiteDatabase != null) {
                                                                                                    }
/* 1090 */                                                                                          l01O0IO1ooO0 l01o0io1ooo062222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                                                          l0olllO1i.I000II(l01o0io1ooo062222);
/* 1097 */                                                                                          l01o0io1ooo062222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                                                          l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                                                          if (cursor2 != null) {
                                                                                                    }
/* 1108 */                                                                                          if (sQLiteDatabase != null) {
                                                                                                    }
/* 1179 */                                                                                          i17 = i3 + 1;
/* 1181 */                                                                                          i15 = i4;
/* 1183 */                                                                                          str5 = str2;
/* 1185 */                                                                                          str6 = str3;
/* 1187 */                                                                                          str7 = str;
                                                                                                }
                                                                                            } else {
/* 458 */                                                                                       j2 = 0;
/* 460 */                                                                                       string = null;
                                                                                            }
/* 461 */                                                                                   if (i18 == 0) {
/* 463 */                                                                                       parcelObtain = Parcel.obtain();
                                                                                                try {
/* 468 */                                                                                           cursor2 = cursorQuery2;
                                                                                                    try {
                                                                                                        try {
/* 471 */                                                                                                   parcelObtain.unmarshall(blob, 0, blob.length);
/* 474 */                                                                                                   parcelObtain.setDataPosition(0);
/* 479 */                                                                                                   ii0oooi0IO0l ii0oooi0io0lCreateFromParcel = ii0oooi0IO0l.CREATOR.createFromParcel(parcelObtain);
                                                                                                            try {
                                                                                                                try {
/* 488 */                                                                                                           if (ii0oooi0io0lCreateFromParcel != null) {
/* 495 */                                                                                                               arrayList.add(new l001OIi(ii0oooi0io0lCreateFromParcel, string, j2));
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
/* 502 */                                                                                                           th = th5;
/* 431 */                                                                                                           sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 919 */                                                                                                           cursor = cursor2;
/* 1191 */                                                                                                          if (cursor != null) {
                                                                                                                    }
/* 1196 */                                                                                                          if (sQLiteDatabase != null) {
                                                                                                                    }
/* 1201 */                                                                                                          throw th;
                                                                                                                }
                                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
/* 445 */                                                                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 944 */                                                                                                       i4 = 5;
/* 1125 */                                                                                                      SystemClock.sleep(i16);
/* 1128 */                                                                                                      i16 += 20;
/* 1130 */                                                                                                      if (cursor2 != null) {
                                                                                                                }
/* 1135 */                                                                                                      if (sQLiteDatabase == null) {
                                                                                                                }
/* 1179 */                                                                                                      i17 = i3 + 1;
/* 1181 */                                                                                                      i15 = i4;
/* 1183 */                                                                                                      str5 = str2;
/* 1185 */                                                                                                      str6 = str3;
/* 1187 */                                                                                                      str7 = str;
                                                                                                            } catch (SQLiteFullException e11) {
/* 506 */                                                                                                       e = e11;
/* 453 */                                                                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 957 */                                                                                                       i4 = 5;
/* 1158 */                                                                                                      l01O0IO1ooO0 l01o0io1ooo0522222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                                                                      l0olllO1i.I000II(l01o0io1ooo0522222);
/* 1165 */                                                                                                      l01o0io1ooo0522222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                                                                      if (cursor2 != null) {
                                                                                                                }
/* 1176 */                                                                                                      if (sQLiteDatabase != null) {
                                                                                                                }
/* 1179 */                                                                                                      i17 = i3 + 1;
/* 1181 */                                                                                                      i15 = i4;
/* 1183 */                                                                                                      str5 = str2;
/* 1185 */                                                                                                      str6 = str3;
/* 1187 */                                                                                                      str7 = str;
                                                                                                            } catch (SQLiteException e12) {
/* 504 */                                                                                                       e = e12;
/* 438 */                                                                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 932 */                                                                                                       i4 = 5;
/* 1079 */                                                                                                      if (sQLiteDatabase != null) {
/* 1087 */                                                                                                          sQLiteDatabase.endTransaction();
                                                                                                                }
/* 1090 */                                                                                                      l01O0IO1ooO0 l01o0io1ooo0622222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                                                                      l0olllO1i.I000II(l01o0io1ooo0622222);
/* 1097 */                                                                                                      l01o0io1ooo0622222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                                                                      if (cursor2 != null) {
                                                                                                                }
/* 1108 */                                                                                                      if (sQLiteDatabase != null) {
                                                                                                                }
/* 1179 */                                                                                                      i17 = i3 + 1;
/* 1181 */                                                                                                      i15 = i4;
/* 1183 */                                                                                                      str5 = str2;
/* 1185 */                                                                                                      str6 = str3;
/* 1187 */                                                                                                      str7 = str;
                                                                                                            }
                                                                                                        } catch (OiIi1iiiil01 unused8) {
/* 516 */                                                                                                   l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i2.I00ilO0;
/* 518 */                                                                                                   l0olllO1i.I000II(l01o0io1ooo07);
/* 525 */                                                                                                   l01o0io1ooo07.I00ilO0.I00000oOI("Failed to load event from local database");
/* 528 */                                                                                                   parcelObtain.recycle();
/* 498 */                                                                                                   i8 = 3;
/* 773 */                                                                                                   i6 = i8;
/* 775 */                                                                                                   str5 = str2;
/* 777 */                                                                                                   str6 = str3;
/* 779 */                                                                                                   cursorQuery2 = cursor2;
/* 782 */                                                                                                   i5 = 4;
                                                                                                        }
                                                                                                    } catch (Throwable th6) {
/* 508 */                                                                                               th = th6;
/* 535 */                                                                                               throw th;
                                                                                                    }
                                                                                                } catch (OiIi1iiiil01 unused9) {
/* 514 */                                                                                           cursor2 = cursorQuery2;
                                                                                                } catch (Throwable th7) {
/* 510 */                                                                                           th = th7;
                                                                                                }
                                                                                            } else {
/* 536 */                                                                                       cursor2 = cursorQuery2;
/* 539 */                                                                                       if (i18 == 1) {
/* 541 */                                                                                           parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
/* 547 */                                                                                                   parcelObtain.unmarshall(blob, 0, blob.length);
/* 550 */                                                                                                   parcelObtain.setDataPosition(0);
/* 555 */                                                                                                   lio0lloi0CreateFromParcel = lio0llOI0.CREATOR.createFromParcel(parcelObtain);
                                                                                                        } finally {
                                                                                                        }
                                                                                                    } catch (OiIi1iiiil01 unused10) {
/* 567 */                                                                                               l01O0IO1ooO0 l01o0io1ooo08 = l0olllo1i2.I00ilO0;
/* 569 */                                                                                               l0olllO1i.I000II(l01o0io1ooo08);
/* 576 */                                                                                               l01o0io1ooo08.I00ilO0.I00000oOI("Failed to load user property from local database");
/* 579 */                                                                                               parcelObtain.recycle();
/* 582 */                                                                                               lio0lloi0CreateFromParcel = null;
                                                                                                    }
/* 583 */                                                                                           if (lio0lloi0CreateFromParcel != null) {
/* 590 */                                                                                               arrayList.add(new l001OIi(lio0lloi0CreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } else if (i18 == 2) {
/* 601 */                                                                                           parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
/* 607 */                                                                                                   parcelObtain.unmarshall(blob, 0, blob.length);
/* 610 */                                                                                                   parcelObtain.setDataPosition(0);
/* 615 */                                                                                                   iii000ol000CreateFromParcel = iII000ol000.CREATOR.createFromParcel(parcelObtain);
                                                                                                        } catch (OiIi1iiiil01 unused11) {
/* 627 */                                                                                                   l01O0IO1ooO0 l01o0io1ooo09 = l0olllo1i2.I00ilO0;
/* 629 */                                                                                                   l0olllO1i.I000II(l01o0io1ooo09);
/* 636 */                                                                                                   l01o0io1ooo09.I00ilO0.I00000oOI("Failed to load conditional user property from local database");
/* 639 */                                                                                                   parcelObtain.recycle();
/* 642 */                                                                                                   iii000ol000CreateFromParcel = null;
                                                                                                        }
/* 643 */                                                                                               if (iii000ol000CreateFromParcel != null) {
/* 650 */                                                                                                   arrayList.add(new l001OIi(iii000ol000CreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } finally {
                                                                                                    }
                                                                                                } else {
/* 660 */                                                                                           if (i18 == 4) {
                                                                                                        try {
/* 662 */                                                                                                   parcelObtain = Parcel.obtain();
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
/* 668 */                                                                                                               parcelObtain.unmarshall(blob, 0, blob.length);
/* 671 */                                                                                                               parcelObtain.setDataPosition(0);
/* 676 */                                                                                                               ii0il0loolioCreateFromParcel = ii0il0lOolIo.CREATOR.createFromParcel(parcelObtain);
                                                                                                                    } catch (Throwable th8) {
/* 700 */                                                                                                               th = th8;
/* 737 */                                                                                                               throw th;
                                                                                                                    }
                                                                                                                } catch (OiIi1iiiil01 unused12) {
/* 706 */                                                                                                           l01O0IO1ooO0 l01o0io1ooo010 = l0olllo1i2.I00ilO0;
/* 708 */                                                                                                           l0olllO1i.I000II(l01o0io1ooo010);
/* 715 */                                                                                                           l01o0io1ooo010.I00ilO0.I00000oOI("Failed to load default event parameters from local database");
/* 718 */                                                                                                           parcelObtain.recycle();
/* 721 */                                                                                                           ii0il0loolioCreateFromParcel = null;
/* 722 */                                                                                                           if (ii0il0loolioCreateFromParcel != null) {
                                                                                                                    }
/* 732 */                                                                                                           i8 = 3;
/* 773 */                                                                                                           i6 = i8;
/* 775 */                                                                                                           str5 = str2;
/* 777 */                                                                                                           str6 = str3;
/* 779 */                                                                                                           cursorQuery2 = cursor2;
/* 782 */                                                                                                           i5 = 4;
                                                                                                                }
                                                                                                            } catch (OiIi1iiiil01 unused13) {
                                                                                                            } catch (Throwable th9) {
/* 702 */                                                                                                       th = th9;
                                                                                                            }
                                                                                                        } catch (SQLiteDatabaseLockedException unused14) {
/* 691 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 944 */                                                                                                   i4 = 5;
/* 1125 */                                                                                                  SystemClock.sleep(i16);
/* 1128 */                                                                                                  i16 += 20;
/* 1130 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1135 */                                                                                                  if (sQLiteDatabase == null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        } catch (SQLiteFullException e13) {
/* 743 */                                                                                                   e = e13;
/* 696 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 957 */                                                                                                   i4 = 5;
/* 1158 */                                                                                                  l01O0IO1ooO0 l01o0io1ooo05222222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                                                                  l0olllO1i.I000II(l01o0io1ooo05222222);
/* 1165 */                                                                                                  l01o0io1ooo05222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1176 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        } catch (SQLiteException e14) {
/* 738 */                                                                                                   e = e14;
/* 687 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 932 */                                                                                                   i4 = 5;
/* 1079 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1090 */                                                                                                  l01O0IO1ooO0 l01o0io1ooo06222222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                                                                  l0olllO1i.I000II(l01o0io1ooo06222222);
/* 1097 */                                                                                                  l01o0io1ooo06222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1108 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        }
                                                                                                        try {
/* 722 */                                                                                                   if (ii0il0loolioCreateFromParcel != null) {
/* 729 */                                                                                                       arrayList.add(new l001OIi(ii0il0loolioCreateFromParcel, string, j2));
                                                                                                            }
/* 732 */                                                                                                   i8 = 3;
                                                                                                        } catch (SQLiteDatabaseLockedException unused15) {
/* 691 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 944 */                                                                                                   i4 = 5;
/* 1125 */                                                                                                  SystemClock.sleep(i16);
/* 1128 */                                                                                                  i16 += 20;
/* 1130 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1135 */                                                                                                  if (sQLiteDatabase == null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        } catch (SQLiteFullException e15) {
/* 695 */                                                                                                   e = e15;
/* 696 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 957 */                                                                                                   i4 = 5;
/* 1158 */                                                                                                  l01O0IO1ooO0 l01o0io1ooo052222222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                                                                  l0olllO1i.I000II(l01o0io1ooo052222222);
/* 1165 */                                                                                                  l01o0io1ooo052222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1176 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        } catch (SQLiteException e16) {
/* 686 */                                                                                                   e = e16;
/* 687 */                                                                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 932 */                                                                                                   i4 = 5;
/* 1079 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1090 */                                                                                                  l01O0IO1ooO0 l01o0io1ooo062222222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                                                                  l0olllO1i.I000II(l01o0io1ooo062222222);
/* 1097 */                                                                                                  l01o0io1ooo062222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                                                                  if (cursor2 != null) {
                                                                                                            }
/* 1108 */                                                                                                  if (sQLiteDatabase != null) {
                                                                                                            }
/* 1179 */                                                                                                  i17 = i3 + 1;
/* 1181 */                                                                                                  i15 = i4;
/* 1183 */                                                                                                  str5 = str2;
/* 1185 */                                                                                                  str6 = str3;
/* 1187 */                                                                                                  str7 = str;
                                                                                                        }
                                                                                                    } else {
/* 747 */                                                                                               l01O0IO1ooO0 l01o0io1ooo011 = l0olllo1i2.I00ilO0;
/* 749 */                                                                                               i8 = 3;
/* 750 */                                                                                               if (i18 == 3) {
/* 752 */                                                                                                   l0olllO1i.I000II(l01o0io1ooo011);
/* 759 */                                                                                                   l01o0io1ooo011.I00lll10.I00000oOI("Skipping app launch break");
                                                                                                        } else {
/* 763 */                                                                                                   l0olllO1i.I000II(l01o0io1ooo011);
/* 770 */                                                                                                   l01o0io1ooo011.I00ilO0.I00000oOI("Unknown record type in local database");
                                                                                                        }
                                                                                                    }
/* 773 */                                                                                           i6 = i8;
/* 775 */                                                                                           str5 = str2;
/* 777 */                                                                                           str6 = str3;
/* 779 */                                                                                           cursorQuery2 = cursor2;
/* 782 */                                                                                           i5 = 4;
                                                                                                }
                                                                                            }
/* 498 */                                                                                   i8 = 3;
/* 773 */                                                                                   i6 = i8;
/* 775 */                                                                                   str5 = str2;
/* 777 */                                                                                   str6 = str3;
/* 779 */                                                                                   cursorQuery2 = cursor2;
/* 782 */                                                                                   i5 = 4;
                                                                                        } catch (SQLiteDatabaseLockedException unused16) {
/* 790 */                                                                                   cursor2 = cursorQuery2;
                                                                                        } catch (SQLiteFullException e17) {
/* 793 */                                                                                   e = e17;
/* 794 */                                                                                   cursor2 = cursorQuery2;
                                                                                        } catch (SQLiteException e18) {
/* 786 */                                                                                   e = e18;
/* 787 */                                                                                   cursor2 = cursorQuery2;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused17) {
/* 803 */                                                                               cursor2 = cursorQuery2;
/* 805 */                                                                               str3 = str6;
/* 691 */                                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 944 */                                                                               i4 = 5;
/* 1125 */                                                                              SystemClock.sleep(i16);
/* 1128 */                                                                              i16 += 20;
/* 1130 */                                                                              if (cursor2 != null) {
                                                                                        }
/* 1135 */                                                                              if (sQLiteDatabase == null) {
                                                                                        }
/* 1179 */                                                                              i17 = i3 + 1;
/* 1181 */                                                                              i15 = i4;
/* 1183 */                                                                              str5 = str2;
/* 1185 */                                                                              str6 = str3;
/* 1187 */                                                                              str7 = str;
                                                                                    } catch (SQLiteFullException e19) {
/* 808 */                                                                               e = e19;
/* 809 */                                                                               cursor2 = cursorQuery2;
/* 811 */                                                                               str3 = str6;
/* 696 */                                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 957 */                                                                               i4 = 5;
/* 1158 */                                                                              l01O0IO1ooO0 l01o0io1ooo0522222222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                                              l0olllO1i.I000II(l01o0io1ooo0522222222);
/* 1165 */                                                                              l01o0io1ooo0522222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                                              l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                                              if (cursor2 != null) {
                                                                                        }
/* 1176 */                                                                              if (sQLiteDatabase != null) {
                                                                                        }
/* 1179 */                                                                              i17 = i3 + 1;
/* 1181 */                                                                              i15 = i4;
/* 1183 */                                                                              str5 = str2;
/* 1185 */                                                                              str6 = str3;
/* 1187 */                                                                              str7 = str;
                                                                                    } catch (SQLiteException e20) {
/* 797 */                                                                               e = e20;
/* 798 */                                                                               cursor2 = cursorQuery2;
/* 800 */                                                                               str3 = str6;
/* 687 */                                                                               sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 932 */                                                                               i4 = 5;
/* 1079 */                                                                              if (sQLiteDatabase != null) {
                                                                                        }
/* 1090 */                                                                              l01O0IO1ooO0 l01o0io1ooo0622222222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                                              l0olllO1i.I000II(l01o0io1ooo0622222222);
/* 1097 */                                                                              l01o0io1ooo0622222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                                              l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                                              if (cursor2 != null) {
                                                                                        }
/* 1108 */                                                                              if (sQLiteDatabase != null) {
                                                                                        }
/* 1179 */                                                                              i17 = i3 + 1;
/* 1181 */                                                                              i15 = i4;
/* 1183 */                                                                              str5 = str2;
/* 1185 */                                                                              str6 = str3;
/* 1187 */                                                                              str7 = str;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused18) {
/* 820 */                                                                           cursor2 = cursorQuery2;
/* 822 */                                                                           str2 = str5;
                                                                                } catch (SQLiteFullException e21) {
/* 825 */                                                                           e = e21;
/* 826 */                                                                           cursor2 = cursorQuery2;
/* 828 */                                                                           str2 = str5;
                                                                                } catch (SQLiteException e22) {
/* 814 */                                                                           e = e22;
/* 815 */                                                                           cursor2 = cursorQuery2;
/* 817 */                                                                           str2 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused19) {
/* 840 */                                                                       cursor2 = cursorQuery2;
/* 842 */                                                                       str2 = str5;
/* 844 */                                                                       str3 = str6;
                                                                            } catch (SQLiteFullException e23) {
/* 848 */                                                                       e = e23;
/* 849 */                                                                       cursor2 = cursorQuery2;
/* 851 */                                                                       str2 = str5;
/* 853 */                                                                       str3 = str6;
                                                                            } catch (SQLiteException e24) {
/* 831 */                                                                       e = e24;
/* 832 */                                                                       cursor2 = cursorQuery2;
/* 834 */                                                                       str2 = str5;
/* 836 */                                                                       str3 = str6;
                                                                            }
                                                                        } catch (Throwable th10) {
/* 428 */                                                                   th = th10;
/* 429 */                                                                   cursor2 = cursorQuery2;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused20) {
/* 936 */                                                               cursor2 = cursorQuery2;
/* 938 */                                                               str2 = str5;
/* 940 */                                                               str3 = str6;
                                                                    } catch (SQLiteFullException e25) {
/* 948 */                                                               e = e25;
/* 949 */                                                               cursor2 = cursorQuery2;
/* 951 */                                                               str2 = str5;
/* 953 */                                                               str3 = str6;
                                                                    } catch (SQLiteException e26) {
/* 923 */                                                               e = e26;
/* 924 */                                                               cursor2 = cursorQuery2;
/* 926 */                                                               str2 = str5;
/* 928 */                                                               str3 = str6;
                                                                    }
                                                                }
/* 857 */                                                       cursor2 = cursorQuery2;
/* 859 */                                                       str2 = str5;
/* 861 */                                                       str3 = str6;
/* 863 */                                                       i2 = 0;
/* 876 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
                                                            } catch (SQLiteDatabaseLockedException unused21) {
/* 993 */                                                       str3 = str6;
/* 995 */                                                       sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 998 */                                                       str2 = str5;
/* 1000 */                                                      i4 = i7;
/* 1053 */                                                      cursor2 = null;
/* 1125 */                                                      SystemClock.sleep(i16);
/* 1128 */                                                      i16 += 20;
/* 1130 */                                                      if (cursor2 != null) {
                                                                }
/* 1135 */                                                      if (sQLiteDatabase == null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            }
                                                            try {
/* 886 */                                                       if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
/* 888 */                                                           l01O0IO1ooO0 l01o0io1ooo012 = l0olllo1i2.I00ilO0;
/* 890 */                                                           l0olllO1i.I000II(l01o0io1ooo012);
/* 897 */                                                           l01o0io1ooo012.I00ilO0.I00000oOI("Fewer entries removed from local database than expected");
                                                                }
/* 905 */                                                       sQLiteDatabase.setTransactionSuccessful();
/* 908 */                                                       sQLiteDatabase.endTransaction();
/* 911 */                                                       cursor2.close();
/* 914 */                                                       sQLiteDatabase.close();
                                                            } catch (SQLiteDatabaseLockedException unused22) {
/* 944 */                                                       i4 = 5;
/* 1125 */                                                      SystemClock.sleep(i16);
/* 1128 */                                                      i16 += 20;
/* 1130 */                                                      if (cursor2 != null) {
                                                                }
/* 1135 */                                                      if (sQLiteDatabase == null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            } catch (SQLiteFullException e27) {
/* 903 */                                                       e = e27;
/* 957 */                                                       i4 = 5;
/* 1158 */                                                      l01O0IO1ooO0 l01o0io1ooo05222222222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                      l0olllO1i.I000II(l01o0io1ooo05222222222);
/* 1165 */                                                      l01o0io1ooo05222222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                      if (cursor2 != null) {
                                                                }
/* 1176 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            } catch (SQLiteException e28) {
/* 901 */                                                       e = e28;
/* 932 */                                                       i4 = 5;
/* 1079 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1090 */                                                      l01O0IO1ooO0 l01o0io1ooo06222222222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                      l0olllO1i.I000II(l01o0io1ooo06222222222);
/* 1097 */                                                      l01o0io1ooo06222222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                      l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                      if (cursor2 != null) {
                                                                }
/* 1108 */                                                      if (sQLiteDatabase != null) {
                                                                }
/* 1179 */                                                      i17 = i3 + 1;
/* 1181 */                                                      i15 = i4;
/* 1183 */                                                      str5 = str2;
/* 1185 */                                                      str6 = str3;
/* 1187 */                                                      str7 = str;
                                                            }
                                                        } catch (SQLiteFullException e29) {
/* 982 */                                                   e = e29;
/* 983 */                                                   str3 = str6;
/* 985 */                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 988 */                                                   str2 = str5;
/* 990 */                                                   i4 = 5;
/* 1056 */                                                  cursor2 = null;
/* 1158 */                                                  l01O0IO1ooO0 l01o0io1ooo052222222222 = l0olllo1i2.I00ilO0;
/* 1160 */                                                  l0olllO1i.I000II(l01o0io1ooo052222222222);
/* 1165 */                                                  l01o0io1ooo052222222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1169 */                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1171 */                                                  if (cursor2 != null) {
                                                            }
/* 1176 */                                                  if (sQLiteDatabase != null) {
                                                            }
/* 1179 */                                                  i17 = i3 + 1;
/* 1181 */                                                  i15 = i4;
/* 1183 */                                                  str5 = str2;
/* 1185 */                                                  str6 = str3;
/* 1187 */                                                  str7 = str;
                                                        } catch (SQLiteException e30) {
/* 961 */                                                   e = e30;
/* 962 */                                                   str3 = str6;
/* 964 */                                                   sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 967 */                                                   str2 = str5;
/* 969 */                                                   i4 = 5;
/* 1050 */                                                  cursor2 = null;
/* 1079 */                                                  if (sQLiteDatabase != null) {
                                                            }
/* 1090 */                                                  l01O0IO1ooO0 l01o0io1ooo062222222222 = l0olllo1i2.I00ilO0;
/* 1092 */                                                  l0olllO1i.I000II(l01o0io1ooo062222222222);
/* 1097 */                                                  l01o0io1ooo062222222222.I00ilO0.I0000Il00O("Error reading entries from local database", e);
/* 1101 */                                                  l00ii0iiI000O01llI0.I00iio = true;
/* 1103 */                                                  if (cursor2 != null) {
                                                            }
/* 1108 */                                                  if (sQLiteDatabase != null) {
                                                            }
/* 1179 */                                                  i17 = i3 + 1;
/* 1181 */                                                  i15 = i4;
/* 1183 */                                                  str5 = str2;
/* 1185 */                                                  str6 = str3;
/* 1187 */                                                  str7 = str;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused23) {
/* 1007 */                                              str = str7;
                                                    } catch (SQLiteFullException e31) {
/* 1010 */                                              e = e31;
/* 1011 */                                              str = str7;
                                                    } catch (SQLiteException e32) {
/* 1003 */                                              e = e32;
/* 1004 */                                              str = str7;
                                                    }
                                                } catch (Throwable th11) {
/* 1014 */                                          th = th11;
/* 1015 */                                          i3 = i17;
                                                }
                                            } catch (Throwable th12) {
/* 1019 */                                      th = th12;
/* 1020 */                                      str = str7;
/* 1022 */                                      i3 = i17;
/* 1024 */                                      str3 = str6;
/* 1026 */                                      sQLiteDatabase = sQLiteDatabaseI010l1O;
/* 1029 */                                      i4 = 5;
/* 1031 */                                      str2 = str5;
/* 1033 */                                      cursorQuery = null;
                                            }
                                        }
                                    } catch (SQLiteDatabaseLockedException unused24) {
/* 1111 */                              str = str7;
/* 1113 */                              i3 = i17;
/* 1115 */                              str2 = str5;
/* 1117 */                              str3 = str6;
/* 1120 */                              i4 = 5;
/* 1122 */                              sQLiteDatabase = null;
                                    } catch (SQLiteFullException e33) {
/* 1144 */                              e = e33;
/* 1145 */                              str = str7;
/* 1147 */                              i3 = i17;
/* 1149 */                              str2 = str5;
/* 1151 */                              str3 = str6;
/* 1154 */                              i4 = 5;
/* 1156 */                              sQLiteDatabase = null;
                                    } catch (SQLiteException e34) {
/* 1065 */                              e = e34;
/* 1066 */                              str = str7;
/* 1068 */                              i3 = i17;
/* 1070 */                              str2 = str5;
/* 1072 */                              str3 = str6;
/* 1075 */                              i4 = 5;
/* 1077 */                              sQLiteDatabase = null;
                                    } catch (Throwable th13) {
/* 1060 */                              th = th13;
/* 1061 */                              cursor = null;
/* 1062 */                              sQLiteDatabase = null;
                                    }
/* 1179 */                          i17 = i3 + 1;
/* 1181 */                          i15 = i4;
/* 1183 */                          str5 = str2;
/* 1185 */                          str6 = str3;
/* 1187 */                          str7 = str;
                                }
                            } else {
/* 1217 */                      l01o0io1ooo0 = l01o0io1ooo03;
/* 1219 */                      i = i12;
/* 79 */                        i2 = 0;
/* 1223 */                      if (arrayList == null) {
/* 1225 */                          arrayList2.addAll(arrayList);
/* 1228 */                          size = arrayList.size();
                                } else {
/* 1234 */                          size = i2;
                                }
/* 1237 */                      if (i01OlIoIl == null && size < i14) {
/* 1252 */                          arrayList2.add(new l001OIi(i01OlIoIl, lli10ii2.I00iiO, lli10ii2.I00l0OO0IO));
                                }
/* 1258 */                      size2 = arrayList2.size();
/* 1262 */                      i9 = i2;
/* 1263 */                      while (i9 < size2) {
/* 1269 */                          l001OIi l001oii = (l001OIi) arrayList2.get(i9);
/* 1271 */                          I01OlIoIl i01OlIoIl2 = l001oii.I00000oIO;
/* 1273 */                          iol01I0001 iol01i00012 = iol1II1ii1i.I010ioo;
/* 1280 */                          if (iil1iil2.I01101IOlO(null, iol01i00012)) {
/* 1282 */                              String str8 = l001oii.I00000oOI;
/* 1288 */                              if (TextUtils.isEmpty(str8)) {
/* 1426 */                                  i10 = size;
                                        } else {
/* 1300 */                                  i10 = size;
/* 1420 */                                  lli10ii2 = new lli10iI(lli10ii2.I00iOIl, lli10ii2.I00iiI, str8, l001oii.I0000Il00O, lli10ii2.I00iio, lli10ii2.I00ilI0I1, lli10ii2.I00ilO0, lli10ii2.I00io1l, lli10ii2.I00ioIO, lli10ii2.I00l0I0l0lO1, lli10ii2.I00li1OI, lli10ii2.I00ll1, lli10ii2.I00lli11, lli10ii2.I00lll10, lli10ii2.I00o0iI0io1, lli10ii2.I00o0l1o1o0, lli10ii2.I00o101lO, lli10ii2.I00oI0i, lli10ii2.I00oII, lli10ii2.I00oIiI10, lli10ii2.I00oO101o, lli10ii2.I00oOio10iI1, lli10ii2.I00ol1, lli10ii2.I00olI, lli10ii2.I00oli, lli10ii2.I00oliIiO01i, lli10ii2.I00oo1iO0ll, lli10ii2.I00ooIo0, lli10ii2.I00ooiO1I, lli10ii2.I00oooO, lli10ii2.I0100i, lli10ii2.I0100o111I);
                                        }
                                    }
/* 1430 */                          if (i01OlIoIl2 instanceof ii0oooi0IO0l) {
                                        try {
/* 1432 */                                  iioi0lilII.getClass();
/* 1435 */                                  long jCurrentTimeMillis = System.currentTimeMillis();
                                            try {
/* 1439 */                                      iioi0lilII.getClass();
/* 1442 */                                      jElapsedRealtime = SystemClock.elapsedRealtime();
                                                try {
                                                    try {
/* 1450 */                                              iolll0ill1iVar.I000OOo1O((ii0oooi0IO0l) i01OlIoIl2, lli10ii2);
/* 1453 */                                              l0olllO1i.I000II(l01o0io1ooo0);
/* 1456 */                                              l01o0io1ooo02 = l01o0io1ooo0;
                                                    } catch (RemoteException e35) {
/* 1497 */                                              e = e35;
/* 1498 */                                              l01o0io1ooo02 = l01o0io1ooo0;
/* 1505 */                                              j3 = jCurrentTimeMillis;
/* 1525 */                                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1532 */                                              l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send event to the service", e);
/* 1537 */                                              if (j3 != 0) {
/* 1539 */                                                  OlilOlOiI olilOlOiII001IO000 = OlilOlOiI.I001IO000(l0olllo1i3);
/* 1543 */                                                  iioi0lilII.getClass();
/* 1546 */                                                  long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 1550 */                                                  iioi0lilII.getClass();
/* 1563 */                                                  olilOlOiII001IO000.I001lIiIIo1O(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                        }
/* 1658 */                                              i9++;
/* 1660 */                                              l01o0io1ooo0 = l01o0io1ooo02;
/* 1662 */                                              size = i10;
                                                    }
                                                    try {
/* 1462 */                                              l01o0io1ooo02.I00lll10.I00000oOI("Logging telemetry for logEvent from database");
/* 1465 */                                              OlilOlOiI olilOlOiII001IO0002 = OlilOlOiI.I001IO000(l0olllo1i3);
/* 1469 */                                              iioi0lilII.getClass();
/* 1472 */                                              long jCurrentTimeMillis3 = System.currentTimeMillis();
/* 1476 */                                              iioi0lilII.getClass();
/* 1489 */                                              olilOlOiII001IO0002.I001lIiIIo1O(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                                    } catch (RemoteException e36) {
/* 1495 */                                              e = e36;
/* 1505 */                                              j3 = jCurrentTimeMillis;
/* 1525 */                                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1532 */                                              l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send event to the service", e);
/* 1537 */                                              if (j3 != 0) {
                                                        }
/* 1658 */                                              i9++;
/* 1660 */                                              l01o0io1ooo0 = l01o0io1ooo02;
/* 1662 */                                              size = i10;
                                                    }
                                                } catch (RemoteException e37) {
/* 1501 */                                          e = e37;
                                                }
                                            } catch (RemoteException e38) {
/* 1508 */                                      e = e38;
/* 1511 */                                      l01o0io1ooo02 = l01o0io1ooo0;
/* 1513 */                                      jElapsedRealtime = 0;
                                            }
                                        } catch (RemoteException e39) {
/* 1516 */                                  e = e39;
/* 1519 */                                  l01o0io1ooo02 = l01o0io1ooo0;
/* 1521 */                                  jElapsedRealtime = 0;
/* 1523 */                                  j3 = 0;
                                        }
                                    } else {
/* 1569 */                              l01o0io1ooo02 = l01o0io1ooo0;
/* 1573 */                              if (i01OlIoIl2 instanceof lio0llOI0) {
                                            try {
/* 1577 */                                      iolll0ill1iVar.I00II0Ol1O0l((lio0llOI0) i01OlIoIl2, lli10ii2);
                                            } catch (RemoteException e40) {
/* 1582 */                                      l0olllO1i.I000II(l01o0io1ooo02);
/* 1589 */                                      l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send user property to the service", e40);
                                            }
                                        } else if (i01OlIoIl2 instanceof iII000ol000) {
                                            try {
/* 1599 */                                      iolll0ill1iVar.I001iOo1i0O((iII000ol000) i01OlIoIl2, lli10ii2);
                                            } catch (RemoteException e41) {
/* 1604 */                                      l0olllO1i.I000II(l01o0io1ooo02);
/* 1611 */                                      l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send conditional user property to the service", e41);
                                            }
                                        } else {
/* 1620 */                                  if (iil1iil2.I01101IOlO(null, iol01i00012) && (i01OlIoIl2 instanceof ii0il0lOolIo)) {
                                                try {
/* 1632 */                                          iolll0ill1iVar.I00Io1lO(((ii0il0lOolIo) i01OlIoIl2).I0001Ioi1lo(), lli10ii2);
                                                } catch (RemoteException e42) {
/* 1637 */                                          l0olllO1i.I000II(l01o0io1ooo02);
/* 1644 */                                          l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to send default event parameters to the service", e42);
                                                }
                                            } else {
/* 1648 */                                      l0olllO1i.I000II(l01o0io1ooo02);
/* 1655 */                                      l01o0io1ooo02.I00ilO0.I00000oOI("Discarding data. Unrecognized parcel type.");
                                            }
/* 1658 */                                  i9++;
/* 1660 */                                  l01o0io1ooo0 = l01o0io1ooo02;
/* 1662 */                                  size = i10;
                                        }
                                    }
/* 1658 */                          i9++;
/* 1660 */                          l01o0io1ooo0 = l01o0io1ooo02;
/* 1662 */                          size = i10;
                                }
/* 1675 */                      i12 = i + 1;
/* 1677 */                      l01o0io1ooo03 = l01o0io1ooo0;
/* 1678 */                      i11 = size;
/* 1680 */                      l0olllo1i = l0olllo1i3;
/* 1682 */                      iioi0lilII2 = iioi0lilII;
                            }
                        }
/* 78 */                arrayList = null;
/* 79 */                i2 = 0;
/* 1223 */              if (arrayList == null) {
                        }
/* 1237 */              if (i01OlIoIl == null) {
                        }
/* 1258 */              size2 = arrayList2.size();
/* 1262 */              i9 = i2;
/* 1263 */              while (i9 < size2) {
                        }
/* 1675 */              i12 = i + 1;
/* 1677 */              l01o0io1ooo03 = l01o0io1ooo0;
/* 1678 */              i11 = size;
/* 1680 */              l0olllo1i = l0olllo1i3;
/* 1682 */              iioi0lilII2 = iioi0lilII;
                    }
                }

                public final void I011Ol0(iII000ol000 iii000ol000) {
                    boolean zI010l1ol111;
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 9 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 11 */            l0olllo1i.getClass();
/* 14 */            l00Ii0II l00ii0iiI000O01llI0 = l0olllo1i.I000O01llI0();
/* 20 */            l0olllO1i l0olllo1i2 = (l0olllO1i) l00ii0iiI000O01llI0.I00iOIl;
/* 24 */            l0olllO1i.I0000oI00(l0olllo1i2.I00l0I0l0lO1);
/* 27 */            byte[] bArrI01IiOO = lioil0ilIOi.I01IiOO(iii000ol000);
/* 34 */            if (bArrI01IiOO.length > 131072) {
/* 36 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i2.I00ilO0;
/* 38 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 45 */                l01o0io1ooo0.I00io1l.I00000oOI("Conditional user property too long for local database. Sending directly to service");
/* 48 */                zI010l1ol111 = false;
                    } else {
/* 51 */                zI010l1ol111 = l00ii0iiI000O01llI0.I010l1ol111(2, bArrI01IiOO);
                    }
/* 57 */            iII000ol000 iii000ol0002 = new iII000ol000(iii000ol000);
/* 61 */            lli10iI lli10iiI011IO1I11OI = I011IO1I11OI(true);
/* 68 */            ioli0l0 ioli0l0Var = new ioli0l0(3);
/* 71 */            ioli0l0Var.I00iiO = lli10iiI011IO1I11OI;
/* 73 */            ioli0l0Var.I00iiI = zI010l1ol111;
/* 75 */            ioli0l0Var.I00iio = iii000ol0002;
/* 77 */            ioli0l0Var.I00ilI0I1 = this;
/* 79 */            VarHandle.storeStoreFence();
/* 82 */            I0110o(ioli0l0Var);
                }
            }
