            package p000;

            import android.graphics.Bitmap;
            import android.graphics.Color;
            import com.gemalto.jp2.JP2Decoder;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            
            public final class O00OIo0Ill extends IlIli001 {
                public static Bitmap I0000O(InputStream inputStream, Ii1i1il100 ii1i1il100) throws O1o000, ClassNotFoundException {
                    try {
/* 3 */                 Class.forName("com.gemalto.jp2.JP2Decoder");
/* 11 */                Bitmap bitmapDecode = new JP2Decoder(inputStream).decode();
/* 15 */                IIOoi0ooOoO iIOoi0ooOoO = ii1i1il100.I00000oIO;
/* 24 */                if (!iIOoi0ooOoO.I00l0I0l0lO1(IIi0I0I0o.I01l1o, false)) {
/* 28 */                    iIOoi0ooOoO.I010II(IIi0I0I0o.I011lOIoo0l);
                        }
/* 37 */                iIOoi0ooOoO.I010i10l(IIi0I0I0o.I0IlOO10Ii1, bitmapDecode.getWidth());
/* 46 */                iIOoi0ooOoO.I010i10l(IIi0I0I0o.I01il1IlO1, bitmapDecode.getHeight());
/* 57 */                if (!iIOoi0ooOoO.I00iOIl.containsKey(IIi0I0I0o.I0110OiO)) {
/* 59 */                    bitmapDecode.getColorSpace();
                        }
/* 62 */                return bitmapDecode;
                    } catch (ClassNotFoundException unused) {
/* 89 */                throw new O1o000("Cannot read JPX image: JP2Android is not installed.");
                    }
                }

                @Override
                public final Ii1i1il100 I00000oIO(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i) {
/* 1 */             return I00000oOI(inputStream, outputStream, iIi0io1lIo, i);
                }

                @Override
                public final Ii1i1il100 I00000oOI(InputStream inputStream, OutputStream outputStream, IIi0io1lIo iIi0io1lIo, int i) throws ClassNotFoundException, IOException {
/* 5 */             IIOoi0ooOoO iIOoi0ooOoO = new IIOoi0ooOoO();
/* 8 */             Ii1i1il100 ii1i1il100 = new Ii1i1il100(iIOoi0ooOoO);
/* 11 */            iIOoi0ooOoO.I00ioIO(iIi0io1lIo);
/* 14 */            Bitmap bitmapI0000O = I0000O(inputStream, ii1i1il100);
/* 26 */            int height = bitmapI0000O.getHeight() * bitmapI0000O.getWidth();
/* 27 */            int[] iArr = new int[height];
/* 44 */            bitmapI0000O.getPixels(iArr, 0, bitmapI0000O.getWidth(), 0, 0, bitmapI0000O.getWidth(), bitmapI0000O.getHeight());
/* 49 */            byte[] bArr = new byte[3072];
/* 53 */            int i2 = 0;
/* 54 */            for (int i3 = 0; i3 < height; i3++) {
/* 58 */                if (i2 + 3 >= 3072) {
/* 60 */                    outputStream.write(bArr, 0, i2);
/* 63 */                    i2 = 0;
                        }
/* 64 */                int i4 = iArr[i3];
/* 71 */                bArr[i2] = (byte) Color.red(i4);
/* 80 */                bArr[i2 + 1] = (byte) Color.green(i4);
/* 89 */                bArr[i2 + 2] = (byte) Color.blue(i4);
/* 91 */                i2 += 3;
                    }
/* 96 */            outputStream.write(bArr, 0, i2);
/* 483 */           return ii1i1il100;
                }
            }
