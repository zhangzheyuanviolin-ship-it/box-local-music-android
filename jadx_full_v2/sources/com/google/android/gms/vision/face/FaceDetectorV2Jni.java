            package com.google.android.gms.vision.face;

            import android.content.res.AssetManager;
            import android.util.Log;
            import java.nio.ByteBuffer;
            import java.util.HashMap;
            import p000.iI1ol0i;
            import p000.l0IIOo;
            import p000.loo10o1IolO0;
            import p000.loo1Oo0;
            import p000.o000O0II11oi;
            import p000.o00i0iIlO0;
            import p000.o010O1;
            import p000.o0Ioolo;
            import p000.o0iIO111;
            
            public class FaceDetectorV2Jni {
                public final loo1Oo0 I00000oIO;

                public FaceDetectorV2Jni() {
/* 4 */             loo1Oo0 loo1oo0 = loo1Oo0.I00000oOI;
/* 6 */             o0Ioolo o0ioolo = o0Ioolo.I0000Il00O;
/* 10 */            loo1Oo0 loo1oo02 = new loo1Oo0();
/* 15 */            HashMap map = new HashMap();
/* 18 */            loo1oo02.I00000oIO = map;
/* 20 */            this.I00000oIO = loo1oo02;
/* 22 */            o000O0II11oi o000o0ii11oi = iI1ol0i.I00000oIO;
/* 34 */            map.put(new loo10o1IolO0(o000o0ii11oi.I00000oIO, 202056002), o000o0ii11oi);
                }

                private native void closeDetectorJni(long j);

                private native byte[] detectFacesImageByteArrayJni(long j, byte[] bArr, byte[] bArr2);

                private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr4);

                private native byte[] detectFacesImageByteBufferJni(long j, ByteBuffer byteBuffer, byte[] bArr);

                private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr);

                private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

                public final long I00000oIO(o0iIO111 o0iio111, AssetManager assetManager) {
/* 5 */             return initDetectorJni(o0iio111.I00000oOI(), assetManager);
                }

                public final o00i0iIlO0 I00000oOI(long j, byte[] bArr, l0IIOo l0iioo) {
                    try {
/* 6 */                 byte[] bArrDetectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j, bArr, l0iioo.I00000oOI());
/* 10 */                if (bArrDetectFacesImageByteArrayJni == null || bArrDetectFacesImageByteArrayJni.length <= 0) {
/* 1 */                     return null;
                        }
/* 17 */                return o00i0iIlO0.I000oI1ioi(bArrDetectFacesImageByteArrayJni, this.I00000oIO);
                    } catch (o010O1 e) {
/* 41 */                Log.e("FaceDetectorV2Jni", "detectFacesImageByteArray failed to parse result: ".concat(String.valueOf(e.getMessage())));
/* 1 */                 return null;
                    }
                }

                public final o00i0iIlO0 I0000Il00O(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, l0IIOo l0iioo) {
                    try {
/* 6 */                 byte[] bArrDetectFacesImageByteArrayMultiPlanesJni = detectFacesImageByteArrayMultiPlanesJni(j, bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, l0iioo.I00000oOI());
/* 10 */                if (bArrDetectFacesImageByteArrayMultiPlanesJni == null || bArrDetectFacesImageByteArrayMultiPlanesJni.length <= 0) {
/* 1 */                     return null;
                        }
/* 17 */                return o00i0iIlO0.I000oI1ioi(bArrDetectFacesImageByteArrayMultiPlanesJni, this.I00000oIO);
                    } catch (o010O1 e) {
/* 42 */                Log.e("FaceDetectorV2Jni", "detectFacesImageByteArrayMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage())));
/* 1 */                 return null;
                    }
                }

                public final o00i0iIlO0 I0000O(long j, ByteBuffer byteBuffer, l0IIOo l0iioo) {
                    try {
/* 6 */                 byte[] bArrDetectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j, byteBuffer, l0iioo.I00000oOI());
/* 10 */                if (bArrDetectFacesImageByteBufferJni == null || bArrDetectFacesImageByteBufferJni.length <= 0) {
/* 1 */                     return null;
                        }
/* 17 */                return o00i0iIlO0.I000oI1ioi(bArrDetectFacesImageByteBufferJni, this.I00000oIO);
                    } catch (o010O1 e) {
/* 41 */                Log.e("FaceDetectorV2Jni", "detectFacesImageByteBuffer failed to parse result: ".concat(String.valueOf(e.getMessage())));
/* 1 */                 return null;
                    }
                }

                public final o00i0iIlO0 I0000oI00(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6, l0IIOo l0iioo) {
                    try {
/* 6 */                 byte[] bArrDetectFacesImageByteBufferMultiPlanesJni = detectFacesImageByteBufferMultiPlanesJni(j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6, l0iioo.I00000oOI());
/* 10 */                if (bArrDetectFacesImageByteBufferMultiPlanesJni == null || bArrDetectFacesImageByteBufferMultiPlanesJni.length <= 0) {
/* 1 */                     return null;
                        }
/* 17 */                return o00i0iIlO0.I000oI1ioi(bArrDetectFacesImageByteBufferMultiPlanesJni, this.I00000oIO);
                    } catch (o010O1 e) {
/* 42 */                Log.e("FaceDetectorV2Jni", "detectFacesImageByteBufferMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage())));
/* 1 */                 return null;
                    }
                }

                public final void I0001Ioi1lo(long j) {
/* 1 */             closeDetectorJni(j);
                }
            }
