            package com.google.mlkit.vision.pose.internal;

            import android.content.Context;
            import android.graphics.BitmapFactory;
            import android.util.Log;
            import android.util.Pair;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.common.PointF3D;
            import com.google.mlkit.vision.pose.Pose;
            import com.google.mlkit.vision.pose.PoseDetection;
            import com.google.mlkit.vision.pose.PoseDetector;
            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.I01l10Oi;
            import p000.IoOOl0iOl1io;
            import p000.O1lolIl101;
            import p000.OloIIoII1oo;
            import p000.lII0I0I000I;
            import p000.lOio0o;
            
            final class zzc implements O1lolIl101 {
                final Context zza;
                private PoseDetector zzb;

                public zzc(Context context) {
/* 1 */             this.zza = context;
                }

                private final InputImage zzc(String str) {
                    try {
/* 16 */                return InputImage.fromBitmap(BitmapFactory.decodeStream(this.zza.getAssets().open(str)), 0);
                    } catch (IOException e) {
/* 28 */                IoOOl0iOl1io.I000l1("Failed to create test image from ".concat(str), e);
/* 31 */                return null;
                    }
                }

                private static final Object zzd(OloIIoII1oo oloIIoII1oo) {
                    try {
/* 5 */                 return lOio0o.I00000oOI(oloIIoII1oo, 20L, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 14 */                Log.isLoggable("PoseAccManager", 3);
/* 27 */                IoOOl0iOl1io.I000l1("PoseAccelerationManager failed with error: ".concat(String.valueOf(oloIIoII1oo)), e);
/* 30 */                return null;
                    }
                }

                @Override
                public final OloIIoII1oo closeDetector() {
/* 1 */             PoseDetector poseDetector = this.zzb;
/* 11 */            OloIIoII1oo oloIIoII1ooI0000oI00 = poseDetector == null ? lOio0o.I0000oI00(null) : poseDetector.closeWithTask();
/* 15 */            this.zzb = null;
/* 29 */            return oloIIoII1ooI0000oI00;
                }

                @Override
                public final float getCorrectnessScore(Object obj, Object obj2, Object obj3) {
/* 3 */             InputImage inputImage = (InputImage) obj;
/* 13 */            List<PoseLandmark> allPoseLandmarks = ((Pose) obj2).getAllPoseLandmarks();
/* 17 */            List<PoseLandmark> allPoseLandmarks2 = ((Pose) obj3).getAllPoseLandmarks();
/* 29 */            if (allPoseLandmarks.size() != allPoseLandmarks2.size()) {
/* 31 */                return 0.0f;
                    }
/* 41 */            if (allPoseLandmarks.isEmpty()) {
/* 39 */                return 1.0f;
                    }
/* 46 */            float fMin = 0.0f;
/* 47 */            float fMin2 = 0.0f;
/* 48 */            float fAbs = 0.0f;
/* 53 */            for (int i = 0; i < allPoseLandmarks.size(); i++) {
/* 55 */                PoseLandmark poseLandmark = allPoseLandmarks.get(i);
/* 61 */                PoseLandmark poseLandmark2 = allPoseLandmarks2.get(i);
/* 82 */                lII0I0I000I.I000OOo1O("Mismatching landmark type", poseLandmark.getLandmarkType() == poseLandmark2.getLandmarkType());
/* 85 */                PointF3D position3D = poseLandmark.getPosition3D();
/* 89 */                PointF3D position3D2 = poseLandmark2.getPosition3D();
/* 133 */               fMin += Math.min(((float) Math.hypot(position3D.getX() - position3D2.getX(), position3D.getY() - position3D2.getY())) / inputImage.getWidth(), 1.0f);
/* 157 */               fMin2 += Math.min(Math.abs(position3D.getZ() - position3D2.getZ()) / inputImage.getWidth(), 1.0f);
/* 171 */               fAbs += Math.abs(poseLandmark.getInFrameLikelihood() - poseLandmark2.getInFrameLikelihood());
                    }
/* 177 */           float size = allPoseLandmarks.size();
/* 182 */           float f = fMin / size;
/* 184 */           float f2 = fAbs / size;
/* 193 */           if (fMin2 / size >= 0.4d || f2 >= 0.1d) {
/* 175 */               return 0.0f;
                    }
/* 206 */           return 1.0f - f;
                }

                @Override
                public final float getCorrectnessScoreThreshold() {
/* 1 */             return 0.97f;
                }

                @Override
                public final I01l10Oi getDefaultOptionsAsDecoder() {
/* 6 */             return new com.google.mlkit.vision.pose.zza().build();
                }

                @Override
                public final List getInputsWithExpectedResults(I01l10Oi i01l10Oi) {
/* 37 */            List<InputImage> listAsList = Arrays.asList(zzc("mlkit_pose/benchmark_breaking1.data"), zzc("mlkit_pose/benchmark_breaking2.data"), zzc("mlkit_pose/benchmark_halfbody.data"), zzc("mlkit_pose/benchmark_jump.data"), zzc("mlkit_pose/benchmark_plant.data"));
/* 43 */            ArrayList arrayList = new ArrayList();
/* 53 */            initDetectorForCorrectnessBenchmark(((PoseDetectorOptionsBase) i01l10Oi).cloneWithRunConfigAssigned("default_config", true));
/* 64 */            for (InputImage inputImage : listAsList) {
/* 87 */                arrayList.add(new Pair(inputImage, (Pose) zzd(runDetector(inputImage))));
                    }
/* 95 */            zzd(closeDetector());
/* 186 */           return arrayList;
                }

                @Override
                public final int getLatencyBenchmarkRepetitionNumber() {
/* 1 */             return 15;
                }

                @Override
                public final int getMaxRetryCount() {
/* 1 */             return 3;
                }

                @Override
                public final int getTaskTimeoutSeconds() {
/* 1 */             return 40;
                }

                @Override
                public final Class getWorkerClass() {
/* 1 */             return PoseMiniBenchmarkWorker.class;
                }

                @Override
                public final OloIIoII1oo initDetectorForLatencyBenchmark(I01l10Oi i01l10Oi) {
/* 3 */             PoseDetector client = PoseDetection.getClient((PoseDetectorOptionsBase) i01l10Oi);
/* 7 */             this.zzb = client;
/* 9 */             lII0I0I000I.I000II(client);
/* 12 */            return client.getInitTask();
                }

                @Override
                public final boolean requireDeviceIdle() {
/* 1 */             return false;
                }

                @Override
                public final OloIIoII1oo initDetectorForCorrectnessBenchmark(PoseDetectorOptionsBase poseDetectorOptionsBase) {
/* 5 */             PoseDetector client = PoseDetection.getClient(poseDetectorOptionsBase.zzc());
/* 9 */             this.zzb = client;
/* 11 */            lII0I0I000I.I000II(client);
/* 14 */            return client.getInitTask();
                }

                @Override
                public final OloIIoII1oo runDetector(InputImage inputImage) {
/* 1 */             PoseDetector poseDetector = this.zzb;
/* 3 */             lII0I0I000I.I000II(poseDetector);
/* 6 */             return poseDetector.process(inputImage);
                }
            }
