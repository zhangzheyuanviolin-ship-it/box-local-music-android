            package p000;

            import android.database.sqlite.SQLiteProgram;
            import java.io.Closeable;
            
/* 8 */     public class IllOIIOooolo implements Olil1OioO {
                public final int I00iOIl = 1;
                public Closeable I00iiI;

                public IllOIIOooolo(SQLiteProgram sQLiteProgram) {
/* 7 */             this.I00iiI = sQLiteProgram;
                }

                @Override
                public final void I000OOo1O(int i, double d) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((SQLiteProgram) this.I00iiI).bindDouble(i, d);
                            break;
                        default:
/* 10 */                    ((Oi1oO0O0) this.I00iiI).I000OOo1O(i, d);
                            break;
                    }
                }

                @Override
                public final void I000OiO(int i, long j) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((SQLiteProgram) this.I00iiI).bindLong(i, j);
                            break;
                        default:
/* 10 */                    ((Oi1oO0O0) this.I00iiI).I000OiO(i, j);
                            break;
                    }
                }

                @Override
                public final void I000iOII(int i, byte[] bArr) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((SQLiteProgram) this.I00iiI).bindBlob(i, bArr);
                            break;
                        default:
/* 10 */                    ((Oi1oO0O0) this.I00iiI).I000iOII(i, bArr);
                            break;
                    }
                }

                @Override
                public final void I000o00OoI0I(int i) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((SQLiteProgram) this.I00iiI).bindNull(i);
                            break;
                        default:
/* 10 */                    ((Oi1oO0O0) this.I00iiI).I000o00OoI0I(i);
                            break;
                    }
                }

                @Override
                public final void I001i1O0Ol(int i, String str) {
                    switch (this.I00iOIl) {
                        case 0:
/* 18 */                    ((SQLiteProgram) this.I00iiI).bindString(i, str);
                            break;
                        default:
/* 10 */                    ((Oi1oO0O0) this.I00iiI).I001i1O0Ol(i, str);
                            break;
                    }
                }

                @Override
                public final void close() {
                    switch (this.I00iOIl) {
                        case 0:
/* 11 */                    ((SQLiteProgram) this.I00iiI).close();
                            break;
                    }
                }

/* 9 */         public IllOIIOooolo() {
                }

/* 19 */        private final void I00000oIO() {
                }
            }
