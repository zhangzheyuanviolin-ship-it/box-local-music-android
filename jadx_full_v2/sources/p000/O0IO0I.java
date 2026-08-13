            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.util.ArrayList;
            import java.util.List;
            
            public class O0IO0I extends IlIiOO0ilI {
                @Override
                public final Ol0i0olI I00000oIO(OO0IIO1Il oO0IIO1Il) {
/* 18 */            return new I1Ooio(new FileOutputStream(oO0IIO1Il.toFile(), true), new Oo11IoI());
                }

                @Override
                public void I0000Il00O(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2) throws IOException {
/* 13 */            if (oO0IIO1Il.toFile().renameTo(oO0IIO1Il2.toFile())) {
/* 15 */                return;
                    }
/* 20 */            IoOOl0iOl1io.I000OiO("failed to move ", oO0IIO1Il, " to ", oO0IIO1Il2);
                }

                @Override
                public final void I000II(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 9 */             if (oO0IIO1Il.toFile().mkdir()) {
/* 49 */                return;
                    }
/* 11 */            IlIOoOIo0l ilIOoOIo0lI001l0I00 = I001l0I00(oO0IIO1Il);
/* 15 */            if (ilIOoOIo0lI001l0I00 == null || !ilIOoOIo0lI001l0I00.I00000oOI) {
/* 25 */                IOOlIIilOl0.I000l1("failed to create directory: ", oO0IIO1Il);
                    }
                }

                @Override
                public final void I000O01llI0(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 5 */             if (Thread.interrupted()) {
/* 49 */                throw new InterruptedIOException("interrupted");
                    }
/* 7 */             File file = oO0IIO1Il.toFile();
/* 15 */            if (file.delete() || !file.exists()) {
/* 29 */                return;
                    }
/* 26 */            IOOlIIilOl0.I000l1("failed to delete ", oO0IIO1Il);
                }

                @Override
                public final List I00100l0(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 1 */             File file = oO0IIO1Il.toFile();
/* 5 */             String[] list = file.list();
/* 9 */             if (list == null) {
/* 15 */                if (file.exists()) {
/* 19 */                    IOOlIIilOl0.I000l1("failed to list ", oO0IIO1Il);
/* 22 */                    return null;
                        }
/* 43 */                throw new FileNotFoundException("no such file: " + oO0IIO1Il);
                    }
/* 46 */            ArrayList arrayList = new ArrayList();
/* 51 */            for (String str : list) {
/* 59 */                arrayList.add(oO0IIO1Il.I0000O(str));
                    }
/* 65 */            IOOiOil.I000o00OoI0I(arrayList);
/* 186 */           return arrayList;
                }

                @Override
                public IlIOoOIo0l I001l0I00(OO0IIO1Il oO0IIO1Il) {
/* 1 */             File file = oO0IIO1Il.toFile();
/* 5 */             boolean zIsFile = file.isFile();
/* 9 */             boolean zIsDirectory = file.isDirectory();
/* 13 */            long jLastModified = file.lastModified();
/* 17 */            long length = file.length();
/* 21 */            if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
/* 57 */                return new IlIOoOIo0l(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
                    }
/* 41 */            return null;
                }

                @Override
                public final Ol0i0olI I00IOO(OO0IIO1Il oO0IIO1Il) {
/* 18 */            return new I1Ooio(new FileOutputStream(oO0IIO1Il.toFile(), false), new Oo11IoI());
                }

                @Override
                public final OlI1ii I00IioO0OiOi(OO0IIO1Il oO0IIO1Il) {
/* 14 */            return new I1Ool00Il(new FileInputStream(oO0IIO1Il.toFile()), Oo11IoI.I0000O);
                }

                public String toString() {
/* 1 */             return "JvmSystemFileSystem";
                }
            }
