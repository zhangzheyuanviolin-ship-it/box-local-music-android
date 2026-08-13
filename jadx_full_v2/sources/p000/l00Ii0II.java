            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteFullException;
            import android.os.SystemClock;
            
            public final class l00Ii0II extends iolOI0li {
                public static final String[] I00ilI0I1 = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
                public iOio0o1oi1I I00iiO;
                public boolean I00iio;

                @Override
                public final boolean I010iIIOlo() {
/* 1 */             return false;
                }

                public final void I010ioo() {
                    int iDelete;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010II();
                    try {
/* 8 */                 SQLiteDatabase sQLiteDatabaseI010l1O = I010l1O();
/* 12 */                if (sQLiteDatabaseI010l1O == null || (iDelete = sQLiteDatabaseI010l1O.delete("messages", null, null)) <= 0) {
/* 42 */                    return;
                        }
/* 23 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 25 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 36 */                l01o0io1ooo0.I00lll10.I0000Il00O("Reset local analytics data. records", Integer.valueOf(iDelete));
                    } catch (SQLiteException e) {
/* 43 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 45 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 52 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Error resetting local analytics data. error", e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[PHI: r4
                  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I010l10O() {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             I010II();
/* 12 */            if (!this.I00iio && l0olllo1i.I00iOIl.getDatabasePath("google_app_measurement_local.db").exists()) {
/* 32 */                int i = 5;
/* 33 */                for (int i2 = 0; i2 < 5; i2++) {
/* 35 */                    SQLiteDatabase sQLiteDatabase = null;
                            try {
                                try {
/* 37 */                            SQLiteDatabase sQLiteDatabaseI010l1O = I010l1O();
/* 41 */                            if (sQLiteDatabaseI010l1O == null) {
/* 43 */                                this.I00iio = true;
/* 245 */                               return;
                                    }
/* 46 */                            sQLiteDatabaseI010l1O.beginTransaction();
/* 62 */                            sQLiteDatabaseI010l1O.delete("messages", "type == ?", new String[]{Integer.toString(3)});
/* 65 */                            sQLiteDatabaseI010l1O.setTransactionSuccessful();
/* 68 */                            sQLiteDatabaseI010l1O.endTransaction();
/* 71 */                            sQLiteDatabaseI010l1O.close();
/* 74 */                            return;
                                } catch (SQLiteException e) {
/* 78 */                            if (0 != 0) {
                                        try {
/* 84 */                                    if (sQLiteDatabase.inTransaction()) {
/* 86 */                                        sQLiteDatabase.endTransaction();
                                            }
                                        } catch (Throwable th) {
/* 135 */                                   if (0 != 0) {
/* 137 */                                       sQLiteDatabase.close();
                                            }
/* 140 */                                   throw th;
                                        }
                                    }
/* 89 */                            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 91 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 96 */                            l01o0io1ooo0.I00ilO0.I0000Il00O("Error deleting app launch break from local database", e);
/* 99 */                            this.I00iio = true;
/* 101 */                           if (0 != 0) {
/* 112 */                               sQLiteDatabase.close();
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused) {
/* 105 */                       SystemClock.sleep(i);
/* 108 */                       i += 20;
/* 110 */                       if (0 != 0) {
/* 112 */                           sQLiteDatabase.close();
                                }
                            } catch (SQLiteFullException e2) {
/* 117 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 119 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 124 */                       l01o0io1ooo02.I00ilO0.I0000Il00O("Error deleting app launch break from local database", e2);
/* 127 */                       this.I00iio = true;
/* 129 */                       if (0 != 0) {
                                }
                            }
                        }
/* 141 */               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 143 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 150 */               l01o0io1ooo03.I00l0I0l0lO1.I00000oOI("Error deleting app launch break from local database in reasonable time");
                    }
                }

                public final SQLiteDatabase I010l1O() {
/* 4 */             if (this.I00iio) {
/* 3 */                 return null;
                    }
/* 9 */             SQLiteDatabase writableDatabase = this.I00iiO.getWritableDatabase();
/* 13 */            if (writableDatabase != null) {
/* 20 */                return writableDatabase;
                    }
/* 16 */            this.I00iio = true;
/* 3 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:120:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0170 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: SQLiteException -> 0x0093, SQLiteDatabaseLockedException -> 0x009a, SQLiteFullException -> 0x009e, all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0150 A[PHI: r8 r10 r17
                  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
                  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
                  (r10v5 android.database.sqlite.SQLiteDatabase)
                  (r10v6 android.database.sqlite.SQLiteDatabase)
                  (r10v8 android.database.sqlite.SQLiteDatabase)
                 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
                  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I010l1ol111(int i, byte[] bArr) {
                    SQLiteDatabase sQLiteDatabaseI010l1O;
                    boolean z;
                    boolean z2;
                    Cursor cursorRawQuery;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             I010II();
/* 12 */            boolean z3 = false;
/* 12 */            z3 = false;
/* 13 */            if (!this.I00iio) {
/* 16 */                iIl1iil iil1iil = l0olllo1i.I00iio;
/* 18 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 20 */                iol01I0001 iol01i0001 = iol1II1ii1i.I010ioo;
/* 22 */                Cursor cursor = null;
/* 38 */                lli10iI lli10iiI010ioo = iil1iil.I01101IOlO(null, iol01i0001) ? l0olllo1i.I000iOII().I010ioo(null) : null;
/* 41 */                ContentValues contentValues = new ContentValues();
/* 50 */                contentValues.put("type", Integer.valueOf(i));
/* 57 */                contentValues.put("entry", bArr);
/* 66 */                if (l0olllo1i.I00iio.I01101IOlO(null, iol01i0001) && lli10iiI010ioo != null) {
/* 74 */                    contentValues.put("app_version", lli10iiI010ioo.I00iiO);
/* 85 */                    contentValues.put("app_version_int", Long.valueOf(lli10iiI010ioo.I00l0OO0IO));
                        }
/* 89 */                int i2 = 5;
/* 90 */                int i3 = 0;
/* 91 */                for (int i4 = 5; i3 < i4; i4 = 5) {
                            try {
/* 94 */                        sQLiteDatabaseI010l1O = I010l1O();
                            } catch (SQLiteDatabaseLockedException unused) {
/* 320 */                       z = z3 ? 1 : 0;
/* 322 */                       sQLiteDatabaseI010l1O = null;
/* 323 */                       cursorRawQuery = null;
                            } catch (SQLiteFullException e) {
/* 343 */                       e = e;
/* 344 */                       z = z3 ? 1 : 0;
/* 346 */                       sQLiteDatabaseI010l1O = null;
/* 347 */                       cursorRawQuery = null;
                            } catch (SQLiteException e2) {
/* 280 */                       e = e2;
/* 281 */                       z = z3 ? 1 : 0;
/* 283 */                       z2 = true;
/* 285 */                       sQLiteDatabaseI010l1O = null;
/* 286 */                       cursorRawQuery = null;
                            } catch (Throwable th) {
/* 276 */                       th = th;
/* 277 */                       sQLiteDatabaseI010l1O = null;
                            }
/* 98 */                    if (sQLiteDatabaseI010l1O == null) {
/* 100 */                       this.I00iio = true;
                            } else {
                                try {
/* 124 */                           sQLiteDatabaseI010l1O.beginTransaction();
/* 129 */                           cursorRawQuery = sQLiteDatabaseI010l1O.rawQuery("select count(1) from messages", null);
/* 133 */                           long j = 0;
/* 135 */                           if (cursorRawQuery == null) {
/* 173 */                               if (j < 100000) {
                                        }
/* 249 */                               sQLiteDatabaseI010l1O.insertOrThrow("messages", null, contentValues);
/* 252 */                               sQLiteDatabaseI010l1O.setTransactionSuccessful();
/* 255 */                               sQLiteDatabaseI010l1O.endTransaction();
/* 258 */                               if (cursorRawQuery != null) {
                                        }
/* 263 */                               sQLiteDatabaseI010l1O.close();
/* 266 */                               return z2;
                                    }
                                    try {
                                        try {
/* 141 */                                   if (cursorRawQuery.moveToFirst()) {
/* 143 */                                       j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                            }
/* 173 */                                   if (j < 100000) {
/* 175 */                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 182 */                                       l01o0io1ooo0.I00ilO0.I00000oOI("Data loss, local db full");
/* 190 */                                       long j2 = 100001 - j;
/* 199 */                                       long jDelete = sQLiteDatabaseI010l1O.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
/* 206 */                                       if (jDelete != j2) {
/* 208 */                                           l0olllO1i.I000II(l01o0io1ooo0);
/* 211 */                                           IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00ilO0;
/* 215 */                                           z = z3 ? 1 : 0;
                                                    try {
                                                        try {
/* 221 */                                                   z2 = true;
                                                        } catch (SQLiteDatabaseLockedException unused2) {
/* 325 */                                                   SystemClock.sleep(i2);
/* 328 */                                                   i2 += 20;
/* 330 */                                                   if (cursorRawQuery != null) {
/* 332 */                                                       cursorRawQuery.close();
                                                            }
/* 335 */                                                   if (sQLiteDatabaseI010l1O == null) {
/* 337 */                                                       sQLiteDatabaseI010l1O.close();
                                                            }
/* 369 */                                                   i3++;
/* 371 */                                                   z3 = z;
                                                        }
                                                    } catch (SQLiteFullException e3) {
/* 243 */                                               e = e3;
/* 348 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 355 */                                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry; local database full", e);
/* 359 */                                               this.I00iio = true;
/* 361 */                                               if (cursorRawQuery != null) {
/* 363 */                                                   cursorRawQuery.close();
                                                        }
/* 366 */                                               if (sQLiteDatabaseI010l1O != null) {
                                                        }
/* 369 */                                               i3++;
/* 371 */                                               z3 = z;
                                                    } catch (SQLiteException e4) {
/* 241 */                                               e = e4;
/* 151 */                                               z2 = true;
/* 287 */                                               if (sQLiteDatabaseI010l1O != null && sQLiteDatabaseI010l1O.inTransaction()) {
/* 295 */                                                   sQLiteDatabaseI010l1O.endTransaction();
                                                        }
/* 298 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 305 */                                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry to local database", e);
/* 310 */                                               this.I00iio = z2;
/* 312 */                                               if (cursorRawQuery != null) {
/* 314 */                                                   cursorRawQuery.close();
                                                        }
/* 317 */                                               if (sQLiteDatabaseI010l1O != null) {
                                                        }
/* 369 */                                               i3++;
/* 371 */                                               z3 = z;
                                                    }
                                                    try {
/* 232 */                                               iOloiOI1.I0000oI00("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                                    } catch (SQLiteFullException e5) {
/* 238 */                                               e = e5;
/* 348 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 355 */                                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry; local database full", e);
/* 359 */                                               this.I00iio = true;
/* 361 */                                               if (cursorRawQuery != null) {
                                                        }
/* 366 */                                               if (sQLiteDatabaseI010l1O != null) {
                                                        }
/* 369 */                                               i3++;
/* 371 */                                               z3 = z;
                                                    } catch (SQLiteException e6) {
/* 236 */                                               e = e6;
/* 287 */                                               if (sQLiteDatabaseI010l1O != null) {
/* 295 */                                                   sQLiteDatabaseI010l1O.endTransaction();
                                                        }
/* 298 */                                               l0olllO1i.I000II(l01o0io1ooo0);
/* 305 */                                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry to local database", e);
/* 310 */                                               this.I00iio = z2;
/* 312 */                                               if (cursorRawQuery != null) {
                                                        }
/* 317 */                                               if (sQLiteDatabaseI010l1O != null) {
                                                        }
/* 369 */                                               i3++;
/* 371 */                                               z3 = z;
                                                    }
                                                } else {
/* 245 */                                           z = z3 ? 1 : 0;
/* 247 */                                           z2 = true;
                                                }
                                            }
/* 249 */                                   sQLiteDatabaseI010l1O.insertOrThrow("messages", null, contentValues);
/* 252 */                                   sQLiteDatabaseI010l1O.setTransactionSuccessful();
/* 255 */                                   sQLiteDatabaseI010l1O.endTransaction();
/* 258 */                                   if (cursorRawQuery != null) {
/* 260 */                                       cursorRawQuery.close();
                                            }
/* 263 */                                   sQLiteDatabaseI010l1O.close();
/* 266 */                                   return z2;
                                        } catch (Throwable th2) {
/* 341 */                                   th = th2;
/* 267 */                                   cursor = cursorRawQuery;
/* 376 */                                   if (cursor != null) {
/* 378 */                                       cursor.close();
                                            }
/* 381 */                                   if (sQLiteDatabaseI010l1O != null) {
/* 383 */                                       sQLiteDatabaseI010l1O.close();
                                            }
/* 386 */                                   throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused3) {
/* 155 */                               z = z3 ? 1 : 0;
/* 325 */                               SystemClock.sleep(i2);
/* 328 */                               i2 += 20;
/* 330 */                               if (cursorRawQuery != null) {
                                        }
/* 335 */                               if (sQLiteDatabaseI010l1O == null) {
                                        }
/* 369 */                               i3++;
/* 371 */                               z3 = z;
                                    } catch (SQLiteFullException e7) {
/* 159 */                               e = e7;
/* 160 */                               z = z3 ? 1 : 0;
/* 348 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 355 */                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry; local database full", e);
/* 359 */                               this.I00iio = true;
/* 361 */                               if (cursorRawQuery != null) {
                                        }
/* 366 */                               if (sQLiteDatabaseI010l1O != null) {
                                        }
/* 369 */                               i3++;
/* 371 */                               z3 = z;
                                    } catch (SQLiteException e8) {
/* 148 */                               e = e8;
/* 149 */                               z = z3 ? 1 : 0;
/* 151 */                               z2 = true;
/* 287 */                               if (sQLiteDatabaseI010l1O != null) {
                                        }
/* 298 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 305 */                               l01o0io1ooo0.I00ilO0.I0000Il00O("Error writing entry to local database", e);
/* 310 */                               this.I00iio = z2;
/* 312 */                               if (cursorRawQuery != null) {
                                        }
/* 317 */                               if (sQLiteDatabaseI010l1O != null) {
                                        }
/* 369 */                               i3++;
/* 371 */                               z3 = z;
                                    }
                                } catch (SQLiteDatabaseLockedException unused4) {
/* 113 */                           z = z3 ? 1 : 0;
/* 272 */                           cursorRawQuery = null;
                                } catch (SQLiteFullException e9) {
/* 117 */                           e = e9;
/* 118 */                           z = z3 ? 1 : 0;
/* 274 */                           cursorRawQuery = null;
                                } catch (SQLiteException e10) {
/* 106 */                           e = e10;
/* 107 */                           z = z3 ? 1 : 0;
/* 109 */                           z2 = true;
/* 270 */                           cursorRawQuery = null;
                                } catch (Throwable th3) {
/* 103 */                           th = th3;
                                }
/* 369 */                       i3++;
/* 371 */                       z3 = z;
                            }
                        }
/* 387 */               boolean z4 = z3 ? 1 : 0;
/* 389 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 396 */               l01o0io1ooo0.I00lll10.I00000oOI("Failed to write entry to local database");
/* 900 */               return z4;
                    }
/* 102 */           return z3;
                }
            }
