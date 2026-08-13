            package com.google.mlkit.vision.pose.internal;

            import android.content.Context;
            import androidx.work.WorkerParameters;
            import com.google.mlkit.acceleration.internal.MiniBenchmarkWorker;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.Pose;
            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import p000.O1o0111OI00;
            import p000.OloIo0oOIO0;
            
            public class PoseMiniBenchmarkWorker extends MiniBenchmarkWorker<PoseDetectorOptionsBase, InputImage, Pose> {
                /* JADX WARN: Illegal instructions before constructor call */
                public PoseMiniBenchmarkWorker(Context context, WorkerParameters workerParameters) {
                    O1o0111OI00 o1o0111OI00I0000O;
/* 1 */             Object obj = O1o0111OI00.I00000oOI;
                    synchronized (obj) {
/* 4 */                 o1o0111OI00I0000O = O1o0111OI00.I0000Il00O;
/* 6 */                 if (o1o0111OI00I0000O == null) {
                            synchronized (obj) {
/* 12 */                        o1o0111OI00I0000O = O1o0111OI00.I0000O(context, OloIo0oOIO0.I00000oIO);
                            }
                        }
                    }
/* 42 */            super((Context) o1o0111OI00I0000O.I00000oIO(Context.class), workerParameters, zzd.zzb(), new zzc(context), zzd.zza());
                }
            }
