            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.util.Base64;
            import android.util.Log;
            import android.util.Size;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IiI0oIlol0 implements OllIoO1OO, IIiOOIoi0, Oll01O011O, OiIIOlilOlo {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public IiI0oIlol0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public void I00000oIO() {
/* 3 */             iiOlilo0IIIl iiolilo0iiil = (iiOlilo0IIIl) this.I00iiI;
/* 7 */             OOIIlOOo oOIIlOOo = (OOIIlOOo) this.I00iiO;
/* 11 */            IIllOo0 iIllOo0 = (IIllOo0) this.I00iio;
/* 24 */            if (((OOIIooi) iiolilo0iiil.I00iOIl).I00io1l.compareAndSet(oOIIlOOo, null)) {
/* 28 */                oOIIlOOo.I00000oOI(OOIIollIo.I00iOIl);
                    }
/* 31 */            Illo1O1o illo1O1o = oOIIlOOo.I0000oI00;
/* 33 */            if (illo1O1o != null) {
/* 36 */                illo1O1o.cancel(false);
/* 39 */                oOIIlOOo.I0000oI00 = null;
                    }
/* 45 */            iIllOo0.I0000O().I000OOo1O(oOIIlOOo);
                }

                @Override
                public void I00000oOI(I1lO00 i1lO00) {
                    OOIO1OOiI0 oOIO1OOiI0;
/* 3 */             iiOlilo0IIIl iiolilo0iiil = (iiOlilo0IIIl) this.I00iiI;
/* 7 */             IIllOo0 iIllOo0 = (IIllOo0) this.I00iiO;
/* 11 */            Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00iio;
/* 15 */            OOIIooi oOIIooi = (OOIIooi) iiolilo0iiil.I00iOIl;
/* 17 */            Objects.toString(i1lO00);
/* 23 */            l11I11lO.I0000O(3, "PreviewView");
/* 40 */            boolean z = iIllOo0.I0010o().I000iOII() == 0;
/* 41 */            OOIIloi0 oOIIloi0 = oOIIooi.I00iio;
/* 43 */            Size size = oll0I0l1i1.I00000oOI;
/* 45 */            oOIIloi0.getClass();
/* 48 */            Objects.toString(i1lO00);
/* 51 */            Objects.toString(size);
/* 56 */            l11I11lO.I0000O(3, "PreviewTransform");
/* 61 */            oOIIloi0.I00000oOI = i1lO00.I00000oIO;
/* 65 */            oOIIloi0.I0000Il00O = i1lO00.I00000oOI;
/* 67 */            int i = i1lO00.I0000Il00O;
/* 69 */            oOIIloi0.I0000oI00 = i;
/* 71 */            oOIIloi0.I00000oIO = size;
/* 73 */            oOIIloi0.I0001Ioi1lo = z;
/* 77 */            oOIIloi0.I000II = i1lO00.I0000O;
/* 81 */            oOIIloi0.I0000O = i1lO00.I0000oI00;
/* 84 */            if (i == -1 || ((oOIO1OOiI0 = oOIIooi.I00iiI) != null && (oOIO1OOiI0 instanceof Oll0OO0O))) {
/* 98 */                oOIIooi.I00ilI0I1 = true;
                    } else {
/* 95 */                oOIIooi.I00ilI0I1 = false;
                    }
/* 100 */           oOIIooi.I00000oIO();
                }

                public void I0000Il00O(Oo1Ioo1 oo1Ioo1, I1iOo1IoI1 i1iOo1IoI1) {
/* 3 */             OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiI;
/* 7 */             O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I00iiO;
/* 11 */            Iiioioo1llO iiioioo1llO = (Iiioioo1llO) this.I00iio;
/* 13 */            if (oo1Ioo1 != null) {
/* 15 */                String str = oo1Ioo1.I00000oIO;
/* 17 */                if (str == null) {
/* 21 */                    oOo0ooi.I00iOIl = "Empty access token";
                        } else {
/* 24 */                    String str2 = oo1Ioo1.I0000Il00O;
/* 26 */                    if (str2 == null) {
/* 30 */                        oOo0ooi.I00iOIl = "Empty refresh token";
                            } else {
/* 33 */                        Long l = oo1Ioo1.I00000oOI;
/* 35 */                        if (l == null) {
/* 39 */                            oOo0ooi.I00iOIl = "Empty expiration time";
                                } else {
/* 42 */                            long jLongValue = l.longValue();
/* 46 */                            Ii1liIllli0 ii1liIllli0 = o1ol100o0O.I0000Il00O;
/* 48 */                            ii1liIllli0.getClass();
/* 57 */                            iOi1IOoIO0l.I00000oOI(new I00oO101o(ii1liIllli0, str, str2, jLongValue, (IOoil1iiIilo) null));
/* 60 */                            o1ol100o0O.I000iOII = str;
                                }
                            }
                        }
                    } else if (i1iOo1IoI1 != null) {
/* 75 */                oOo0ooi.I00iOIl = IIl001iO0Io.I000o00OoI0I("Token exchange failed: ", i1iOo1IoI1.getMessage());
                    } else {
/* 80 */                oOo0ooi.I00iOIl = "Token exchange failed";
                    }
/* 82 */            Object obj = oOo0ooi.I00iOIl;
/* 84 */            if (obj == null) {
/* 94 */                iiioioo1llO.invoke(new Oo1IoiO0o(Oo1Ioili0lO.I00iiI, null));
                    } else {
/* 107 */               iiioioo1llO.invoke(new Oo1IoiO0o(Oo1Ioili0lO.I00iOIl, (String) obj));
                    }
                }

                @Override
                public Object I000oI1ioi() {
/* 3 */             IiI101Oo iiI101Oo = (IiI101Oo) this.I00iiI;
/* 7 */             I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 11 */            I1l0Ioi01 i1l0Ioi01 = (I1l0Ioi01) this.I00iio;
/* 13 */            OiIIilol0iO oiIIilol0iO = iiI101Oo.I0000O;
/* 15 */            oiIIilol0iO.getClass();
/* 18 */            OOIio1010OoO oOIio1010OoO = i1lO11.I0000Il00O;
/* 20 */            String str = i1l0Ioi01.I00000oIO;
/* 35 */            if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
/* 44 */                new StringBuilder("Storing event with priority=").append(oOIio1010OoO);
                    }
/* 50 */            IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(7);
/* 53 */            iiI0oIlol0.I00iiI = oiIIilol0iO;
/* 55 */            iiI0oIlol0.I00iio = i1l0Ioi01;
/* 57 */            iiI0oIlol0.I00iiO = i1lO11;
/* 59 */            VarHandle.storeStoreFence();
/* 68 */            long jLongValue = ((Long) oiIIilol0iO.I000II(iiI0oIlol0)).longValue();
/* 76 */            if (jLongValue >= 1) {
/* 79 */                I1lI0I0i1.I00000oIO(jLongValue, i1lO11, i1l0Ioi01);
                    }
/* 86 */            iiI101Oo.I00000oIO.I00II0Ol1O0l(i1lO11, 1, false);
/* 89 */            return null;
                }

                /* JADX WARN: Finally extract failed */
                @Override
                public Object apply(Object obj) {
                    int i;
                    long jInsert;
                    OiIIilol0iO oiIIilol0iO;
/* 3 */             int i2 = this.I00iOIl;
/* 5 */             O1I0ol o1I0ol = O1I0ol.CACHE_FULL;
/* 13 */            int i3 = 5;
/* 14 */            int i4 = 3;
/* 15 */            int i5 = 4;
/* 16 */            int i6 = 2;
/* 17 */            int i7 = 0;
/* 18 */            int i8 = 1;
                    switch (i2) {
                        case 6:
/* 676 */                   OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) this.I00iiI;
/* 680 */                   HashMap map = (HashMap) this.I00iiO;
/* 684 */                   iOliil ioliil = (iOliil) this.I00iio;
/* 688 */                   Cursor cursor = (Cursor) obj;
/* 690 */                   oiIIilol0iO2.getClass();
/* 697 */                   while (cursor.moveToNext()) {
/* 700 */                       String string = cursor.getString(0);
/* 705 */                       int i9 = cursor.getInt(1);
/* 709 */                       O1I0ol o1I0ol2 = O1I0ol.REASON_UNKNOWN;
/* 711 */                       if (i9 != 0) {
/* 717 */                           if (i9 == 1) {
/* 719 */                               o1I0ol2 = O1I0ol.MESSAGE_TOO_OLD;
                                    } else if (i9 == 2) {
/* 725 */                               o1I0ol2 = o1I0ol;
/* 726 */                               i = 2;
                                    } else if (i9 == 3) {
/* 731 */                               o1I0ol2 = O1I0ol.PAYLOAD_TOO_BIG;
                                    } else if (i9 == 4) {
/* 737 */                               o1I0ol2 = O1I0ol.MAX_RETRIES_REACHED;
                                    } else if (i9 == 5) {
/* 743 */                               o1I0ol2 = O1I0ol.INVALID_PAYLOD;
/* 745 */                               i = 2;
                                    } else {
/* 748 */                               if (i9 == 6) {
/* 750 */                                   o1I0ol2 = O1I0ol.SERVER_ERROR;
                                        } else {
/* 762 */                                   l11I1i.I00000oIO("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i9));
                                        }
/* 752 */                               i = 2;
                                    }
/* 713 */                           i = 2;
                                } else {
/* 713 */                           i = 2;
                                }
/* 766 */                       long j = cursor.getLong(i);
/* 774 */                       if (!map.containsKey(string)) {
/* 781 */                           map.put(string, new ArrayList());
                                }
/* 788 */                       List list = (List) map.get(string);
/* 792 */                       O1I0oo1Ii o1I0oo1Ii = new O1I0oo1Ii();
/* 795 */                       o1I0oo1Ii.I00000oIO = j;
/* 797 */                       o1I0oo1Ii.I00000oOI = o1I0ol2;
/* 799 */                       VarHandle.storeStoreFence();
/* 802 */                       list.add(o1I0oo1Ii);
                            }
/* 818 */                   for (Map.Entry entry : map.entrySet()) {
/* 826 */                       int i10 = O1I11lol0lOO.I0000Il00O;
/* 830 */                       new ArrayList();
/* 837 */                       String str = (String) entry.getKey();
/* 847 */                       List listUnmodifiableList = Collections.unmodifiableList((List) entry.getValue());
/* 851 */                       O1I11lol0lOO o1I11lol0lOO = new O1I11lol0lOO();
/* 854 */                       o1I11lol0lOO.I00000oIO = str;
/* 856 */                       o1I11lol0lOO.I00000oOI = listUnmodifiableList;
/* 858 */                       VarHandle.storeStoreFence();
/* 865 */                       ((ArrayList) ioliil.I00iiO).add(o1I11lol0lOO);
                            }
/* 871 */                   long jI0001Ioi1lo = oiIIilol0iO2.I00iiI.I0001Ioi1lo();
/* 875 */                   SQLiteDatabase sQLiteDatabaseI00000oIO = oiIIilol0iO2.I00000oIO();
/* 879 */                   sQLiteDatabaseI00000oIO.beginTransaction();
                            try {
/* 887 */                       Cursor cursorRawQuery = sQLiteDatabaseI00000oIO.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
/* 893 */                       OiII1li oiII1li = new OiII1li();
/* 896 */                       oiII1li.I00iOIl = jI0001Ioi1lo;
/* 898 */                       VarHandle.storeStoreFence();
/* 905 */                       Oo11I1IO oo11I1IO = (Oo11I1IO) OiIIilol0iO.I001l0I00(cursorRawQuery, oiII1li);
/* 907 */                       sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 910 */                       sQLiteDatabaseI00000oIO.endTransaction();
/* 913 */                       ioliil.I00iiI = oo11I1IO;
/* 939 */                       long jSimpleQueryForLong = oiIIilol0iO2.I00000oIO().compileStatement("PRAGMA page_size").simpleQueryForLong() * oiIIilol0iO2.I00000oIO().compileStatement("PRAGMA page_count").simpleQueryForLong();
/* 942 */                       long j2 = I1l0OIO0Oio.I0001Ioi1lo.I00000oIO;
/* 946 */                       OlOIOII olOIOII = new OlOIOII();
/* 949 */                       olOIOII.I00000oIO = jSimpleQueryForLong;
/* 951 */                       olOIOII.I00000oOI = j2;
/* 953 */                       VarHandle.storeStoreFence();
/* 958 */                       Io0IO1O io0IO1O = new Io0IO1O();
/* 961 */                       io0IO1O.I00000oIO = olOIOII;
/* 963 */                       VarHandle.storeStoreFence();
/* 966 */                       ioliil.I00iio = io0IO1O;
/* 976 */                       ioliil.I00ilI0I1 = (String) oiIIilol0iO2.I00ilI0I1.get();
/* 982 */                       Oo11I1IO oo11I1IO2 = (Oo11I1IO) ioliil.I00iiI;
/* 988 */                       List listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) ioliil.I00iiO);
/* 994 */                       Io0IO1O io0IO1O2 = (Io0IO1O) ioliil.I00iio;
/* 998 */                       String str2 = (String) ioliil.I00ilI0I1;
/* 1000 */                      IOIololliO iOIololliO = new IOIololliO();
/* 1003 */                      iOIololliO.I00000oIO = oo11I1IO2;
/* 1005 */                      iOIololliO.I00000oOI = listUnmodifiableList2;
/* 1007 */                      iOIololliO.I0000Il00O = io0IO1O2;
/* 1009 */                      iOIololliO.I0000O = str2;
/* 1011 */                      VarHandle.storeStoreFence();
/* 1014 */                      return iOIololliO;
                            } catch (Throwable th) {
/* 1016 */                      sQLiteDatabaseI00000oIO.endTransaction();
/* 1019 */                      throw th;
                            }
                        case 7:
