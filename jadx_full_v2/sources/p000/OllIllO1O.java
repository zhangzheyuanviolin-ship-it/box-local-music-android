            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.os.PowerManager;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.firebase.messaging.FirebaseMessaging;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.HashMap;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            
/* 56 */    public final class OllIllO1O implements Runnable {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public OllIllO1O(FirebaseMessaging firebaseMessaging, long j) {
/* 2 */             this.I00iOIl = 0;
/* 28 */            new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new iO10oo0i1o("firebase-iid-executor", 5));
/* 31 */            this.I00iio = firebaseMessaging;
/* 33 */            this.I00iiI = j;
/* 48 */            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.I00000oOI.getSystemService("power")).newWakeLock(1, "fiid-sync");
/* 52 */            this.I00iiO = wakeLockNewWakeLock;
/* 54 */            wakeLockNewWakeLock.setReferenceCounted(false);
                }

                public boolean I00000oIO() {
/* 13 */            ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.I00iio).I00000oOI.getSystemService("connectivity");
/* 22 */            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }

                public boolean I00000oOI() throws IOException {
                    try {
/* 12 */                if (((FirebaseMessaging) this.I00iio).I00000oIO() == null) {
/* 16 */                    Log.e("FirebaseMessaging", "Token retrieval failed: null");
/* 3 */                     return false;
                        }
/* 23 */                Log.isLoggable("FirebaseMessaging", 3);
/* 26 */                return true;
                    } catch (IOException e) {
/* 34 */                String message = e.getMessage();
/* 44 */                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
/* 67 */                    if (e.getMessage() != null) {
/* 75 */                        throw e;
                            }
/* 71 */                    Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
/* 3 */                     return false;
                        }
/* 99 */                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
/* 3 */                 return false;
                    } catch (SecurityException unused) {
/* 30 */                Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
/* 3 */                 return false;
                    }
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 563 */                   PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.I00iiO;
/* 567 */                   OillOo0 oillOo0I000iOII = OillOo0.I000iOII();
/* 573 */                   FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.I00iio;
/* 581 */                   if (oillOo0I000iOII.I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 583 */                       wakeLock.acquire();
                            }
                            try {
                                try {
                                    synchronized (firebaseMessaging) {
/* 587 */                               firebaseMessaging.I000iOII = true;
                                    }
/* 596 */                           if (!firebaseMessaging.I000OOo1O.I000II()) {
                                        synchronized (firebaseMessaging) {
/* 599 */                                   firebaseMessaging.I000iOII = false;
                                        }
/* 612 */                               if (!OillOo0.I000iOII().I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 746 */                                   return;
                                        }
                                    } else if (!OillOo0.I000iOII().I000l1(firebaseMessaging.I00000oOI) || I00000oIO()) {
/* 671 */                               if (I00000oOI()) {
                                            synchronized (firebaseMessaging) {
/* 674 */                                       firebaseMessaging.I000iOII = false;
                                            }
                                        } else {
/* 683 */                                   firebaseMessaging.I000II(this.I00iiI);
                                        }
/* 696 */                               if (!OillOo0.I000iOII().I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 746 */                                   return;
                                        }
                                    } else {
/* 642 */                               OllIliiOO1 ollIliiOO1 = new OllIliiOO1();
/* 645 */                               ollIliiOO1.I00000oIO = this;
/* 647 */                               ollIliiOO1.I00000oIO();
/* 660 */                               if (!OillOo0.I000iOII().I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 746 */                                   return;
                                        }
                                    }
                                } catch (IOException e) {
/* 725 */                           Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                                    synchronized (firebaseMessaging) {
/* 729 */                               firebaseMessaging.I000iOII = false;
/* 742 */                               if (!OillOo0.I000iOII().I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 746 */                                   return;
                                        }
                                    }
                                }
/* 614 */                       wakeLock.release();
/* 746 */                       return;
                            } catch (Throwable th) {
/* 760 */                       if (OillOo0.I000iOII().I000o00OoI0I(firebaseMessaging.I00000oOI)) {
/* 762 */                           wakeLock.release();
                                }
/* 765 */                       throw th;
                            }
                        case 1:
