            package p000;

            import java.io.File;
            import java.io.IOException;
            
            public abstract class ilOIo0iOI {
                public static void I00000oIO(File file) throws IOException {
/* 5 */             File parentFile = file.getCanonicalFile().getParentFile();
/* 9 */             if (parentFile == null) {
/* 21 */                return;
                    }
/* 12 */            parentFile.mkdirs();
/* 19 */            if (parentFile.isDirectory()) {
/* 21 */                return;
                    }
/* 24 */            IOOlIIilOl0.I000l1("Unable to create parent directories of ", file);
                }
            }
