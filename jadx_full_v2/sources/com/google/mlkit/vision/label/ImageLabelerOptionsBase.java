            package com.google.mlkit.vision.label;

            import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
            import java.util.Arrays;
            import java.util.concurrent.Executor;
            import p000.l1ioii1I10Io;
            import p000.lII0I0I000I;
            
            public abstract class ImageLabelerOptionsBase implements MultiFlavorDetectorCreator.DetectorOptions<ImageLabeler> {
                private final Executor zza;
                private final float zzb;

                public static abstract class Builder<B extends Builder<B>> {
                    private float zza = -1.0f;
                    private Executor zzb;

                    public abstract ImageLabelerOptionsBase build();

                    public B setConfidenceThreshold(float f) {
/* 6 */                 boolean z = false;
/* 7 */                 if (Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0) {
/* 17 */                    z = true;
                        }
/* 20 */                lII0I0I000I.I00000oIO("Confidence Threshold should be in range [0.0f, 1.0f].", z);
/* 23 */                this.zza = f;
/* 49 */                return this;
                    }

                    public B setExecutor(Executor executor) {
/* 1 */                 this.zzb = executor;
/* 49 */                return this;
                    }
                }

                public ImageLabelerOptionsBase(Builder<?> builder) {
/* 8 */             this.zzb = ((Builder) builder).zza;
/* 14 */            this.zza = ((Builder) builder).zzb;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ImageLabelerOptionsBase)) {
/* 7 */                 return false;
                    }
/* 11 */            ImageLabelerOptionsBase imageLabelerOptionsBase = (ImageLabelerOptionsBase) obj;
                    return getClass().equals(imageLabelerOptionsBase.getClass()) && Float.compare(this.zzb, imageLabelerOptionsBase.zzb) == 0 && l1ioii1I10Io.I00000oIO(imageLabelerOptionsBase.zza, this.zza);
                }

                public float getConfidenceThreshold() {
/* 1 */             return this.zzb;
                }

                public Executor getExecutor() {
/* 1 */             return this.zza;
                }

                public int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.zzb), this.zza});
                }
            }