/* 300 */                   OiIIilol0iO oiIIilol0iO3 = (OiIIilol0iO) this.I00iiI;
/* 304 */                   I1l0Ioi01 i1l0Ioi01 = (I1l0Ioi01) this.I00iio;
/* 308 */                   I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 312 */                   SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 344 */                   long jSimpleQueryForLong2 = oiIIilol0iO3.I00000oIO().compileStatement("PRAGMA page_size").simpleQueryForLong() * oiIIilol0iO3.I00000oIO().compileStatement("PRAGMA page_count").simpleQueryForLong();
/* 345 */                   I1l0OIO0Oio i1l0OIO0Oio = oiIIilol0iO3.I00iio;
/* 351 */                   if (jSimpleQueryForLong2 >= i1l0OIO0Oio.I00000oIO) {
/* 357 */                       oiIIilol0iO3.I000l1(1L, o1I0ol, i1l0Ioi01.I00000oIO);
/* 362 */                       return -1L;
                            }
/* 368 */                   Long lI0000Il00O = OiIIilol0iO.I0000Il00O(sQLiteDatabase, i1lO11);
/* 372 */                   if (lI0000Il00O != null) {
/* 374 */                       jInsert = lI0000Il00O.longValue();
                            } else {
/* 381 */                       ContentValues contentValues = new ContentValues();
/* 388 */                       contentValues.put("backend_name", i1lO11.I00000oIO);
/* 403 */                       contentValues.put("priority", Integer.valueOf(OOIioI1.I00000oIO(i1lO11.I0000Il00O)));
/* 408 */                       contentValues.put("next_request_ms", (Integer) 0);
/* 411 */                       byte[] bArr = i1lO11.I00000oOI;
/* 413 */                       if (bArr != null) {
/* 422 */                           contentValues.put("extras", Base64.encodeToString(bArr, 0));
                                }
/* 429 */                       jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                            }
/* 433 */                   int i11 = i1l0OIO0Oio.I0000oI00;
/* 437 */                   byte[] bArr2 = i1l0Ioi01.I0000Il00O.I00000oOI;
/* 444 */                   boolean z = bArr2.length <= i11;
/* 447 */                   ContentValues contentValues2 = new ContentValues();
/* 456 */                   contentValues2.put("context_id", Long.valueOf(jInsert));
/* 463 */                   contentValues2.put("transport_name", i1l0Ioi01.I00000oIO);
/* 474 */                   contentValues2.put("timestamp_ms", Long.valueOf(i1l0Ioi01.I0000O));
/* 485 */                   contentValues2.put("uptime_ms", Long.valueOf(i1l0Ioi01.I0000oI00));
/* 496 */                   contentValues2.put("payload_encoding", i1l0Ioi01.I0000Il00O.I00000oIO.I00000oIO);
/* 503 */                   contentValues2.put("code", i1l0Ioi01.I00000oOI);
/* 508 */                   contentValues2.put("num_attempts", (Integer) 0);
/* 517 */                   contentValues2.put("inline", Boolean.valueOf(z));
/* 529 */                   contentValues2.put("payload", z ? bArr2 : new byte[0]);
/* 535 */                   long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
/* 541 */                   if (!z) {
/* 551 */                       int iCeil = (int) Math.ceil(bArr2.length / i11);
/* 553 */                       for (int i12 = 1; i12 <= iCeil; i12++) {
/* 565 */                           byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i12 - 1) * i11, Math.min(i12 * i11, bArr2.length));
/* 571 */                           ContentValues contentValues3 = new ContentValues();
/* 578 */                           contentValues3.put("event_id", Long.valueOf(jInsert2));
/* 587 */                           contentValues3.put("sequence_num", Integer.valueOf(i12));
/* 590 */                           contentValues3.put("bytes", bArrCopyOfRange);
/* 596 */                           sQLiteDatabase.insert("event_payloads", null, contentValues3);
                                }
                            }