/* 516 */                   lO0liIO0 lo0liio0 = (lO0liIO0) this.I00iio;
/* 524 */                   lo0liio0.I010o0o0oO((lIol0ili1Oi) this.I00iiO, false, this.I00iiI);
/* 527 */                   lo0liio0.I00ilI0I1 = null;
/* 533 */                   lOliOlO1Io loliolo1ioI000OOo1O = ((l0olllO1i) lo0liio0.I00iOIl).I000OOo1O();
/* 537 */                   loliolo1ioI000OOo1O.I010II();
/* 540 */                   loliolo1ioI000OOo1O.I010OIo1l();
/* 547 */                   l0iOoII1Il l0iooii1il = new l0iOoII1Il(11);
/* 550 */                   l0iooii1il.I00iiI = null;
/* 552 */                   l0iooii1il.I00iiO = loliolo1ioI000OOo1O;
/* 554 */                   VarHandle.storeStoreFence();
/* 557 */                   loliolo1ioI000OOo1O.I0110o(l0iooii1il);
/* 560 */                   return;
                        case 2:
/* 391 */                   loOiOoIi looiooii = (loOiOoIi) this.I00iiO;
/* 393 */                   lOoo11 looo11 = lOoo11.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION;
/* 397 */                   il1ilI1l il1ili1l = (il1ilI1l) this.I00iio;
/* 399 */                   long j = this.I00iiI;
/* 401 */                   HashMap map = looiooii.I000OiO;
/* 407 */                   if (!map.containsKey(looo11)) {
/* 413 */                       iI0iIIo ii0iiio = new iI0iIIo(0);
/* 416 */                       loO1I0 loo1i0 = new loO1I0();
/* 423 */                       if (!ii0iiio.isEmpty()) {
/* 431 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 434 */                           throw null;
                                }
/* 425 */                       loo1i0.I00iiO = ii0iiio;
/* 427 */                       map.put(looo11, loo1i0);
                            }
/* 439 */                   loO1I0 loo1i02 = (loO1I0) map.get(looo11);
/* 441 */                   Long lValueOf = Long.valueOf(j);
/* 445 */                   iI0iIIo ii0iiio2 = loo1i02.I00iiO;
/* 451 */                   Collection collection = (Collection) ii0iiio2.get(il1ili1l);
/* 453 */                   if (collection == null) {
/* 457 */                       ArrayList arrayList = new ArrayList(3);
/* 464 */                       if (!arrayList.add(lValueOf)) {
/* 472 */                           I000II.I000O01llI0("New Collection violated the Collection spec");
/* 513 */                           return;
                                }
/* 466 */                       ii0iiio2.put(il1ili1l, arrayList);
                            } else {
/* 476 */                       collection.add(lValueOf);
                            }
/* 479 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 487 */                   if (looiooii.I0000O(looo11, jElapsedRealtime)) {
/* 496 */                       looiooii.I000OOo1O.put(looo11, Long.valueOf(jElapsedRealtime));
/* 502 */                       lOii1o loii1o = new lOii1o(7);
/* 505 */                       loii1o.I00iiI = looiooii;
/* 507 */                       VarHandle.storeStoreFence();
/* 510 */                       io1OllI.I00000oIO(1, loii1o);
/* 513 */                       return;
                            }
/* 513 */                   return;
                        case 3:
