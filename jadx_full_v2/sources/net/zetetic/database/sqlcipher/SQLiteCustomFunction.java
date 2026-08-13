            package net.zetetic.database.sqlcipher;

            import net.zetetic.database.sqlcipher.SQLiteDatabase;
            import p000.I000II;
            
            public final class SQLiteCustomFunction {
                public final SQLiteDatabase.CustomFunction I00000oIO;
                public final String name;
                public final int numArgs;

                public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
/* 4 */             if (str == null) {
/* 15 */                I000II.I000iOII("name must not be null.");
/* 215 */               throw null;
                    }
/* 6 */             this.name = str;
/* 8 */             this.numArgs = i;
/* 10 */            this.I00000oIO = customFunction;
                }

                private void dispatchCallback(String[] strArr) {
/* 3 */             this.I00000oIO.I00000oIO();
                }
            }
