            package net.zetetic.database.sqlcipher;

            import android.database.DatabaseUtils;
            import android.os.CancellationSignal;
            import java.util.Arrays;
            import p000.I000II;
            import p000.IIlIOloOOO;
            import p000.Oi010OO0;
            import p000.Olil1OioO;
            
            public abstract class SQLiteProgram extends SQLiteClosable implements Olil1OioO {
                public static final String[] I00ioIO = new String[0];
                public final SQLiteDatabase I00iiI;
                public final String I00iiO;
                public final boolean I00iio;
                public final String[] I00ilI0I1;
                public final int I00ilO0;
                public final Object[] I00io1l;

                public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, CancellationSignal cancellationSignal) {
                    int i;
/* 4 */             this.I00iiI = sQLiteDatabase;
/* 6 */             String strTrim = str.trim();
/* 10 */            this.I00iiO = strTrim;
/* 12 */            int sqlStatementType = DatabaseUtils.getSqlStatementType(strTrim);
/* 19 */            if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
/* 90 */                this.I00iio = false;
/* 94 */                this.I00ilI0I1 = I00ioIO;
/* 96 */                this.I00ilO0 = 0;
/* 98 */                i = 0;
                    } else {
/* 28 */                boolean z = sqlStatementType == 1;
/* 34 */                SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
/* 37 */                SQLiteSession sQLiteSessionI00Io1lO = sQLiteDatabase.I00Io1lO();
/* 41 */                int iI00IioO0OiOi = SQLiteDatabase.I00IioO0OiOi(z);
/* 45 */                sQLiteSessionI00Io1lO.getClass();
/* 48 */                if (strTrim == null) {
/* 86 */                    I000II.I000iOII("sql must not be null.");
/* 89 */                    throw null;
                        }
/* 50 */                if (cancellationSignal != null) {
/* 52 */                    cancellationSignal.throwIfCanceled();
                        }
/* 55 */                sQLiteSessionI00Io1lO.I00000oIO(strTrim, iI00IioO0OiOi, cancellationSignal);
                        try {
/* 60 */                    sQLiteSessionI00Io1lO.I00000oOI.I00100l0(strTrim, sQLiteStatementInfo);
/* 63 */                    sQLiteSessionI00Io1lO.I000OOo1O();
/* 68 */                    this.I00iio = sQLiteStatementInfo.I0000Il00O;
/* 72 */                    this.I00ilI0I1 = sQLiteStatementInfo.I00000oOI;
/* 74 */                    i = sQLiteStatementInfo.I00000oIO;
/* 76 */                    this.I00ilO0 = i;
                        } catch (Throwable th) {
/* 80 */                    sQLiteSessionI00Io1lO.I000OOo1O();
/* 83 */                    throw th;
                        }
                    }
/* 99 */            if (objArr != null && objArr.length > i) {
/* 138 */               throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + i + " arguments.");
                    }
/* 139 */           if (i == 0) {
/* 152 */               this.I00io1l = null;
/* 483 */               return;
                    }
/* 141 */           Object[] objArr2 = new Object[i];
/* 143 */           this.I00io1l = objArr2;
/* 145 */           if (objArr != null) {
/* 148 */               System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                    }
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             Object[] objArr = this.I00io1l;
/* 3 */             if (objArr != null) {
/* 6 */                 Arrays.fill(objArr, (Object) null);
                    }
                }

                public final void I000O01llI0(int i, Object obj) {
/* 1 */             int i2 = this.I00ilO0;
/* 4 */             if (i < 1 || i > i2) {
/* 24 */                I000II.I000iOII(Oi010OO0.I0010o("Cannot bind argument at index ", i, " because the index is out of range.  The statement has ", i2, " parameters."));
                    } else {
/* 11 */                this.I00io1l[i - 1] = obj;
                    }
                }

                @Override
                public final void I000OOo1O(int i, double d) {
/* 5 */             I000O01llI0(i, Double.valueOf(d));
                }

                @Override
                public final void I000OiO(int i, long j) {
/* 5 */             I000O01llI0(i, Long.valueOf(j));
                }

                @Override
                public final void I000iOII(int i, byte[] bArr) {
/* 1 */             if (bArr != null) {
/* 3 */                 I000O01llI0(i, bArr);
                    } else {
/* 15 */                I000II.I000iOII(IIlIOloOOO.I00100l0("the bind value at index ", i, " is null"));
                    }
                }

                @Override
                public final void I000o00OoI0I(int i) {
/* 2 */             I000O01llI0(i, null);
                }

                @Override
                public final void I001i1O0Ol(int i, String str) {
/* 1 */             if (str != null) {
/* 3 */                 I000O01llI0(i, str);
                    } else {
/* 15 */                I000II.I000iOII(IIlIOloOOO.I00100l0("the bind value at index ", i, " is null"));
                    }
                }
            }
