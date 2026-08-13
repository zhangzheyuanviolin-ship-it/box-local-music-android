            package net.zetetic.database.sqlcipher;

            import android.database.AbstractWindowedCursor;
            import android.database.CursorWindow;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.HashMap;
            import p000.I000II;
            
/* 25 */    public class SQLiteCursor extends AbstractWindowedCursor {
                public static final int I00io1l = (int) (Math.pow(1024.0d, 2.0d) * 8.0d);
                public final String[] I00iOIl;
                public final SQLiteQuery I00iiI;
                public final SQLiteCursorDriver I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public HashMap I00ilO0;

                public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
/* 5 */             this.I00iio = -1;
/* 8 */             if (sQLiteQuery == null) {
/* 23 */                I000II.I000iOII("query object cannot be null");
/* 215 */               throw null;
                    }
/* 10 */            this.I00iiO = sQLiteCursorDriver;
/* 12 */            this.I00ilO0 = null;
/* 14 */            this.I00iiI = sQLiteQuery;
/* 18 */            this.I00iOIl = sQLiteQuery.I00ilI0I1;
                }

                public final void I00000oIO(int i) {
/* 1 */             SQLiteQuery sQLiteQuery = this.I00iiI;
/* 5 */             String strI00IOO = sQLiteQuery.I00iiI.I00IOO();
/* 11 */            int i2 = I00io1l + Barcode.FORMAT_UPC_A;
/* 13 */            CursorWindow window = getWindow();
/* 17 */            if (window == null) {
/* 25 */                setWindow(new CursorWindow(strI00IOO, i2));
                    } else {
/* 29 */                window.clear();
                    }
                    try {
/* 37 */                if (this.I00iio != -1) {
/* 79 */                    sQLiteQuery.I000l1(((AbstractWindowedCursor) this).mWindow, Math.max(i - (this.I00ilI0I1 / 3), 0), i, false);
                        } else {
/* 50 */                    this.I00iio = sQLiteQuery.I000l1(((AbstractWindowedCursor) this).mWindow, Math.max(i, 0), i, true);
/* 58 */                    this.I00ilI0I1 = ((AbstractWindowedCursor) this).mWindow.getNumRows();
/* 62 */                    Log.isLoggable("SQLiteCursor", 3);
                        }
                    } catch (RuntimeException e) {
/* 84 */                setWindow(null);
/* 186 */               throw e;
                    }
                }

                @Override
                public final void close() {
/* 1 */             super.close();
                    synchronized (this) {
/* 7 */                 this.I00iiI.I000II();
/* 12 */                this.I00iiO.getClass();
                    }
                }

                @Override
                public final void deactivate() {
/* 1 */             super.deactivate();
/* 6 */             this.I00iiO.getClass();
                }

                @Override
                public final void finalize() throws Throwable {
                    try {
/* 3 */                 if (((AbstractWindowedCursor) this).mWindow != null) {
/* 5 */                     close();
                        }
                    } finally {
/* 15 */                super.finalize();
                    }
                }

                @Override
                public final int getColumnIndex(String str) {
/* 3 */             if (this.I00ilO0 == null) {
/* 5 */                 String[] strArr = this.I00iOIl;
/* 7 */                 int length = strArr.length;
/* 12 */                HashMap map = new HashMap(length, 1.0f);
/* 16 */                for (int i = 0; i < length; i++) {
/* 24 */                    map.put(strArr[i], Integer.valueOf(i));
                        }
/* 30 */                this.I00ilO0 = map;
                    }
/* 34 */            int iLastIndexOf = str.lastIndexOf(46);
/* 39 */            if (iLastIndexOf != -1) {
/* 54 */                Log.e("SQLiteCursor", "requesting column name with table name -- ".concat(str), new Exception());
/* 59 */                str = str.substring(iLastIndexOf + 1);
                    }
/* 69 */            Integer num = (Integer) this.I00ilO0.get(str);
/* 71 */            if (num != null) {
/* 73 */                return num.intValue();
                    }
/* 38 */            return -1;
                }

                @Override
                public final String[] getColumnNames() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final int getCount() {
/* 4 */             if (this.I00iio == -1) {
/* 7 */                 I00000oIO(0);
                    }
/* 10 */            return this.I00iio;
                }

                @Override
                public final boolean onMove(int i, int i2) {
/* 1 */             CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
/* 3 */             if (cursorWindow != null && i2 >= cursorWindow.getStartPosition()) {
/* 24 */                if (i2 < ((AbstractWindowedCursor) this).mWindow.getNumRows() + ((AbstractWindowedCursor) this).mWindow.getStartPosition()) {
/* 29 */                    return true;
                        }
                    }
/* 26 */            I00000oIO(i2);
/* 29 */            return true;
                }

                @Override
                public final boolean requery() {
/* 6 */             if (isClosed()) {
/* 5 */                 return false;
                    }
                    synchronized (this) {
                        try {
/* 18 */                    if (!this.I00iiI.I00iiI.isOpen()) {
/* 5 */                         return false;
                            }
/* 24 */                    CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
/* 26 */                    if (cursorWindow != null) {
/* 28 */                        cursorWindow.clear();
                            }
/* 32 */                    ((AbstractWindowedCursor) this).mPos = -1;
/* 34 */                    this.I00iio = -1;
/* 38 */                    this.I00iiO.getClass();
                            try {
/* 42 */                        return super.requery();
                            } catch (IllegalStateException e) {
/* 68 */                        Log.w("SQLiteCursor", "requery() failed " + e.getMessage(), e);
/* 5 */                         return false;
                            }
                        } catch (Throwable th) {
/* 113 */                   throw th;
                        }
                    }
                }

                @Override
                public final void setWindow(CursorWindow cursorWindow) {
/* 1 */             super.setWindow(cursorWindow);
/* 5 */             this.I00iio = -1;
                }

                @Deprecated
/* 26 */        public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
/* 27 */            this(sQLiteCursorDriver, str, sQLiteQuery);
                }
            }