/* 620 */                   for (Map.Entry entry2 : Collections.unmodifiableMap(i1l0Ioi01.I0001Ioi1lo).entrySet()) {
/* 630 */                       ContentValues contentValues4 = new ContentValues();
/* 637 */                       contentValues4.put("event_id", Long.valueOf(jInsert2));
/* 648 */                       contentValues4.put("name", (String) entry2.getKey());
/* 659 */                       contentValues4.put("value", (String) entry2.getValue());
/* 665 */                       sQLiteDatabase.insert("event_metadata", null, contentValues4);
                            }
/* 669 */                   return Long.valueOf(jInsert2);
                        default:
/* 24 */                    OiIIilol0iO oiIIilol0iO4 = (OiIIilol0iO) this.I00iiI;
/* 28 */                    ArrayList arrayList = (ArrayList) this.I00iio;
/* 32 */                    I1lO11 i1lO112 = (I1lO11) this.I00iiO;
/* 36 */                    Cursor cursor2 = (Cursor) obj;
/* 42 */                    while (cursor2.moveToNext()) {
/* 44 */                        long j3 = cursor2.getLong(i7);
/* 59 */                        int i13 = cursor2.getInt(7) != 0 ? i8 : i7;
/* 63 */                        I0Oi111ii i0Oi111ii = new I0Oi111ii(i6);
/* 71 */                        i0Oi111ii.I00io1l = new HashMap();
/* 73 */                        String string2 = cursor2.getString(i8);
/* 77 */                        if (string2 == null) {
/* 289 */                           IOOlIIilOl0.I000II("Null transportName");
/* 56 */                            return null;
                                }
/* 79 */                        i0Oi111ii.I00iiI = string2;
/* 89 */                        i0Oi111ii.I00ilI0I1 = Long.valueOf(cursor2.getLong(i6));
/* 99 */                        i0Oi111ii.I00ilO0 = Long.valueOf(cursor2.getLong(i4));
/* 101 */                       if (i13 != 0) {
/* 105 */                           String string3 = cursor2.getString(i5);
/* 125 */                           i0Oi111ii.I00iio = new Il01oOi(string3 == null ? OiIIilol0iO.I00ilO0 : Il0IIil.I00000oIO(string3), cursor2.getBlob(i3));
/* 127 */                           oiIIilol0iO = oiIIilol0iO4;
                                } else {
/* 134 */                           String string4 = cursor2.getString(i5);
/* 143 */                           Il0IIil il0IIilI00000oIO = string4 == null ? OiIIilol0iO.I00ilO0 : Il0IIil.I00000oIO(string4);
/* 173 */                           Cursor cursorQuery = oiIIilol0iO4.I00000oIO().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j3)}, null, null, "sequence_num");
                                    try {
/* 179 */                               ArrayList arrayList2 = new ArrayList();
/* 182 */                               int length = i7;
/* 187 */                               while (cursorQuery.moveToNext()) {
/* 189 */                                   byte[] blob = cursorQuery.getBlob(i7);
/* 193 */                                   arrayList2.add(blob);
/* 197 */                                   length += blob.length;
                                        }
/* 200 */                               byte[] bArr3 = new byte[length];
/* 202 */                               int i14 = i7;
/* 203 */                               int length2 = i14;
/* 208 */                               while (i14 < arrayList2.size()) {
/* 214 */                                   byte[] bArr4 = (byte[]) arrayList2.get(i14);
/* 216 */                                   OiIIilol0iO oiIIilol0iO5 = oiIIilol0iO4;
/* 219 */                                   ArrayList arrayList3 = arrayList2;
/* 222 */                                   System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
/* 226 */                                   length2 += bArr4.length;
/* 227 */                                   i14++;
/* 229 */                                   arrayList2 = arrayList3;
/* 231 */                                   oiIIilol0iO4 = oiIIilol0iO5;
                                        }
/* 234 */                               oiIIilol0iO = oiIIilol0iO4;
/* 236 */                               cursorQuery.close();
/* 242 */                               i0Oi111ii.I00iio = new Il01oOi(il0IIilI00000oIO, bArr3);
                                    } catch (Throwable th2) {
/* 283 */                               cursorQuery.close();
/* 286 */                               throw th2;
                                    }
                                }
