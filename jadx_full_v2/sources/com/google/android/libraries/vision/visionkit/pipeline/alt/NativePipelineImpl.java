            package com.google.android.libraries.vision.visionkit.pipeline.alt;

            import android.graphics.Bitmap;
            import android.util.Log;
            import java.nio.ByteBuffer;
            import p000.i0i0lO11loi;
            import p000.i0o10lO1i;
            import p000.i11IO0ii;
            import p000.i11i01Oo;
            
            class NativePipelineImpl implements i0i0lO11loi {
                public i11IO0ii I00iOIl;
                public I00000oIO I00iiI;
                public I00000oIO I00iiO;
                public I00000oIO I00iio;

                public NativePipelineImpl(I00000oIO i00000oIO, I00000oIO i00000oIO2, I00000oIO i00000oIO3, i11IO0ii i11io0ii) {
/* 4 */             this.I00iiI = i00000oIO;
/* 6 */             this.I00iiO = i00000oIO2;
/* 8 */             this.I00iio = i00000oIO3;
/* 10 */            this.I00iOIl = i11io0ii;
                }

                @Override
                public final void I000l1() {
/* 2 */             this.I00iOIl = null;
/* 4 */             this.I00iiI = null;
/* 6 */             this.I00iiO = null;
/* 8 */             this.I00iio = null;
                }

                @Override
                public native void close(long j, long j2, long j3, long j4, long j5);

                public void closeFileDescriptor(int i) {
/* 3 */             this.I00iio.zbc(i);
                }

                @Override
                public native long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

                @Override
                public native long initializeFrameBufferReleaseCallback(long j);

                @Override
                public native long initializeFrameManager();

                @Override
                public native long initializeIsolationCallback();

                @Override
                public native long initializeResultsCallback();

                public void onReleaseAtTimestampUs(long j) {
/* 3 */             this.I00iiI.zba(j);
                }

                public void onResult(byte[] bArr) {
                    try {
/* 9 */                 this.I00iiO.zbd(i0o10lO1i.I00100l0(bArr, this.I00iOIl));
                    } catch (i11i01Oo e) {
/* 21 */                if (Log.isLoggable("VisionKit", 6)) {
/* 25 */                    Log.e("VisionKit", "Error in result from JNI layer", e);
                        }
                    }
                }

                public int openFileDescriptor(String str) {
/* 3 */             this.I00iio.zbb(str);
/* 6 */             return -1;
                }

                @Override
                public native byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

                @Override
                public native byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

                @Override
                public native byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

                @Override
                public native void start(long j);

                @Override
                public native boolean stop(long j);

                @Override
                public native void waitUntilIdle(long j);
            }