/* 265 */                   loi1ool loi1oolVar = (loi1ool) this.I00iiO;
/* 267 */                   li0lloo li0llooVar = li0lloo.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
/* 271 */                   ilOlOIiO0 iloloiio0 = (ilOlOIiO0) this.I00iio;
/* 273 */                   long j2 = this.I00iiI;
/* 275 */                   HashMap map2 = loi1oolVar.I000OiO;
/* 281 */                   if (!map2.containsKey(li0llooVar)) {
/* 287 */                       iI0iIIo ii0iiio3 = new iI0iIIo(1);
/* 290 */                       o10liooI o10liooi = new o10liooI();
/* 297 */                       if (!ii0iiio3.isEmpty()) {
/* 305 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 308 */                           throw null;
                                }
/* 299 */                       o10liooi.I00iiO = ii0iiio3;
/* 301 */                       map2.put(li0llooVar, o10liooi);
                            }
/* 313 */                   o10liooI o10liooi2 = (o10liooI) map2.get(li0llooVar);
/* 315 */                   Long lValueOf2 = Long.valueOf(j2);
/* 319 */                   iI0iIIo ii0iiio4 = o10liooi2.I00iiO;
/* 325 */                   Collection collection2 = (Collection) ii0iiio4.get(iloloiio0);
/* 327 */                   if (collection2 == null) {
/* 331 */                       ArrayList arrayList2 = new ArrayList(3);
/* 338 */                       if (!arrayList2.add(lValueOf2)) {
/* 346 */                           I000II.I000O01llI0("New Collection violated the Collection spec");
/* 388 */                           return;
                                }
/* 340 */                       ii0iiio4.put(iloloiio0, arrayList2);
                            } else {
/* 350 */                       collection2.add(lValueOf2);
                            }
/* 353 */                   long jElapsedRealtime2 = SystemClock.elapsedRealtime();
/* 361 */                   if (loi1oolVar.I0000oI00(li0llooVar, jElapsedRealtime2)) {
/* 370 */                       loi1oolVar.I000OOo1O.put(li0llooVar, Long.valueOf(jElapsedRealtime2));
/* 377 */                       lOii1o loii1o2 = new lOii1o(9);
/* 380 */                       loii1o2.I00iiI = loi1oolVar;
/* 382 */                       VarHandle.storeStoreFence();
/* 385 */                       io1OllI.I00000oIO(1, loii1o2);
/* 388 */                       return;
                            }
/* 388 */                   return;
                        case 4:
/* 138 */                   loiI0oIOO loii0oioo = (loiI0oIOO) this.I00iiO;
/* 140 */                   li10OOoO0loI li10oooo0loi = li10OOoO0loI.AGGREGATED_ON_DEVICE_FACE_MESH_DETECTION;
/* 144 */                   il1o0o00O0 il1o0o00o0 = (il1o0o00O0) this.I00iio;
/* 146 */                   long j3 = this.I00iiI;
/* 148 */                   HashMap map3 = loii0oioo.I000OiO;
/* 154 */                   if (!map3.containsKey(li10oooo0loi)) {
/* 161 */                       iI0iIIo ii0iiio5 = new iI0iIIo(2);
/* 164 */                       o10lo0 o10lo0Var = new o10lo0();
/* 171 */                       if (!ii0iiio5.isEmpty()) {
/* 179 */                           OIiilo1Ool0o.I00100o1O0lo();
/* 182 */                           throw null;
                                }
/* 173 */                       o10lo0Var.I00iiO = ii0iiio5;
/* 175 */                       map3.put(li10oooo0loi, o10lo0Var);
                            }
/* 187 */                   o10lo0 o10lo0Var2 = (o10lo0) map3.get(li10oooo0loi);
/* 189 */                   Long lValueOf3 = Long.valueOf(j3);
/* 193 */                   iI0iIIo ii0iiio6 = o10lo0Var2.I00iiO;
/* 199 */                   Collection collection3 = (Collection) ii0iiio6.get(il1o0o00o0);
/* 201 */                   if (collection3 == null) {
/* 205 */                       ArrayList arrayList3 = new ArrayList(3);
/* 212 */                       if (!arrayList3.add(lValueOf3)) {
/* 220 */                           I000II.I000O01llI0("New Collection violated the Collection spec");
/* 262 */                           return;
                                }
/* 214 */                       ii0iiio6.put(il1o0o00o0, arrayList3);
                            } else {
/* 224 */                       collection3.add(lValueOf3);
                            }
