            package com.google.mlkit.vision.label.defaults;

            import com.google.mlkit.vision.label.ImageLabelerOptionsBase;
            import java.util.concurrent.Executor;
            
            public class ImageLabelerOptions extends ImageLabelerOptionsBase {
                public static final ImageLabelerOptions DEFAULT_OPTIONS = new Builder().build();

                public static class Builder extends ImageLabelerOptionsBase.Builder<Builder> {
                    public Builder() {
/* 6 */                 setConfidenceThreshold(0.5f);
                    }

                    @Override
                    public ImageLabelerOptions build() {
/* 4 */                 return new ImageLabelerOptions(this, null);
                    }

                    @Override
                    public Builder setConfidenceThreshold(float f) {
/* 5 */                 return (Builder) super.setConfidenceThreshold(f);
                    }

                    @Override
                    public Builder setExecutor(Executor executor) {
/* 5 */                 return (Builder) super.setExecutor(executor);
                    }
                }

                public ImageLabelerOptions(Builder builder, zza zzaVar) {
/* 1 */             super(builder);
                }
            }
