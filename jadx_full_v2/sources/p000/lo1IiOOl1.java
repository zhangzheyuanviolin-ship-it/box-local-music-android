            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.lang.invoke.VarHandle;
            
            public final class lo1IiOOl1 extends OOiO0OIilloO implements lo0liol11lI {
                public FileInputStream I00iiI;
                public File I00iiO;

                public static lo1IiOOl1 I0000Il00O(File file) {
/* 5 */             FileInputStream fileInputStream = new FileInputStream(file);
/* 9 */             lo1IiOOl1 lo1iiool1 = new lo1IiOOl1(fileInputStream, 1);
/* 12 */            lo1iiool1.I00iiI = fileInputStream;
/* 14 */            lo1iiool1.I00iiO = file;
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return lo1iiool1;
                }

                @Override
                public final File zza() {
/* 1 */             return this.I00iiO;
                }
            }