/* 227 */                   long jElapsedRealtime3 = SystemClock.elapsedRealtime();
/* 235 */                   if (loii0oioo.I0000O(li10oooo0loi, jElapsedRealtime3)) {
/* 244 */                       loii0oioo.I000OOo1O.put(li10oooo0loi, Long.valueOf(jElapsedRealtime3));
/* 251 */                       lOii1o loii1o3 = new lOii1o(10);
/* 254 */                       loii1o3.I00iiI = loii0oioo;
/* 256 */                       VarHandle.storeStoreFence();
/* 259 */                       io1OllI.I00000oIO(1, loii1o3);
/* 262 */                       return;
                            }
/* 262 */                   return;
                        default:
/* 12 */                    o0OIl1o1i0Oi o0oil1o1i0oi = (o0OIl1o1i0Oi) this.I00iiO;
/* 14 */                    lioiiIOoil lioiiiooil = lioiiIOoil.AGGREGATED_ON_DEVICE_POSE_DETECTION;
/* 18 */                    io1IlOiOOo io1iloiooo = (io1IlOiOOo) this.I00iio;
/* 20 */                    long j4 = this.I00iiI;
/* 22 */                    HashMap map4 = o0oil1o1i0oi.I000OiO;
/* 28 */                    if (!map4.containsKey(lioiiiooil)) {
/* 34 */                        iI0iIIo ii0iiio7 = new iI0iIIo(3);
/* 37 */                        iI1oliOIO ii1olioio = new iI1oliOIO();
/* 44 */                        if (!ii0iiio7.isEmpty()) {
/* 52 */                            OIiilo1Ool0o.I00100o1O0lo();
/* 55 */                            throw null;
                                }
/* 46 */                        ii1olioio.I00iiO = ii0iiio7;
/* 48 */                        map4.put(lioiiiooil, ii1olioio);
                            }
/* 60 */                    iI1oliOIO ii1olioio2 = (iI1oliOIO) map4.get(lioiiiooil);
/* 62 */                    Long lValueOf4 = Long.valueOf(j4);
/* 66 */                    iI0iIIo ii0iiio8 = ii1olioio2.I00iiO;
/* 72 */                    Collection collection4 = (Collection) ii0iiio8.get(io1iloiooo);
/* 74 */                    if (collection4 == null) {
/* 78 */                        ArrayList arrayList4 = new ArrayList(3);
/* 85 */                        if (!arrayList4.add(lValueOf4)) {
/* 93 */                            I000II.I000O01llI0("New Collection violated the Collection spec");
/* 135 */                           return;
                                }
/* 87 */                        ii0iiio8.put(io1iloiooo, arrayList4);
                            } else {
/* 97 */                        collection4.add(lValueOf4);
                            }
/* 100 */                   long jElapsedRealtime4 = SystemClock.elapsedRealtime();
/* 108 */                   if (o0oil1o1i0oi.I0000O(lioiiiooil, jElapsedRealtime4)) {
/* 117 */                       o0oil1o1i0oi.I000OOo1O.put(lioiiiooil, Long.valueOf(jElapsedRealtime4));
/* 124 */                       lOii1o loii1o4 = new lOii1o(12);
/* 127 */                       loii1o4.I00iiI = o0oil1o1i0oi;
/* 129 */                       VarHandle.storeStoreFence();
/* 132 */                       io1OllI.I00000oIO(1, loii1o4);
/* 135 */                       return;
                            }
/* 135 */                   return;
                    }
                }

/* 57 */        public OllIllO1O(int i) {
/* 58 */            this.I00iOIl = i;
                }
            }
