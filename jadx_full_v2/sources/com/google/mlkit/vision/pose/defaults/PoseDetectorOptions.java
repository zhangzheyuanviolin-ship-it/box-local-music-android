            package com.google.mlkit.vision.pose.defaults;

            import com.google.mlkit.vision.pose.PoseDetectorOptionsBase;
            import java.util.concurrent.Executor;
            
            public class PoseDetectorOptions extends PoseDetectorOptionsBase {

                public static class Builder extends PoseDetectorOptionsBase.Builder<Builder> {
                    @Override
                    public PoseDetectorOptions build() {
/* 6 */                 super.setModelInfo(true, "mlkit_pose/pose_person_detector_f16.tflite", "mlkit_pose/pose_landmark_detector_lite_f16_inf.tflite");
/* 12 */                return new PoseDetectorOptions(this, null);
                    }

                    @Override
                    public Builder setDetectorMode(int i) {
/* 5 */                 return (Builder) super.setDetectorMode(i);
                    }

                    @Override
                    public Builder setExecutor(Executor executor) {
/* 5 */                 return (Builder) super.setExecutor(executor);
                    }

                    @Override
                    public Builder setPreferredHardwareConfigs(int i, int... iArr) {
/* 5 */                 return (Builder) super.setPreferredHardwareConfigs(i, iArr);
                    }
                }

                public PoseDetectorOptions(Builder builder, zza zzaVar) {
/* 1 */             super(builder);
                }
            }
