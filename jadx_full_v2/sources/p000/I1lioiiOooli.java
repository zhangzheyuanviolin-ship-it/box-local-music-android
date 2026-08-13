            package p000;

            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            
            public final class I1lioiiOooli implements I00II0Ol1O0l {
                public final I00Ol00 I00iOIl;
                public IOo10oOO I00iiI;

                public I1lioiiOooli(I00Ol00 i00Ol00) {
/* 4 */             this.I00iOIl = i00Ol00;
                }

                public static I1lioO11Il I00000oIO(I00Ol00 i00Ol00) throws IOException {
/* 3 */             IOo10oOO iOo10oOO = new IOo10oOO(i00Ol00);
/* 6 */             byte[] bArrI00000oIO = lOOllo00lO.I00000oIO(iOo10oOO);
/* 10 */            int i = iOo10oOO.I00iiO;
/* 14 */            I1lioO11Il i1lioO11Il = new I1lioO11Il();
/* 18 */            if (bArrI00000oIO == null) {
/* 73 */                IOOlIIilOl0.I000II("'data' cannot be null");
/* 17 */                return null;
                    }
/* 21 */            if (bArrI00000oIO.length == 0 && i != 0) {
/* 28 */                I000II.I000iOII("zero length data with non-zero pad bits");
/* 17 */                return null;
                    }
/* 33 */            if (i > 7 || i < 0) {
/* 67 */                I000II.I000iOII("pad bits cannot be greater than 7 or less than 0");
/* 17 */                return null;
                    }
/* 38 */            int length = bArrI00000oIO.length;
/* 41 */            byte[] bArr = new byte[length + 1];
/* 45 */            System.arraycopy(bArrI00000oIO, 0, bArr, 1, length);
/* 48 */            bArr[0] = (byte) i;
/* 50 */            i1lioO11Il.I00iOIl = bArr;
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            i1lioO11Il.I00ilI0I1 = null;
/* 59 */            i1lioO11Il.I00iio = 1000;
/* 61 */            VarHandle.storeStoreFence();
/* 64 */            return i1lioO11Il;
                }

                @Override
                public final I00OIO1 I0000O() {
                    try {
/* 3 */                 return I00000oIO(this.I00iOIl);
                    } catch (IOException e) {
/* 15 */                I000II.I000lI("IOException converting stream to byte array: ", e.getMessage(), e);
/* 18 */                return null;
                    }
                }

                @Override
                public final InputStream I0001Ioi1lo() {
/* 5 */             IOo10oOO iOo10oOO = new IOo10oOO(this.I00iOIl);
/* 8 */             this.I00iiI = iOo10oOO;
/* 29 */            return iOo10oOO;
                }

                @Override
                public final int I000OOo1O() {
/* 3 */             return this.I00iiI.I00iiO;
                }

                @Override
                public final I00OIO1 I000OiO() {
/* 3 */             return I00000oIO(this.I00iOIl);
                }
            }
