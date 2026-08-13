            package p000;

            import android.graphics.Bitmap;
            import java.nio.ByteBuffer;
            
            public interface iiOOiO011l00 {
                void close(long j, long j2, long j3, long j4, long j5);

                byte[] getAnalyticsLogs(long j);

                long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

                long initializeFrameBufferReleaseCallback(long j);

                long initializeFrameManager();

                long initializeIsolationCallback();

                long initializeResultsCallback();

                byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

                byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

                byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

                void start(long j);

                boolean stop(long j);

                void waitUntilIdle(long j);

                void mo40zza();
            }
