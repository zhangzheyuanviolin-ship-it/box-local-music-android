            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.SQLException;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteStatement;
            import android.text.TextUtils;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class IllO0lI implements Olil0l0 {
                public static final String[] I00iiI = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
                public static final String[] I00iiO = new String[0];
                public static final O0ioIllo0i1 I00iio;
                public static final O0ioIllo0i1 I00ilI0I1;
                public SQLiteDatabase I00iOIl;

                static {
/* 24 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 37 */            I00iio = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(26));
/* 50 */            I00ilI0I1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, new IOlIlo1(27));
                }

                @Override
                public final void I0010o() {
/* 3 */             this.I00iOIl.beginTransaction();
                }

                @Override
                public final void I001IIilI0O() {
/* 3 */             this.I00iOIl.disableWriteAheadLogging();
                }

                @Override
                public final void I001IO000(String str) throws SQLException {
/* 3 */             this.I00iOIl.execSQL(str);
                }

                @Override
                public final OlilOOI I001iOo1i0O(String str) throws SQLException {
/* 5 */             SQLiteStatement sQLiteStatementCompileStatement = this.I00iOIl.compileStatement(str);
/* 9 */             IllOIOi illOIOi = new IllOIOi(sQLiteStatementCompileStatement);
/* 12 */            illOIOi.I00iiO = sQLiteStatementCompileStatement;
/* 14 */            VarHandle.storeStoreFence();
/* 29 */            return illOIOi;
                }

                @Override
                public final void I001lloI() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 6 */             SQLiteDatabase sQLiteDatabase = this.I00iOIl;
/* 8 */             O0ioIllo0i1 o0ioIllo0i1 = I00ilI0I1;
/* 16 */            if (((Method) o0ioIllo0i1.getValue()) != null) {
/* 18 */                O0ioIllo0i1 o0ioIllo0i12 = I00iio;
/* 26 */                if (((Method) o0ioIllo0i12.getValue()) != null) {
/* 32 */                    Method method = (Method) o0ioIllo0i1.getValue();
/* 41 */                    Object objInvoke = ((Method) o0ioIllo0i12.getValue()).invoke(sQLiteDatabase, null);
/* 45 */                    if (objInvoke != null) {
/* 51 */                        method.invoke(objInvoke, 0, null, 0, null);
/* 54 */                        return;
                            } else {
/* 57 */                        I000II.I001IO000("Required value was null.");
/* 60 */                        return;
                            }
                        }
                    }
/* 61 */            I0010o();
                }

                @Override
                public final Cursor I00IoIO0lI(IIOOoll iIOOoll) {
/* 4 */             I0oioiIIlo i0oioiIIlo = new I0oioiIIlo(1);
/* 7 */             i0oioiIIlo.I00iiI = iIOOoll;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            SQLiteDatabase sQLiteDatabase = this.I00iOIl;
/* 16 */            IllO0OIO0 illO0OIO0 = new IllO0OIO0();
/* 19 */            illO0OIO0.I00000oIO = i0oioiIIlo;
/* 21 */            VarHandle.storeStoreFence();
/* 33 */            return sQLiteDatabase.rawQueryWithFactory(illO0OIO0, ((OlilIol) iIOOoll.I00iiI).I00iiI, I00iiO, null);
                }

                @Override
                public final boolean I00Iooi00oi() {
/* 3 */             return this.I00iOIl.enableWriteAheadLogging();
                }

                @Override
                public final void I00O0o1oo(Object[] objArr) throws SQLException {
/* 5 */             this.I00iOIl.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
                }

                @Override
                public final void I00O10llo() {
/* 3 */             this.I00iOIl.setTransactionSuccessful();
                }

                @Override
                public final void I00OI1() {
/* 3 */             this.I00iOIl.beginTransactionNonExclusive();
                }

                @Override
                public final void I00OloOo() {
/* 3 */             this.I00iOIl.endTransaction();
                }

                @Override
                public final boolean I00li1OI() {
/* 3 */             return this.I00iOIl.inTransaction();
                }

                @Override
                public final boolean I00o0l1o1o0() {
/* 3 */             return this.I00iOIl.isWriteAheadLoggingEnabled();
                }

                @Override
                public final int I00olI(ContentValues contentValues, Object[] objArr) throws SQLException {
/* 5 */             int i = 0;
/* 6 */             if (contentValues.size() == 0) {
/* 131 */               I000II.I000iOII("Empty values");
/* 5 */                 return 0;
                    }
/* 8 */             int size = contentValues.size();
/* 13 */            int length = objArr.length + size;
/* 14 */            Object[] objArr2 = new Object[length];
/* 20 */            StringBuilder sb = new StringBuilder("UPDATE ");
/* 28 */            sb.append(I00iiI[3]);
/* 33 */            sb.append("WorkSpec SET ");
/* 48 */            for (String str : contentValues.keySet()) {
/* 63 */                sb.append(i > 0 ? "," : "");
/* 66 */                sb.append(str);
/* 75 */                objArr2[i] = contentValues.get(str);
/* 79 */                sb.append("=?");
/* 69 */                i++;
                    }
/* 85 */            for (int i2 = size; i2 < length; i2++) {
/* 91 */                objArr2[i2] = objArr[i2 - size];
                    }
/* 102 */           if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
/* 106 */               sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                    }
/* 113 */           OlilOOI olilOOII001iOo1i0O = I001iOo1i0O(sb.toString());
/* 117 */           lOIOiI11oo.I00000oIO(olilOOII001iOo1i0O, objArr2);
/* 124 */           return ((IllOIOi) olilOOII001iOo1i0O).I00iiO.executeUpdateDelete();
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final boolean isOpen() {
/* 3 */             return this.I00iOIl.isOpen();
                }
            }
