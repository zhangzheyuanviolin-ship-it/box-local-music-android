            package p000;

            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.TreeMap;
            
/* 27 */    public final class i0Il1IIOi extends IoiOloi {
                public final TreeMap I00iOIl = new TreeMap();

                public i0Il1IIOi(File file, File file2) throws IOException, NumberFormatException {
/* 11 */            ArrayList arrayListI00000oIO = i0OIioiOOiiO.I00000oIO(file, file2);
/* 19 */            if (arrayListI00000oIO.isEmpty()) {
/* 89 */                throw new i0O0lI1oiO(String.format("Virtualized slice archive empty for %s, %s", file, file2));
                    }
/* 21 */            Iterator it = arrayListI00000oIO.iterator();
/* 25 */            long length = 0;
/* 31 */            while (it.hasNext()) {
/* 37 */                File file3 = (File) it.next();
/* 45 */                this.I00iOIl.put(Long.valueOf(length), file3);
/* 52 */                length += file3.length();
                    }
                }

                public final long I00ioIO() {
/* 3 */             Map.Entry entryLastEntry = this.I00iOIl.lastEntry();
/* 27 */            return ((File) entryLastEntry.getValue()).length() + ((Long) entryLastEntry.getKey()).longValue();
                }

                public final FileInputStream I00l0I0l0lO1(long j, Long l) {
/* 11 */            FileInputStream fileInputStream = new FileInputStream((File) this.I00iOIl.get(l));
/* 31 */            if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
/* 33 */                return fileInputStream;
                    }
/* 89 */            throw new i0O0lI1oiO("Virtualized slice archive corrupt, could not skip in file with key " + l);
                }

                @Override
/* 28 */        public final void close() {
                }
            }
