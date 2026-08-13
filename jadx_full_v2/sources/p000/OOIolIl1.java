            package p000;

            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.util.Objects;
            
            public final class OOIolIl1 {
                public final int I00000oIO;
                public final int I00000oOI;
                public final long I0000Il00O;
                public final long I0000O;

                public OOIolIl1(int i, int i2, long j, long j2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
/* 8 */             this.I0000Il00O = j;
/* 10 */            this.I0000O = j2;
                }

                public static OOIolIl1 I00000oIO(File file) throws IOException {
/* 8 */             DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                    try {
/* 29 */                OOIolIl1 oOIolIl1 = new OOIolIl1(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
/* 32 */                dataInputStream.close();
/* 35 */                return oOIolIl1;
                    } finally {
                    }
                }

                public final void I00000oOI(File file) throws IOException {
/* 1 */             file.delete();
/* 11 */            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
                    try {
/* 16 */                dataOutputStream.writeInt(this.I00000oIO);
/* 21 */                dataOutputStream.writeInt(this.I00000oOI);
/* 26 */                dataOutputStream.writeLong(this.I0000Il00O);
/* 31 */                dataOutputStream.writeLong(this.I0000O);
/* 34 */                dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
/* 39 */                    dataOutputStream.close();
                        } catch (Throwable th2) {
/* 44 */                    th.addSuppressed(th2);
                        }
/* 77 */                throw th;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && (obj instanceof OOIolIl1)) {
/* 13 */                OOIolIl1 oOIolIl1 = (OOIolIl1) obj;
/* 19 */                if (this.I00000oOI == oOIolIl1.I00000oOI && this.I0000Il00O == oOIolIl1.I0000Il00O && this.I00000oIO == oOIolIl1.I00000oIO && this.I0000O == oOIolIl1.I0000O) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 29 */            return Objects.hash(Integer.valueOf(this.I00000oOI), Long.valueOf(this.I0000Il00O), Integer.valueOf(this.I00000oIO), Long.valueOf(this.I0000O));
                }
            }
