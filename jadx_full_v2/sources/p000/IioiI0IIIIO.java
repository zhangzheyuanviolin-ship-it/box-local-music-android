            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteException;
            import android.text.TextUtils;
            import android.util.Pair;
            import java.io.IOException;
            import java.lang.ref.Reference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.ConcurrentLinkedQueue;
            
/* 11 */    public final class IioiI0IIIIO {
                public static final long[] I0000oI00 = new long[0];
                public long I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public IioiI0IIIIO(long j, Object obj, String str, String str2) {
/* 1 */             this.I00000oOI = obj;
/* 3 */             this.I0000Il00O = str;
/* 5 */             this.I0000O = str2;
/* 7 */             this.I00000oIO = j;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0029 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x002e A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean I00000oIO(I0OI0o0lO i0OI0o0lO, OOlioiIOOO1 oOlioiIOOO1, ArrayList arrayList, boolean z) {
/* 5 */             Iterator it = ((ConcurrentLinkedQueue) this.I0000O).iterator();
                    while (true) {
/* 14 */                if (!it.hasNext()) {
/* 13 */                    return false;
                        }
/* 20 */                OOll1O oOll1O = (OOll1O) it.next();
                        synchronized (oOll1O) {
/* 24 */                    if (z) {
                                try {
/* 31 */                            if (!(oOll1O.I0001Ioi1lo != null)) {
                                        continue;
                                    } else if (!oOll1O.I0001Ioi1lo(i0OI0o0lO, arrayList)) {
/* 42 */                                oOlioiIOOO1.I00000oIO(oOll1O);
/* 23 */                                return true;
                                    }
                                } catch (Throwable th) {
/* 50 */                            throw th;
                                }
                            } else if (!oOll1O.I0001Ioi1lo(i0OI0o0lO, arrayList)) {
                            }
                        }
                    }
                }

                public int I00000oOI(OOll1O oOll1O, long j) {
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 3 */             ArrayList arrayList = oOll1O.I000oI1ioi;
/* 6 */             int i = 0;
/* 11 */            while (i < arrayList.size()) {
/* 17 */                Reference reference = (Reference) arrayList.get(i);
/* 23 */                if (reference.get() != null) {
/* 25 */                    i++;
                        } else {
/* 51 */                    String strConcat = "A connection to " + oOll1O.I00000oIO.I00000oIO.I000O01llI0 + " was leaked. Did you forget to close a response body?";
/* 55 */                    OO1I1IllO oO1I1IllO = OO1I1IllO.I00000oIO;
/* 57 */                    OO1I1IllO oO1I1IllO2 = OO1I1IllO.I00000oIO;
/* 59 */                    Throwable th = ((OOliiO0) reference).I00000oIO;
/* 61 */                    oO1I1IllO2.getClass();
/* 64 */                    if (th == null) {
/* 68 */                        strConcat = strConcat.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                            }
/* 73 */                    OO1I1IllO.I0001Ioi1lo(strConcat, th, 5);
/* 76 */                    arrayList.remove(i);
/* 80 */                    oOll1O.I000OOo1O = true;
/* 86 */                    if (arrayList.isEmpty()) {
/* 91 */                        oOll1O.I00100l0 = j - this.I00000oIO;
/* 5 */                         return 0;
                            }
                        }
                    }
/* 94 */            return arrayList.size();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00fe A[PHI: r7 r16 r17
                  0x00fe: PHI (r7v1 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
                  0x00fe: PHI (r16v5 l0l1iIIOl) = (r16v7 l0l1iIIOl), (r16v11 l0l1iIIOl) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
                  0x00fe: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public l0l1iIIOl I0000Il00O(String str, l0l1iIIOl l0l1iiiol) throws Throwable {
                    Cursor cursor;
                    l0l1iIIOl l0l1iiiol2;
                    long j;
                    Cursor cursorRawQuery;
                    Pair pair;
                    Object obj;
                    Pair pair2;
/* 7 */             String strI001iOo1i0O = l0l1iiiol.I001iOo1i0O();
/* 11 */            List listI001IO000 = l0l1iiiol.I001IO000();
/* 17 */            i1lioiII i1lioiii = (i1lioiII) this.I0000O;
/* 19 */            lilOOl0 lilool0 = i1lioiii.I00iiI;
/* 24 */            l0olllO1i l0olllo1i = (l0olllO1i) i1lioiii.I00iOIl;
/* 26 */            lilool0.I00i0oil();
/* 31 */            l0lliIlIO l0lliilioI010oio1OO0 = lio010i.I010oio1OO0("_eid", l0l1iiiol);
/* 45 */            Long l = (Long) (l0lliilioI010oio1OO0 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO0));
/* 47 */            if (l != null) {
/* 55 */                if (strI001iOo1i0O.equals("_ep")) {
/* 57 */                    lilool0.I00i0oil();
/* 62 */                    l0lliIlIO l0lliilioI010oio1OO02 = lio010i.I010oio1OO0("_en", l0l1iiiol);
/* 75 */                    String str2 = (String) (l0lliilioI010oio1OO02 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO02));
/* 81 */                    if (TextUtils.isEmpty(str2)) {
/* 83 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 85 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 92 */                        l01o0io1ooo0.I00io1l.I0000Il00O("Extra parameter without an event name. eventId", l);
/* 35 */                        return null;
                            }
/* 100 */                   if (((l0l1iIIOl) this.I00000oOI) == null || ((Long) this.I0000Il00O) == null || l.longValue() != ((Long) this.I0000Il00O).longValue()) {
/* 129 */                       iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 131 */                       lilOOl0.I00O0o1oo(iol1loo1io);
/* 136 */                       l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io.I00iOIl;
/* 138 */                       iol1loo1io.I010II();
/* 141 */                       iol1loo1io.I010OIo1l();
                                try {
/* 158 */                           cursorRawQuery = iol1loo1io.I01Io11IiiiO().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                                    try {
                                        try {
/* 166 */                                   if (cursorRawQuery.moveToFirst()) {
/* 210 */                                       l0l1iiiol2 = null;
                                                try {
                                                    try {
/* 228 */                                               Pair pairCreate = Pair.create((l0l1iIIOl) ((l0l0O000) lio010i.I01IlIoOI(l0l1iIIOl.I00IlilI0i0i(), cursorRawQuery.getBlob(0))).I0000oI00(), Long.valueOf(cursorRawQuery.getLong(1)));
/* 232 */                                               cursorRawQuery.close();
                                                        pair2 = pairCreate;
                                                    } catch (SQLiteException e) {
/* 263 */                                               e = e;
/* 264 */                                               j = 0;
/* 286 */                                               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i2.I00ilO0;
/* 288 */                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 295 */                                               l01o0io1ooo02.I00ilO0.I0000Il00O("Error selecting main event", e);
/* 298 */                                               if (cursorRawQuery != null) {
                                                        }
/* 258 */                                               pair = l0l1iiiol2;
/* 301 */                                               if (pair != 0) {
                                                        }
/* 489 */                                               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 491 */                                               l0olllO1i.I000II(l01o0io1ooo03);
/* 498 */                                               l01o0io1ooo03.I00io1l.I0000O(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 501 */                                               return l0l1iiiol2;
                                                    }
                                                } catch (IOException e2) {
/* 237 */                                           l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 239 */                                           l0olllO1i.I000II(l01o0io1ooo04);
/* 246 */                                           j = 0;
                                                    try {
/* 252 */                                               l01o0io1ooo04.I00ilO0.I0000oI00("Failed to merge main event. appId, eventId", l01O0IO1ooO0.I010ioo(str), l, e2);
                                                    } catch (SQLiteException e3) {
/* 261 */                                               e = e3;
/* 286 */                                               l01O0IO1ooO0 l01o0io1ooo022 = l0olllo1i2.I00ilO0;
/* 288 */                                               l0olllO1i.I000II(l01o0io1ooo022);
/* 295 */                                               l01o0io1ooo022.I00ilO0.I0000Il00O("Error selecting main event", e);
/* 298 */                                               if (cursorRawQuery != null) {
/* 255 */                                                   cursorRawQuery.close();
                                                        }
/* 258 */                                               pair = l0l1iiiol2;
/* 301 */                                               if (pair != 0) {
                                                        }
/* 489 */                                               l01O0IO1ooO0 l01o0io1ooo032 = l0olllo1i.I00ilO0;
/* 491 */                                               l0olllO1i.I000II(l01o0io1ooo032);
/* 498 */                                               l01o0io1ooo032.I00io1l.I0000O(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 501 */                                               return l0l1iiiol2;
                                                    }
/* 255 */                                           cursorRawQuery.close();
/* 258 */                                           pair = l0l1iiiol2;
/* 301 */                                           if (pair != 0) {
                                                    }
/* 489 */                                           l01O0IO1ooO0 l01o0io1ooo0322 = l0olllo1i.I00ilO0;
/* 491 */                                           l0olllO1i.I000II(l01o0io1ooo0322);
/* 498 */                                           l01o0io1ooo0322.I00io1l.I0000O(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 501 */                                           return l0l1iiiol2;
                                                }
                                            } else {
/* 168 */                                       l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i2.I00ilO0;
/* 170 */                                       l0olllO1i.I000II(l01o0io1ooo05);
/* 177 */                                       l01o0io1ooo05.I00lll10.I00000oOI("Main event not found");
/* 180 */                                       cursorRawQuery.close();
/* 183 */                                       pair2 = null;
/* 184 */                                       l0l1iiiol2 = null;
                                            }
/* 186 */                                   j = 0;
                                            pair = pair2;
                                        } catch (SQLiteException e4) {
/* 192 */                                   e = e4;
/* 193 */                                   l0l1iiiol2 = null;
                                        }
                                    } catch (Throwable th) {
/* 190 */                               th = th;
/* 267 */                               cursor = cursorRawQuery;
/* 502 */                               if (cursor != null) {
/* 504 */                                   cursor.close();
                                        }
/* 507 */                               throw th;
                                    }
                                } catch (SQLiteException e5) {
/* 274 */                           e = e5;
/* 275 */                           l0l1iiiol2 = null;
/* 277 */                           j = 0;
/* 284 */                           cursorRawQuery = null;
                                } catch (Throwable th2) {
/* 270 */                           th = th2;
/* 280 */                           cursor = null;
                                }
/* 301 */                       if (pair != 0 || (obj = pair.first) == null) {
/* 489 */                           l01O0IO1ooO0 l01o0io1ooo03222 = l0olllo1i.I00ilO0;
/* 491 */                           l0olllO1i.I000II(l01o0io1ooo03222);
/* 498 */                           l01o0io1ooo03222.I00io1l.I0000O(str2, "Extra parameter without existing main event. eventName, eventId", l);
/* 501 */                           return l0l1iiiol2;
                                }
/* 312 */                       this.I00000oOI = (l0l1iIIOl) obj;
/* 322 */                       this.I00000oIO = ((Long) pair.second).longValue();
/* 324 */                       lilool0.I00i0oil();
/* 337 */                       this.I0000Il00O = (Long) lio010i.I01101olii("_eid", (l0l1iIIOl) this.I00000oOI);
                            } else {
/* 125 */                       j = 0;
                            }
                            long j2 = this.I00000oIO - 1;
/* 344 */                   this.I00000oIO = j2;
/* 348 */                   if (j2 <= j) {
/* 350 */                       iOl1lOo1IO iol1loo1io2 = lilool0.I00iiO;
/* 352 */                       lilOOl0.I00O0o1oo(iol1loo1io2);
/* 357 */                       l0olllO1i l0olllo1i3 = (l0olllO1i) iol1loo1io2.I00iOIl;
/* 359 */                       iol1loo1io2.I010II();
/* 362 */                       l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i3.I00ilO0;
/* 364 */                       l0olllO1i.I000II(l01o0io1ooo06);
/* 371 */                       l01o0io1ooo06.I00lll10.I0000Il00O("Clearing complex main event info. appId", str);
                                try {
/* 384 */                           iol1loo1io2.I01Io11IiiiO().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                                } catch (SQLiteException e6) {
/* 389 */                           l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i3.I00ilO0;
/* 391 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 398 */                           l01o0io1ooo07.I00ilO0.I0000Il00O("Error clearing complex main event", e6);
                                }
                            } else {
/* 402 */                       iOl1lOo1IO iol1loo1io3 = lilool0.I00iiO;
/* 404 */                       lilOOl0.I00O0o1oo(iol1loo1io3);
/* 415 */                       iol1loo1io3.I011Ill(str, l, this.I00000oIO, (l0l1iIIOl) this.I00000oOI);
                            }
/* 420 */                   ArrayList arrayList = new ArrayList();
/* 439 */                   for (l0lliIlIO l0lliilio : ((l0l1iIIOl) this.I00000oOI).I001IO000()) {
/* 447 */                       lilool0.I00i0oil();
/* 458 */                       if (lio010i.I010oio1OO0(l0lliilio.I001IIilI0O(), l0l1iiiol) == null) {
/* 460 */                           arrayList.add(l0lliilio);
                                }
                            }
/* 468 */                   if (arrayList.isEmpty()) {
/* 475 */                       l01O0IO1ooO0 l01o0io1ooo08 = l0olllo1i.I00ilO0;
/* 477 */                       l0olllO1i.I000II(l01o0io1ooo08);
/* 484 */                       l01o0io1ooo08.I00io1l.I0000Il00O("No unique parameters in main event. eventName", str2);
                            } else {
/* 470 */                       arrayList.addAll(listI001IO000);
/* 473 */                       listI001IO000 = arrayList;
                            }
/* 487 */                   strI001iOo1i0O = str2;
                        } else {
/* 513 */                   this.I0000Il00O = l;
/* 515 */                   this.I00000oOI = l0l1iiiol;
/* 517 */                   lilool0.I00i0oil();
/* 526 */                   l0lliIlIO l0lliilioI010oio1OO03 = lio010i.I010oio1OO0("_epc", l0l1iiiol);
/* 533 */                   Object objI011Ill = l0lliilioI010oio1OO03 != null ? lio010i.I011Ill(l0lliilioI010oio1OO03) : null;
/* 546 */                   long jLongValue = ((Long) (objI011Ill != null ? objI011Ill : 0L)).longValue();
/* 550 */                   this.I00000oIO = jLongValue;
/* 554 */                   if (jLongValue <= 0) {
/* 556 */                       l01O0IO1ooO0 l01o0io1ooo09 = l0olllo1i.I00ilO0;
/* 558 */                       l0olllO1i.I000II(l01o0io1ooo09);
/* 565 */                       l01o0io1ooo09.I00io1l.I0000Il00O("Complex event with zero extra param count. eventName", strI001iOo1i0O);
                            } else {
/* 569 */                       iOl1lOo1IO iol1loo1io4 = lilool0.I00iiO;
/* 571 */                       lilOOl0.I00O0o1oo(iol1loo1io4);
/* 584 */                       iol1loo1io4.I011Ill(str, l, this.I00000oIO, l0l1iiiol);
                            }
                        }
                    }
/* 591 */           l0l0O000 l0l0o000 = (l0l0O000) l0l1iiiol.I000OiO();
/* 593 */           l0l0o000.I000oI1ioi(strI001iOo1i0O);
/* 596 */           l0l0o000.I0000Il00O();
/* 603 */           ((l0l1iIIOl) l0l0o000.I00iiI).I00IoO0();
/* 606 */           l0l0o000.I0000Il00O();
/* 613 */           ((l0l1iIIOl) l0l0o000.I00iiI).I00IoIO0lI(listI001IO000);
/* 620 */           return (l0l1iIIOl) l0l0o000.I0000oI00();
                }
            }
