            package p000;

            import android.media.MediaDataSource;
            import java.io.DataInputStream;
            import java.io.IOException;
            
/* 18 */    public final class Il1IOI extends MediaDataSource {
                public long I00iOIl;
                public final Il1IlIO I00iiI;

                public Il1IOI(Il1IlIO il1IlIO) {
/* 1 */             this.I00iiI = il1IlIO;
                }

                @Override
                public final long getSize() {
/* 1 */             return -1L;
                }

                @Override
                public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
/* 1 */             Il1IlIO il1IlIO = this.I00iiI;
/* 3 */             DataInputStream dataInputStream = il1IlIO.I00iOIl;
/* 5 */             if (i2 == 0) {
/* 7 */                 return 0;
                    }
/* 14 */            if (j >= 0) {
                        try {
/* 17 */                    long j2 = this.I00iOIl;
/* 21 */                    if (j2 != j) {
/* 25 */                        if (j2 < 0 || j < j2 + dataInputStream.available()) {
/* 38 */                            il1IlIO.I0000Il00O(j);
/* 41 */                            this.I00iOIl = j;
                                }
                            }
/* 47 */                    if (i2 > dataInputStream.available()) {
/* 49 */                        i2 = dataInputStream.available();
                            }
/* 53 */                    int i3 = il1IlIO.read(bArr, i, i2);
/* 57 */                    if (i3 >= 0) {
                                this.I00iOIl += i3;
/* 65 */                        return i3;
                            }
                        } catch (IOException unused) {
                        }
/* 68 */                this.I00iOIl = -1L;
/* 13 */                return -1;
                    }
/* 13 */            return -1;
                }

                @Override
/* 19 */        public final void close() {
                }
            }
