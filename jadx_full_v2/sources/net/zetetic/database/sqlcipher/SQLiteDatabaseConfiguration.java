            package net.zetetic.database.sqlcipher;

            import java.util.ArrayList;
            import java.util.Locale;
            import java.util.regex.Pattern;
            import p000.I000II;
            
/* 76 */    public final class SQLiteDatabaseConfiguration {
                public static final Pattern I000OOo1O = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
                public final String I00000oIO;
                public final String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public Locale I0000oI00;
                public byte[] I0001Ioi1lo;
                public SQLiteDatabaseHook I000II;
                public final ArrayList I000O01llI0;

                public SQLiteDatabaseConfiguration(String str, int i, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
/* 9 */             this.I000O01llI0 = new ArrayList();
/* 11 */            if (str == null) {
/* 73 */                I000II.I000iOII("path must not be null.");
/* 483 */               throw null;
                    }
/* 13 */            this.I00000oIO = str;
/* 17 */            int iIndexOf = str.indexOf(63);
/* 28 */            str = iIndexOf >= 0 ? (String) str.subSequence(0, iIndexOf) : str;
/* 52 */            this.I00000oOI = str.indexOf(64) != -1 ? I000OOo1O.matcher(str).replaceAll("XX@YY") : str;
/* 54 */            this.I0000Il00O = i;
/* 56 */            this.I0001Ioi1lo = bArr;
/* 58 */            this.I000II = sQLiteDatabaseHook;
/* 62 */            this.I0000O = 25;
/* 68 */            this.I0000oI00 = Locale.getDefault();
                }

                public final void I00000oIO(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
/* 1 */             if (sQLiteDatabaseConfiguration == null) {
/* 52 */                I000II.I000iOII("other must not be null.");
/* 186 */               return;
                    }
/* 11 */            if (!this.I00000oIO.equals(sQLiteDatabaseConfiguration.I00000oIO)) {
/* 46 */                I000II.I000iOII("other configuration must refer to the same database.");
/* 49 */                return;
                    }
/* 15 */            this.I0000Il00O = sQLiteDatabaseConfiguration.I0000Il00O;
/* 19 */            this.I0000O = sQLiteDatabaseConfiguration.I0000O;
/* 23 */            this.I0000oI00 = sQLiteDatabaseConfiguration.I0000oI00;
/* 27 */            this.I0001Ioi1lo = sQLiteDatabaseConfiguration.I0001Ioi1lo;
/* 31 */            this.I000II = sQLiteDatabaseConfiguration.I000II;
/* 33 */            ArrayList arrayList = this.I000O01llI0;
/* 35 */            arrayList.clear();
/* 40 */            arrayList.addAll(sQLiteDatabaseConfiguration.I000O01llI0);
                }

/* 77 */        public SQLiteDatabaseConfiguration(String str, int i) {
/* 78 */            this(str, i, null, null);
                }

/* 78 */        public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
/* 80 */            this.I000O01llI0 = new ArrayList();
                    if (sQLiteDatabaseConfiguration != null) {
/* 81 */                this.I00000oIO = sQLiteDatabaseConfiguration.I00000oIO;
/* 82 */                this.I00000oOI = sQLiteDatabaseConfiguration.I00000oOI;
/* 83 */                I00000oIO(sQLiteDatabaseConfiguration);
                        return;
                    }
/* 84 */            I000II.I000iOII("other must not be null.");
                    throw null;
                }
            }
