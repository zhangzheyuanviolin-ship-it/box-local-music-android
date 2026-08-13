            package net.zetetic.database.sqlcipher;

            import p000.Olil0oI0110I;
            import p000.Olil0oi;
            import p000.Olil10OiIi1l;
            
/* 11 */    public class SupportOpenHelperFactory implements Olil0oi {
                public final byte[] I00iOIl;
                public final SQLiteDatabaseHook I00iiI;
                public final boolean I00iiO;
                public final int I00iio;

                public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
/* 4 */             this.I00iOIl = bArr;
/* 6 */             this.I00iiI = sQLiteDatabaseHook;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = i;
                }

                @Override
                public final Olil10OiIi1l I00IoIO0lI(Olil0oI0110I olil0oI0110I) {
/* 1 */             int i = this.I00iio;
/* 4 */             byte[] bArr = this.I00iOIl;
/* 6 */             SQLiteDatabaseHook sQLiteDatabaseHook = this.I00iiI;
                    return i == -1 ? new SupportHelper(olil0oI0110I, bArr, sQLiteDatabaseHook, this.I00iiO) : new SupportHelper(olil0oI0110I, bArr, sQLiteDatabaseHook, this.I00iiO, i);
                }

/* 12 */        public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
/* 13 */            this(bArr, sQLiteDatabaseHook, z, -1);
                }

/* 13 */        public SupportOpenHelperFactory(byte[] bArr) {
/* 14 */            this(bArr, null, false);
                }
            }
