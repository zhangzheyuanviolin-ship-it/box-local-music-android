            package p000;

            import java.io.File;
            
            public abstract class iOOoIil {
                public static boolean I00000oIO(File file) {
/* 6 */             if (!file.isDirectory()) {
/* 38 */                file.delete();
/* 5 */                 return true;
                    }
/* 8 */             File[] fileArrListFiles = file.listFiles();
/* 13 */            if (fileArrListFiles == null) {
/* 12 */                return false;
                    }
/* 18 */            boolean z = true;
/* 19 */            for (File file2 : fileArrListFiles) {
/* 33 */                z = I00000oIO(file2) && z;
                    }
/* 37 */            return z;
                }
            }