/* 249 */                       if (!cursor2.isNull(6)) {
/* 259 */                           i0Oi111ii.I00iiO = Integer.valueOf(cursor2.getInt(6));
                                }
/* 269 */                       arrayList.add(I1lI0I0i1.I00000oIO(j3, i1lO112, i0Oi111ii.I000lI()));
/* 272 */                       oiIIilol0iO4 = oiIIilol0iO;
/* 274 */                       i3 = 5;
/* 275 */                       i4 = 3;
/* 276 */                       i5 = 4;
/* 277 */                       i6 = 2;
/* 278 */                       i7 = 0;
/* 279 */                       i8 = 1;
                            }
/* 293 */                   return null;
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    switch (this.I00iOIl) {
                        case 1:
/* 61 */                    Executor executor = (Executor) this.I00iiI;
/* 65 */                    String str = (String) this.I00iiO;
/* 69 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iio;
/* 74 */                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 79 */                    O10loIll o10loIll = new O10loIll(0);
/* 82 */                    o10loIll.I00iiI = atomicBoolean;
/* 84 */                    VarHandle.storeStoreFence();
/* 89 */                    iIiOOI.I00000oIO(o10loIll, Iii1101i100I.I00iOIl);
/* 94 */                    O10loilI10Oo o10loilI10Oo = new O10loilI10Oo(0);
/* 97 */                    o10loilI10Oo.I00iiI = atomicBoolean;
/* 99 */                    o10loilI10Oo.I00iiO = iIiOOI;
/* 101 */                   o10loilI10Oo.I00iio = illOOo00lI;
/* 103 */                   VarHandle.storeStoreFence();
/* 106 */                   executor.execute(o10loilI10Oo);
/* 109 */                   return str;
                        default:
/* 8 */                     Ii00l101O ii00l101O = (Ii00l101O) this.I00iiI;
/* 12 */                    Ii01I10 ii01I10 = (Ii01I10) this.I00iiO;
/* 16 */                    IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iio;
/* 24 */                    O010OIi o010OIi = (O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio);
/* 30 */                    I0100i i0100i = new I0100i(25);
/* 33 */                    i0100i.I00iiI = o010OIi;
/* 35 */                    VarHandle.storeStoreFence();
/* 40 */                    iIiOOI.I00000oIO(i0100i, Iii1101i100I.I00iOIl);
/* 54 */                    return iOi1II01i0.I0000O(il001oo1.I00000oIO(ii00l101O), null, ii01I10, new IiI110i1O(illiIl1l11O, iIiOOI, null), 1);
                    }
                }
            }
