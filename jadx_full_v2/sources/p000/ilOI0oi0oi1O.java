            package p000;

            import java.io.File;
            import java.io.IOException;
            
            public abstract class ilOI0oi0oi1O {
                public static IOException I00000oIO(File file, IOException iOException) {
/* 7 */             StringBuilder sb = new StringBuilder("Inoperable file:");
                    try {
/* 43 */                sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
                    } catch (IOException unused) {
/* 49 */                sb.append(" failed to attach additional metadata");
                    }
/* 58 */            return new IOException(sb.toString(), iOException);
                }

                public static IOException I00000oOI(File file, IOException iOException) {
/* 1 */             File parentFile = file.getParentFile();
                    return parentFile == null ? I00000oIO(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? I00000oIO(file, iOException) : I00000oIO(file, iOException) : parentFile.canWrite() ? I00000oIO(file, iOException) : I00000oIO(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? I00000oIO(file, iOException) : I00000oIO(file, iOException) : parentFile.canWrite() ? I00000oIO(file, iOException) : I00000oIO(file, iOException) : I00000oIO(file, iOException);
                }
            }
