            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.EOFException;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class OoIoiiol0o implements OoIoiillo, Il01o0OlloO, IliIo0lOI {
                public String I00iOIl;
                public I01loIooI I00iiI;
                public ArrayList I00iiO;
                public ArrayList I00iio;
                public String I00ilI0I1;
                public ArrayList I00ilO0;
                public LinkedHashMap I00io1l;
                public ConcurrentHashMap I00ioIO;

                public static OoIoiiol0o I0000O(FileInputStream fileInputStream) throws IOException {
/* 4 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(1);
/* 9 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 15 */            byte[] bArr = new byte[65535];
                    while (true) {
/* 17 */                int i = fileInputStream.read(bArr);
/* 22 */                int i2 = 0;
/* 23 */                if (i == -1) {
/* 33 */                    olOO1i11110.I0010o(byteArrayOutputStream.toByteArray());
/* 38 */                    OoIol00Ool ooIol00Ool = new OoIol00Ool(i2);
/* 51 */                    byte[] bArrCopyOfRange = Arrays.copyOfRange((byte[]) olOO1i11110.I00iiI, 0, ((int[]) olOO1i11110.I00iiO)[0]);
/* 57 */                    byte[] bArr2 = (byte[]) olOO1i11110.I00iiI;
/* 61 */                    int[] iArr = (int[]) olOO1i11110.I00iiO;
/* 63 */                    int i3 = iArr[0];
/* 72 */                    return ooIol00Ool.I000O01llI0(bArrCopyOfRange, Arrays.copyOfRange(bArr2, i3, iArr[1] + i3));
                        }
/* 25 */                byteArrayOutputStream.write(bArr, 0, i);
                    }
                }

                public static OoIoiiol0o I0000oI00(byte[] bArr) throws IOException {
/* 4 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(1);
/* 7 */             olOO1i11110.I0010o(bArr);
/* 13 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(0);
/* 26 */            byte[] bArrCopyOfRange = Arrays.copyOfRange((byte[]) olOO1i11110.I00iiI, 0, ((int[]) olOO1i11110.I00iiO)[0]);
/* 32 */            byte[] bArr2 = (byte[]) olOO1i11110.I00iiI;
/* 36 */            int[] iArr = (int[]) olOO1i11110.I00iiO;
/* 38 */            int i = iArr[0];
/* 47 */            return ooIol00Ool.I000O01llI0(bArrCopyOfRange, Arrays.copyOfRange(bArr2, i, iArr[1] + i));
                }

                @Override
                public final List I00000oIO() {
/* 3 */             return Collections.unmodifiableList(this.I00iiO);
                }

                @Override
                public final I01loIooI I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final II1i0i0ilO I0000Il00O() {
/* 5 */             return new II1i0i0ilO(this.I00iio);
                }

                @Override
                public final boolean I000II(String str) {
                    return this.I00io1l.get(str) != null;
                }

                @Override
                public final float I000O01llI0(String str) throws EOFException {
/* 1 */             OoIoiillI1 ooIoiillI1I000l1 = I000l1(str);
/* 7 */             if (ooIoiillI1I000l1.I0000O == null) {
/* 9 */                 ooIoiillI1I000l1.I00000oIO();
                    }
/* 14 */            return ooIoiillI1I000l1.I0000oI00;
                }

                @Override
                public final OoIoiillI1 I000l1(String str) throws EOFException {
/* 1 */             LinkedHashMap linkedHashMap = this.I00io1l;
/* 3 */             ConcurrentHashMap concurrentHashMap = this.I00ioIO;
/* 9 */             OoIoiillI1 ooIoiillI1 = (OoIoiillI1) concurrentHashMap.get(str);
/* 11 */            if (ooIoiillI1 != null) {
/* 186 */               return ooIoiillI1;
                    }
/* 17 */            byte[] bArr = (byte[]) linkedHashMap.get(str);
/* 19 */            if (bArr == null) {
/* 28 */                bArr = (byte[]) linkedHashMap.get(".notdef");
                    }
/* 32 */            String str2 = this.I00iOIl;
/* 34 */            Ioo1oiOl ioo1oiOl = new Ioo1oiOl();
/* 37 */            ioo1oiOl.I00000oIO = str2;
/* 39 */            ioo1oiOl.I00000oOI = str;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            ArrayList arrayList = this.I00ilO0;
/* 48 */            ArrayList arrayList2 = new ArrayList();
/* 51 */            ioo1oiOl.I00000oIO(bArr, arrayList, arrayList2);
/* 58 */            OoIoiillI1 ooIoiillI12 = new OoIoiillI1(this, this.I00iOIl, str);
/* 61 */            ooIoiillI12.I000OiO = arrayList2;
/* 63 */            concurrentHashMap.put(str, ooIoiillI12);
/* 66 */            return ooIoiillI12;
                }

                @Override
                public final String getName() {
/* 1 */             return this.I00iOIl;
                }

                public final String toString() {
/* 57 */            return OoIoiiol0o.class.getName() + "[fontName=" + this.I00iOIl + ", fullName=" + this.I00ilI0I1 + ", encoding=" + this.I00iiI + ", charStringsDict=" + this.I00io1l + "]";
                }
            }
