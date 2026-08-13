            package net.zetetic.database;

            import java.util.Locale;
            import net.zetetic.database.sqlcipher.SQLiteDatabase;
            
            public class DatabaseUtils {

                @Deprecated
                public static class InsertHelper {
                    public final SQLiteDatabase I00000oIO;

                    public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
/* 4 */                 this.I00000oIO = sQLiteDatabase;
                    }
                }

                public static int I00000oIO(String str) {
/* 1 */             String strTrim = str.trim();
/* 12 */            if (strTrim.length() < 3) {
/* 9 */                 return 99;
                    }
/* 22 */            String upperCase = strTrim.substring(0, 3).toUpperCase(Locale.ROOT);
/* 32 */            if (upperCase.equals("SEL")) {
/* 34 */                return 1;
                    }
/* 42 */            if (upperCase.equals("INS") || upperCase.equals("UPD") || upperCase.equals("REP") || upperCase.equals("DEL")) {
/* 176 */               return 2;
                    }
/* 75 */            if (upperCase.equals("ATT")) {
/* 11 */                return 3;
                    }
/* 85 */            if (upperCase.equals("COM") || upperCase.equals("END")) {
/* 84 */                return 5;
                    }
/* 103 */           if (upperCase.equals("ROL")) {
/* 105 */               return 6;
                    }
/* 113 */           if (upperCase.equals("BEG")) {
/* 115 */               return 4;
                    }
/* 123 */           if (upperCase.equals("PRA")) {
/* 125 */               return 7;
                    }
/* 133 */           if (upperCase.equals("CRE") || upperCase.equals("DRO") || upperCase.equals("ALT")) {
/* 173 */               return 8;
                    }
                    return (upperCase.equals("ANA") || upperCase.equals("DET")) ? 9 : 99;
                }
            }
