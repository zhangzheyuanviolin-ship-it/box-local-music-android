            package p000;

            import java.io.BufferedInputStream;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.io.OutputStream;
            
            public final class OlOiiilIl implements OlOiOooOO1 {
                public IOO000ilo I00000oIO;

                @Override
                public final InputStream I00000oIO(InputStream inputStream, byte[] bArr) {
/* 3 */             IOO000ilo iOO000ilo = this.I00000oIO;
/* 5 */             Ioo000li1 ioo000li1 = new Ioo000li1();
/* 9 */             ioo000li1.I00iOIl = false;
/* 12 */            ioo000li1.I00iiI = null;
/* 14 */            ioo000li1.I00iio = iOO000ilo;
/* 20 */            if (inputStream.markSupported()) {
/* 22 */                ioo000li1.I00iiO = inputStream;
                    } else {
/* 30 */                ioo000li1.I00iiO = new BufferedInputStream(inputStream);
                    }
/* 37 */            ioo000li1.I00iiO.mark(Integer.MAX_VALUE);
/* 46 */            ioo000li1.I00ilI0I1 = (byte[]) bArr.clone();
/* 89 */            return ioo000li1;
                }

                @Override
                public final OutputStream I00000oOI(FileOutputStream fileOutputStream, byte[] bArr) {
/* 11 */            return ((OlOiOooOO1) ((OOIiiiO) this.I00000oIO.I00iiO).I00000oOI).I00000oOI(fileOutputStream, bArr);
                }
            }
