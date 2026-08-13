            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.Bundle;
            import android.os.PowerManager;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.Pair;
            import com.google.mlkit.vision.face.internal.zzg;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.concurrent.TimeUnit;
            
            public final class Oo1ooo0ollI implements Runnable {
                public static final Object I00io1l = new Object();
                public static Boolean I00ioIO;
                public static Boolean I00l0I0l0lO1;
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public Oo1ooo0ollI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static boolean I00000oIO(Context context) {
                    boolean zBooleanValue;
                    synchronized (I00io1l) {
                        try {
/* 4 */                     Boolean bool = I00l0I0l0lO1;
/* 6 */                     if (bool == null && bool == null) {
/* 25 */                        zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
/* 26 */                        if (!zBooleanValue) {
/* 31 */                            Log.isLoggable("FirebaseMessaging", 3);
                                }
                            } else {
/* 12 */                        zBooleanValue = bool.booleanValue();
                            }
/* 45 */                    I00l0I0l0lO1 = Boolean.valueOf(zBooleanValue);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 48 */            return zBooleanValue;
                }

                public static boolean I00000oOI(Context context) {
                    boolean zBooleanValue;
                    synchronized (I00io1l) {
                        try {
/* 4 */                     Boolean bool = I00ioIO;
/* 6 */                     if (bool == null && bool == null) {
/* 25 */                        zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
/* 26 */                        if (!zBooleanValue) {
/* 31 */                            Log.isLoggable("FirebaseMessaging", 3);
                                }
                            } else {
/* 12 */                        zBooleanValue = bool.booleanValue();
                            }
/* 45 */                    I00ioIO = Boolean.valueOf(zBooleanValue);
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 48 */            return zBooleanValue;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public synchronized boolean I0000Il00O() {
                    boolean z;
                    try {
/* 12 */                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.I00iiO).getSystemService("connectivity");
/* 23 */                NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
/* 24 */                if (activeNetworkInfo != null) {
/* 34 */                    z = activeNetworkInfo.isConnected();
                        }
                    } catch (Throwable th) {
/* 55 */                throw th;
                    }
/* 36 */            return z;
                }

                /* JADX WARN: Removed duplicated region for block: B:119:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0099 A[Catch: all -> 0x004d, InterruptedException | RuntimeException | o0iolOlII11I -> 0x0050, InterruptedException | RuntimeException | o0iolOlII11I -> 0x0050, InterruptedException | RuntimeException | o0iolOlII11I -> 0x0050, TryCatch #6 {InterruptedException | RuntimeException | o0iolOlII11I -> 0x0050, blocks: (B:5:0x0021, B:17:0x0054, B:17:0x0054, B:17:0x0054, B:18:0x0059, B:18:0x0059, B:18:0x0059, B:20:0x006a, B:20:0x006a, B:20:0x006a, B:22:0x0071, B:22:0x0071, B:22:0x0071, B:26:0x0099, B:26:0x0099, B:26:0x0099, B:27:0x009e, B:27:0x009e, B:27:0x009e, B:24:0x008c, B:24:0x008c, B:24:0x008c, B:8:0x0029, B:10:0x0047), top: B:118:0x0021, outer: #4 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    iiiiIIllo iiiiiillo;
                    I0Oi111ii i0Oi111ii;
                    switch (this.I00iOIl) {
                        case 0:
/* 497 */                   Oo1oo01i oo1oo01i = (Oo1oo01i) this.I00ilO0;
/* 504 */                   PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.I00ilI0I1;
/* 511 */                   Context context = (Context) this.I00iiO;
/* 517 */                   if (I00000oOI(context)) {
/* 522 */                       wakeLock.acquire(180000L);
                            }
                            try {
                                try {
/* 525 */                           oo1oo01i.I00000oIO(true);
/* 536 */                           if (!((I101oOiOiI) this.I00iio).I000II()) {
/* 538 */                               oo1oo01i.I00000oIO(false);
/* 545 */                               if (!I00000oOI(context)) {
/* 651 */                                   return;
                                        }
                                    } else if (!I00000oIO(context) || I0000Il00O()) {
/* 604 */                               if (oo1oo01i.I00000oOI()) {
/* 606 */                                   oo1oo01i.I00000oIO(false);
                                        } else {
/* 612 */                                   oo1oo01i.I0000Il00O(this.I00iiI);
                                        }
/* 619 */                               if (!I00000oOI(context)) {
/* 651 */                                   return;
                                        }
                                    } else {
/* 575 */                               Oo1oo1o1o oo1oo1o1o = new Oo1oo1o1o();
/* 578 */                               oo1oo1o1o.I00000oIO = this;
/* 580 */                               Log.isLoggable("FirebaseMessaging", 3);
/* 590 */                               context.registerReceiver(oo1oo1o1o, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
/* 597 */                               if (!I00000oOI(context)) {
/* 651 */                                   return;
                                        }
                                    }
                                } catch (IOException e) {
/* 638 */                           Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
/* 641 */                           oo1oo01i.I00000oIO(false);
/* 648 */                           if (!I00000oOI(context)) {
/* 651 */                               return;
                                    }
                                }
                                try {
/* 547 */                           wakeLock.release();
/* 651 */                           return;
                                } catch (RuntimeException unused) {
/* 551 */                           Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
/* 651 */                           return;
                                }
                            } finally {
                            }
                        case 1:
/* 425 */                   String str = (String) this.I00iio;
/* 431 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00ilO0).I000II;
/* 435 */                   String str2 = (String) this.I00iiO;
/* 437 */                   if (str2 == null) {
/* 443 */                       lilool0.I00iOIl().I010II();
/* 446 */                       String str3 = lilool0.I010101Oo1lO;
/* 448 */                       if (str3 == null || str3.equals(str)) {
/* 457 */                           lilool0.I010101Oo1lO = str;
/* 459 */                           lilool0.I0100o111I = null;
/* 491 */                           return;
                                }
/* 491 */                       return;
                            }
/* 470 */                   lIol0ili1Oi liol0ili1oi = new lIol0ili1Oi((String) this.I00ilI0I1, str2, this.I00iiI);
/* 477 */                   lilool0.I00iOIl().I010II();
/* 480 */                   String str4 = lilool0.I010101Oo1lO;
/* 482 */                   if (str4 != null) {
/* 484 */                       str4.equals(str);
                            }
/* 487 */                   lilool0.I010101Oo1lO = str;
/* 489 */                   lilool0.I0100o111I = liol0ili1oi;
/* 491 */                   return;
                        case 2:
/* 419 */                   ((lIl1O1li) this.I00ilO0).I01101olii(this.I00iiI, this.I00ilI0I1, (String) this.I00iiO, (String) this.I00iio);
/* 422 */                   return;
                        case 3:
/* 351 */                   Bundle bundle = (Bundle) this.I00iiO;
/* 355 */                   bundle.remove("screen_name");
/* 360 */                   bundle.remove("screen_class");
/* 366 */                   lO0liIO0 lo0liio0 = (lO0liIO0) this.I00ilO0;
/* 372 */                   lioil0ilIOi lioil0ilioi = ((l0olllO1i) lo0liio0.I00iOIl).I00l0I0l0lO1;
/* 374 */                   l0olllO1i.I0000oI00(lioil0ilioi);
/* 396 */                   lo0liio0.I010l1O((lIol0ili1Oi) this.I00iio, (lIol0ili1Oi) this.I00ilI0I1, this.I00iiI, true, lioil0ilioi.I010oio1OO0("screen_view", bundle, null, false));
/* 399 */                   return;
                        case 4:
/* 201 */                   li10lI1 li10li1 = (li10lI1) this.I00iiO;
/* 205 */                   lIIl0IOioI liil0ioioi = (lIIl0IOioI) this.I00iio;
/* 209 */                   ilIliOoI1 ililiooi1 = (ilIliOoI1) this.I00ilI0I1;
/* 211 */                   long j = this.I00iiI;
/* 215 */                   zzg zzgVar = (zzg) this.I00ilO0;
/* 217 */                   HashMap map = li10li1.I000OiO;
/* 223 */                   if (!map.containsKey(liil0ioioi)) {
/* 230 */                       iI0iIIo ii0iiio = new iI0iIIo(5);
/* 233 */                       iOIoo1lI ioioo1li = new iOIoo1lI();
/* 240 */                       if (!ii0iiio.isEmpty()) {
/* 248 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 251 */                           throw null;
                                }
/* 242 */                       ioioo1li.I00iiO = ii0iiio;
/* 244 */                       map.put(liil0ioioi, ioioo1li);
                            }
/* 256 */                   iOIoo1lI ioioo1li2 = (iOIoo1lI) map.get(liil0ioioi);
/* 258 */                   Long lValueOf = Long.valueOf(j);
/* 262 */                   iI0iIIo ii0iiio2 = ioioo1li2.I00iiO;
/* 268 */                   Collection collection = (Collection) ii0iiio2.get(ililiooi1);
/* 270 */                   if (collection == null) {
/* 274 */                       ArrayList arrayList = new ArrayList(3);
/* 281 */                       if (!arrayList.add(lValueOf)) {
/* 294 */                           I000II.I000O01llI0("New Collection violated the Collection spec");
/* 348 */                           return;
                                } else {
                                    ioioo1li2.I00iio++;
/* 288 */                           ii0iiio2.put(ililiooi1, arrayList);
                                }
                            } else if (collection.add(lValueOf)) {
                                ioioo1li2.I00iio++;
                            }
/* 309 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 317 */                   if (li10li1.I0000oI00(liil0ioioi, jElapsedRealtime)) {
/* 326 */                       li10li1.I000OOo1O.put(liil0ioioi, Long.valueOf(jElapsedRealtime));
/* 333 */                       O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(20);
/* 336 */                       o10oO1IiI1.I00iiI = li10li1;
/* 338 */                       o10oO1IiI1.I00iiO = liil0ioioi;
/* 340 */                       o10oO1IiI1.I00iio = zzgVar;
/* 342 */                       VarHandle.storeStoreFence();
/* 345 */                       io1OllI.I00000oIO(1, o10oO1IiI1);
/* 348 */                       return;
                            }
/* 348 */                   return;
                        default:
/* 13 */                    o0ilO10O o0ilo10o = (o0ilO10O) this.I00iiO;
/* 17 */                    Date date = (Date) this.I00iio;
/* 19 */                    long j2 = this.I00iiI;
/* 23 */                    o01oIol1O o01oiol1o = (o01oIol1O) this.I00ilI0I1;
/* 27 */                    OloIlI0ll oloIlI0ll = (OloIlI0ll) this.I00ilO0;
/* 29 */                    o0ilo10o.getClass();
                            try {
                                try {
/* 34 */                            Pair pairI00000oOI = o0ilo10o.I00000oOI(o01oiol1o, false);
/* 38 */                            if (pairI00000oOI == null) {
/* 40 */                                iiiiiillo = null;
/* 83 */                                if (iiiiiillo == null) {
                                            try {
/* 87 */                                        o0ilo10o.I0000Il00O.I001i1O0Ol();
/* 98 */                                        i0Oi111ii = new I0Oi111ii(o0ilo10o, o0ilo10o.I0000Il00O.I001IO000(), date, o01oiol1o);
                                            } catch (IOException e2) {
/* 143 */                                       o01oiol1o.I00000oIO(loOill110Ol.UNKNOWN_ERROR);
/* 148 */                                       Log.e("MLKit RemoteConfigRestC", "Initializing installation id failed", e2);
                                            }
/* 105 */                                   if (o0li1IlO0.I00000oIO(i0Oi111ii)) {
/* 117 */                                       iiiiiillo = (iiiiIIllo) i0Oi111ii.I00ilI0I1;
/* 125 */                                       "writeAndSetFetchedConfig: ".concat(String.valueOf(iiiiiillo));
/* 134 */                                       o0ilo10o.I000O01llI0.I00000oIO((o0i1ol0) i0Oi111ii.I00ilO0, o01oiol1o);
/* 137 */                                       o0ilo10o.I0001Ioi1lo = iiiiiillo;
                                            } else {
/* 109 */                                       o01oiol1o.I00000oIO(loOill110Ol.RPC_EXPONENTIAL_BACKOFF_FAILED);
/* 112 */                                       iiiiiillo = null;
                                            }
                                        }
/* 152 */                               if (iiiiiillo == null) {
/* 156 */                                   Log.e("MLKit RemoteConfigRestC", "Remote config was null!");
                                        }
/* 159 */                               oloIlI0ll.I00000oOI(null);
                                    } else {
/* 44 */                                iiiiiillo = (iiiiIIllo) pairI00000oOI.first;
/* 70 */                                if (date.after(new Date(((Date) pairI00000oOI.second).getTime() + TimeUnit.SECONDS.toMillis(j2)))) {
/* 74 */                                    Log.i("MLKit RemoteConfigRestC", "Saved remote config is past its expiration time.");
/* 40 */                                    iiiiiillo = null;
                                        }
/* 83 */                                if (iiiiiillo == null) {
                                        }
/* 152 */                               if (iiiiiillo == null) {
                                        }
/* 159 */                               oloIlI0ll.I00000oOI(null);
                                    }
                                } catch (InterruptedException | RuntimeException | o0iolOlII11I e3) {
/* 165 */                           Log.e("MLKit RemoteConfigRestC", "Fetch failed", e3);
/* 168 */                           oloIlI0ll.I00000oIO(e3);
                                }
/* 171 */                       o01oiol1o.I00000oOI();
/* 174 */                       o0l101oi1li1 o0l101oi1li1Var = o0ilo10o.I000OOo1O;
/* 176 */                       o0l101oi1li1Var.getClass();
/* 181 */                       o0l101oi1li1Var.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_FETCH, o01oiol1o);
/* 184 */                       return;
                            } catch (Throwable th) {
/* 185 */                       o01oiol1o.I00000oOI();
/* 188 */                       o0l101oi1li1 o0l101oi1li1Var2 = o0ilo10o.I000OOo1O;
/* 190 */                       o0l101oi1li1Var2.getClass();
/* 195 */                       o0l101oi1li1Var2.I0001Ioi1lo(lioiiIOoil.REMOTE_CONFIG_FETCH, o01oiol1o);
/* 198 */                       throw th;
                            }
                    }
                }
            }
