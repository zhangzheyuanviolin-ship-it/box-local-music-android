            package com.google.android.libraries.barhopper;

            import android.graphics.Bitmap;
            import android.util.Log;
            import java.io.Closeable;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import p000.I000II;
            import p000.I1o1o0;
            import p000.I1o1o001ilo;
            import p000.IlIi0I0;
            import p000.IoOOl0iOl1io;
            import p000.OIiilo1Ool0o;
            import p000.ilIO10iO;
            import p000.ilOO1I1l;
            import p000.iloll1i;
            import p000.ioiO0iOooii;
            
            public class BarhopperV3 implements Closeable {
                public long I00iOIl;

                public static I1o1o0 I000l1(byte[] bArr) {
/* 1 */             bArr.getClass();
                    try {
/* 4 */                 ilOO1I1l iloo1i1l = ilOO1I1l.I00000oOI;
/* 6 */                 ioiO0iOooii ioio0ioooii = ioiO0iOooii.I0000Il00O;
/* 10 */                return I1o1o0.I00100l0(bArr, ilOO1I1l.I00000oOI);
                    } catch (iloll1i e) {
/* 18 */                IoOOl0iOl1io.I000l1("Received unexpected BarhopperResponse buffer: {0}", e);
/* 21 */                return null;
                    }
                }

                private native void closeNative(long j);

                private native long createNativeWithClientOptions(byte[] bArr);

                private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

                private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

                private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

                public final void I00000oIO(I1o1o001ilo i1o1o001ilo) {
/* 7 */             if (this.I00iOIl != 0) {
/* 13 */                Log.w("BarhopperV3", "Native pointer already exists.");
/* 16 */                return;
                    }
                    try {
/* 17 */                int iI0000Il00O = i1o1o001ilo.I0000Il00O();
/* 21 */                byte[] bArr = new byte[iI0000Il00O];
/* 25 */                ilIO10iO ilio10io = new ilIO10iO();
/* 28 */                int length = bArr.length;
/* 33 */                if (((length - iI0000Il00O) | iI0000Il00O) < 0) {
/* 95 */                    OIiilo1Ool0o.I000l1("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(iI0000Il00O)});
/* 99 */                    throw null;
                        }
/* 35 */                ilio10io.I00000oOI = bArr;
/* 37 */                ilio10io.I0000O = 0;
/* 39 */                ilio10io.I0000Il00O = iI0000Il00O;
/* 41 */                VarHandle.storeStoreFence();
/* 44 */                i1o1o001ilo.I000o00OoI0I(ilio10io);
/* 50 */                if (iI0000Il00O - ilio10io.I0000O != 0) {
/* 76 */                    throw new IllegalStateException("Did not write as much data as expected.");
                        }
/* 52 */                long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
/* 56 */                this.I00iOIl = jCreateNativeWithClientOptions;
/* 60 */                if (jCreateNativeWithClientOptions != 0) {
/* 62 */                    return;
                        }
/* 65 */                I000II.I000iOII("Failed to create native pointer with client options.");
                    } catch (IOException e) {
/* 115 */               OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", I1o1o001ilo.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
                    }
                }

                public final I1o1o0 I0000Il00O(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
/* 1 */             long j = this.I00iOIl;
/* 7 */             if (j != 0) {
/* 18 */                return I000l1(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
                    }
/* 25 */            I000II.I001IO000("Native pointer does not exist.");
/* 28 */            return null;
                }

                public final I1o1o0 I000II(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
/* 1 */             long j = this.I00iOIl;
/* 7 */             if (j != 0) {
/* 18 */                return I000l1(recognizeNative(j, i, i2, bArr, recognitionOptions));
                    }
/* 25 */            I000II.I001IO000("Native pointer does not exist.");
/* 28 */            return null;
                }

                public final I1o1o0 I000O01llI0(Bitmap bitmap, RecognitionOptions recognitionOptions) {
/* 7 */             if (this.I00iOIl == 0) {
/* 51 */                I000II.I001IO000("Native pointer does not exist.");
/* 54 */                return null;
                    }
/* 9 */             Bitmap.Config config = bitmap.getConfig();
/* 13 */            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
/* 15 */            if (config != config2) {
/* 27 */                "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig()));
/* 34 */                bitmap = bitmap.copy(config2, bitmap.isMutable());
                    }
/* 44 */            return I000l1(recognizeBitmapNative(this.I00iOIl, bitmap, recognitionOptions));
                }

                @Override
                public final void close() {
/* 1 */             long j = this.I00iOIl;
/* 7 */             if (j != 0) {
/* 9 */                 closeNative(j);
/* 12 */                this.I00iOIl = 0L;
                    }
                }
            }
